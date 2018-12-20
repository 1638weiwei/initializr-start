package com.ww.spring.blog.repository;

import com.ww.spring.blog.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @ClassName UserRepository
 * @Author：WW
 * @Description
 * @Date: 11:27$ 2018/12/19$
 **/
public interface UserRepository extends CrudRepository<User, Long> {
}
