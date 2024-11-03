package com.java.hotpotserver.customer.service.impl;

import com.java.hotpotserver.customer.entity.Customer;
import com.java.hotpotserver.customer.mapper.CustomerMapper;
import com.java.hotpotserver.customer.service.ICustomerService;
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
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}
