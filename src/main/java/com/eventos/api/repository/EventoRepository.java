package com.eventos.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventos.api.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {
	Evento findByCodigo(long codigo);
}
