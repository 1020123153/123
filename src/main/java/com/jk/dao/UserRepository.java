package com.jk.dao;

import com.jk.model.Goods;
import com.jk.model.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 10201 on 2017/11/16.
 */

public interface UserRepository extends JpaRepository<UserDTO, Long> {
}
