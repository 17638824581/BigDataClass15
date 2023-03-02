package com.dahua.exception;

/**
 * 超重异常
 * @author Mr.yu
 * @date 2022/11/2 16:38
 */
public class OverloadException extends RuntimeException {

    public OverloadException() {
        super();
    }

    public OverloadException(String message) {
        super(message);
    }

}
