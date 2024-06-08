package com.withmere.Withmere_Backend.exception;

import com.withmere.Withmere_Backend.exception.error.BusinessException;
import com.withmere.Withmere_Backend.exception.error.ErrorCode;

public class StartDatePastException extends BusinessException {
    public static final BusinessException EXCEPTION =
            new StartDatePastException();

    public StartDatePastException() { super(ErrorCode.STARTDATE_PAST); }
}
