package com.registro.usuarios.repositorio;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.registro.usuarios.modelo.Destino;


@Repository
public interface IDestino extends JpaRepository<Destino, Serializable>{
	public abstract Destino findByCiudad_dest(String ciudad_dest);
}
