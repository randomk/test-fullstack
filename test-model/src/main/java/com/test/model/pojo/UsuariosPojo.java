package com.test.model.pojo;

import java.io.Serializable;

/**
 * Classe que representa o Objeto usuário para o sistema.
 * 
 * 
 * @author rafaelsilva
 *
 */
public abstract class UsuariosPojo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -271336394378226308L;
	private Long id;
	private String nome;
	private String email;
	private Integer telefone;
	private Integer sexo;

	enum TP_SEXO {

		MASCULINO(1, "Masculino"), FEMININO(2, "Feminino"), OUTROS(3, "Outros");

		int id;
		String descricao;

		TP_SEXO(int id, String descricao) {
			this.id = id;
			this.descricao = descricao;
		}

		public int getId() {
			return id;
		}

		public String getDescricao() {
			return descricao;
		}

	}

	public UsuariosPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuariosPojo(Long id, String nome, String email, Integer telefone, Integer sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.sexo = sexo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "UsuariosPojo [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", sexo="
				+ sexo + "]";
	}

}
