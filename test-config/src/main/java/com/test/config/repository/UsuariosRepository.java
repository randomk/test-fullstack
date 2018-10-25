package com.test.config.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.Usuarios;

@Transactional
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

}
