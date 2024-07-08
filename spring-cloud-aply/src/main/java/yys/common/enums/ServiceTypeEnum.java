package yys.common.enums;

public enum ServiceTypeEnum {
    Bird("BIRD_FLOW_SERVICE","鸟流程"),
    Worm("WORM_FLOW_SERVICE","虫流程");

    private String code;
    private String name;

    private ServiceTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
