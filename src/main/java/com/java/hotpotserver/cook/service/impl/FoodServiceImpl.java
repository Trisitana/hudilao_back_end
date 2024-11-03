package com.java.hotpotserver.cook.service.impl;

import com.java.hotpotserver.cook.entity.Food;
import com.java.hotpotserver.cook.mapper.FoodMapper;
import com.java.hotpotserver.cook.service.IFoodService;
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
