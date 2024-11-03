package com.java.hotpotserver.admin.service.impl;

import com.java.hotpotserver.admin.entity.Employee;
import com.java.hotpotserver.admin.mapper.EmployeeMapper;
import com.java.hotpotserver.admin.service.IEmployeeService;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
