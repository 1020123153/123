package com.jk.service;

import com.jk.model.Goods;
import com.jk.model.UserDTO;

import java.util.List;

/**
 * Created by 10201 on 2017/11/16.
 */
public interface GoodsService {
    List<Goods> showGoods();



    List<UserDTO> toAddUser();


    void save(Goods goods);
}
