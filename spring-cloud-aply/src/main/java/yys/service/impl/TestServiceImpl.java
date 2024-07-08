package yys.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import yys.service.TestService;

@Service
public abstract class TestServiceImpl implements TestService {

    private static final Logger log = LoggerFactory.getLogger(TestServiceImpl.class);

    public String preToDo(String name) {
        log.info(name+"准备开始工作！");
        toGo(name);
        return name+"准备开始工作！";
    }
    /**
     * 活动
     *
     * @param name 名字
     * @return 结果
     */
    protected abstract String toGo(String name);

}
