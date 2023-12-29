
package com.todocode.posteoOk.model;



import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PosteoOk {
    
    private Long id;
    private String titulo;
    private String autor;

    public PosteoOk() {
    }

    
    public PosteoOk(Long id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }
}    