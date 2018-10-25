package com.test.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Usuarios;
import com.test.model.pojo.UsuariosPojo;
import com.test.service.UsuariosService;
import com.test.service.exceptions.ServiceException;

@RestController
@RequestMapping("/api/user")
public class UsuariosControllers {

	@Autowired
	private UsuariosService usuariosService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UsuariosPojo novoUsuario(@RequestBody UsuariosPojo usuariosPojo) {
		Usuarios usuarios = (Usuarios) usuariosPojo;
		Usuarios salvo = null;
		try {
			salvo = usuariosService.salvar(usuarios);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return (UsuariosPojo) salvo;
	}

	@PutMapping("{id}")
	public UsuariosPojo editarUsuario(@PathVariable Long id, @RequestBody UsuariosPojo usuariosPojo) {
		Usuarios usuarios = (Usuarios) usuariosPojo;
		Usuarios salvo = null;
		try {
			salvo = usuariosService.salvar(usuarios);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return (UsuariosPojo) salvo;
	}

	@GetMapping
	public List<UsuariosPojo> listarTodos() {
		List<UsuariosPojo> list = new ArrayList<>();
		try {
			for (Usuarios usuarios : usuariosService.listarTodos()) {
				list.add((UsuariosPojo) usuarios);
			}
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return list;
	}

	@GetMapping("{id}")
	public UsuariosPojo getUsuario(@PathVariable Long id) {

		try {
			return (UsuariosPojo) usuariosService.getUsuario(id);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@DeleteMapping("/{id}")
	public void deletarUsuario(@PathVariable Long id) {
		try {
			usuariosService.removerUsuario(id);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
}
