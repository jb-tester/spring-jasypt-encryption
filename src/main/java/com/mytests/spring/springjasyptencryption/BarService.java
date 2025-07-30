package com.mytests.spring.springjasyptencryption;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * *
 * <p>Created by irina on 7/30/2025.</p>
 * *
 */
@Service
public class BarService {

    private final BarRepository repository;

    public BarService(BarRepository repository) {
        this.repository = repository;
    }


    public List<Bar> getAll() {

        return repository.findAll();
    }

    public List<Bar> customQuery(String attr) {

        return repository.customQuery(attr);
    }

}    