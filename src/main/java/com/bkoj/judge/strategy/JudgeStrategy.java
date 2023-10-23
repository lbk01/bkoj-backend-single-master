package com.bkoj.judge.strategy;

import com.bkoj.judge.codesandbox.model.JudgeInfo;

/**
 * 判题策略
 * @author bk
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}