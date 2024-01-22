package com.booboil.booboilojbackendjudgeservice.controller.inner;

import com.booboil.booboil0jbackendserviceclient.JudgeFeignClient;
import com.booboil.booboilojbackendjudgeservice.judge.JudgeService;
import com.booboil.booboilojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/inner")
public class JudgeInnerController implements JudgeFeignClient {

    @Resource
    private JudgeService judgeService;


    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    @Override
    @PostMapping("/do")
    public QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId){
        return judgeService.doJudge(questionSubmitId);
    }
}
