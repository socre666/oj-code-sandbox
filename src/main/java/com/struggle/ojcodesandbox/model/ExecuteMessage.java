package com.struggle.ojcodesandbox.model;

import lombok.Data;

/**
 * @author Mr.Chen
 * 进程执行信息
 */
@Data
public class ExecuteMessage {
    private int exitValue;

    private String message;

    private String errorMessage;

    private Long time;

    private Long memory;
}
