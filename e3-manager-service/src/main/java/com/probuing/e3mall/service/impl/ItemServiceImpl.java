package com.probuing.e3mall.service.impl;

import com.probuing.e3mall.mapper.TbItemMapper;
import com.probuing.e3mall.pojo.TbItem;
import com.probuing.e3mall.pojo.TbItemExample;
import com.probuing.e3mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: wxblack-mac
 * @Date: 2018/9/13 17:57
 * @Description:
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper mapper;

    @Override
    public TbItem getItemById(long id) {
        TbItemExample tbItemExample = new TbItemExample();
        TbItemExample.Criteria criteria = tbItemExample.createCriteria();
        criteria.andIdEqualTo(id);
        //执行查询
        List<TbItem> list = mapper.selectByExample(tbItemExample);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
