package com.project.model;

public class StuApplyLog {
    private Integer id; //ID
    private Integer teacherId; //导师ID
    private String projectTitle; //项目题目
    private String projectIntro; //项目介绍
    private String profile; //相关文件
    private String stuRemark; //学生备注
    private Integer stuId; //学生ID
    private Integer selectStatus; //申请状态
    private String teacherRemark; //导师备注
    private String createTime; //申请时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = (projectTitle == null) ? null : projectTitle.trim();
    }

    public String getProjectIntro() {
        return projectIntro;
    }

    public void setProjectIntro(String projectIntro) {
        this.projectIntro = (projectIntro == null) ? null : projectIntro.trim();
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = (profile == null) ? null : profile.trim();
    }

    public String getStuRemark() {
        return stuRemark;
    }

    public void setStuRemark(String stuRemark) {
        this.stuRemark = (stuRemark == null) ? null : stuRemark.trim();
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getSelectStatus() {
        return selectStatus;
    }

    public void setSelectStatus(Integer selectStatus) {
        this.selectStatus = selectStatus;
    }

    public String getTeacherRemark() {
        return teacherRemark;
    }

    public void setTeacherRemark(String teacherRemark) {
        this.teacherRemark = (teacherRemark == null) ? null : teacherRemark.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = (createTime == null) ? null : createTime.trim();
    }
}

