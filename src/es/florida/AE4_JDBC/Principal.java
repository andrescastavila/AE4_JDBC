package es.florida.AE4_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ae4","root","");
			System.out.println("Conexion correcta");
			
		}catch(SQLException e){
			System.err.println("Error en la conexion");
			e.printStackTrace();
		}
		
//Codi per a omplir la taula llibres		
//			try {
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ae4","root","");
//			PreparedStatement psInsertar = con.prepareStatement("INSERT INTO llibres(titol,autor,any_naix,any_publicacion,editorial,pagines)VALUES (?,?,?,?,?,?)");
//			psInsertar.setString(1, "El señor de los anillos");
//			psInsertar.setString(2, "J.R.R. Tolkien");
//			psInsertar.setInt(3, 1890);
//			psInsertar.setInt(4, 1950);
//			psInsertar.setString(5, "Minotauro");
//			psInsertar.setInt(6, 1392);
//			int resultadoActualizar=psInsertar.executeUpdate();
//			con.close();
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		
//			try {
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ae4","root","");
//				PreparedStatement psInsertar = con.prepareStatement("INSERT INTO llibres(titol,autor,any_naix,any_publicacion,editorial,pagines)VALUES (?,?,?,?,?,?)");
//				psInsertar.setString(1, "El juego de Ender");
//				psInsertar.setString(2, "Orson Scott Card");
//				psInsertar.setInt(3, 1951);
//				psInsertar.setInt(4, 1977);
//				psInsertar.setString(5, "Ediciones B");
//				psInsertar.setInt(6, 509);
//				int resultadoActualizar=psInsertar.executeUpdate();
//				con.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}
//			
//			try {
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ae4","root","");
//				PreparedStatement psInsertar = con.prepareStatement("INSERT INTO llibres(titol,autor,any_naix,any_publicacion,editorial,pagines)VALUES (?,?,?,?,?,?)");
//				psInsertar.setString(1, "Lazarillo de Tormes");
//				psInsertar.setString(2, "Anonimo");
//				psInsertar.setInt(3, 0);
//				psInsertar.setInt(4, 1554);
//				psInsertar.setString(5, "Clasicos populares");
//				psInsertar.setInt(6, 150);
//				int resultadoActualizar=psInsertar.executeUpdate();
//				con.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}
//			try {
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ae4","root","");
//				PreparedStatement psInsertar = con.prepareStatement("INSERT INTO llibres(titol,autor,any_naix,any_publicacion,editorial,pagines)VALUES (?,?,?,?,?,?)");
//				psInsertar.setString(1, "Las uvas de la ira");
//				psInsertar.setString(2, "John Steinbeck");
//				psInsertar.setInt(3, 1902);
//				psInsertar.setInt(4, 1939);
//				psInsertar.setString(5, "Alianza");
//				psInsertar.setInt(6, 619);
//				int resultadoActualizar=psInsertar.executeUpdate();
//				con.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}	
//			try {
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ae4","root","");
//				PreparedStatement psInsertar = con.prepareStatement("INSERT INTO llibres(titol,autor,any_naix,any_publicacion,editorial,pagines)VALUES (?,?,?,?,?,?)");
//				psInsertar.setString(1, "Watchmen");
//				psInsertar.setString(2, "Alan Moore");
//				psInsertar.setInt(3, 1953);
//				psInsertar.setInt(4, 1980);
//				psInsertar.setString(5, "ECC");
//				psInsertar.setInt(6, 416);
//				int resultadoActualizar=psInsertar.executeUpdate();
//				con.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}	
//			try {
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ae4","root","");
//				PreparedStatement psInsertar = con.prepareStatement("INSERT INTO llibres(titol,autor,any_naix,any_publicacion,editorial,pagines)VALUES (?,?,?,?,?,?)");
//				psInsertar.setString(1, "La hoguera de las vanidades");
//				psInsertar.setString(2, "Tom Wolfe");
//				psInsertar.setInt(3, 1930);
//				psInsertar.setInt(4, 1980);
//				psInsertar.setString(5, "Anagrama");
//				psInsertar.setInt(6, 636);
//				int resultadoActualizar=psInsertar.executeUpdate();
//				con.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}	
//			try {
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ae4","root","");
//				PreparedStatement psInsertar = con.prepareStatement("INSERT INTO llibres(titol,autor,any_naix,any_publicacion,editorial,pagines)VALUES (?,?,?,?,?,?)");
//				psInsertar.setString(1, "La familia de Pascual Duarte");
//				psInsertar.setString(2, "Camilo Jose Cela");
//				psInsertar.setInt(3, 1916);
//				psInsertar.setInt(4, 1942);
//				psInsertar.setString(5, "Destino");
//				psInsertar.setInt(6, 165);
//				int resultadoActualizar=psInsertar.executeUpdate();
//				con.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}	
//			try {
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ae4","root","");
//				PreparedStatement psInsertar = con.prepareStatement("INSERT INTO llibres(titol,autor,any_naix,any_publicacion,editorial,pagines)VALUES (?,?,?,?,?,?)");
//				psInsertar.setString(1, "El señor de las moscas");
//				psInsertar.setString(2, "William Golding");
//				psInsertar.setInt(3, 1911);
//				psInsertar.setInt(4, 1972);
//				psInsertar.setString(5, "Alianza");
//				psInsertar.setInt(6, 236);
//				int resultadoActualizar=psInsertar.executeUpdate();
//				con.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}	
//			try {
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ae4","root","");
//				PreparedStatement psInsertar = con.prepareStatement("INSERT INTO llibres(titol,autor,any_naix,any_publicacion,editorial,pagines)VALUES (?,?,?,?,?,?)");
//				psInsertar.setString(1, "La ciudad de los prodigios");
//				psInsertar.setString(2, "Eduardo Mendoza");
//				psInsertar.setInt(3, 1943);
//				psInsertar.setInt(4, 1986);
//				psInsertar.setString(5, "Seix Barral");
//				psInsertar.setInt(6, 541);
//				int resultadoActualizar=psInsertar.executeUpdate();
//				con.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}	
//			try {
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ae4","root","");
//				PreparedStatement psInsertar = con.prepareStatement("INSERT INTO llibres(titol,autor,any_naix,any_publicacion,editorial,pagines)VALUES (?,?,?,?,?,?)");
//				psInsertar.setString(1, "Ensayo sobre la ceguera");
//				psInsertar.setString(2, "Jose Saramango");
//				psInsertar.setInt(3, 1922);
//				psInsertar.setInt(4, 1995);
//				psInsertar.setString(5, "Santillana");
//				psInsertar.setInt(6,439);
//				int resultadoActualizar=psInsertar.executeUpdate();
//				con.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}	
//			try {
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ae4","root","");
//				PreparedStatement psInsertar = con.prepareStatement("INSERT INTO llibres(titol,autor,any_naix,any_publicacion,editorial,pagines)VALUES (?,?,?,?,?,?)");
//				psInsertar.setString(1, "Los surcos del azar");
//				psInsertar.setString(2, "Paco Roca");
//				psInsertar.setInt(3, 1969);
//				psInsertar.setInt(4, 2013);
//				psInsertar.setString(5, "Astiberri");
//				psInsertar.setInt(6, 349);
//				int resultadoActualizar=psInsertar.executeUpdate();
//				con.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}	
//			try {
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ae4","root","");
//				PreparedStatement psInsertar = con.prepareStatement("INSERT INTO llibres(titol,autor,any_naix,any_publicacion,editorial,pagines)VALUES (?,?,?,?,?,?)");
//				psInsertar.setString(1, "Ghosts of spain");
//				psInsertar.setString(2, "Giles Tremlett");
//				psInsertar.setInt(3, 1962);
//				psInsertar.setInt(4, 2006);
//				psInsertar.setString(5, "Faber & Faber");
//				psInsertar.setInt(6, 468);
//				int resultadoActualizar=psInsertar.executeUpdate();
//				con.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}	
//			try {
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ae4","root","");
//				PreparedStatement psInsertar = con.prepareStatement("INSERT INTO llibres(titol,autor,any_naix,any_publicacion,editorial,pagines)VALUES (?,?,?,?,?,?)");
//				psInsertar.setString(1, "Sidi");
//				psInsertar.setString(2, "Arturo Perez Reverte");
//				psInsertar.setInt(3, 1951);
//				psInsertar.setInt(4, 2019);
//				psInsertar.setString(5, "Penguin");
//				psInsertar.setInt(6, 369);
//				int resultadoActualizar=psInsertar.executeUpdate();
//				con.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}	
//			try {
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ae4","root","");
//				PreparedStatement psInsertar = con.prepareStatement("INSERT INTO llibres(titol,autor,any_naix,any_publicacion,editorial,pagines)VALUES (?,?,?,?,?,?)");
//				psInsertar.setString(1, "Dune");
//				psInsertar.setString(2, "Frank Herbert");
//				psInsertar.setInt(3, 1920);
//				psInsertar.setInt(4, 1965);
//				psInsertar.setString(5, "Acervo");
//				psInsertar.setInt(6, 741);
//				int resultadoActualizar=psInsertar.executeUpdate();
//				con.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}	
	
			System.out.println("LLIBRES DE LA BIBLIOTECA");
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ae4","root","");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM llibres");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+""
					+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getInt(7));
					}
				rs.close();
				stmt.close();
				con.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			
			System.out.println("LLIBRES DELS AUTORS NASCUTS ABANS DE 1950");
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ae4","root","");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT titol,autor,any_publicacion FROM llibres WHERE any_naix < 1950");
				while(rs.next()) {
					System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
					}
				rs.close();
				stmt.close();
				con.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			
			System.out.println("EDITORIAL QUE HAGEN PUBLICAT ALMENYS UN LLIBRE EN EL SEGLE XX");
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ae4","root","");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT editorial FROM llibres WHERE any_publicacion BETWEEN '1901-01-01' AND '2000-01-01'");
				while(rs.next()) {
					System.out.println(rs.getString(1));
					}
				rs.close();
				stmt.close();
				con.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			
			
		
	}

}
