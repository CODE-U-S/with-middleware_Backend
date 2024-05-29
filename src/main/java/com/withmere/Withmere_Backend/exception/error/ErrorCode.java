package com.withmere.Withmere_Backend.exception.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    FOLLOW_DUPLICATE(HttpStatus.CONFLICT, "Follow Duplicate"), // 유저의 이메일이 중복됨
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "User Not Found"), // 유저를 찾을 수 없음
    FOLLOW_NOT_FOUND(HttpStatus.NOT_FOUND, "Follow Not Found"); // 팔로우한 기록을 찾을 수 없음

    private final HttpStatus status;
    private final String message;
}
