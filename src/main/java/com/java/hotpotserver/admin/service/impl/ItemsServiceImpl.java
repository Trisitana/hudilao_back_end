package com.java.hotpotserver.admin.service.impl;

import com.java.hotpotserver.admin.entity.Items;
import com.java.hotpotserver.admin.mapper.ItemsMapper;
import com.java.hotpotserver.admin.service.IItemsService;
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
