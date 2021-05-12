package com.project.model;

public class StudentInfo {
    private Integer id; //ID
    private String stuNo; //学号
    private String password; //密码
    private String realName; //姓名
    private String celPhone; //联系电话
    private String email; //邮箱
    private String headImg; //电子照片
    private Integer sex; //性别
    private Integer haveTurtor; //是否有导师
    private Integer collegeId; //所属学院
    private Integer classId; //班级
    private Integer researchId; //研究方向
    private Integer gradeId; //年级
    private Integer termId; //学期

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = (stuNo == null) ? null : stuNo.trim();
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

    public Integer getHaveTurtor() {
        return haveTurtor;
    }

    public void setHaveTurtor(Integer haveTurtor) {
        this.haveTurtor = haveTurtor;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getResearchId() {
        return researchId;
    }

    public void setResearchId(Integer researchId) {
        this.researchId = researchId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getTermId() {
        return termId;
    }

    public void setTermId(Integer termId) {
        this.termId = termId;
    }
}

