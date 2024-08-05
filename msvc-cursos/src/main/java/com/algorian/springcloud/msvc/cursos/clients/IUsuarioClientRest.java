package com.algorian.springcloud.msvc.cursos.clients;

import com.algorian.springcloud.msvc.cursos.models.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name="msvc-usuarios", url="localhost:8001")
public interface IUsuarioClientRest {

    @GetMapping("/{id}")
    Usuario detalle(@PathVariable(name="id") Long id);

    @PostMapping("/")
    Usuario crear (@RequestBody Usuario usuario);

}
