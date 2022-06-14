package com.proj.microv.microservicesimple.service;

import com.proj.microv.microservicesimple.dto.MotoDto;
import com.proj.microv.microservicesimple.entity.Moto;
import com.proj.microv.microservicesimple.repository.MotoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created by Vladislav Domaniewski
 */

@Service
@RequiredArgsConstructor
public class MotoService {

    private final MotoRepository motoRepository;

    public Moto save(MotoDto motoDto) {
        Moto moto = new Moto()
                .setName(motoDto.getName())
                .setYearCreation(motoDto.getYearCreation())
                .setId(UUID.randomUUID().toString())
                .setCreatedAt(LocalDateTime.now());

        return motoRepository.save(moto);
    }

    public Iterable<Moto> getAll() {
        return motoRepository.findAll();
    }
}
