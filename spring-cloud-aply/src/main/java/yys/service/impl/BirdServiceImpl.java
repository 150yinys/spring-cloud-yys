package yys.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yys.common.annotation.AnnotationTest;
import yys.entity.BirdEntity;
import yys.service.BirdService;
import yys.service.WormService;

@Service("birdService")
public class BirdServiceImpl implements BirdService {

    private static final Logger log = Logger.getLogger(BirdServiceImpl.class);

    @Autowired
    private WormService wormService;//虫

    /**
     * 新增
     *
     * @param birdEntity
     * @return
     */
    @Override
    public String save(BirdEntity birdEntity) {
        log.info("新增成功，参数 ："+birdEntity.getName());
        return "新增成功，参数："+birdEntity.getName();
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
    public BirdEntity query(String pkId) {
        log.info("查询成功，参数："+pkId);
        BirdEntity birdEntity = new BirdEntity();
        birdEntity.setPkId("1231");
        birdEntity.setName("云雀");
        birdEntity.setColor("蓝色");
        birdEntity.setAge(88);
        birdEntity.setState("活的");
        return birdEntity;
    }

    /**
     * 鸟吃虫
     * @param name 名字
     * @return 结果
     */
    @Override
    public String toEat(String name) {
        log.info(name+"吃掉了虫");
        wormService.isEatted(name);
        return name+"吃掉了虫";
    }
}
