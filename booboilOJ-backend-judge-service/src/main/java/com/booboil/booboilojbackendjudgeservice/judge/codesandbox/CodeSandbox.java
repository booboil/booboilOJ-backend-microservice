package com.booboil.booboilojbackendjudgeservice.judge.codesandbox;

import com.booboil.booboilojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.booboil.booboilojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
