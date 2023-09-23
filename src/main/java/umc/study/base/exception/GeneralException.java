package umc.study.base.exception;

import lombok.Getter;
import umc.study.base.Code;

@Getter
public class GeneralException extends RuntimeException{
    private final Code errorCode;

    public GeneralException() {
        super(Code._INTERNAL_SERVER_ERROR.getMessage());
        this.errorCode = Code._INTERNAL_SERVER_ERROR;
    }

    public GeneralException(String message) {
        super(Code._INTERNAL_SERVER_ERROR.getMessage(message));
        this.errorCode = Code._INTERNAL_SERVER_ERROR;
    }

    public GeneralException(String message, Throwable cause) {
        super(Code._INTERNAL_SERVER_ERROR.getMessage(message), cause);
        this.errorCode = Code._INTERNAL_SERVER_ERROR;
    }

    public GeneralException(Throwable cause) {
        super(Code._INTERNAL_SERVER_ERROR.getMessage(cause));
        this.errorCode = Code._INTERNAL_SERVER_ERROR;
    }

    public GeneralException(Code errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public GeneralException(Code errorCode, String message) {
        super(errorCode.getMessage(message));
        this.errorCode = errorCode;
    }

    public GeneralException(Code errorCode, String message, Throwable cause) {
        super(errorCode.getMessage(message), cause);
        this.errorCode = errorCode;
    }

    public GeneralException(Code errorCode, Throwable cause) {
        super(errorCode.getMessage(cause), cause);
        this.errorCode = errorCode;
    }
}

