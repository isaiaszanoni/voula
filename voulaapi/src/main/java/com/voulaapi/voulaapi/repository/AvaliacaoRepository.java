package com.voulaapi.voulaapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voulaapi.voulaapi.model.Avaliacao;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
	
	Optional<Avaliacao> findById(long idAvaliacao);

}
