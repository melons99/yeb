package com.melons.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.melons.server.mapper.MenuRoleMapper;
import com.melons.server.pojo.MenuRole;
import com.melons.server.pojo.RespBean;
import com.melons.server.service.IMenuRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
@Service
public class MenuRoleServiceImpl extends ServiceImpl<MenuRoleMapper, MenuRole> implements IMenuRoleService {

    @Autowired
    private MenuRoleMapper menuRoleMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    @Override
    @Transactional
    public RespBean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.delete(new QueryWrapper<MenuRole>().eq("rid",rid));
        if (mids == null || mids.length==0){
            Set<String> keys = redisTemplate.keys("menu" + "*");
            redisTemplate.delete(keys);
            return RespBean.success("更新成功");
        }
        Integer result = menuRoleMapper.insertRecord(rid, mids);
        if (mids.length == result){
            Set<String> keys = redisTemplate.keys("menu" + "*");
            redisTemplate.delete(keys);
            return RespBean.success("更新成功");
        }
        return RespBean.error("更新失败");
    }
}
