package com.withmere.Withmere_Backend.exception;

import com.withmere.Withmere_Backend.exception.error.BusinessException;
import com.withmere.Withmere_Backend.exception.error.ErrorCode;

public class FriendDuplicateException extends BusinessException {
    public static final BusinessException EXCEPTION =
            new FriendDuplicateException();

    private FriendDuplicateException() { super(ErrorCode.FRIEND_DUPLICATE); }
}