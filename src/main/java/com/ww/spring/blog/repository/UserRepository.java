package com.ww.spring.blog.repository;

import com.ww.spring.blog.domain.User;

import java.util.List;

/**
 * @ClassName UserRepository
 * @Author：WW
 * @Description
 * @Date: 11:27$ 2018/12/19$
 **/
public interface UserRepository {
    User saveOrUpdateUser(User user);

    void deleteUser(Long id);

    User getUserById(Long id);

    List<User> listUsers();
}
