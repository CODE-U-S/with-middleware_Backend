package com.withmere.Withmere_Backend.exception;

import com.withmere.Withmere_Backend.exception.error.BusinessException;
import com.withmere.Withmere_Backend.exception.error.ErrorCode;

public class FriendNotFoundException extends BusinessException {
    public static final BusinessException EXCEPTION =
            new FriendNotFoundException();

    private FriendNotFoundException() { super(ErrorCode.FRIEND_NOT_FOUND); }
}
