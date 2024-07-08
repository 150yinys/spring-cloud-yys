package yys.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yys.common.constant.ServiceTypeConstant;

@Service(ServiceTypeConstant.Worm)
public class WormFlowService extends TestServiceImpl {

    private static final Logger log = LoggerFactory.getLogger(WormFlowService.class);

    /**
     * 活动
     *
     * @param name 名字
     * @return 结果
     */
    @Override
    public String toGo(String name) {
        log.info(name+"开始活动！");
        this.toDirlling(name);
        return name+"开始活动！";
    }

    /**
     * 钻地
     *
     * @param name 名字
     * @return 结果
     */
    public String toDirlling(String name) {
        log.info(name+"开始钻地！");
        return name+"开始钻地！";
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
