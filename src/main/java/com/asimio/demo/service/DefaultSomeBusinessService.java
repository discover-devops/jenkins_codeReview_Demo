package com.asimio.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DefaultSomeBusinessService implements SomeBusinessService {

    @Override
    public String findEntity(String id) {
        return String.format("Retrieved entity with id: %s", id);
    }
}