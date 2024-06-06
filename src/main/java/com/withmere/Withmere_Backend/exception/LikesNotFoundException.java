package com.withmere.Withmere_Backend.exception;

import com.withmere.Withmere_Backend.domain.BaseTimeEntity;
import com.withmere.Withmere_Backend.exception.error.BusinessException;
import com.withmere.Withmere_Backend.exception.error.ErrorCode;

public class LikesNotFoundException extends BusinessException {
    public static final BusinessException EXCEPTION =
            new LikesNotFoundException();

    public LikesNotFoundException() {
        super(ErrorCode.LIKE_NOT_FOUND);
    }
}
