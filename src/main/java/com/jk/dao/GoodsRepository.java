package com.jk.dao;

import com.jk.model.Goods;
import com.jk.model.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods, Long> {

    Goods findById(long id);

    Long deleteById(Long id);
}