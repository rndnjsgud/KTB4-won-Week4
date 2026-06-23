package com.example.KTB_assignment_week4.dto.userDTO.Response;

import com.example.KTB_assignment_week4.domain.user.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserSignupResponse {
    private final Long id;
    private final String email;
    private final String nickname;

    public static UserSignupResponse from(User user){
        return new UserSignupResponse(user.getId(), user.getEmail(), user.getNickname());
    }
}
