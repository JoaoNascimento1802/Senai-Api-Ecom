package jwt.senaiapitest.controller;

import java.util.List;

import jakarta.validation.Valid;
import jwt.senaiapitest.dto.ProdutoDTO;
import jwt.senaiapitest.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class ProdutoController {

    @Autowired
    ProdutoService service;

    @GetMapping
    public List<ProdutoDTO> findAll(){
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
