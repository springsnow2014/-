package com.project.model;
import java.util.ArrayList;
import java.util.List;
public class TeacherEvalExample {
    protected String orderByClause;
    protected boolean distinct;
    protected int startRow;
    protected int pageRows;
    protected List<Criteria> oredCriteria;
    public TeacherEvalExample() {
        oredCriteria = new ArrayList<>();
    }
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }
    public String getOrderByClause() {
        return orderByClause;
    }
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }
    public boolean isDistinct() {
        return distinct;
    }
    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }
    public int getStartRow() {
        return startRow;
    }
    public void setPageRows(int pageRows) {
        this.pageRows = pageRows;
    }
    public int getPageRows() {
        return pageRows;
    }
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;
        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }
        public boolean isValid() {
            return criteria.size() > 0;
        }
        public List<Criterion> getAllCriteria() {
            return criteria;
        }
        public List<Criterion> getCriteria() {
            return criteria;
        }
        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }
        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }
        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }
    public Criteria andIdIsNull() {
		 addCriterion("id is null");
		return (Criteria) this;
		}
  public Criteria andIdIsNotNull(){
		addCriterion("id is not null");
		return (Criteria) this;
		}
  public Criteria andIdEqualTo(Integer value) {
		  addCriterion("id =", value, "id");
		return (Criteria) this;
		}
   public Criteria andIdNotEqualTo(Integer value) {
		  addCriterion("id <>", value, "id");
		return (Criteria) this;
		}
    public Criteria andIdGreaterThan(Integer value) {
		 addCriterion("id >", value, "id");
		return (Criteria) this;
		}
  public Criteria andIdGreaterThanOrEqualTo(Integer value) {
		  addCriterion("id >=", value, "Id");
		return (Criteria) this;
		}
   public Criteria andIdLessThan(Integer value) {
		  addCriterion("id <", value, "id");
		return (Criteria) this;
		}
    public Criteria andIdLessThanOrEqualTo(Integer value) {
		  addCriterion("id <=", value, "id");
		return (Criteria) this;
		}
    public Criteria andIdIn(List<Integer> values) {
		  addCriterion("id in", values, "id");
		return (Criteria) this;
		}
    public Criteria andIdNotIn(List<Integer> values) {
		  addCriterion("id not in", values, "id");
		return (Criteria) this;
		}
     public Criteria andIdBetween(Integer value1, Integer value2) {
		   addCriterion("id between", value1, value2, "id");
		return (Criteria) this;
		}
     public Criteria andIdNotBetween(Integer value1, Integer value2) {
		   addCriterion("id not between", value1, value2, "id");
		return (Criteria) this;
		}
    public Criteria andIdLike(Integer value) {
		  addCriterion("id like", value, "id");
		return (Criteria) this;
		}
    public Criteria andIdNotLike(Integer value) {
		  addCriterion("id not like", value, "id");
		return (Criteria) this;
		}
 public Criteria andIdeologicalmoralIsNull() {
		 addCriterion("ideologicalmoral is null");
		return (Criteria) this;
		}
  public Criteria andIdeologicalmoralIsNotNull(){
		addCriterion("ideologicalmoral is not null");
		return (Criteria) this;
		}
  public Criteria andIdeologicalmoralEqualTo(String value) {
		  addCriterion("ideologicalmoral =", value, "ideologicalmoral");
		return (Criteria) this;
		}
   public Criteria andIdeologicalmoralNotEqualTo(String value) {
		  addCriterion("ideologicalmoral <>", value, "ideologicalmoral");
		return (Criteria) this;
		}
    public Criteria andIdeologicalmoralGreaterThan(String value) {
		 addCriterion("ideologicalmoral >", value, "ideologicalmoral");
		return (Criteria) this;
		}
  public Criteria andIdeologicalmoralGreaterThanOrEqualTo(String value) {
		  addCriterion("ideologicalmoral >=", value, "Ideologicalmoral");
		return (Criteria) this;
		}
   public Criteria andIdeologicalmoralLessThan(String value) {
		  addCriterion("ideologicalmoral <", value, "ideologicalmoral");
		return (Criteria) this;
		}
    public Criteria andIdeologicalmoralLessThanOrEqualTo(String value) {
		  addCriterion("ideologicalmoral <=", value, "ideologicalmoral");
		return (Criteria) this;
		}
    public Criteria andIdeologicalmoralIn(List<String> values) {
		  addCriterion("ideologicalmoral in", values, "ideologicalmoral");
		return (Criteria) this;
		}
    public Criteria andIdeologicalmoralNotIn(List<String> values) {
		  addCriterion("ideologicalmoral not in", values, "ideologicalmoral");
		return (Criteria) this;
		}
     public Criteria andIdeologicalmoralBetween(String value1, String value2) {
		   addCriterion("ideologicalmoral between", value1, value2, "ideologicalmoral");
		return (Criteria) this;
		}
     public Criteria andIdeologicalmoralNotBetween(String value1, String value2) {
		   addCriterion("ideologicalmoral not between", value1, value2, "ideologicalmoral");
		return (Criteria) this;
		}
    public Criteria andIdeologicalmoralLike(String value) {
		  addCriterion("ideologicalmoral like", value, "ideologicalmoral");
		return (Criteria) this;
		}
    public Criteria andIdeologicalmoralNotLike(String value) {
		  addCriterion("ideologicalmoral not like", value, "ideologicalmoral");
		return (Criteria) this;
		}
 public Criteria andLearningabilityIsNull() {
		 addCriterion("learningability is null");
		return (Criteria) this;
		}
  public Criteria andLearningabilityIsNotNull(){
		addCriterion("learningability is not null");
		return (Criteria) this;
		}
  public Criteria andLearningabilityEqualTo(String value) {
		  addCriterion("learningability =", value, "learningability");
		return (Criteria) this;
		}
   public Criteria andLearningabilityNotEqualTo(String value) {
		  addCriterion("learningability <>", value, "learningability");
		return (Criteria) this;
		}
    public Criteria andLearningabilityGreaterThan(String value) {
		 addCriterion("learningability >", value, "learningability");
		return (Criteria) this;
		}
  public Criteria andLearningabilityGreaterThanOrEqualTo(String value) {
		  addCriterion("learningability >=", value, "Learningability");
		return (Criteria) this;
		}
   public Criteria andLearningabilityLessThan(String value) {
		  addCriterion("learningability <", value, "learningability");
		return (Criteria) this;
		}
    public Criteria andLearningabilityLessThanOrEqualTo(String value) {
		  addCriterion("learningability <=", value, "learningability");
		return (Criteria) this;
		}
    public Criteria andLearningabilityIn(List<String> values) {
		  addCriterion("learningability in", values, "learningability");
		return (Criteria) this;
		}
    public Criteria andLearningabilityNotIn(List<String> values) {
		  addCriterion("learningability not in", values, "learningability");
		return (Criteria) this;
		}
     public Criteria andLearningabilityBetween(String value1, String value2) {
		   addCriterion("learningability between", value1, value2, "learningability");
		return (Criteria) this;
		}
     public Criteria andLearningabilityNotBetween(String value1, String value2) {
		   addCriterion("learningability not between", value1, value2, "learningability");
		return (Criteria) this;
		}
    public Criteria andLearningabilityLike(String value) {
		  addCriterion("learningability like", value, "learningability");
		return (Criteria) this;
		}
    public Criteria andLearningabilityNotLike(String value) {
		  addCriterion("learningability not like", value, "learningability");
		return (Criteria) this;
		}
 public Criteria andProfessionalSkillsIsNull() {
		 addCriterion("professional_skills is null");
		return (Criteria) this;
		}
  public Criteria andProfessionalSkillsIsNotNull(){
		addCriterion("professional_skills is not null");
		return (Criteria) this;
		}
  public Criteria andProfessionalSkillsEqualTo(String value) {
		  addCriterion("professional_skills =", value, "professionalSkills");
		return (Criteria) this;
		}
   public Criteria andProfessionalSkillsNotEqualTo(String value) {
		  addCriterion("professional_skills <>", value, "professionalSkills");
		return (Criteria) this;
		}
    public Criteria andProfessionalSkillsGreaterThan(String value) {
		 addCriterion("professional_skills >", value, "professionalSkills");
		return (Criteria) this;
		}
  public Criteria andProfessionalSkillsGreaterThanOrEqualTo(String value) {
		  addCriterion("professional_skills >=", value, "ProfessionalSkills");
		return (Criteria) this;
		}
   public Criteria andProfessionalSkillsLessThan(String value) {
		  addCriterion("professional_skills <", value, "professionalSkills");
		return (Criteria) this;
		}
    public Criteria andProfessionalSkillsLessThanOrEqualTo(String value) {
		  addCriterion("professional_skills <=", value, "professionalSkills");
		return (Criteria) this;
		}
    public Criteria andProfessionalSkillsIn(List<String> values) {
		  addCriterion("professional_skills in", values, "professionalSkills");
		return (Criteria) this;
		}
    public Criteria andProfessionalSkillsNotIn(List<String> values) {
		  addCriterion("professional_skills not in", values, "professionalSkills");
		return (Criteria) this;
		}
     public Criteria andProfessionalSkillsBetween(String value1, String value2) {
		   addCriterion("professional_skills between", value1, value2, "professionalSkills");
		return (Criteria) this;
		}
     public Criteria andProfessionalSkillsNotBetween(String value1, String value2) {
		   addCriterion("professional_skills not between", value1, value2, "professionalSkills");
		return (Criteria) this;
		}
    public Criteria andProfessionalSkillsLike(String value) {
		  addCriterion("professional_skills like", value, "professionalSkills");
		return (Criteria) this;
		}
    public Criteria andProfessionalSkillsNotLike(String value) {
		  addCriterion("professional_skills not like", value, "professionalSkills");
		return (Criteria) this;
		}
 public Criteria andPractiveIsNull() {
		 addCriterion("practive is null");
		return (Criteria) this;
		}
  public Criteria andPractiveIsNotNull(){
		addCriterion("practive is not null");
		return (Criteria) this;
		}
  public Criteria andPractiveEqualTo(String value) {
		  addCriterion("practive =", value, "practive");
		return (Criteria) this;
		}
   public Criteria andPractiveNotEqualTo(String value) {
		  addCriterion("practive <>", value, "practive");
		return (Criteria) this;
		}
    public Criteria andPractiveGreaterThan(String value) {
		 addCriterion("practive >", value, "practive");
		return (Criteria) this;
		}
  public Criteria andPractiveGreaterThanOrEqualTo(String value) {
		  addCriterion("practive >=", value, "Practive");
		return (Criteria) this;
		}
   public Criteria andPractiveLessThan(String value) {
		  addCriterion("practive <", value, "practive");
		return (Criteria) this;
		}
    public Criteria andPractiveLessThanOrEqualTo(String value) {
		  addCriterion("practive <=", value, "practive");
		return (Criteria) this;
		}
    public Criteria andPractiveIn(List<String> values) {
		  addCriterion("practive in", values, "practive");
		return (Criteria) this;
		}
    public Criteria andPractiveNotIn(List<String> values) {
		  addCriterion("practive not in", values, "practive");
		return (Criteria) this;
		}
     public Criteria andPractiveBetween(String value1, String value2) {
		   addCriterion("practive between", value1, value2, "practive");
		return (Criteria) this;
		}
     public Criteria andPractiveNotBetween(String value1, String value2) {
		   addCriterion("practive not between", value1, value2, "practive");
		return (Criteria) this;
		}
    public Criteria andPractiveLike(String value) {
		  addCriterion("practive like", value, "practive");
		return (Criteria) this;
		}
    public Criteria andPractiveNotLike(String value) {
		  addCriterion("practive not like", value, "practive");
		return (Criteria) this;
		}
 public Criteria andPapergradeIsNull() {
		 addCriterion("papergrade is null");
		return (Criteria) this;
		}
  public Criteria andPapergradeIsNotNull(){
		addCriterion("papergrade is not null");
		return (Criteria) this;
		}
  public Criteria andPapergradeEqualTo(Integer value) {
		  addCriterion("papergrade =", value, "papergrade");
		return (Criteria) this;
		}
   public Criteria andPapergradeNotEqualTo(Integer value) {
		  addCriterion("papergrade <>", value, "papergrade");
		return (Criteria) this;
		}
    public Criteria andPapergradeGreaterThan(Integer value) {
		 addCriterion("papergrade >", value, "papergrade");
		return (Criteria) this;
		}
  public Criteria andPapergradeGreaterThanOrEqualTo(Integer value) {
		  addCriterion("papergrade >=", value, "Papergrade");
		return (Criteria) this;
		}
   public Criteria andPapergradeLessThan(Integer value) {
		  addCriterion("papergrade <", value, "papergrade");
		return (Criteria) this;
		}
    public Criteria andPapergradeLessThanOrEqualTo(Integer value) {
		  addCriterion("papergrade <=", value, "papergrade");
		return (Criteria) this;
		}
    public Criteria andPapergradeIn(List<Integer> values) {
		  addCriterion("papergrade in", values, "papergrade");
		return (Criteria) this;
		}
    public Criteria andPapergradeNotIn(List<Integer> values) {
		  addCriterion("papergrade not in", values, "papergrade");
		return (Criteria) this;
		}
     public Criteria andPapergradeBetween(Integer value1, Integer value2) {
		   addCriterion("papergrade between", value1, value2, "papergrade");
		return (Criteria) this;
		}
     public Criteria andPapergradeNotBetween(Integer value1, Integer value2) {
		   addCriterion("papergrade not between", value1, value2, "papergrade");
		return (Criteria) this;
		}
    public Criteria andPapergradeLike(Integer value) {
		  addCriterion("papergrade like", value, "papergrade");
		return (Criteria) this;
		}
    public Criteria andPapergradeNotLike(Integer value) {
		  addCriterion("papergrade not like", value, "papergrade");
		return (Criteria) this;
		}
 public Criteria andCreateTimeIsNull() {
		 addCriterion("create_time is null");
		return (Criteria) this;
		}
  public Criteria andCreateTimeIsNotNull(){
		addCriterion("create_time is not null");
		return (Criteria) this;
		}
  public Criteria andCreateTimeEqualTo(String value) {
		  addCriterion("create_time =", value, "createTime");
		return (Criteria) this;
		}
   public Criteria andCreateTimeNotEqualTo(String value) {
		  addCriterion("create_time <>", value, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeGreaterThan(String value) {
		 addCriterion("create_time >", value, "createTime");
		return (Criteria) this;
		}
  public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
		  addCriterion("create_time >=", value, "CreateTime");
		return (Criteria) this;
		}
   public Criteria andCreateTimeLessThan(String value) {
		  addCriterion("create_time <", value, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeLessThanOrEqualTo(String value) {
		  addCriterion("create_time <=", value, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeIn(List<String> values) {
		  addCriterion("create_time in", values, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeNotIn(List<String> values) {
		  addCriterion("create_time not in", values, "createTime");
		return (Criteria) this;
		}
     public Criteria andCreateTimeBetween(String value1, String value2) {
		   addCriterion("create_time between", value1, value2, "createTime");
		return (Criteria) this;
		}
     public Criteria andCreateTimeNotBetween(String value1, String value2) {
		   addCriterion("create_time not between", value1, value2, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeLike(String value) {
		  addCriterion("create_time like", value, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeNotLike(String value) {
		  addCriterion("create_time not like", value, "createTime");
		return (Criteria) this;
		}
 public Criteria andStuIdIsNull() {
		 addCriterion("stu_id is null");
		return (Criteria) this;
		}
  public Criteria andStuIdIsNotNull(){
		addCriterion("stu_id is not null");
		return (Criteria) this;
		}
  public Criteria andStuIdEqualTo(Integer value) {
		  addCriterion("stu_id =", value, "stuId");
		return (Criteria) this;
		}
   public Criteria andStuIdNotEqualTo(Integer value) {
		  addCriterion("stu_id <>", value, "stuId");
		return (Criteria) this;
		}
    public Criteria andStuIdGreaterThan(Integer value) {
		 addCriterion("stu_id >", value, "stuId");
		return (Criteria) this;
		}
  public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
		  addCriterion("stu_id >=", value, "StuId");
		return (Criteria) this;
		}
   public Criteria andStuIdLessThan(Integer value) {
		  addCriterion("stu_id <", value, "stuId");
		return (Criteria) this;
		}
    public Criteria andStuIdLessThanOrEqualTo(Integer value) {
		  addCriterion("stu_id <=", value, "stuId");
		return (Criteria) this;
		}
    public Criteria andStuIdIn(List<Integer> values) {
		  addCriterion("stu_id in", values, "stuId");
		return (Criteria) this;
		}
    public Criteria andStuIdNotIn(List<Integer> values) {
		  addCriterion("stu_id not in", values, "stuId");
		return (Criteria) this;
		}
     public Criteria andStuIdBetween(Integer value1, Integer value2) {
		   addCriterion("stu_id between", value1, value2, "stuId");
		return (Criteria) this;
		}
     public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
		   addCriterion("stu_id not between", value1, value2, "stuId");
		return (Criteria) this;
		}
    public Criteria andStuIdLike(Integer value) {
		  addCriterion("stu_id like", value, "stuId");
		return (Criteria) this;
		}
    public Criteria andStuIdNotLike(Integer value) {
		  addCriterion("stu_id not like", value, "stuId");
		return (Criteria) this;
		}
 public Criteria andTeacherIdIsNull() {
		 addCriterion("teacher_id is null");
		return (Criteria) this;
		}
  public Criteria andTeacherIdIsNotNull(){
		addCriterion("teacher_id is not null");
		return (Criteria) this;
		}
  public Criteria andTeacherIdEqualTo(Integer value) {
		  addCriterion("teacher_id =", value, "teacherId");
		return (Criteria) this;
		}
   public Criteria andTeacherIdNotEqualTo(Integer value) {
		  addCriterion("teacher_id <>", value, "teacherId");
		return (Criteria) this;
		}
    public Criteria andTeacherIdGreaterThan(Integer value) {
		 addCriterion("teacher_id >", value, "teacherId");
		return (Criteria) this;
		}
  public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
		  addCriterion("teacher_id >=", value, "TeacherId");
		return (Criteria) this;
		}
   public Criteria andTeacherIdLessThan(Integer value) {
		  addCriterion("teacher_id <", value, "teacherId");
		return (Criteria) this;
		}
    public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
		  addCriterion("teacher_id <=", value, "teacherId");
		return (Criteria) this;
		}
    public Criteria andTeacherIdIn(List<Integer> values) {
		  addCriterion("teacher_id in", values, "teacherId");
		return (Criteria) this;
		}
    public Criteria andTeacherIdNotIn(List<Integer> values) {
		  addCriterion("teacher_id not in", values, "teacherId");
		return (Criteria) this;
		}
     public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
		   addCriterion("teacher_id between", value1, value2, "teacherId");
		return (Criteria) this;
		}
     public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
		   addCriterion("teacher_id not between", value1, value2, "teacherId");
		return (Criteria) this;
		}
    public Criteria andTeacherIdLike(Integer value) {
		  addCriterion("teacher_id like", value, "teacherId");
		return (Criteria) this;
		}
    public Criteria andTeacherIdNotLike(Integer value) {
		  addCriterion("teacher_id not like", value, "teacherId");
		return (Criteria) this;
		}
 public Criteria andProjectIdIsNull() {
		 addCriterion("project_id is null");
		return (Criteria) this;
		}
  public Criteria andProjectIdIsNotNull(){
		addCriterion("project_id is not null");
		return (Criteria) this;
		}
  public Criteria andProjectIdEqualTo(Integer value) {
		  addCriterion("project_id =", value, "projectId");
		return (Criteria) this;
		}
   public Criteria andProjectIdNotEqualTo(Integer value) {
		  addCriterion("project_id <>", value, "projectId");
		return (Criteria) this;
		}
    public Criteria andProjectIdGreaterThan(Integer value) {
		 addCriterion("project_id >", value, "projectId");
		return (Criteria) this;
		}
  public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
		  addCriterion("project_id >=", value, "ProjectId");
		return (Criteria) this;
		}
   public Criteria andProjectIdLessThan(Integer value) {
		  addCriterion("project_id <", value, "projectId");
		return (Criteria) this;
		}
    public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
		  addCriterion("project_id <=", value, "projectId");
		return (Criteria) this;
		}
    public Criteria andProjectIdIn(List<Integer> values) {
		  addCriterion("project_id in", values, "projectId");
		return (Criteria) this;
		}
    public Criteria andProjectIdNotIn(List<Integer> values) {
		  addCriterion("project_id not in", values, "projectId");
		return (Criteria) this;
		}
     public Criteria andProjectIdBetween(Integer value1, Integer value2) {
		   addCriterion("project_id between", value1, value2, "projectId");
		return (Criteria) this;
		}
     public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
		   addCriterion("project_id not between", value1, value2, "projectId");
		return (Criteria) this;
		}
    public Criteria andProjectIdLike(Integer value) {
		  addCriterion("project_id like", value, "projectId");
		return (Criteria) this;
		}
    public Criteria andProjectIdNotLike(Integer value) {
		  addCriterion("project_id not like", value, "projectId");
		return (Criteria) this;
		}

    }
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
    public static class Criterion {
        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;
        private String typeHandler;
        public String getCondition() {
            return condition;
        }
        public Object getValue() {
            return value;
        }
        public Object getSecondValue() {
            return secondValue;
        }
        public boolean isNoValue() {
            return noValue;
        }
        public boolean isSingleValue() {
            return singleValue;
        }
        public boolean isBetweenValue() {
            return betweenValue;
        }
        public boolean isListValue() {
            return listValue;
        }
        public String getTypeHandler() {
            return typeHandler;
        }
        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }
        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }
        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }
        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }
        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
