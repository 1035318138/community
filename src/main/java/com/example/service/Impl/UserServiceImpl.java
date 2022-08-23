package com.example.service.Impl;


import com.example.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author ：mac
 * @Date ：2022/8/22 09:55
 */
@Service
public class UserServiceImpl  implements UserService {


   /* @Override
    public void deleteBySno(Integer id) {
        this.removeById(id);
    }

    @Override
    public void saveOrUpdate(UserDTO userDTO) {
        User user = this.getById(userDTO.getId());
        if (user != null) {
            // 修改
            BeanUtil.copyProperties(userDTO, user);
            user.setUpdateTime(new Date());
        } else {
            user = BeanUtil.copyProperties(userDTO, User.class);
            user.setUpdateTime(new Date());
            user.setCreateTime(new Date());
        }
        this.saveOrUpdate(user);
    }*/
}
