package com.probuing.e3mall.controller;

import com.probuing.e3mall.pojo.TbItem;
import com.probuing.e3mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/9/13 17:59
 * @Description:
 */
@Controller
public class ItemController {
    @Autowired
    ItemService service;

    @RequestMapping(value = "/item/{itemid}")
    @ResponseBody
    public TbItem getItemById(@PathVariable long itemid) {
        return service.getItemById(itemid);
    }
}
