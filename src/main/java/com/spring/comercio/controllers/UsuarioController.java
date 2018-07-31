package com.spring.comercio.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.comercio.models.Usuario;
import com.spring.comercio.repositories.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;	
	
	@RequestMapping(method=RequestMethod.GET)
	public Iterable<Usuario> listaUsuario(){	
		
		return usuarioRepository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Usuario inserirUsuario(@RequestBody Usuario usuario) {
		
		UUID uuid = UUID.randomUUID();
		//Usuario user = new Usuario();
		
		usuario.setId(uuid);
		
		usuarioRepository.save(usuario);
		
		return usuario;
	}

}
