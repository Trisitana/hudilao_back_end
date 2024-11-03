package com.java.hotpotserver.waiter.service.impl;

import com.java.hotpotserver.waiter.entity.Items;
import com.java.hotpotserver.waiter.mapper.ItemsMapper;
import com.java.hotpotserver.waiter.service.IItemsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fengyu
 * @since 2023-08-29
 */
@Service
public class ItemsServiceImpl extends ServiceImpl<ItemsMapper, Items> implements IItemsService {

}
