package com.withmere.Withmere_Backend.exception;

import com.withmere.Withmere_Backend.exception.error.BusinessException;
import com.withmere.Withmere_Backend.exception.error.ErrorCode;

public class EmailTitleDuplaicateException extends BusinessException{
    public static final BusinessException EXCEPTION =
            new EmailTitleDuplaicateException();

    public EmailTitleDuplaicateException() { super(ErrorCode.EMAIL_TITLE_DUPLICATE); }
}
