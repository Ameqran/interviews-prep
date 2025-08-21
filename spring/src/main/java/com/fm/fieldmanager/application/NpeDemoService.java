package com.fm.fieldmanager.application;

import com.fm.fieldmanager.adapters.out.memory.NpeDemoRepo;
import com.fm.fieldmanager.adapters.out.memory.NpeDemoRepo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NpeDemoService {

    // BUG: field injection; refactor to constructor injection
    @Autowired
    private NpeDemoRepo repo;

    // BUG: Streams over a possibly null collection from repo
    public List<String> getAllNames() {
        List<Item> items = repo.findAll();
        return items.stream().map(Item::getName).toList();
    }

    // BUG: Optional.get() on possibly empty Optional
    public Item getOne(Long id) {
        return repo.findById(id).get();
    }
}

