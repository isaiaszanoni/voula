package com.voulaapi.voulaapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voulaapi.voulaapi.model.Local;
import com.voulaapi.voulaapi.repository.LocalRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/local")
public class LocalController {
	
	@Autowired
	private LocalRepository repository;
	
	@GetMapping("/")
	public ResponseEntity<List<Local>> getAllLocals(){
		List<Local> objectList = repository.findAll();
		
		if(objectList.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(objectList);
		}
	}
	
	@GetMapping("/{nome_local}")
	public ResponseEntity<List<Local>> getByNameLocal(@PathVariable(value = "nome_local") String nomeLocal){
		List<Local> objectList = repository.findAllByNomeLocalContainingIgnoreCase(nomeLocal);
		
		if(objectList.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(objectList);
		}
	}
	
	
	@PostMapping("/")
	public ResponseEntity<Local> addNewLocal(@Valid @RequestBody Local newLocal){
		return ResponseEntity.status(201).body(repository.save(newLocal));
	}
	
	@PutMapping("/")
	public ResponseEntity<Local> updateLocal(@Valid @RequestBody Local updateLocal){
		return ResponseEntity.status(200).body(repository.save(updateLocal));
	}
	
	@DeleteMapping("/{id_local}")
	public void deleteLocal(@PathVariable(value = "id_local") Long idLocal) {
		repository.deleteById(idLocal);
	}
}
