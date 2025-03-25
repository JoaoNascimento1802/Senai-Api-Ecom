package jwt.senaiapitest.controller;

import jakarta.validation.Valid;
import jwt.senaiapitest.dto.PedidoDTO;
import jwt.senaiapitest.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("order")
public class PedidoController {

    @Autowired
    PedidoService pedidoService;


    @PostMapping ("/new")
    public ResponseEntity<PedidoDTO> inserPedido(@RequestBody @Valid PedidoDTO dto){
        dto = pedidoService.inserir(dto);
        return ResponseEntity.ok(dto);

    }

}

