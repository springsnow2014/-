package com.project.model;

public class TeacherEval {
    private Integer id; //ID
    private String ideologicalmoral; //思想品德
    private String learningability; //学习能力
    private String professionalSkills; //专业技能
    private String practive; //实践
    private Integer papergrade; //论文成绩
    private String createTime; //评价时间
    private Integer stuId; //评价学生
    private Integer teacherId; //导师ID
    private Integer projectId; //项目ID

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdeologicalmoral() {
        return ideologicalmoral;
    }

    public void setIdeologicalmoral(String ideologicalmoral) {
        this.ideologicalmoral = (ideologicalmoral == null) ? null
                                                           : ideologicalmoral.trim();
    }

    public String getLearningability() {
        return learningability;
    }

    public void setLearningability(String learningability) {
        this.learningability = (learningability == null) ? null
                                                         : learningability.trim();
    }

    public String getProfessionalSkills() {
        return professionalSkills;
    }

    public void setProfessionalSkills(String professionalSkills) {
        this.professionalSkills = (professionalSkills == null) ? null
                                                               : professionalSkills.trim();
    }

    public String getPractive() {
        return practive;
    }

    public void setPractive(String practive) {
        this.practive = (practive == null) ? null : practive.trim();
    }

    public Integer getPapergrade() {
        return papergrade;
    }

    public void setPapergrade(Integer papergrade) {
        this.papergrade = papergrade;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = (createTime == null) ? null : createTime.trim();
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
}

