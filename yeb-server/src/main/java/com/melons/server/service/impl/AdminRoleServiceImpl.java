package com.melons.server.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.melons.server.mapper.AdminRoleMapper;
import com.melons.server.pojo.AdminRole;
import com.melons.server.service.IAdminRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author melons
 * @since 2021-10-17
 */
@Service
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleMapper, AdminRole> implements IAdminRoleService {

}
