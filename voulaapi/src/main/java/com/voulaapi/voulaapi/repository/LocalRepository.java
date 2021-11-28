package com.voulaapi.voulaapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voulaapi.voulaapi.model.Local;



public interface LocalRepository extends JpaRepository<Local, Long>{
	
	public List<Local> findAllByNomeLocalContainingIgnoreCase(String tarefa);
	

}