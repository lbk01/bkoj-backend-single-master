package com.bkoj.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.bkoj.model.entity.UserCode;

/**
* @author bk
* @description 针对表【user_code(用户)】的数据库操作Service
* @createDate 2023-07-19 16:00:09
*/
public interface UserCodeService extends IService<UserCode> {

    /**
     * 查看用户有无调用次数
     * @param userId
     * @return
     */
    UserCode getUserCodeByUserId(long userId);
}
