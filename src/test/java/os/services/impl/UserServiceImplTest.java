package os.services.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import os.model.User;
import os.repositories.UserRepository;

import java.util.Optional;

@SpringBootTest
class UserServiceImplTest {

    private static final int ID          = 11;
    private static final String USERNAME = "teste1";
    private static final String EMAIL    = "email@email";
    private static final String PASSWORD = "teste321";

    @InjectMocks
    private UserServiceImpl service;

    @Mock
    private UserRepository repository;


    private User user;

    private Optional<User> optionalUser_db;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startUser();
    }

    @Test
    void findAllUser() {
    }

    @Test
    void whenFindBiByIdThenReturnAnUserInstance() {
        Mockito.when(repository.findById(Mockito.anyInt())).thenReturn((optionalUser_db));

        Optional<User> response = service.findById(ID);

        Assertions.assertEquals(Optional.class, response.getClass());
    }

    @Test
    void saveUser() {
    }

    @Test
    void updateUser() {
    }

    @Test
    void deleteUser() {
    }

    private void startUser() {
        user = new User(ID, USERNAME, EMAIL, PASSWORD);
    }
}