package com.withmere.Withmere_Backend.exception;

import com.withmere.Withmere_Backend.exception.error.BusinessException;
import com.withmere.Withmere_Backend.exception.error.ErrorCode;

public class EmailNicknameMismatchException extends BusinessException{
    public static final BusinessException EXCEPTION =
            new EmailNicknameMismatchException();

    public EmailNicknameMismatchException() { super(ErrorCode.EMAIL_TITLE_DUPLICATE); }
}
