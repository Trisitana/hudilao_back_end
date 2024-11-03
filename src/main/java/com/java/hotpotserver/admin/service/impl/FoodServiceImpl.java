package com.java.hotpotserver.admin.service.impl;

import com.java.hotpotserver.admin.entity.Food;
import com.java.hotpotserver.admin.mapper.FoodMapper;
import com.java.hotpotserver.admin.service.IFoodService;
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
public class FoodServiceImpl extends ServiceImpl<FoodMapper, Food> implements IFoodService {

}
