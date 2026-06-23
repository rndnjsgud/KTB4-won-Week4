package com.example.KTB_assignment_week4.dto.userDTO.Response;

import com.example.KTB_assignment_week4.domain.user.User;
import com.example.KTB_assignment_week4.domain.user.UserRole;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserLoginResponse {
    private final Long id;
    private final String nickname;
    private final String email;
    private final UserRole userRole;

    public static UserLoginResponse from(User user){
        return new UserLoginResponse(user.getId(),
                user.getNickname(),
                user.getEmail(),
                user.getUserRole());
    }
}
