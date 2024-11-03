package com.java.hotpotserver.customer.service.impl;

import com.java.hotpotserver.customer.entity.Order;
import com.java.hotpotserver.customer.mapper.OrderMapper;
import com.java.hotpotserver.customer.service.IOrderService;
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
