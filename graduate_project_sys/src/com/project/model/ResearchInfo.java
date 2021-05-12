package com.project.model;

public class ResearchInfo {
    private Integer id; //ID
    private String rname; //类型名
    private Integer cid; //学院ID

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = (rname == null) ? null : rname.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}

