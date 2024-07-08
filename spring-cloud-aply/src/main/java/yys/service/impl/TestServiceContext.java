package yys.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Component
public class TestServiceContext {

    private static final Logger log = LoggerFactory.getLogger(TestServiceContext.class);

    @Autowired
    private List<TestServiceImpl> testServiceImpls;

    @Autowired
    private Map<String,TestServiceImpl> testServiceImplsMap;

    @PostConstruct
    void init() {
        if(!CollectionUtils.isEmpty(testServiceImpls)) {
            testServiceImpls.forEach(testService -> {
                log.info("serviceList---key:"+testService.getClass().getName()+",value:"+testService.getClass());
            });
        } else {
            log.info("testServiceImpls为空");
        }
        if(testServiceImplsMap!=null && testServiceImplsMap.size()>0) {
            testServiceImplsMap.forEach((key,value) -> {
                log.info("serviceMap---key:"+key+",value:"+value.getClass());
            });
        } else {
            log.info("testServiceImplsMap为空");
        }
    }

    public TestServiceImpl getServices(String key) {
        if(testServiceImplsMap!=null && testServiceImplsMap.size()>0) {
            return testServiceImplsMap.get(key);
        } else {
            log.info("获取key为"+key+"的service失败！");
            return null;
        }
    }
}
