package jwt.senaiapitest.repositories;

import jwt.senaiapitest.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
