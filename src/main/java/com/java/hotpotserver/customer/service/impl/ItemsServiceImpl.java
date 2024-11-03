package com.java.hotpotserver.customer.service.impl;

import com.java.hotpotserver.customer.entity.Items;
import com.java.hotpotserver.customer.mapper.ItemsMapper;
import com.java.hotpotserver.customer.service.IItemsService;
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
