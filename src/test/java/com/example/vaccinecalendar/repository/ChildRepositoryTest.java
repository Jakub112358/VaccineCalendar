package com.example.vaccinecalendar.repository;

import com.example.vaccinecalendar.model.ChildModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import javax.validation.ConstraintViolationException;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
class ChildRepositoryTest {
    @Autowired
    ChildRepository repo;
    @Autowired
    TestEntityManager entityManager;

    @Test
    @DisplayName("ChildRepository is bootstrapped")
    void injectedComponentsAreNotNull() {
        assertNotNull(repo);
        assertNotNull(entityManager);
    }

    @ParameterizedTest
    @MethodSource("supplyValidTestChild")
    @DisplayName("Given valid ChildModel when persisting then OK")
    void givenValidChild_isPersisted(ChildModel child) {
        repo.save(child);
        ChildModel persisted = repo.findById(child.getId()).orElseThrow();

        assertEquals(child, persisted);
    }

    @ParameterizedTest
    @MethodSource("supplyInvalidTestChild")
    @DisplayName("Given invalid ChildModel when persisting then throws")
    void givenInvalidChild_throws(ChildModel child) {
        assertThrows(ConstraintViolationException.class, () -> repo.save(child));
    }


    private static List<ChildModel> supplyValidTestChild() {
        LocalDate today = LocalDate.now();
        return List.of(
                new ChildModel(0, "ĄĆĘŁÓŚŹŻąćęłóśźż", today, today, true),
                new ChildModel(0, "Jan Kowalski", today.minusDays(5), today, true),
                new ChildModel(0, "A-B", today, today.minusDays(5), true)
        );
    }

    private static List<ChildModel> supplyInvalidTestChild() {
        LocalDate today = LocalDate.now();
        return List.of(
                //Name can't be empty
                new ChildModel(0, "", today, today, true),
                new ChildModel(0, "   ", today, today, true),
                new ChildModel(0, "\n", today, today, true),
                //Terms must be accepted
                new ChildModel(0, "Zbyszek", today, today, false)
        );
    }
}