package jwt.senaiapitest.repositories;

import jwt.senaiapitest.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
