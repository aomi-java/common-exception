package tech.aomi.common.exception;

import java.io.Serializable;

/**
 * 无效的凭据
 *
 * @author Sean createAt 2021/7/29
 */
public class BadCredentialsException extends ServiceException {
    private static final long serialVersionUID = -3292594554397039970L;

    public BadCredentialsException() {
        super();
    }

    public BadCredentialsException(String message) {
        super(message);
    }

    public BadCredentialsException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadCredentialsException(Throwable cause) {
        super(cause);
    }

    @Override
    public Serializable getErrorCode() {
        return ErrorCode.INVALID_CREDENTIAL;
    }
}
