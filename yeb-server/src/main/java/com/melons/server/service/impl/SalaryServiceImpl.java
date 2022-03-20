package com.melons.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.melons.server.mapper.SalaryMapper;
import com.melons.server.pojo.Salary;
import com.melons.server.service.ISalaryService;
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
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, Salary> implements ISalaryService {

}
