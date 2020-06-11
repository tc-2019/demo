package com.tc.service.impl;

import com.tc.entity.User;
import com.tc.dao.UserDao;
import com.tc.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tc
 * @since 2020-06-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
	
}
