package com.struggle.ojcodesandbox;


import com.struggle.ojcodesandbox.model.ExecuteCodeRequest;
import com.struggle.ojcodesandbox.model.ExecuteCodeResponse;

/**
 * @author Mr.Chen
 * 代码沙箱接口的定义
 */
public interface CodeSandbox {
    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
