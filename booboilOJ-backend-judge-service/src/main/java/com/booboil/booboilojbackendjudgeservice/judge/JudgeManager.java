package com.booboil.booboilojbackendjudgeservice.judge;

import com.booboil.booboilojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.booboil.booboilojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.booboil.booboilojbackendjudgeservice.judge.strategy.JudgeContext;
import com.booboil.booboilojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.booboil.booboilojbackendmodel.model.codesandbox.JudgeInfo;
import com.booboil.booboilojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
