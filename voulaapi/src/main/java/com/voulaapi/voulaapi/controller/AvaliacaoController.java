package com.voulaapi.voulaapi.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.voulaapi.voulaapi.model.Avaliacao;
import com.voulaapi.voulaapi.repository.AvaliacaoRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/avaliacao")
public class AvaliacaoController {
	
	@Autowired
	private AvaliacaoRepository aRepository;
	
	@GetMapping("/")
	public ResponseEntity<List<Avaliacao>> getAllAvaliacao(){
		List<Avaliacao> objAvaliacao = aRepository.findAll();
		
		if(objAvaliacao.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(objAvaliacao);
		}
	}
	
	/*@GetMapping("/{geralAvaliacao}")
	public ResponseEntity<List<Avaliacao>> getByAvaliacao(@PathVariable long geralAvaliacao){
		List<Avaliacao> objAvaliacao = aRepository.findByAllGeralAvaliacaoContainingIgnoreCase(geralAvaliacao);
		
		if (objAvaliacao.isEmpty()){
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(objAvaliacao);
		}
	}*/
	
	
	@GetMapping("/{idAvaliaca}")
	public ResponseEntity<Avaliacao> getById(@PathVariable long idAvaliacao){
		Optional<Avaliacao> objAvaliacao = aRepository.findById(idAvaliacao);
		
		if (objAvaliacao.isPresent()){
			return ResponseEntity.status(200).body(objAvaliacao.get());
		} else {
			return ResponseEntity.status(204).build();
		}
	}
	
	@PostMapping("/")
	public ResponseEntity<Avaliacao> Post(@Valid @RequestBody Avaliacao geralAvaliacao) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(aRepository.save(geralAvaliacao));
	}
    

    @PutMapping("/")
    public ResponseEntity<Avaliacao> put (@Valid @RequestBody Avaliacao geralAvaliacao){
        return ResponseEntity.status(201).body(aRepository.save(geralAvaliacao));
    }

    @DeleteMapping("/")
    public void deleteById(@PathVariable Avaliacao geralAvaliacao){
        aRepository.delete(geralAvaliacao);
    }

}
