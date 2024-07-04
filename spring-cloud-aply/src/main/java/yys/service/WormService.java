package yys.service;

import yys.entity.WormEntity;

public interface WormService {
    /**
     * 新增
     * @param wormEntity 虫
     * @return 结果
     */
    String save(WormEntity wormEntity);

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
    WormEntity query(String pkId);

    void isEatted(String name);
}
