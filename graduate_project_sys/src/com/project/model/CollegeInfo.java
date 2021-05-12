package com.project.model;

public class CollegeInfo {
    private Integer id; //ID
    private String cname; //学院名
    private String address; //学院地址
    private String contactTel; //联系电话

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = (cname == null) ? null : cname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = (address == null) ? null : address.trim();
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = (contactTel == null) ? null : contactTel.trim();
    }
}

