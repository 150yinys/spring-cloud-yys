package yys.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import yys.entity.WormEntity;
import yys.service.WormService;

@Service("wormService")
public class WormServiceImpl implements WormService {

    private static final Logger log = Logger.getLogger(WormServiceImpl.class);

    /**
     * 新增
     *
     * @param wormEntity
     * @return
     */
    @Override
    public String save(WormEntity wormEntity) {
        log.info("新增成功，参数 ："+wormEntity.getName());
        return "新增成功，参数："+wormEntity.getName();
    }

    /**
     * 删除
     *
     * @param pkId
     * @return
     */
    @Override
    public String delete(String pkId) {
        log.info("删除成功，参数："+pkId);
        return "删除成功，参数："+pkId;
    }

    /**
     * 查询
     *
     * @param pkId
     * @return
     */
    @Override
    public WormEntity query(String pkId) {
        log.info("查询成功，参数："+pkId);
        WormEntity wormEntity = new WormEntity();
        wormEntity.setPkId("7898");
        wormEntity.setName("蚯蚓");
        wormEntity.setColor("棕色");
        wormEntity.setAge(100);
        wormEntity.setState("活的");
        return wormEntity;
    }

    /**
     * 虫被吃
     * @param name 名字
     */
    @Override
    public void isEatted(String name) {
        log.info("虫被"+name+"吃掉了");
    }
}
