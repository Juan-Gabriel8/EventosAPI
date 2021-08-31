package com.eventos.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventos.api.models.Convidado;
import com.eventos.api.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
	Iterable<Convidado>findByEvento(Evento evento);
	Convidado findByRg(String rg);

}
