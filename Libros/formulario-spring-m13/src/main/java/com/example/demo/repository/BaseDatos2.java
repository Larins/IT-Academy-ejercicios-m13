/*package com.example.demo.repository;

import java.sql.*;
import java.util.ArrayList;

import com.example.demo.bean.Libro;

public class BaseDatos2 {

	private Connection conexion;

	public BaseDatos2() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String conex="jdbc:mysql://localhost:3306/biblioteca_online";
			this.conexion = DriverManager.getConnection(conex, "root","");
		} catch (Exception e) {
			e.printStackTrace();
		}
 	}

 	//NUEVO LIBRO
 	public void inserta(Libro libro) {
 		String query = " insert into libros (id, titulo, autor, editorial, fecha, tematica)" + " values (?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement preparedStmt;
			preparedStmt = conexion.prepareStatement(query);
			preparedStmt.setInt (1, libro.getId());
			preparedStmt.setString (2, libro.getTitulo());
			preparedStmt.setString (3, libro.getAutor());
			preparedStmt.setString (4, libro.getEditorial());
			preparedStmt.setString (5, libro.getFecha());
			preparedStmt.setString (6, libro.getTematica());
			preparedStmt.executeUpdate();
		} catch (SQLException ex) {
			System.out.print(ex.getMessage());
		}	
 	}

 	//ELIMINAR LIBRO

	public void borrar(int id) {
		String query = "delete from libros where id="+id;
		try {
			PreparedStatement preparedStmt = conexion.prepareStatement(query);
			preparedStmt.executeUpdate();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	} 	

 	//MODIFICAR LIBRO

  	public void modifica(Libro libro) {

  		String query = " update libros set titulo=?, autor=?, editorial=?, fecha=?, tematica=?" + "where id=?";

		try {
			PreparedStatement preparedStmt = conexion.prepareStatement(query);
			preparedStmt.setInt (1, libro.getId());
			preparedStmt.setString (2, libro.getTitulo());
			preparedStmt.setString (3, libro.getAutor());
			preparedStmt.setString (4, libro.getEditorial());
			preparedStmt.setString (5, libro.getFecha());
			preparedStmt.setString (6, libro.getTematica());
			preparedStmt.setInt (6, libro.getId());
			System.out.println(preparedStmt.toString());
			preparedStmt.executeUpdate();
		} catch (SQLException ex) {
			System.out.print(ex.getMessage());
		}	
 	}

 	//GET LIBRO

 	public Libro getLibro(int id) {
 		Libro libro = null;
 		try {
 			Statement s = conexion.createStatement();
 			String sql = "SELECT * FROM LIBROS WHERE ID="+id;
 			s.execute(sql);
 			ResultSet rs = s.getResultSet();
			rs.next();
			libro = new Libro(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
 		} catch (SQLException ex) {
 			System.out.print(ex.getMessage());
 		}
 		return libro;
 	}

 	//GET LIBROS

 	public ArrayList<Libro> getLibros() {
 		ArrayList<Libro> lista = new ArrayList<Libro>();
 		try {
 			Statement s = conexion.createStatement();
 			String sql = "SELECT * FROM LIBROS";
 			s.execute(sql);
 			ResultSet rs = s.getResultSet();
 			while (rs.next()) {
				Libro libro = new Libro(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
 				lista.add(libro);
 			}
 		} catch (SQLException ex) {
  			System.out.print(ex.getMessage());
 		}
 		return lista;
 	}

 	//COMPROBAR USUARIO 

 	public boolean compruebaUsuario(String usuario, String password) {
 		boolean check=false;
 		try {
 			Statement s = conexion.createStatement();
 			String sql = "SELECT COUNT(*) FROM USUARIOS WHERE usuario = '" + usuario + "' " + "and password = '" + password + "'";
 			s.execute(sql);
 			ResultSet rs = s.getResultSet();
 			rs.next();
 			if (rs.getInt(1)>0)
 				check=true;
 		} catch (SQLException ex) {
  			System.out.print(ex.getMessage());
 		}
 		return check;
 	}
}*/
