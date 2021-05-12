package com.project.model;

public class TeacherInfo {
    private Integer id; //ID
    private String tno; //工号
    private String password; //密码
    private String realName; //姓名
    private String celPhone; //联系电话
    private String email; //邮箱
    private String personalIntro; //教学简介
    private String headImg; //电子照片
    private Integer sex; //性别
    private String jobName; //职称
    private Integer isSelect; //是否可选
    private Integer selectedNum; //已选学生数
    private Integer collegeId; //所属学院
    private Integer researchId; //研究方向

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = (tno == null) ? null : tno.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = (password == null) ? null : password.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = (realName == null) ? null : realName.trim();
    }

    public String getCelPhone() {
        return celPhone;
    }

    public void setCelPhone(String celPhone) {
        this.celPhone = (celPhone == null) ? null : celPhone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = (email == null) ? null : email.trim();
    }

    public String getPersonalIntro() {
        return personalIntro;
    }

    public void setPersonalIntro(String personalIntro) {
        this.personalIntro = (personalIntro == null) ? null : personalIntro.trim();
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = (headImg == null) ? null : headImg.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = (jobName == null) ? null : jobName.trim();
    }

    public Integer getIsSelect() {
        return isSelect;
    }

    public void setIsSelect(Integer isSelect) {
        this.isSelect = isSelect;
    }

    public Integer getSelectedNum() {
        return selectedNum;
    }

    public void setSelectedNum(Integer selectedNum) {
        this.selectedNum = selectedNum;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public Integer getResearchId() {
        return researchId;
    }

    public void setResearchId(Integer researchId) {
        this.researchId = researchId;
    }
}

