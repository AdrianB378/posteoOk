
package com.todocode.posteoOk.controller;

import com.todocode.posteoOk.model.PosteoOk;
import com.todocode.posteoOk.repository.IPosteoOkRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PosteoOkController {

    @Autowired
    IPosteoOkRepository repo;

    @GetMapping("/posteos")
    public List<PosteoOk> traerTodos() {
        return repo.traerTodos();
    }

}
