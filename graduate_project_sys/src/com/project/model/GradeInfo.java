package com.project.model;

public class GradeInfo {
    private Integer id; //ID
    private String gname; //年级名

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = (gname == null) ? null : gname.trim();
    }
}

