package com.proj.microv.microservicesimple.controller;

import com.proj.microv.microservicesimple.dto.MotoDto;
import com.proj.microv.microservicesimple.entity.Moto;
import com.proj.microv.microservicesimple.service.MotoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Vladislav Domaniewski
 */

@RestController
@RequestMapping("/moto")
@RequiredArgsConstructor
public class MotoContoller {

    private final MotoService service;

    @PostMapping
    public Moto save(@RequestBody MotoDto moto) {
        return service.save(moto);
    }

    @GetMapping
    public Iterable<Moto> getAll() {
        return service.getAll();
    }
}
