package br.com.lista10.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.lista10.connection.ConnectionFactory;
import br.com.lista10.model.Produto;

public class ProdutoDao implements iProdutoDao{

	@Override
	public void adiciona(Produto produto) {		

		String sql = "insert into produtos (nome,descricao,valor) values (?,?,?)";

		try {
			PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql);

			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.setFloat(3, produto.getValor());

			stmt.executeQuery();
			stmt.close();
		}catch (Exception e) {
			System.out.println("Erro no adicionar(): " + e);
		} 
		
	}

	@Override
	public List<Produto> getLista() {

		String sql = "select * from produtos";
		ArrayList<Produto> Todos_Produtos = new ArrayList<>();

		try {
			PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(); 

			while(rs.next()){
				Long id = rs.getLong("id");
				String nome = rs.getString("nome");
				String descricao = rs.getString("descricao");
				float valor = rs.getFloat("valor");

				Todos_Produtos.add(new Produto(id,nome,descricao,valor));
			}
			rs.close();
			stmt.close();	

		} catch (Exception e) {
			System.out.println("Erro no getLista(): " + e);
		}
		
		return Todos_Produtos; 
	}

	@Override
	public void altera(Produto produto) {

		String sql = "update produtos set  nome=?, descricao=?, valor=? where id=" + produto.getId();

		try {
			
			PreparedStatement  stmt = ConnectionFactory.getConnection().prepareStatement(sql);
			
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.setFloat(3, produto.getValor());
			
			stmt.execute();
			stmt.close();

		} catch (Exception e) {
			System.out.println("Erro no alterar(): " + e);
		} 
	}

	@Override
	public void remove(Long id) {

		String sql = "delete from produtos where id=" + id;

		try {

			PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(sql);
			stmt.execute();
			stmt.close();

		}catch (Exception e) {
			System.out.println("Erro no remover(): " + e);
		} 
	}

}
