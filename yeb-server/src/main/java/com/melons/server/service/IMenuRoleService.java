package com.melons.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.melons.server.pojo.MenuRole;
import com.melons.server.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);

}
