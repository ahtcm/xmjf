package com.shsxt.xm.service;

import com.shsxt.xm.po.BasItem;
import com.shsxt.xm.query.BasItemQuery;
import com.shsxt.xm.utils.PageList;

/**
 * Created by GXR on 2017/11/9.
 */
public interface IBasItemService {
    public PageList queryBasItemsByParams(BasItemQuery basItemQuery);

    public void updateBasItemStatusToOpen(Integer itemId);

    public BasItem queryBasItemById(Integer itemId);
}
