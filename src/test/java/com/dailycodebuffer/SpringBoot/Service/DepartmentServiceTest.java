package com.dailycodebuffer.SpringBoot.Service;

import com.dailycodebuffer.SpringBoot.Entity.Department;
import com.dailycodebuffer.SpringBoot.Repository.DepartmentRepository;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department = Department.builder().departmentName("IT")
                .departmentAddress("Surat")
                .departmentCode("IT06")
                .departmentId(1L)
                .build();

        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT")).thenReturn(department);
    }

    @Test
    @DisplayName("Get Data Based on Valid Department Name")
    //@Disabled
    public void whenvalidDepartmentName_ThenDepartmentShouldFind(){

        String departName = "IT";
        Department found = departmentService.fetchDepartmentByName(departName);
        assertEquals(departName,found.getDepartmentName());

    }
}