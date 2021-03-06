package com.example.demo.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.bean.Libro;
import com.example.demo.service.IBaseDatos3;
import com.mysql.cj.xdevapi.Statement;

@Service
public class BaseDatos3Service implements IBaseDatos3 {

	@Autowired
	BaseDatos3 bd;

	@Override
	public void inserta(Libro libro) {
		bd.save(libro); //Función JPA
	}

	@Override
	public void borrar(int id) {
		bd.deleteById(id); //Función JPA
	};

	@Override
	public void modifica(Libro libro) {
		bd.save(libro); //Función JPA
	}

	@Override
	public Libro getLibro(int id) {
		Optional<Libro> l = bd.findById(id); //Función JPA
		return l.get(); //Función JPA
		//return null; //Se cambia por la función JPA
	}

	@Override
	public ArrayList<Libro> getLibros() {
		return (ArrayList<Libro>) bd.findAll(); //Función JPA
		//return null; //Se cambia por la función JPA
	}

	@Override
	public boolean compruebaUsuario(String usuario, String password) {
		boolean check=false; //Función JPA
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String conex="jdbc:mysql://localhost:3306/biblioteca_online";
			Connection conexion = DriverManager.getConnection (conex, "root", "");
			java.sql.Statement s = conexion.createStatement();
			//Código original:
			//Statement s = conexion.createStatement();
			//Eclipse sugiere java.sql.Statement para salvar el error
			String sql = "SELECT COUNT(*) FROM usuarios WHERE usuario = '" + usuario + "' " + "and password = '" + password + "'";
			s.execute(sql);
			ResultSet rs = s.getResultSet();
			rs.next();
			if (rs.getInt(1)>0)
				check = true;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return check;
		//return false; //Se cambia por la función JPA
	}
}
