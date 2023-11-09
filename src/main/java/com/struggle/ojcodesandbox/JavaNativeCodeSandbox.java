package com.struggle.ojcodesandbox;

import com.struggle.ojcodesandbox.model.ExecuteCodeRequest;
import com.struggle.ojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

/**
 * @author Mr.Chen
 * Java原生代码沙箱实现（直接复用模板方法)
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}
