package com.fm.fieldmanager;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class NpeDemoTest {

    @Autowired
    MockMvc mvc;

    @Test
    @DisplayName("GET /api/npe/all should return empty list, not NPE")
    void allShouldReturnEmptyList() throws Exception {
        // Expectation: 200 OK with [] when repository is empty — not NPE.
        // Current behavior: NPE due to null collection returned from repo and streamed.
        mvc.perform(get("/api/npe/all").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("[]"));
    }

    @Test
    @DisplayName("GET /api/npe/999 should be 404 when item not found")
    void oneShouldReturn404WhenMissing() throws Exception {
        // Expectation: 404 Not Found, not NoSuchElementException/500.
        mvc.perform(get("/api/npe/999").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

    @Test
    @DisplayName("GET /api/npe/1 should return seeded item")
    void oneShouldReturnSeededItem() throws Exception {
        mvc.perform(get("/api/npe/1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.name").value("Seeded Item"));
    }
}

