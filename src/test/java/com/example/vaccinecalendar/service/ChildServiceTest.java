package com.example.vaccinecalendar.service;

import com.example.vaccinecalendar.model.ChildModel;
import com.example.vaccinecalendar.repository.ChildRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.validation.ConstraintViolationException;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
class ChildServiceTest {

    @Mock
    private ChildRepository repo;

    @InjectMocks
    private ChildService service;

    @Test
    @DisplayName("Given valid child, when addChild(), then ChildRepository.save(child) is invoked")
    void addChild_invokesRepo() {
        //given
        ChildModel child = supplyValidChild();

        //when
        service.addChild(child);

        //then
        ArgumentCaptor<ChildModel> argCaptor = ArgumentCaptor.forClass(ChildModel.class);
        verify(repo).save(argCaptor.capture());

        assertEquals(child, argCaptor.getValue());
    }

    @Test
    @DisplayName("Given repo exception, when addChild(), then handles exception")
    void givenRepoException_addChild_handles() {
        //given
        ChildModel child = supplyValidChild();
        given(repo.save(child)).willThrow(ConstraintViolationException.class);

        //when
        //then
        assertDoesNotThrow(() -> service.addChild(child));
        verify(repo).save(child);
    }

    @Test
    @DisplayName("When getting child list, then ChildRepository.findAll() is invoked")
    void getChildList_invokesRepo() {
        //given
        List<ChildModel> children = createChildren();
        given(repo.findAll()).willReturn(children);

        //when
        List<ChildModel> actual = service.getChildList();

        //then
        verify(repo).findAll();
        assertEquals(children, actual); //List.equals(list) is true if-only-if size/order/elements are identical
    }

    private List<ChildModel> createChildren() {
        return Stream.generate(this::supplyValidChild)
                .limit(2)
                .toList();
    }

    private ChildModel supplyValidChild() {
        LocalDate today = LocalDate.now();
        return new ChildModel(0, "Gabi", today, today, true);
    }
}