
package com.todocode.posteoOk.repository;

import com.todocode.posteoOk.model.PosteoOk;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PosteoOkRepository implements IPosteoOkRepository{

    @Override
    public List<PosteoOk> traerTodos() {
       List<PosteoOk> listaPosteos = new ArrayList<PosteoOk> ();
       listaPosteos.add(new PosteoOk (1L, "¿Cómo formatear una PC?", "Paulo Perez"));
       listaPosteos.add(new PosteoOk (2L, "¿Cómo mantener la seguridad?", "Gabriel Guismín"));
       
       return listaPosteos;
    }
    
    
    
}
