package com.spring.comercio.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.comercio.models.Anuncio;
import com.spring.comercio.repositories.AnuncioRepository;

@RestController
@RequestMapping("/anuncio")
public class AnuncioController {
	
	@Autowired
	AnuncioRepository anuncioRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public Iterable<Anuncio> listarAnuncios(){
		return anuncioRepository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Anuncio inserirAnuncio(@RequestBody Anuncio anuncio) {
		
		UUID uuid = UUID.randomUUID();
		
		anuncio.setId(uuid);
		
		anuncioRepository.save(anuncio);
		
		return anuncio;
		
	}

}
