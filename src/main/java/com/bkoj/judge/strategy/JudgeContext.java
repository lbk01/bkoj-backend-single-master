package com.bkoj.judge.strategy;


import com.bkoj.judge.codesandbox.model.JudgeInfo;
import com.bkoj.model.dto.question.JudgeCase;
import com.bkoj.model.entity.Question;
import com.bkoj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 * @author bk
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
