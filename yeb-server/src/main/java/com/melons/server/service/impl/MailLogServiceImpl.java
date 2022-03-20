package com.melons.server.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.melons.server.mapper.MailLogMapper;
import com.melons.server.pojo.MailLog;
import com.melons.server.service.IMailLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author melons
 * @since 2021-10-17
 */
@Service
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
