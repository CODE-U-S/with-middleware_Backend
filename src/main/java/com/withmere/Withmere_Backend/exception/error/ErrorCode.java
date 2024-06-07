package com.withmere.Withmere_Backend.exception.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    FRIEND_DUPLICATE(HttpStatus.CONFLICT, "Follow Duplicate"), // 유저의 이메일이 중복됨
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "User Not Found"), // 유저를 찾을 수 없음
    FRIEND_NOT_FOUND(HttpStatus.NOT_FOUND, "Follow Not Found"), // 팔로우한 기록을 찾을 수 없음
    EXIST_LIKE(HttpStatus.CONFLICT, "Like Already Exists"), // 좋아요가 이미 있음
    LIKE_NOT_FOUND(HttpStatus.NOT_FOUND, "Like Not Found"), // 일치하는 좋아요 찾을 수 없음
    //한 이메일에 같은 제목을 가진 글이 중복됨.
    EMAIL_TITLE_DUPLICATE(HttpStatus.CONFLICT, "Post with the same email and title already exists"),
    //시작 날짜가 종료 날짜보다 미래임.
    START_CANNOT_END(HttpStatus.CONFLICT,"Start date cannot be after end date"),
    //시작 날짜가 과거임.
    STARTDATE_PAST(HttpStatus.CONFLICT, "Start date cannot be in the past");

    //일치하는 제목을 찾을 수 없음.
    private final HttpStatus status;
    private final String message;
}
