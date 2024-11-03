package com.java.hotpotserver.waiter.service.impl;

import com.java.hotpotserver.waiter.entity.Announcement;
import com.java.hotpotserver.waiter.mapper.AnnouncementMapper;
import com.java.hotpotserver.waiter.service.IAnnouncementService;
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
public class AnnouncementServiceImpl extends ServiceImpl<AnnouncementMapper, Announcement> implements IAnnouncementService {

}
