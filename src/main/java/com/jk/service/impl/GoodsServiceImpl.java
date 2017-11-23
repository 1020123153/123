package com.jk.service.impl;

import com.jk.dao.GoodsRepository;
import com.jk.dao.UserRepository;
import com.jk.model.Goods;
import com.jk.model.UserDTO;
import com.jk.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by 10201 on 2017/11/16.
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsRepository goodsRepository;
    @Autowired
    private UserRepository userRepository;
    @Cacheable(value="goods-list" ,key = "'goodslist'")

    public List<Goods> showGoods() {

        return goodsRepository.findAll();
    }

    @Cacheable(value="user-list" ,key = "'userlist'")
    public List<UserDTO> toAddUser() {
        return userRepository.findAll();
    }
    @CachePut(value="goods-list" ,key = "'goodslist'")
    public void save(Goods goods) {
        goodsRepository.save(goods);


    }
}
