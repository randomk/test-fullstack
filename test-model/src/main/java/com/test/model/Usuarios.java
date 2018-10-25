package com.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import com.test.model.pojo.UsuariosPojo;

/**
 * Representa a entidade que persiste na tabela <br>
 * TB_USUARIOS</br>
 * do banco de dados.
 * 
 * @author rafaelsilva
 *
 */
@Entity
@Table(name = "TB_USUARIOS")
public class Usuarios extends UsuariosPojo {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3998653647135874557L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@NotNull(message = "O campo nome é obrigaório. Favor informar.")
	@Column(name = "DS_NOME")
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@NotNull(message = "O campo email é obrigaório. Favor informar.")
	@Email(message = "O campo email é invalido. Fovor informar um email válido.")
	@Column(name = "DS_EMAIL")
	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.getEmail();
	}

	@NotNull(message = "O campo sexo é obrigaório. Favor informar.")
	@Column(name = "CD_SEXO")
	@Override
	public Integer getSexo() {
		// TODO Auto-generated method stub
		return super.getSexo();
	}

	@NotNull(message = "O campo telefone é obrigaório. Favor informar.")
	@Column(name = "NR_TELEFONE")
	@Override
	public Integer getTelefone() {
		// TODO Auto-generated method stub
		return super.getTelefone();
	}
}
