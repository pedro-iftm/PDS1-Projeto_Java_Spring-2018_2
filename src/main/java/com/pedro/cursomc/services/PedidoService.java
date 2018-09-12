package com.pedro.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedro.cursomc.domain.Pedido;
import com.pedro.cursomc.repositories.PedidoRepository;
import com.pedro.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Pedido obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! id: " + id +
					", tipo: " + Pedido.class.getName());
		}
		return obj;
	}
}