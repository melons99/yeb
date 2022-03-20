package com.melons.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.melons.server.pojo.Menu;
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
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     * 根据用户ID获取菜单
     * @param id
     * @return
     */
    List<Menu> getMenusByAdminId(Integer id);


    List<Menu> getMenusWithRole();

    List<Menu> getAllMenus();
}
