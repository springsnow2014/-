package com.project.model;
import java.util.ArrayList;
import java.util.List;
public class ChatLogExample {
    protected String orderByClause;
    protected boolean distinct;
    protected int startRow;
    protected int pageRows;
    protected List<Criteria> oredCriteria;
    public ChatLogExample() {
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
 public Criteria andContentIsNull() {
		 addCriterion("content is null");
		return (Criteria) this;
		}
  public Criteria andContentIsNotNull(){
		addCriterion("content is not null");
		return (Criteria) this;
		}
  public Criteria andContentEqualTo(String value) {
		  addCriterion("content =", value, "content");
		return (Criteria) this;
		}
   public Criteria andContentNotEqualTo(String value) {
		  addCriterion("content <>", value, "content");
		return (Criteria) this;
		}
    public Criteria andContentGreaterThan(String value) {
		 addCriterion("content >", value, "content");
		return (Criteria) this;
		}
  public Criteria andContentGreaterThanOrEqualTo(String value) {
		  addCriterion("content >=", value, "Content");
		return (Criteria) this;
		}
   public Criteria andContentLessThan(String value) {
		  addCriterion("content <", value, "content");
		return (Criteria) this;
		}
    public Criteria andContentLessThanOrEqualTo(String value) {
		  addCriterion("content <=", value, "content");
		return (Criteria) this;
		}
    public Criteria andContentIn(List<String> values) {
		  addCriterion("content in", values, "content");
		return (Criteria) this;
		}
    public Criteria andContentNotIn(List<String> values) {
		  addCriterion("content not in", values, "content");
		return (Criteria) this;
		}
     public Criteria andContentBetween(String value1, String value2) {
		   addCriterion("content between", value1, value2, "content");
		return (Criteria) this;
		}
     public Criteria andContentNotBetween(String value1, String value2) {
		   addCriterion("content not between", value1, value2, "content");
		return (Criteria) this;
		}
    public Criteria andContentLike(String value) {
		  addCriterion("content like", value, "content");
		return (Criteria) this;
		}
    public Criteria andContentNotLike(String value) {
		  addCriterion("content not like", value, "content");
		return (Criteria) this;
		}
 public Criteria andIsReadIsNull() {
		 addCriterion("is_read is null");
		return (Criteria) this;
		}
  public Criteria andIsReadIsNotNull(){
		addCriterion("is_read is not null");
		return (Criteria) this;
		}
  public Criteria andIsReadEqualTo(Integer value) {
		  addCriterion("is_read =", value, "isRead");
		return (Criteria) this;
		}
   public Criteria andIsReadNotEqualTo(Integer value) {
		  addCriterion("is_read <>", value, "isRead");
		return (Criteria) this;
		}
    public Criteria andIsReadGreaterThan(Integer value) {
		 addCriterion("is_read >", value, "isRead");
		return (Criteria) this;
		}
  public Criteria andIsReadGreaterThanOrEqualTo(Integer value) {
		  addCriterion("is_read >=", value, "IsRead");
		return (Criteria) this;
		}
   public Criteria andIsReadLessThan(Integer value) {
		  addCriterion("is_read <", value, "isRead");
		return (Criteria) this;
		}
    public Criteria andIsReadLessThanOrEqualTo(Integer value) {
		  addCriterion("is_read <=", value, "isRead");
		return (Criteria) this;
		}
    public Criteria andIsReadIn(List<Integer> values) {
		  addCriterion("is_read in", values, "isRead");
		return (Criteria) this;
		}
    public Criteria andIsReadNotIn(List<Integer> values) {
		  addCriterion("is_read not in", values, "isRead");
		return (Criteria) this;
		}
     public Criteria andIsReadBetween(Integer value1, Integer value2) {
		   addCriterion("is_read between", value1, value2, "isRead");
		return (Criteria) this;
		}
     public Criteria andIsReadNotBetween(Integer value1, Integer value2) {
		   addCriterion("is_read not between", value1, value2, "isRead");
		return (Criteria) this;
		}
    public Criteria andIsReadLike(Integer value) {
		  addCriterion("is_read like", value, "isRead");
		return (Criteria) this;
		}
    public Criteria andIsReadNotLike(Integer value) {
		  addCriterion("is_read not like", value, "isRead");
		return (Criteria) this;
		}
 public Criteria andTypeIsNull() {
		 addCriterion("type is null");
		return (Criteria) this;
		}
  public Criteria andTypeIsNotNull(){
		addCriterion("type is not null");
		return (Criteria) this;
		}
  public Criteria andTypeEqualTo(Integer value) {
		  addCriterion("type =", value, "type");
		return (Criteria) this;
		}
   public Criteria andTypeNotEqualTo(Integer value) {
		  addCriterion("type <>", value, "type");
		return (Criteria) this;
		}
    public Criteria andTypeGreaterThan(Integer value) {
		 addCriterion("type >", value, "type");
		return (Criteria) this;
		}
  public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
		  addCriterion("type >=", value, "Type");
		return (Criteria) this;
		}
   public Criteria andTypeLessThan(Integer value) {
		  addCriterion("type <", value, "type");
		return (Criteria) this;
		}
    public Criteria andTypeLessThanOrEqualTo(Integer value) {
		  addCriterion("type <=", value, "type");
		return (Criteria) this;
		}
    public Criteria andTypeIn(List<Integer> values) {
		  addCriterion("type in", values, "type");
		return (Criteria) this;
		}
    public Criteria andTypeNotIn(List<Integer> values) {
		  addCriterion("type not in", values, "type");
		return (Criteria) this;
		}
     public Criteria andTypeBetween(Integer value1, Integer value2) {
		   addCriterion("type between", value1, value2, "type");
		return (Criteria) this;
		}
     public Criteria andTypeNotBetween(Integer value1, Integer value2) {
		   addCriterion("type not between", value1, value2, "type");
		return (Criteria) this;
		}
    public Criteria andTypeLike(Integer value) {
		  addCriterion("type like", value, "type");
		return (Criteria) this;
		}
    public Criteria andTypeNotLike(Integer value) {
		  addCriterion("type not like", value, "type");
		return (Criteria) this;
		}
 public Criteria andTidIsNull() {
		 addCriterion("tid is null");
		return (Criteria) this;
		}
  public Criteria andTidIsNotNull(){
		addCriterion("tid is not null");
		return (Criteria) this;
		}
  public Criteria andTidEqualTo(Integer value) {
		  addCriterion("tid =", value, "tid");
		return (Criteria) this;
		}
   public Criteria andTidNotEqualTo(Integer value) {
		  addCriterion("tid <>", value, "tid");
		return (Criteria) this;
		}
    public Criteria andTidGreaterThan(Integer value) {
		 addCriterion("tid >", value, "tid");
		return (Criteria) this;
		}
  public Criteria andTidGreaterThanOrEqualTo(Integer value) {
		  addCriterion("tid >=", value, "Tid");
		return (Criteria) this;
		}
   public Criteria andTidLessThan(Integer value) {
		  addCriterion("tid <", value, "tid");
		return (Criteria) this;
		}
    public Criteria andTidLessThanOrEqualTo(Integer value) {
		  addCriterion("tid <=", value, "tid");
		return (Criteria) this;
		}
    public Criteria andTidIn(List<Integer> values) {
		  addCriterion("tid in", values, "tid");
		return (Criteria) this;
		}
    public Criteria andTidNotIn(List<Integer> values) {
		  addCriterion("tid not in", values, "tid");
		return (Criteria) this;
		}
     public Criteria andTidBetween(Integer value1, Integer value2) {
		   addCriterion("tid between", value1, value2, "tid");
		return (Criteria) this;
		}
     public Criteria andTidNotBetween(Integer value1, Integer value2) {
		   addCriterion("tid not between", value1, value2, "tid");
		return (Criteria) this;
		}
    public Criteria andTidLike(Integer value) {
		  addCriterion("tid like", value, "tid");
		return (Criteria) this;
		}
    public Criteria andTidNotLike(Integer value) {
		  addCriterion("tid not like", value, "tid");
		return (Criteria) this;
		}
 public Criteria andSidIsNull() {
		 addCriterion("sid is null");
		return (Criteria) this;
		}
  public Criteria andSidIsNotNull(){
		addCriterion("sid is not null");
		return (Criteria) this;
		}
  public Criteria andSidEqualTo(Integer value) {
		  addCriterion("sid =", value, "sid");
		return (Criteria) this;
		}
   public Criteria andSidNotEqualTo(Integer value) {
		  addCriterion("sid <>", value, "sid");
		return (Criteria) this;
		}
    public Criteria andSidGreaterThan(Integer value) {
		 addCriterion("sid >", value, "sid");
		return (Criteria) this;
		}
  public Criteria andSidGreaterThanOrEqualTo(Integer value) {
		  addCriterion("sid >=", value, "Sid");
		return (Criteria) this;
		}
   public Criteria andSidLessThan(Integer value) {
		  addCriterion("sid <", value, "sid");
		return (Criteria) this;
		}
    public Criteria andSidLessThanOrEqualTo(Integer value) {
		  addCriterion("sid <=", value, "sid");
		return (Criteria) this;
		}
    public Criteria andSidIn(List<Integer> values) {
		  addCriterion("sid in", values, "sid");
		return (Criteria) this;
		}
    public Criteria andSidNotIn(List<Integer> values) {
		  addCriterion("sid not in", values, "sid");
		return (Criteria) this;
		}
     public Criteria andSidBetween(Integer value1, Integer value2) {
		   addCriterion("sid between", value1, value2, "sid");
		return (Criteria) this;
		}
     public Criteria andSidNotBetween(Integer value1, Integer value2) {
		   addCriterion("sid not between", value1, value2, "sid");
		return (Criteria) this;
		}
    public Criteria andSidLike(Integer value) {
		  addCriterion("sid like", value, "sid");
		return (Criteria) this;
		}
    public Criteria andSidNotLike(Integer value) {
		  addCriterion("sid not like", value, "sid");
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
