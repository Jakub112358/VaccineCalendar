package com.example.vaccinecalendar.integration;

import com.example.vaccinecalendar.repository.ChildRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
@AutoConfigureMockMvc
class ChildIntegrationTest {

    @Autowired
    private ChildRepository repo;

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Can post child")
    @Disabled
    void canPostChild() {
        throw new RuntimeException("Not yet implemented.");
    }

    @Test
    @DisplayName("Can get children list")
    @Disabled
    void canGetChildren() {
        throw new RuntimeException("Not yet implemented.");
    }
}