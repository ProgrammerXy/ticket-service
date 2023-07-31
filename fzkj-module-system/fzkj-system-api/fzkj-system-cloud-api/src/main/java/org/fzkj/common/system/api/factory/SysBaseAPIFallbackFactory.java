package org.fzkj.common.system.api.factory;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.fzkj.common.system.api.ISysBaseAPI;
import org.fzkj.common.system.api.fallback.SysBaseAPIFallback;
import org.springframework.stereotype.Component;

/**
 * @Description: SysBaseAPIFallbackFactory
 * @author: jeecg-boot
 */
@Component
public class SysBaseAPIFallbackFactory implements FallbackFactory<ISysBaseAPI> {

    @Override
    public ISysBaseAPI create(Throwable throwable) {
        SysBaseAPIFallback fallback = new SysBaseAPIFallback();
        fallback.setCause(throwable);
        return fallback;
    }
}