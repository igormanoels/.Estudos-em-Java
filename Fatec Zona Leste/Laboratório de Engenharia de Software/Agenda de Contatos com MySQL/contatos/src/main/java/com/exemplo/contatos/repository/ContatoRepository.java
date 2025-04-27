package com.exemplo.contatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.contatos.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{

}

