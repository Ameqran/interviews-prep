package com.fm.fieldmanager.adapters.out.memory;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class NpeDemoRepo {

    public static class Item {
        private final Long id;
        private final String name;

        public Item(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    private final Map<Long, Item> store = new HashMap<>();

    public NpeDemoRepo() {
        // Seed with a single item
        store.put(1L, new Item(1L, "Seeded Item"));
    }

    // BUG: returns null instead of empty list when there are no items
    public List<Item> findAll() {
        if (store.isEmpty()) {
            return null; // should be Collections.emptyList()
        }
        return new ArrayList<>(store.values());
    }

    public Optional<Item> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }
}

