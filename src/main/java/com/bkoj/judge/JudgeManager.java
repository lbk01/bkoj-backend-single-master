package com.bkoj.judge;

import com.bkoj.judge.codesandbox.model.JudgeInfo;
import com.bkoj.judge.strategy.DefaultJudgeStrategy;
import com.bkoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.bkoj.judge.strategy.JudgeContext;
import com.bkoj.judge.strategy.JudgeStrategy;
import com.bkoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 * @author bk
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
        String language = questionSubmit.getSubmitLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}