package com.zxgs.service.impI;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import com.zxgs.dao.UserMapper;
import com.zxgs.pojo.User;
import com.zxgs.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Resource
    public UserMapper userMapper;

    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userMapper.selectByPrimaryKey(userId);
    }

}
