package org.fzkj.modules.message.service.impl;

import org.fzkj.common.system.base.service.impl.JeecgServiceImpl;
import org.fzkj.modules.message.entity.SysMessage;
import org.fzkj.modules.message.mapper.SysMessageMapper;
import org.fzkj.modules.message.service.ISysMessageService;
import org.springframework.stereotype.Service;

/**
 * @Description: 消息
 * @Author: jeecg-boot
 * @Date:  2019-04-09
 * @Version: V1.0
 */
@Service
public class SysMessageServiceImpl extends JeecgServiceImpl<SysMessageMapper, SysMessage> implements ISysMessageService {

}
