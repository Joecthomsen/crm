//package com.crm.crm.service;
//
//import com.crm.crm.models.User;
//import com.crm.crm.repository.UserRepository;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.verify;
//
//class UserServiceTest {
//
//    @Mock
//    private UserRepository userRepository;
//    private AutoCloseable autoCloseable;
//    private UserService userServiceTest;
//
//    @BeforeEach
//    void setUp() {
//        autoCloseable = MockitoAnnotations.openMocks(this);
//        userServiceTest = new UserService(userRepository);
//    }
//
//    @AfterEach
//    void tearDown() throws Exception {
//        autoCloseable.close();
//    }
//
//    @Test
//    void addUser() {
//        User testUser = new User(10203040, "test@test.test" , "Johannes" , "Test" , "Hejhejtest");
//        userServiceTest.addUser(testUser);
//    }
//
//    @Test
//    @Disabled
//    void getUser() {
//    }
//
//    @Test
//    void getAllUsers() {
//        userServiceTest.getAllUsers();
//        verify(userRepository).findAll();
//    }
//}