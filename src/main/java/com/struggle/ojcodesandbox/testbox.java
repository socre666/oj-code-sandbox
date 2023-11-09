package com.struggle.ojcodesandbox;

import cn.hutool.core.io.resource.ResourceUtil;
import com.struggle.ojcodesandbox.model.ExecuteCodeRequest;
import com.struggle.ojcodesandbox.model.ExecuteCodeResponse;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author Mr.Chen
 */
public class testbox {
    public static void main(String[] args) {
            JavaNativeCodeSandbox javaNativeCodeSandbox = new JavaNativeCodeSandbox();
            ExecuteCodeRequest executeCodeRequest = new ExecuteCodeRequest();
            executeCodeRequest.setInputList(Arrays.asList("1 2","3 4"));
//        String code = ResourceUtil.readStr("testCode/simpleComputeArgs/Main.java", StandardCharsets.UTF_8);
            String code = ResourceUtil.readStr("testCode/simpleComputeArgs/Main.java", StandardCharsets.UTF_8);
//        String code = ResourceUtil.readStr("testCode/simpleCompute/Main.java", StandardCharsets.UTF_8);
            executeCodeRequest.setCode(code);
            executeCodeRequest.setLanguage("java");

            ExecuteCodeResponse executeCodeResponse = javaNativeCodeSandbox.executeCode(executeCodeRequest);
            System.out.println(executeCodeResponse);
        }

}
