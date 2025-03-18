package com.revisao.ecommerce.controllers;


import java.util.List;
import java.util.stream.Collectors;

import com.revisao.ecommerce.entities.Produto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.revisao.ecommerce.dto.ProdutoDTO;
import com.revisao.ecommerce.services.ProdutoService;

@RestController
@RequestMapping
public class ProdutoController {

	@Autowired
	ProdutoService service;
	
	@GetMapping
	public List<ProdutoDTO>findAll(){
		return service.findAll();
	}
	
	@GetMapping(value = "/pagina")
	public Page<ProdutoDTO> findAll(Pageable pagina){
		return service.findPagina(pagina);
	}

	@PostMapping( value = "/new")
	public ResponseEntity<ProdutoDTO> insert(@RequestBody @Valid ProdutoDTO dto){
		dto = service.inset(dto);
		return ResponseEntity.ok(dto);
	}

	

}
