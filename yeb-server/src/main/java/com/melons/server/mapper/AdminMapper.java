package com.melons.server.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.melons.server.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author melons
 * @since 2021-10-17
 */
@Mapper
public interface AdminMapper extends BaseMapper<Admin> {

    List<Admin> getAllAdmin(@Param("id") Integer id, @Param("keywords") String keywords);
}
