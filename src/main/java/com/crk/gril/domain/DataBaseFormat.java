package com.crk.gril.domain;

/**
 * @Author: 程荣凯
 * @Date: 2018/8/25 15:24
 */
public class DataBaseFormat {
    private String id;
    private String pId;
    private  String name;
    private boolean open;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
