package com.melons.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.melons.server.pojo.Employee;
import com.melons.server.pojo.Nation;
import com.melons.server.pojo.RespPageBean;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhanglishen
 * @since 2020-11-14
 */


public interface INationService extends IService<Nation> {



}
