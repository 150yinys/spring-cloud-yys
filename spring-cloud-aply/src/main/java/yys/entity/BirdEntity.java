package yys.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "BirdEntity",description = "鸟")
public class BirdEntity {
    @ApiModelProperty(value = "主键")
    private String pkId;
    @ApiModelProperty(value = "名字")
    private String name;
    @ApiModelProperty(value = "颜色")
    private String color;
    @ApiModelProperty(value = "状态")
    private String state;
    @ApiModelProperty(value = "年龄")
    private int age;

    public String getPkId() {
        return pkId;
    }

    public void setPkId(String pkId) {
        this.pkId = pkId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
