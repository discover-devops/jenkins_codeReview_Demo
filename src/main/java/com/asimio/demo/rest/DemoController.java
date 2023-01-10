package com.asimio.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asimio.demo.service.SomeBusinessService;

@RestController
@RequestMapping(value = "/api/entities")
public class DemoController {

    private final SomeBusinessService someBusinessService;

    @Autowired
    public DemoController(SomeBusinessService someBusinessService) {
        this.someBusinessService = someBusinessService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<String> findEntity(@PathVariable String id) {
        String entity = this.someBusinessService.findEntity(id);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }
}