package edu.nextstep.racingcar.common;

import edu.nextstep.racingcar.step2.CalculatorError;

public class BusinessException extends RuntimeException {

    private final String code;
    private final String message;

    public BusinessException(Exception e, BusinessError error) {
        super(error.getMessage(), e);
        this.code = error.name();
        this.message = error.getMessage();
    }

    public BusinessException(BusinessError error) {
        this.code = error.name();
        this.message = error.getMessage();
    }
}
