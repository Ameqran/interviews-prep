package com.fm.fieldmanager.adapters.in.web.controllers;

import com.fm.fieldmanager.adapters.out.memory.NpeDemoRepo.Item;
import com.fm.fieldmanager.application.NpeDemoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/npe")
public class NpeDemoController {

    private final NpeDemoService service;

    // Using constructor injection here so the controller itself is fine.
    public NpeDemoController(NpeDemoService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<String> all() {
        // NPE occurs here because service.getAllNames() may return null list under the hood
        return service.getAllNames();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> one(@PathVariable Long id) {
        // No not-found handling; Optional.get() in service will cause a 500
        Item item = service.getOne(id);
        return ResponseEntity.ok(item);
    }
}

