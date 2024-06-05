package com.withmere.Withmere_Backend.exception;

import com.withmere.Withmere_Backend.exception.error.BusinessException;
import com.withmere.Withmere_Backend.exception.error.ErrorCode;

public class LikesExistException extends BusinessException {
    public static final BusinessException EXCEPTION =
            new LikesExistException();
    private LikesExistException() {
        super(ErrorCode.EXIST_LIKE);
    }
}
