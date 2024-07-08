package yys.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import yys.common.constant.ServiceTypeConstant;
import yys.common.enums.ServiceTypeEnum;

@Service(ServiceTypeConstant.Bird)
public class BirdFlowService extends TestServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(BirdFlowService.class);

    /**
     * 活动
     *
     * @param name 名字
     * @return 结果
     */
    @Override
    public String toGo(String name) {
        log.info(name+"开始活动！");
        this.toFly(name);
        return name+"开始活动！";
    }

    /**
     * 飞翔
     *
     * @param name 名字
     * @return 结果
     */
    public String toFly(String name) {
        log.info(name+"开始飞翔！");
        return name+"开始飞翔！";
    }

    /**
     * 工作
     *
     * @param name 名字
     * @return 结果
     */
    @Override
    public String toWork(String name) {
        log.info(name+"开始工作！");
        return name+"开始工作！";
    }
}
