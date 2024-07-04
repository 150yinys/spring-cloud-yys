package yys.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yys.entity.WormEntity;
import yys.service.WormService;

@Api("虫")
@RestController
@RequestMapping("/api/worm")
public class WormController {

    @Autowired
    private WormService wormService;

    /**
     * 新增
     * @param wormEntity
     * @return
     */
    @ApiOperation("新增")
    @PostMapping("/save")
    public String save(@RequestBody WormEntity wormEntity) {
        return wormService.save(wormEntity);
    }

    /**
     * 删除
     * @param pkId
     * @return
     */
    @ApiOperation("删除")
    @GetMapping("/delete")
    public String delete(@RequestParam("pkId") String pkId) {
        return wormService.delete(pkId);
    }

    /**
     * 查询
     * @param pkId
     * @return
     */
    @ApiOperation("查询")
    @GetMapping("/query")
    public WormEntity query(@RequestParam("pkId") String pkId) {
        return wormService.query(pkId);
    }
}
