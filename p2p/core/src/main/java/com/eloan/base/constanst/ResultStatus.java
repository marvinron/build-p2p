package com.eloan.base.constanst;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 邱润泽
 *
 *  10000-19999 系统或注册相关
 *
 *  20000-29999 借款相关
 */
@Getter
public enum ResultStatus {

    SUCCESS(0, "成功"),
    FAILD(-1, "失败"),
    EXCEPTION(-1, "系统异常"),
    PARAM_ERROR(10000, "参数错误"),
    SYSTEM_ERROR(10001, "系统错误"),
    FILE_NOT_EXIST(10002, "文件不存在"),
    FILE_NOT_DOWNLOAD(10003, "文件没有下载"),
    FILE_NOT_GENERATE(10004, "文件没有生成"),
    FILE_NOT_STORAGE(10005, "文件没有入库"),
    SYSTEM_DB_ERROR(10006, "数据库系统错误"),
    FILE_ALREADY_DOWNLOAD(10007, "文件已经下载"),
    DATA_ALREADY_PEXISTS(10008, "数据已经存在");

    private int code ;
    private String message;

    ResultStatus(int code , String message){
        this.code = code;
        this.message = message;
    }


}
