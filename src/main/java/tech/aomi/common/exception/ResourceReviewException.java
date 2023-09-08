package tech.aomi.common.exception;

import java.io.Serializable;

/**
 * 资源审核中异常
 */
public class ResourceReviewException extends ServiceException {

    public ResourceReviewException() {
        super();
    }

    public ResourceReviewException(String message) {
        super(message);
    }

    public ResourceReviewException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceReviewException(Throwable cause) {
        super(cause);
    }

    @Override
    public Serializable getErrorCode() {
        return ErrorCode.RESOURCE_REVIEW;
    }
}

