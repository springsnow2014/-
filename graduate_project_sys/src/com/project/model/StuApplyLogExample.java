package com.project.model;
import java.util.ArrayList;
import java.util.List;
public class StuApplyLogExample {
    protected String orderByClause;
    protected boolean distinct;
    protected int startRow;
    protected int pageRows;
    protected List<Criteria> oredCriteria;
    public StuApplyLogExample() {
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
 public Criteria andProjectTitleIsNull() {
		 addCriterion("project_title is null");
		return (Criteria) this;
		}
  public Criteria andProjectTitleIsNotNull(){
		addCriterion("project_title is not null");
		return (Criteria) this;
		}
  public Criteria andProjectTitleEqualTo(String value) {
		  addCriterion("project_title =", value, "projectTitle");
		return (Criteria) this;
		}
   public Criteria andProjectTitleNotEqualTo(String value) {
		  addCriterion("project_title <>", value, "projectTitle");
		return (Criteria) this;
		}
    public Criteria andProjectTitleGreaterThan(String value) {
		 addCriterion("project_title >", value, "projectTitle");
		return (Criteria) this;
		}
  public Criteria andProjectTitleGreaterThanOrEqualTo(String value) {
		  addCriterion("project_title >=", value, "ProjectTitle");
		return (Criteria) this;
		}
   public Criteria andProjectTitleLessThan(String value) {
		  addCriterion("project_title <", value, "projectTitle");
		return (Criteria) this;
		}
    public Criteria andProjectTitleLessThanOrEqualTo(String value) {
		  addCriterion("project_title <=", value, "projectTitle");
		return (Criteria) this;
		}
    public Criteria andProjectTitleIn(List<String> values) {
		  addCriterion("project_title in", values, "projectTitle");
		return (Criteria) this;
		}
    public Criteria andProjectTitleNotIn(List<String> values) {
		  addCriterion("project_title not in", values, "projectTitle");
		return (Criteria) this;
		}
     public Criteria andProjectTitleBetween(String value1, String value2) {
		   addCriterion("project_title between", value1, value2, "projectTitle");
		return (Criteria) this;
		}
     public Criteria andProjectTitleNotBetween(String value1, String value2) {
		   addCriterion("project_title not between", value1, value2, "projectTitle");
		return (Criteria) this;
		}
    public Criteria andProjectTitleLike(String value) {
		  addCriterion("project_title like", value, "projectTitle");
		return (Criteria) this;
		}
    public Criteria andProjectTitleNotLike(String value) {
		  addCriterion("project_title not like", value, "projectTitle");
		return (Criteria) this;
		}
 public Criteria andProjectIntroIsNull() {
		 addCriterion("project_intro is null");
		return (Criteria) this;
		}
  public Criteria andProjectIntroIsNotNull(){
		addCriterion("project_intro is not null");
		return (Criteria) this;
		}
  public Criteria andProjectIntroEqualTo(String value) {
		  addCriterion("project_intro =", value, "projectIntro");
		return (Criteria) this;
		}
   public Criteria andProjectIntroNotEqualTo(String value) {
		  addCriterion("project_intro <>", value, "projectIntro");
		return (Criteria) this;
		}
    public Criteria andProjectIntroGreaterThan(String value) {
		 addCriterion("project_intro >", value, "projectIntro");
		return (Criteria) this;
		}
  public Criteria andProjectIntroGreaterThanOrEqualTo(String value) {
		  addCriterion("project_intro >=", value, "ProjectIntro");
		return (Criteria) this;
		}
   public Criteria andProjectIntroLessThan(String value) {
		  addCriterion("project_intro <", value, "projectIntro");
		return (Criteria) this;
		}
    public Criteria andProjectIntroLessThanOrEqualTo(String value) {
		  addCriterion("project_intro <=", value, "projectIntro");
		return (Criteria) this;
		}
    public Criteria andProjectIntroIn(List<String> values) {
		  addCriterion("project_intro in", values, "projectIntro");
		return (Criteria) this;
		}
    public Criteria andProjectIntroNotIn(List<String> values) {
		  addCriterion("project_intro not in", values, "projectIntro");
		return (Criteria) this;
		}
     public Criteria andProjectIntroBetween(String value1, String value2) {
		   addCriterion("project_intro between", value1, value2, "projectIntro");
		return (Criteria) this;
		}
     public Criteria andProjectIntroNotBetween(String value1, String value2) {
		   addCriterion("project_intro not between", value1, value2, "projectIntro");
		return (Criteria) this;
		}
    public Criteria andProjectIntroLike(String value) {
		  addCriterion("project_intro like", value, "projectIntro");
		return (Criteria) this;
		}
    public Criteria andProjectIntroNotLike(String value) {
		  addCriterion("project_intro not like", value, "projectIntro");
		return (Criteria) this;
		}
 public Criteria andProfileIsNull() {
		 addCriterion("profile is null");
		return (Criteria) this;
		}
  public Criteria andProfileIsNotNull(){
		addCriterion("profile is not null");
		return (Criteria) this;
		}
  public Criteria andProfileEqualTo(String value) {
		  addCriterion("profile =", value, "profile");
		return (Criteria) this;
		}
   public Criteria andProfileNotEqualTo(String value) {
		  addCriterion("profile <>", value, "profile");
		return (Criteria) this;
		}
    public Criteria andProfileGreaterThan(String value) {
		 addCriterion("profile >", value, "profile");
		return (Criteria) this;
		}
  public Criteria andProfileGreaterThanOrEqualTo(String value) {
		  addCriterion("profile >=", value, "Profile");
		return (Criteria) this;
		}
   public Criteria andProfileLessThan(String value) {
		  addCriterion("profile <", value, "profile");
		return (Criteria) this;
		}
    public Criteria andProfileLessThanOrEqualTo(String value) {
		  addCriterion("profile <=", value, "profile");
		return (Criteria) this;
		}
    public Criteria andProfileIn(List<String> values) {
		  addCriterion("profile in", values, "profile");
		return (Criteria) this;
		}
    public Criteria andProfileNotIn(List<String> values) {
		  addCriterion("profile not in", values, "profile");
		return (Criteria) this;
		}
     public Criteria andProfileBetween(String value1, String value2) {
		   addCriterion("profile between", value1, value2, "profile");
		return (Criteria) this;
		}
     public Criteria andProfileNotBetween(String value1, String value2) {
		   addCriterion("profile not between", value1, value2, "profile");
		return (Criteria) this;
		}
    public Criteria andProfileLike(String value) {
		  addCriterion("profile like", value, "profile");
		return (Criteria) this;
		}
    public Criteria andProfileNotLike(String value) {
		  addCriterion("profile not like", value, "profile");
		return (Criteria) this;
		}
 public Criteria andStuRemarkIsNull() {
		 addCriterion("stu_remark is null");
		return (Criteria) this;
		}
  public Criteria andStuRemarkIsNotNull(){
		addCriterion("stu_remark is not null");
		return (Criteria) this;
		}
  public Criteria andStuRemarkEqualTo(String value) {
		  addCriterion("stu_remark =", value, "stuRemark");
		return (Criteria) this;
		}
   public Criteria andStuRemarkNotEqualTo(String value) {
		  addCriterion("stu_remark <>", value, "stuRemark");
		return (Criteria) this;
		}
    public Criteria andStuRemarkGreaterThan(String value) {
		 addCriterion("stu_remark >", value, "stuRemark");
		return (Criteria) this;
		}
  public Criteria andStuRemarkGreaterThanOrEqualTo(String value) {
		  addCriterion("stu_remark >=", value, "StuRemark");
		return (Criteria) this;
		}
   public Criteria andStuRemarkLessThan(String value) {
		  addCriterion("stu_remark <", value, "stuRemark");
		return (Criteria) this;
		}
    public Criteria andStuRemarkLessThanOrEqualTo(String value) {
		  addCriterion("stu_remark <=", value, "stuRemark");
		return (Criteria) this;
		}
    public Criteria andStuRemarkIn(List<String> values) {
		  addCriterion("stu_remark in", values, "stuRemark");
		return (Criteria) this;
		}
    public Criteria andStuRemarkNotIn(List<String> values) {
		  addCriterion("stu_remark not in", values, "stuRemark");
		return (Criteria) this;
		}
     public Criteria andStuRemarkBetween(String value1, String value2) {
		   addCriterion("stu_remark between", value1, value2, "stuRemark");
		return (Criteria) this;
		}
     public Criteria andStuRemarkNotBetween(String value1, String value2) {
		   addCriterion("stu_remark not between", value1, value2, "stuRemark");
		return (Criteria) this;
		}
    public Criteria andStuRemarkLike(String value) {
		  addCriterion("stu_remark like", value, "stuRemark");
		return (Criteria) this;
		}
    public Criteria andStuRemarkNotLike(String value) {
		  addCriterion("stu_remark not like", value, "stuRemark");
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
 public Criteria andSelectStatusIsNull() {
		 addCriterion("select_status is null");
		return (Criteria) this;
		}
  public Criteria andSelectStatusIsNotNull(){
		addCriterion("select_status is not null");
		return (Criteria) this;
		}
  public Criteria andSelectStatusEqualTo(Integer value) {
		  addCriterion("select_status =", value, "selectStatus");
		return (Criteria) this;
		}
   public Criteria andSelectStatusNotEqualTo(Integer value) {
		  addCriterion("select_status <>", value, "selectStatus");
		return (Criteria) this;
		}
    public Criteria andSelectStatusGreaterThan(Integer value) {
		 addCriterion("select_status >", value, "selectStatus");
		return (Criteria) this;
		}
  public Criteria andSelectStatusGreaterThanOrEqualTo(Integer value) {
		  addCriterion("select_status >=", value, "SelectStatus");
		return (Criteria) this;
		}
   public Criteria andSelectStatusLessThan(Integer value) {
		  addCriterion("select_status <", value, "selectStatus");
		return (Criteria) this;
		}
    public Criteria andSelectStatusLessThanOrEqualTo(Integer value) {
		  addCriterion("select_status <=", value, "selectStatus");
		return (Criteria) this;
		}
    public Criteria andSelectStatusIn(List<Integer> values) {
		  addCriterion("select_status in", values, "selectStatus");
		return (Criteria) this;
		}
    public Criteria andSelectStatusNotIn(List<Integer> values) {
		  addCriterion("select_status not in", values, "selectStatus");
		return (Criteria) this;
		}
     public Criteria andSelectStatusBetween(Integer value1, Integer value2) {
		   addCriterion("select_status between", value1, value2, "selectStatus");
		return (Criteria) this;
		}
     public Criteria andSelectStatusNotBetween(Integer value1, Integer value2) {
		   addCriterion("select_status not between", value1, value2, "selectStatus");
		return (Criteria) this;
		}
    public Criteria andSelectStatusLike(Integer value) {
		  addCriterion("select_status like", value, "selectStatus");
		return (Criteria) this;
		}
    public Criteria andSelectStatusNotLike(Integer value) {
		  addCriterion("select_status not like", value, "selectStatus");
		return (Criteria) this;
		}
 public Criteria andTeacherRemarkIsNull() {
		 addCriterion("teacher_remark is null");
		return (Criteria) this;
		}
  public Criteria andTeacherRemarkIsNotNull(){
		addCriterion("teacher_remark is not null");
		return (Criteria) this;
		}
  public Criteria andTeacherRemarkEqualTo(String value) {
		  addCriterion("teacher_remark =", value, "teacherRemark");
		return (Criteria) this;
		}
   public Criteria andTeacherRemarkNotEqualTo(String value) {
		  addCriterion("teacher_remark <>", value, "teacherRemark");
		return (Criteria) this;
		}
    public Criteria andTeacherRemarkGreaterThan(String value) {
		 addCriterion("teacher_remark >", value, "teacherRemark");
		return (Criteria) this;
		}
  public Criteria andTeacherRemarkGreaterThanOrEqualTo(String value) {
		  addCriterion("teacher_remark >=", value, "TeacherRemark");
		return (Criteria) this;
		}
   public Criteria andTeacherRemarkLessThan(String value) {
		  addCriterion("teacher_remark <", value, "teacherRemark");
		return (Criteria) this;
		}
    public Criteria andTeacherRemarkLessThanOrEqualTo(String value) {
		  addCriterion("teacher_remark <=", value, "teacherRemark");
		return (Criteria) this;
		}
    public Criteria andTeacherRemarkIn(List<String> values) {
		  addCriterion("teacher_remark in", values, "teacherRemark");
		return (Criteria) this;
		}
    public Criteria andTeacherRemarkNotIn(List<String> values) {
		  addCriterion("teacher_remark not in", values, "teacherRemark");
		return (Criteria) this;
		}
     public Criteria andTeacherRemarkBetween(String value1, String value2) {
		   addCriterion("teacher_remark between", value1, value2, "teacherRemark");
		return (Criteria) this;
		}
     public Criteria andTeacherRemarkNotBetween(String value1, String value2) {
		   addCriterion("teacher_remark not between", value1, value2, "teacherRemark");
		return (Criteria) this;
		}
    public Criteria andTeacherRemarkLike(String value) {
		  addCriterion("teacher_remark like", value, "teacherRemark");
		return (Criteria) this;
		}
    public Criteria andTeacherRemarkNotLike(String value) {
		  addCriterion("teacher_remark not like", value, "teacherRemark");
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
