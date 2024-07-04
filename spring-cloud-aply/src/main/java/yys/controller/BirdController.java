package yys.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yys.common.annotation.AnnotationTest;
import yys.entity.BirdEntity;
import yys.service.BirdService;

@Api("鸟")
@RestController
@RequestMapping("/api/bird")
public class BirdController {

    @Autowired
    private BirdService birdService;

    /**
     * 新增
     * @param birdEntity
     * @return
     */
    @ApiOperation("新增")
    @PostMapping("/save")
    public String save(@RequestBody BirdEntity birdEntity) {
        return birdService.save(birdEntity);
    }

    /**
     * 删除
     * @param pkId
     * @return
     */
    @AnnotationTest
    @ApiOperation("删除")
    @GetMapping("/delete")
    public String delete(@RequestParam("pkId") String pkId) {
        return birdService.delete(pkId);
    }

    /**
     * 查询
     * @param pkId
     * @return
     */
    @ApiOperation("查询")
    @GetMapping("/query")
    public BirdEntity query(@RequestParam("pkId") String pkId) {
        return birdService.query(pkId);
    }

    /**
     * 鸟吃虫
     * @param name
     * @return
     */
    @ApiOperation("鸟吃虫")
    @GetMapping("/toEat")
    public String toEat(@RequestParam("name") String name) {
        return birdService.toEat(name);
    }
}
