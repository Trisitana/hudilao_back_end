package com.java.hotpotserver.cook.service.impl;

import com.java.hotpotserver.cook.entity.Order;
import com.java.hotpotserver.cook.mapper.OrderMapper;
import com.java.hotpotserver.cook.service.IOrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
