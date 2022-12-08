package os.services.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import os.domain.User_db;
import os.repositories.UserRepository;

import java.util.Optional;

@SpringBootTest
class UserServiceImplTest {

    private static final int ID          = 11;
    private static final String USERNAME = "teste1";
    private static final String PASSWORD = "teste321";

    @InjectMocks
    private UserServiceImpl service;

    @Mock
    private UserRepository repository;


    private User_db user;

    private Optional<User_db> optionalUser_db;

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

        Optional<User_db> response = service.findById(ID);

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
        user = new User_db(ID, USERNAME, PASSWORD);
    }
}