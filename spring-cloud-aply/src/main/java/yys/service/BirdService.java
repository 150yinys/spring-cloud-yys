package yys.service;

import yys.entity.BirdEntity;

public interface BirdService {
    /**
     * 新增
     * @param birdEntity 鸟
     * @return 结果
     */
    String save(BirdEntity birdEntity);

    /**
     * 删除
     * @param pkId 主键
     * @return 结果
     */
    String delete(String pkId);

    /**
     * 查询
     * @param pkId 主键
     * @return 结果
     */
    BirdEntity query(String pkId);
}
