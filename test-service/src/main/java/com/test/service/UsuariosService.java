package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.config.repository.UsuariosRepository;
import com.test.model.Usuarios;
import com.test.service.exceptions.ServiceException;

@Service
public class UsuariosService {

	@Autowired
	private UsuariosRepository usuariosRepository;

	public Usuarios salvar(Usuarios usuarios) throws ServiceException {
		if (usuarios == null) {
			throw new ServiceException("Usuário não foi informado.");
		}

		try {
			return usuariosRepository.saveAndFlush(usuarios);
		} catch (Exception e) {
			throw new ServiceException("Erro ao tentar gravar o usuário na base de dados. " + e.getMessage());
		}
	}

	public List<Usuarios> listarTodos() throws ServiceException {
		try {
			return usuariosRepository.findAll();
		} catch (Exception e) {
			throw new ServiceException("Erro ao tentar listar  todos os usuários na base de dados. " + e.getMessage());
		}
	}

	public Usuarios getUsuario(Long id) throws ServiceException {
		if (id == null) {
			throw new ServiceException("Usuário (id) não foi informado.");
		}

		try {
			return usuariosRepository.getOne(id);
		} catch (Exception e) {
			throw new ServiceException("Erro ao tentar buscar o usuário na base de dados. " + e.getMessage());
		}
	}

	public void removerUsuario(Long id) throws ServiceException {
		if (id == null) {
			throw new ServiceException("Usuário (id) não foi informado.");
		}

		try {
			usuariosRepository.delete(id);
		} catch (Exception e) {
			throw new ServiceException("Erro ao tentar remover o usuário na base de dados. " + e.getMessage());
		}
	}

}
