package com.proj.microv.microservicesimple.controller;

import com.proj.microv.microservicesimple.entity.Moto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Vladislav Domaniewski
 */

@RestController
@RequestMapping("/moto")
public class MotoContoller {

    @PostMapping
    public Moto save(Moto moto) {
        return moto;
    }
}
