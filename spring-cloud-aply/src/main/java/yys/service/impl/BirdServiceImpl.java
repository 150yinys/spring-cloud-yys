package yys.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import yys.entity.BirdEntity;
import yys.service.BirdService;

@Service("birdService")
public class BirdServiceImpl implements BirdService {

    private static final Logger log = Logger.getLogger(BirdServiceImpl.class);

    /**
     * 新增
     *
     * @param birdEntity
     * @return
     */
    @Override
    public String save(BirdEntity birdEntity) {
        log.info("新增成功，参数："+birdEntity.getName());
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
        return birdEntity;
    }
}
