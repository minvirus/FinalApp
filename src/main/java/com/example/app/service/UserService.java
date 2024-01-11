package com.example.app.service;

import com.example.app.domain.dto.UserDto;
import com.example.app.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    //    회원 정보 삽입
    public void register(UserDto userDto){
        userMapper.insert(userDto);
    }
    //    회원 번호 조회
    public Long findUserNumber (String userId,String userPassword){
        return userMapper.selectUserNumber(userId,userPassword)
                .orElseThrow(() -> new IllegalArgumentException("일치하는 회원 정보 없음"));
    }
}
