package com.project.model;

public class ClassInfo {
    private Integer id; //ID
    private String className; //班级名
    private Integer cid; //学院ID

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = (className == null) ? null : className.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}

