package org.fzkj.config.redis;

import lombok.NoArgsConstructor;
import org.jeecg.common.base.BaseMap;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

@Configuration
@NoArgsConstructor
public class FzkjRedisClient {
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    public void sendMessage(String handlerName, BaseMap params) {
        params.put("handlerName", handlerName);
        this.redisTemplate.convertAndSend("jeecg_redis_topic", params);
    }
}
