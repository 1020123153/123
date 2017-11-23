package com.jk.controller;

import com.jk.model.Goods;
import com.jk.model.UserDTO;
import com.jk.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.text.ParseException;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by 10201 on 2017/11/16.
 */
@Controller
public class GoodsController  {

    @Autowired
    private  GoodsService goodsService;

    @RequestMapping("/")
    public String index() {
        return "redirect:/showGoods";
    }
    @RequestMapping("/showGoods")
    public String showGoods (Model model){

        List<Goods> goodsLsit=goodsService.showGoods();
        model.addAttribute("goods", goodsLsit);

        return  "user/showGoods";
    }
    @RequestMapping("/toAddUser")
    public String toAddUser(Model model){
        List<UserDTO> dtosList=goodsService.toAddUser();
        model.addAttribute("dtos", dtosList);
        return  "user/addUser";
    }

    @RequestMapping("/add")
    public String add(Goods  goods, @RequestParam Map<String,String> link) throws ParseException {
      /*  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        indent.setCreateDate(sdf.parse(link.get("addcreateDate")));
        indent.setGatheringDate(sdf.parse(link.get("addgatheringDate")));
        indent.setShipmentsDate(sdf.parse(link.get("addshipmentsDate")));
        indentService.save(indent);*/
        goodsService.save(goods);
        return "redirect:/showGoods";
    }
}
