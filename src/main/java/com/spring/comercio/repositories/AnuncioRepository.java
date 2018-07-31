package com.spring.comercio.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.spring.comercio.models.Anuncio;

public interface AnuncioRepository  extends CrudRepository<Anuncio, UUID>{
	

}
