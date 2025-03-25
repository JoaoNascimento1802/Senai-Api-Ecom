package jwt.senaiapitest.repositories;

import jwt.senaiapitest.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository  extends JpaRepository<Pedido, Long> {
}
