package jwt.senaiapitest.services;

import jwt.senaiapitest.dto.PedidoDTO;
import jwt.senaiapitest.entities.Pedido;
import jwt.senaiapitest.repositories.PedidoRepository;
import jwt.senaiapitest.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class PedidoService {


    @Autowired
    PedidoRepository pedidoRepository;

    @Autowired
    UsuarioRepository usuarioRepository;


    public PedidoDTO inserir(PedidoDTO dto){
        Pedido pedido = new Pedido();
        pedido.setMomento(Instant.now());
        pedido.setStatus(StatusDoPedido.AGUARDANDO_PAGAMENTO);
        Usuario user = usuarioRepository.getReferenceById(dto.getClienteId());
        pedido.setCliente(user);
        pedido = pedidoRepository.save(pedido);

        return new PedidoDTO(pedido);
    }
}
