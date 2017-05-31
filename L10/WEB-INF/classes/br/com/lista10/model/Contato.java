package  br.com.lista10.model;

import java.util.Calendar;

public class Contato {

	private Integer id;
	
	private String nome;
	private String email;
	private String endereco;
	private Calendar dataNascimento;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String novo) {
		this.nome = novo;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String novo) {
		this.email = novo;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String novo) {
		this.endereco = novo;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer novo) {
		this.id = novo;
	}

	public Calendar getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}