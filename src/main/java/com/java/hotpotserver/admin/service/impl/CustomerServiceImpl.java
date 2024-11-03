package com.java.hotpotserver.admin.service.impl;

import com.java.hotpotserver.admin.entity.Customer;
import com.java.hotpotserver.admin.mapper.CustomerMapper;
import com.java.hotpotserver.admin.service.ICustomerService;
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
