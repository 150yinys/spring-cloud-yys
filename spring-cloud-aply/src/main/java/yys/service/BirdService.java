package yys.service;

import yys.entity.BirdEntity;

public interface BirdService {
    /**
     * 新增
     * @param birdEntity
     * @return
     */
    public String save(BirdEntity birdEntity);

    /**
     * 删除
     * @param pkId
     * @return
     */
    public String delete(String pkId);

    /**
     * 查询
     * @param pkId
     * @return
     */
    public BirdEntity query(String pkId);
}
