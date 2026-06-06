package com.example.KTB_assignment_week4.controller;

import com.example.KTB_assignment_week4.dto.UserInfoResponse;
import com.example.KTB_assignment_week4.dto.UserLoginRequest;
import com.example.KTB_assignment_week4.dto.UserSignupRequest;
import com.example.KTB_assignment_week4.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    public final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/login")  //로그인 메소드
    public String userLogin(@Valid @RequestBody UserLoginRequest userLoginRequest){
        String response = userService.login(userLoginRequest);
        return response;
    }

    @PostMapping("/signup")
    public Long userSignup(@Valid @RequestBody UserSignupRequest userSignupRequest){
        Long response = userService.signup(userSignupRequest);
        return response;
    }

    @GetMapping("/{userId}")
    public UserInfoResponse getUserInfo(@Valid @PathVariable Long userId){
        UserInfoResponse userInfoResponse = userService.getUserInfo(userId);

        return userInfoResponse;
    }
}
