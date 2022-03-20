package com.melons.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.melons.server.pojo.MenuRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
@Mapper
public interface MenuRoleMapper extends BaseMapper<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    Integer insertRecord(@Param("rid")Integer rid,@Param("mids") Integer[] mids);

}
