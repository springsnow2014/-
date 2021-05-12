package com.project.model;

public class TermInfo {
    private Integer id; //ID
    private String tname; //学期名
    private Integer gid; //年级ID

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = (tname == null) ? null : tname.trim();
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }
}

