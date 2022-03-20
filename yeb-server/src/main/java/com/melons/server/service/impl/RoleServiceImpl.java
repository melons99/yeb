package com.melons.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.melons.server.mapper.RoleMapper;
import com.melons.server.pojo.Role;
import com.melons.server.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
