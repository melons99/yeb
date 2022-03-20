package com.melons.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.melons.server.mapper.PositionMapper;

import com.melons.server.pojo.Position;
import com.melons.server.service.IPositionService;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
@Service
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements IPositionService {

}
