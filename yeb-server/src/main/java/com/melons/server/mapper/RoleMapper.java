package com.melons.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.melons.server.pojo.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据用户ID查询角色列表
     * @param adminId
     * @return
     */
    List<Role> getRolesByAdminId(Integer adminId);
}
