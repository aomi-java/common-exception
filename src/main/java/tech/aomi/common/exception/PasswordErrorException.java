package tech.aomi.common.exception;

import java.io.Serializable;

/**
 * 密码错误异常
 *
 * @author Sean createAt 2021/7/29
 */
public class PasswordErrorException extends ServiceException {

    private static final long serialVersionUID = -4912249393761049254L;

    public PasswordErrorException() {
        super();
    }

    public PasswordErrorException(String message) {
        super(message);
    }

    public PasswordErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordErrorException(Throwable cause) {
        super(cause);
    }

    @Override
    public Serializable getErrorCode() {
        return ErrorCode.PASSWORD_ERROR;
    }
}
