package jwt.senaiapitest.dto;

import jwt.senaiapitest.entities.Categoria;

public class CategoriaDTO {
    private Long id;
    private  String nome;

    public CategoriaDTO() {
    }

    public CategoriaDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public CategoriaDTO(Categoria categoria) {
        id = categoria.getId();;
        nome = categoria.getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

