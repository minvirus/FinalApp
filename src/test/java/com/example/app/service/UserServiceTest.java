package com.example.app.service;

import com.example.app.domain.dto.UserDto;
import com.example.app.mapper.UserMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @Mock
    UserMapper userMapper;
    @InjectMocks
    UserService userService;

    UserDto userDto;

    @BeforeEach
    void setUp() {
        userDto= new UserDto();
        userDto.setUserNumber(1L);
        userDto.setUserId("aaa");
        userDto.setUserPassword("1234");
    }

    @Test
    void register() {
        //given
        doNothing().when(userMapper).insert(any());
        //when
        userService.register(userDto);
        //then
        verify(userMapper, time(1)).insert(any());
    }

    @Test
    void findUserNumber() {
        // given
         doReturn().when(userMapper).select
        // when
        // then
    }
}