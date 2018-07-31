package com.spring.comercio.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.spring.comercio.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, UUID>{
	

}
