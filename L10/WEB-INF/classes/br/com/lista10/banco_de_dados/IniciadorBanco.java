package br.com.lista10.banco_de_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.lista10.connection.ConnectionFactory;

public class IniciadorBanco {

	public static void main(String[] args) throws SQLException {
		
//		CRIAÇÃO DO BANCO DE DADOS

		Connection Conn = DriverManager.getConnection("jdbc:postgresql://localhost/?user=postgres&password=root"); 
		
		Statement s = Conn.createStatement();

		s.executeUpdate("CREATE DATABASE desweb");
		
		System.out.println("BANCO DE DADOS CRIADO");

//		CRIAÇÃO DAS TABELAS		
				 
		String sql = "create table produtos(	id serial, nome varchar(30), descricao varchar(30),	valor float)";
		PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql);
		stmt.executeQuery();
		stmt.close();
		
		System.out.println("TABELA PRODUTOS CRIADA");
	}

}
