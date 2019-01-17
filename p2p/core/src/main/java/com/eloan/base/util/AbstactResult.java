package com.eloan.base.util;

import com.eloan.base.constanst.ResultStatus;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 邱润泽
 */
@Setter
@Getter
public class AbstactResult {

    private ResultStatus status ;

    private int code ;

    private String message;

    /**
     * @param status
     */
    protected AbstactResult(ResultStatus status){
    this.code = status.getCode();
    this.message = status.getMessage();
    this.status = status;
    }

    /**
     * @param status
     * @param message
     */
    protected AbstactResult(ResultStatus status, String message) {
        this.code = status.getCode();
        this.status = status;
        this.message = message;
    }

    public static boolean isSuccess(AbstactResult result){
        return result != null &&
                result.status == ResultStatus.SUCCESS &&
                result.getCode() == ResultStatus.SUCCESS.getCode();
    }


    public AbstactResult withError(ResultStatus status) {
        this.status = status;
        return this;
    }


    public AbstactResult withError(ResultStatus status,String message) {
        this.status = status;
        this.code = status.getCode();
        this.message = message;
        return this;
    }


    public AbstactResult withError(int code,String message) {
        this.code = code;
        this.message = message;
        return this;
    }

    public AbstactResult withError(String message) {
        this.status = ResultStatus.SYSTEM_ERROR;
        this.message = message;
        return this;
    }

    public AbstactResult success() {
        this.status = ResultStatus.SUCCESS;
        return this;
    }

}
