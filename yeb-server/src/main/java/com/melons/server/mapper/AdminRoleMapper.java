package com.melons.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.melons.server.pojo.AdminRole;
import com.melons.server.pojo.RespBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author melons
 * @since 2021-10-17
 */
@Mapper
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

    Integer addAdminRole(@Param("adminId") Integer adminId, @Param("rids") Integer[] rids);
}
