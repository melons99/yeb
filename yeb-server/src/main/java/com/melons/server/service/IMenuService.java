package com.melons.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.melons.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
public interface IMenuService extends IService<Menu> {

    //通过用户ID查询菜单列表
    List<Menu> getMenusByAdminId();

    //根据角色获取菜单列表
    List<Menu> getMenusWithRole();

    //查询所有菜单
    List<Menu> getAllMenus();
}
