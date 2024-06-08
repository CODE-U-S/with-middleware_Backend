package com.withmere.Withmere_Backend.exception;

import com.withmere.Withmere_Backend.exception.error.BusinessException;
import com.withmere.Withmere_Backend.exception.error.ErrorCode;

public class StartCannotEndException extends BusinessException {
    public static final BusinessException EXCEPTION =
            new StartCannotEndException();

    public StartCannotEndException() { super(ErrorCode.START_CANNOT_END); }
}
