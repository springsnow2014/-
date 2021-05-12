package com.project.model;
import java.util.ArrayList;
import java.util.List;
public class StuFileInfoExample {
    protected String orderByClause;
    protected boolean distinct;
    protected int startRow;
    protected int pageRows;
    protected List<Criteria> oredCriteria;
    public StuFileInfoExample() {
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
 public Criteria andTitleIsNull() {
		 addCriterion("title is null");
		return (Criteria) this;
		}
  public Criteria andTitleIsNotNull(){
		addCriterion("title is not null");
		return (Criteria) this;
		}
  public Criteria andTitleEqualTo(String value) {
		  addCriterion("title =", value, "title");
		return (Criteria) this;
		}
   public Criteria andTitleNotEqualTo(String value) {
		  addCriterion("title <>", value, "title");
		return (Criteria) this;
		}
    public Criteria andTitleGreaterThan(String value) {
		 addCriterion("title >", value, "title");
		return (Criteria) this;
		}
  public Criteria andTitleGreaterThanOrEqualTo(String value) {
		  addCriterion("title >=", value, "Title");
		return (Criteria) this;
		}
   public Criteria andTitleLessThan(String value) {
		  addCriterion("title <", value, "title");
		return (Criteria) this;
		}
    public Criteria andTitleLessThanOrEqualTo(String value) {
		  addCriterion("title <=", value, "title");
		return (Criteria) this;
		}
    public Criteria andTitleIn(List<String> values) {
		  addCriterion("title in", values, "title");
		return (Criteria) this;
		}
    public Criteria andTitleNotIn(List<String> values) {
		  addCriterion("title not in", values, "title");
		return (Criteria) this;
		}
     public Criteria andTitleBetween(String value1, String value2) {
		   addCriterion("title between", value1, value2, "title");
		return (Criteria) this;
		}
     public Criteria andTitleNotBetween(String value1, String value2) {
		   addCriterion("title not between", value1, value2, "title");
		return (Criteria) this;
		}
    public Criteria andTitleLike(String value) {
		  addCriterion("title like", value, "title");
		return (Criteria) this;
		}
    public Criteria andTitleNotLike(String value) {
		  addCriterion("title not like", value, "title");
		return (Criteria) this;
		}
 public Criteria andFileIntroIsNull() {
		 addCriterion("file_intro is null");
		return (Criteria) this;
		}
  public Criteria andFileIntroIsNotNull(){
		addCriterion("file_intro is not null");
		return (Criteria) this;
		}
  public Criteria andFileIntroEqualTo(String value) {
		  addCriterion("file_intro =", value, "fileIntro");
		return (Criteria) this;
		}
   public Criteria andFileIntroNotEqualTo(String value) {
		  addCriterion("file_intro <>", value, "fileIntro");
		return (Criteria) this;
		}
    public Criteria andFileIntroGreaterThan(String value) {
		 addCriterion("file_intro >", value, "fileIntro");
		return (Criteria) this;
		}
  public Criteria andFileIntroGreaterThanOrEqualTo(String value) {
		  addCriterion("file_intro >=", value, "FileIntro");
		return (Criteria) this;
		}
   public Criteria andFileIntroLessThan(String value) {
		  addCriterion("file_intro <", value, "fileIntro");
		return (Criteria) this;
		}
    public Criteria andFileIntroLessThanOrEqualTo(String value) {
		  addCriterion("file_intro <=", value, "fileIntro");
		return (Criteria) this;
		}
    public Criteria andFileIntroIn(List<String> values) {
		  addCriterion("file_intro in", values, "fileIntro");
		return (Criteria) this;
		}
    public Criteria andFileIntroNotIn(List<String> values) {
		  addCriterion("file_intro not in", values, "fileIntro");
		return (Criteria) this;
		}
     public Criteria andFileIntroBetween(String value1, String value2) {
		   addCriterion("file_intro between", value1, value2, "fileIntro");
		return (Criteria) this;
		}
     public Criteria andFileIntroNotBetween(String value1, String value2) {
		   addCriterion("file_intro not between", value1, value2, "fileIntro");
		return (Criteria) this;
		}
    public Criteria andFileIntroLike(String value) {
		  addCriterion("file_intro like", value, "fileIntro");
		return (Criteria) this;
		}
    public Criteria andFileIntroNotLike(String value) {
		  addCriterion("file_intro not like", value, "fileIntro");
		return (Criteria) this;
		}
 public Criteria andFileUrlIsNull() {
		 addCriterion("file_url is null");
		return (Criteria) this;
		}
  public Criteria andFileUrlIsNotNull(){
		addCriterion("file_url is not null");
		return (Criteria) this;
		}
  public Criteria andFileUrlEqualTo(String value) {
		  addCriterion("file_url =", value, "fileUrl");
		return (Criteria) this;
		}
   public Criteria andFileUrlNotEqualTo(String value) {
		  addCriterion("file_url <>", value, "fileUrl");
		return (Criteria) this;
		}
    public Criteria andFileUrlGreaterThan(String value) {
		 addCriterion("file_url >", value, "fileUrl");
		return (Criteria) this;
		}
  public Criteria andFileUrlGreaterThanOrEqualTo(String value) {
		  addCriterion("file_url >=", value, "FileUrl");
		return (Criteria) this;
		}
   public Criteria andFileUrlLessThan(String value) {
		  addCriterion("file_url <", value, "fileUrl");
		return (Criteria) this;
		}
    public Criteria andFileUrlLessThanOrEqualTo(String value) {
		  addCriterion("file_url <=", value, "fileUrl");
		return (Criteria) this;
		}
    public Criteria andFileUrlIn(List<String> values) {
		  addCriterion("file_url in", values, "fileUrl");
		return (Criteria) this;
		}
    public Criteria andFileUrlNotIn(List<String> values) {
		  addCriterion("file_url not in", values, "fileUrl");
		return (Criteria) this;
		}
     public Criteria andFileUrlBetween(String value1, String value2) {
		   addCriterion("file_url between", value1, value2, "fileUrl");
		return (Criteria) this;
		}
     public Criteria andFileUrlNotBetween(String value1, String value2) {
		   addCriterion("file_url not between", value1, value2, "fileUrl");
		return (Criteria) this;
		}
    public Criteria andFileUrlLike(String value) {
		  addCriterion("file_url like", value, "fileUrl");
		return (Criteria) this;
		}
    public Criteria andFileUrlNotLike(String value) {
		  addCriterion("file_url not like", value, "fileUrl");
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
 public Criteria andTeacherEvalIsNull() {
		 addCriterion("teacher_eval is null");
		return (Criteria) this;
		}
  public Criteria andTeacherEvalIsNotNull(){
		addCriterion("teacher_eval is not null");
		return (Criteria) this;
		}
  public Criteria andTeacherEvalEqualTo(String value) {
		  addCriterion("teacher_eval =", value, "teacherEval");
		return (Criteria) this;
		}
   public Criteria andTeacherEvalNotEqualTo(String value) {
		  addCriterion("teacher_eval <>", value, "teacherEval");
		return (Criteria) this;
		}
    public Criteria andTeacherEvalGreaterThan(String value) {
		 addCriterion("teacher_eval >", value, "teacherEval");
		return (Criteria) this;
		}
  public Criteria andTeacherEvalGreaterThanOrEqualTo(String value) {
		  addCriterion("teacher_eval >=", value, "TeacherEval");
		return (Criteria) this;
		}
   public Criteria andTeacherEvalLessThan(String value) {
		  addCriterion("teacher_eval <", value, "teacherEval");
		return (Criteria) this;
		}
    public Criteria andTeacherEvalLessThanOrEqualTo(String value) {
		  addCriterion("teacher_eval <=", value, "teacherEval");
		return (Criteria) this;
		}
    public Criteria andTeacherEvalIn(List<String> values) {
		  addCriterion("teacher_eval in", values, "teacherEval");
		return (Criteria) this;
		}
    public Criteria andTeacherEvalNotIn(List<String> values) {
		  addCriterion("teacher_eval not in", values, "teacherEval");
		return (Criteria) this;
		}
     public Criteria andTeacherEvalBetween(String value1, String value2) {
		   addCriterion("teacher_eval between", value1, value2, "teacherEval");
		return (Criteria) this;
		}
     public Criteria andTeacherEvalNotBetween(String value1, String value2) {
		   addCriterion("teacher_eval not between", value1, value2, "teacherEval");
		return (Criteria) this;
		}
    public Criteria andTeacherEvalLike(String value) {
		  addCriterion("teacher_eval like", value, "teacherEval");
		return (Criteria) this;
		}
    public Criteria andTeacherEvalNotLike(String value) {
		  addCriterion("teacher_eval not like", value, "teacherEval");
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
