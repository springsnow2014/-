package com.project.model;

public class StuFileInfo {
    private Integer id; //ID
    private String title; //标题
    private String fileIntro; //简介
    private String fileUrl; //文件
    private Integer projectId; //项目
    private String createTime; //发布时间
    private String teacherEval; //导师评语

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = (title == null) ? null : title.trim();
    }

    public String getFileIntro() {
        return fileIntro;
    }

    public void setFileIntro(String fileIntro) {
        this.fileIntro = (fileIntro == null) ? null : fileIntro.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = (fileUrl == null) ? null : fileUrl.trim();
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = (createTime == null) ? null : createTime.trim();
    }

    public String getTeacherEval() {
        return teacherEval;
    }

    public void setTeacherEval(String teacherEval) {
        this.teacherEval = (teacherEval == null) ? null : teacherEval.trim();
    }
}

