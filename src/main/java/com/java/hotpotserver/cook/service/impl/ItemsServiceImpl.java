package com.java.hotpotserver.cook.service.impl;

import com.java.hotpotserver.cook.entity.Items;
import com.java.hotpotserver.cook.mapper.ItemsMapper;
import com.java.hotpotserver.cook.service.IItemsService;
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
