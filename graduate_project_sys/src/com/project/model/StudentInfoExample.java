package com.project.model;
import java.util.ArrayList;
import java.util.List;
public class StudentInfoExample {
    protected String orderByClause;
    protected boolean distinct;
    protected int startRow;
    protected int pageRows;
    protected List<Criteria> oredCriteria;
    public StudentInfoExample() {
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
 public Criteria andStuNoIsNull() {
		 addCriterion("stu_no is null");
		return (Criteria) this;
		}
  public Criteria andStuNoIsNotNull(){
		addCriterion("stu_no is not null");
		return (Criteria) this;
		}
  public Criteria andStuNoEqualTo(String value) {
		  addCriterion("stu_no =", value, "stuNo");
		return (Criteria) this;
		}
   public Criteria andStuNoNotEqualTo(String value) {
		  addCriterion("stu_no <>", value, "stuNo");
		return (Criteria) this;
		}
    public Criteria andStuNoGreaterThan(String value) {
		 addCriterion("stu_no >", value, "stuNo");
		return (Criteria) this;
		}
  public Criteria andStuNoGreaterThanOrEqualTo(String value) {
		  addCriterion("stu_no >=", value, "StuNo");
		return (Criteria) this;
		}
   public Criteria andStuNoLessThan(String value) {
		  addCriterion("stu_no <", value, "stuNo");
		return (Criteria) this;
		}
    public Criteria andStuNoLessThanOrEqualTo(String value) {
		  addCriterion("stu_no <=", value, "stuNo");
		return (Criteria) this;
		}
    public Criteria andStuNoIn(List<String> values) {
		  addCriterion("stu_no in", values, "stuNo");
		return (Criteria) this;
		}
    public Criteria andStuNoNotIn(List<String> values) {
		  addCriterion("stu_no not in", values, "stuNo");
		return (Criteria) this;
		}
     public Criteria andStuNoBetween(String value1, String value2) {
		   addCriterion("stu_no between", value1, value2, "stuNo");
		return (Criteria) this;
		}
     public Criteria andStuNoNotBetween(String value1, String value2) {
		   addCriterion("stu_no not between", value1, value2, "stuNo");
		return (Criteria) this;
		}
    public Criteria andStuNoLike(String value) {
		  addCriterion("stu_no like", value, "stuNo");
		return (Criteria) this;
		}
    public Criteria andStuNoNotLike(String value) {
		  addCriterion("stu_no not like", value, "stuNo");
		return (Criteria) this;
		}
 public Criteria andPasswordIsNull() {
		 addCriterion("password is null");
		return (Criteria) this;
		}
  public Criteria andPasswordIsNotNull(){
		addCriterion("password is not null");
		return (Criteria) this;
		}
  public Criteria andPasswordEqualTo(String value) {
		  addCriterion("password =", value, "password");
		return (Criteria) this;
		}
   public Criteria andPasswordNotEqualTo(String value) {
		  addCriterion("password <>", value, "password");
		return (Criteria) this;
		}
    public Criteria andPasswordGreaterThan(String value) {
		 addCriterion("password >", value, "password");
		return (Criteria) this;
		}
  public Criteria andPasswordGreaterThanOrEqualTo(String value) {
		  addCriterion("password >=", value, "Password");
		return (Criteria) this;
		}
   public Criteria andPasswordLessThan(String value) {
		  addCriterion("password <", value, "password");
		return (Criteria) this;
		}
    public Criteria andPasswordLessThanOrEqualTo(String value) {
		  addCriterion("password <=", value, "password");
		return (Criteria) this;
		}
    public Criteria andPasswordIn(List<String> values) {
		  addCriterion("password in", values, "password");
		return (Criteria) this;
		}
    public Criteria andPasswordNotIn(List<String> values) {
		  addCriterion("password not in", values, "password");
		return (Criteria) this;
		}
     public Criteria andPasswordBetween(String value1, String value2) {
		   addCriterion("password between", value1, value2, "password");
		return (Criteria) this;
		}
     public Criteria andPasswordNotBetween(String value1, String value2) {
		   addCriterion("password not between", value1, value2, "password");
		return (Criteria) this;
		}
    public Criteria andPasswordLike(String value) {
		  addCriterion("password like", value, "password");
		return (Criteria) this;
		}
    public Criteria andPasswordNotLike(String value) {
		  addCriterion("password not like", value, "password");
		return (Criteria) this;
		}
 public Criteria andRealNameIsNull() {
		 addCriterion("real_name is null");
		return (Criteria) this;
		}
  public Criteria andRealNameIsNotNull(){
		addCriterion("real_name is not null");
		return (Criteria) this;
		}
  public Criteria andRealNameEqualTo(String value) {
		  addCriterion("real_name =", value, "realName");
		return (Criteria) this;
		}
   public Criteria andRealNameNotEqualTo(String value) {
		  addCriterion("real_name <>", value, "realName");
		return (Criteria) this;
		}
    public Criteria andRealNameGreaterThan(String value) {
		 addCriterion("real_name >", value, "realName");
		return (Criteria) this;
		}
  public Criteria andRealNameGreaterThanOrEqualTo(String value) {
		  addCriterion("real_name >=", value, "RealName");
		return (Criteria) this;
		}
   public Criteria andRealNameLessThan(String value) {
		  addCriterion("real_name <", value, "realName");
		return (Criteria) this;
		}
    public Criteria andRealNameLessThanOrEqualTo(String value) {
		  addCriterion("real_name <=", value, "realName");
		return (Criteria) this;
		}
    public Criteria andRealNameIn(List<String> values) {
		  addCriterion("real_name in", values, "realName");
		return (Criteria) this;
		}
    public Criteria andRealNameNotIn(List<String> values) {
		  addCriterion("real_name not in", values, "realName");
		return (Criteria) this;
		}
     public Criteria andRealNameBetween(String value1, String value2) {
		   addCriterion("real_name between", value1, value2, "realName");
		return (Criteria) this;
		}
     public Criteria andRealNameNotBetween(String value1, String value2) {
		   addCriterion("real_name not between", value1, value2, "realName");
		return (Criteria) this;
		}
    public Criteria andRealNameLike(String value) {
		  addCriterion("real_name like", value, "realName");
		return (Criteria) this;
		}
    public Criteria andRealNameNotLike(String value) {
		  addCriterion("real_name not like", value, "realName");
		return (Criteria) this;
		}
 public Criteria andCelPhoneIsNull() {
		 addCriterion("cel_phone is null");
		return (Criteria) this;
		}
  public Criteria andCelPhoneIsNotNull(){
		addCriterion("cel_phone is not null");
		return (Criteria) this;
		}
  public Criteria andCelPhoneEqualTo(String value) {
		  addCriterion("cel_phone =", value, "celPhone");
		return (Criteria) this;
		}
   public Criteria andCelPhoneNotEqualTo(String value) {
		  addCriterion("cel_phone <>", value, "celPhone");
		return (Criteria) this;
		}
    public Criteria andCelPhoneGreaterThan(String value) {
		 addCriterion("cel_phone >", value, "celPhone");
		return (Criteria) this;
		}
  public Criteria andCelPhoneGreaterThanOrEqualTo(String value) {
		  addCriterion("cel_phone >=", value, "CelPhone");
		return (Criteria) this;
		}
   public Criteria andCelPhoneLessThan(String value) {
		  addCriterion("cel_phone <", value, "celPhone");
		return (Criteria) this;
		}
    public Criteria andCelPhoneLessThanOrEqualTo(String value) {
		  addCriterion("cel_phone <=", value, "celPhone");
		return (Criteria) this;
		}
    public Criteria andCelPhoneIn(List<String> values) {
		  addCriterion("cel_phone in", values, "celPhone");
		return (Criteria) this;
		}
    public Criteria andCelPhoneNotIn(List<String> values) {
		  addCriterion("cel_phone not in", values, "celPhone");
		return (Criteria) this;
		}
     public Criteria andCelPhoneBetween(String value1, String value2) {
		   addCriterion("cel_phone between", value1, value2, "celPhone");
		return (Criteria) this;
		}
     public Criteria andCelPhoneNotBetween(String value1, String value2) {
		   addCriterion("cel_phone not between", value1, value2, "celPhone");
		return (Criteria) this;
		}
    public Criteria andCelPhoneLike(String value) {
		  addCriterion("cel_phone like", value, "celPhone");
		return (Criteria) this;
		}
    public Criteria andCelPhoneNotLike(String value) {
		  addCriterion("cel_phone not like", value, "celPhone");
		return (Criteria) this;
		}
 public Criteria andEmailIsNull() {
		 addCriterion("email is null");
		return (Criteria) this;
		}
  public Criteria andEmailIsNotNull(){
		addCriterion("email is not null");
		return (Criteria) this;
		}
  public Criteria andEmailEqualTo(String value) {
		  addCriterion("email =", value, "email");
		return (Criteria) this;
		}
   public Criteria andEmailNotEqualTo(String value) {
		  addCriterion("email <>", value, "email");
		return (Criteria) this;
		}
    public Criteria andEmailGreaterThan(String value) {
		 addCriterion("email >", value, "email");
		return (Criteria) this;
		}
  public Criteria andEmailGreaterThanOrEqualTo(String value) {
		  addCriterion("email >=", value, "Email");
		return (Criteria) this;
		}
   public Criteria andEmailLessThan(String value) {
		  addCriterion("email <", value, "email");
		return (Criteria) this;
		}
    public Criteria andEmailLessThanOrEqualTo(String value) {
		  addCriterion("email <=", value, "email");
		return (Criteria) this;
		}
    public Criteria andEmailIn(List<String> values) {
		  addCriterion("email in", values, "email");
		return (Criteria) this;
		}
    public Criteria andEmailNotIn(List<String> values) {
		  addCriterion("email not in", values, "email");
		return (Criteria) this;
		}
     public Criteria andEmailBetween(String value1, String value2) {
		   addCriterion("email between", value1, value2, "email");
		return (Criteria) this;
		}
     public Criteria andEmailNotBetween(String value1, String value2) {
		   addCriterion("email not between", value1, value2, "email");
		return (Criteria) this;
		}
    public Criteria andEmailLike(String value) {
		  addCriterion("email like", value, "email");
		return (Criteria) this;
		}
    public Criteria andEmailNotLike(String value) {
		  addCriterion("email not like", value, "email");
		return (Criteria) this;
		}
 public Criteria andHeadImgIsNull() {
		 addCriterion("head_img is null");
		return (Criteria) this;
		}
  public Criteria andHeadImgIsNotNull(){
		addCriterion("head_img is not null");
		return (Criteria) this;
		}
  public Criteria andHeadImgEqualTo(String value) {
		  addCriterion("head_img =", value, "headImg");
		return (Criteria) this;
		}
   public Criteria andHeadImgNotEqualTo(String value) {
		  addCriterion("head_img <>", value, "headImg");
		return (Criteria) this;
		}
    public Criteria andHeadImgGreaterThan(String value) {
		 addCriterion("head_img >", value, "headImg");
		return (Criteria) this;
		}
  public Criteria andHeadImgGreaterThanOrEqualTo(String value) {
		  addCriterion("head_img >=", value, "HeadImg");
		return (Criteria) this;
		}
   public Criteria andHeadImgLessThan(String value) {
		  addCriterion("head_img <", value, "headImg");
		return (Criteria) this;
		}
    public Criteria andHeadImgLessThanOrEqualTo(String value) {
		  addCriterion("head_img <=", value, "headImg");
		return (Criteria) this;
		}
    public Criteria andHeadImgIn(List<String> values) {
		  addCriterion("head_img in", values, "headImg");
		return (Criteria) this;
		}
    public Criteria andHeadImgNotIn(List<String> values) {
		  addCriterion("head_img not in", values, "headImg");
		return (Criteria) this;
		}
     public Criteria andHeadImgBetween(String value1, String value2) {
		   addCriterion("head_img between", value1, value2, "headImg");
		return (Criteria) this;
		}
     public Criteria andHeadImgNotBetween(String value1, String value2) {
		   addCriterion("head_img not between", value1, value2, "headImg");
		return (Criteria) this;
		}
    public Criteria andHeadImgLike(String value) {
		  addCriterion("head_img like", value, "headImg");
		return (Criteria) this;
		}
    public Criteria andHeadImgNotLike(String value) {
		  addCriterion("head_img not like", value, "headImg");
		return (Criteria) this;
		}
 public Criteria andSexIsNull() {
		 addCriterion("sex is null");
		return (Criteria) this;
		}
  public Criteria andSexIsNotNull(){
		addCriterion("sex is not null");
		return (Criteria) this;
		}
  public Criteria andSexEqualTo(Integer value) {
		  addCriterion("sex =", value, "sex");
		return (Criteria) this;
		}
   public Criteria andSexNotEqualTo(Integer value) {
		  addCriterion("sex <>", value, "sex");
		return (Criteria) this;
		}
    public Criteria andSexGreaterThan(Integer value) {
		 addCriterion("sex >", value, "sex");
		return (Criteria) this;
		}
  public Criteria andSexGreaterThanOrEqualTo(Integer value) {
		  addCriterion("sex >=", value, "Sex");
		return (Criteria) this;
		}
   public Criteria andSexLessThan(Integer value) {
		  addCriterion("sex <", value, "sex");
		return (Criteria) this;
		}
    public Criteria andSexLessThanOrEqualTo(Integer value) {
		  addCriterion("sex <=", value, "sex");
		return (Criteria) this;
		}
    public Criteria andSexIn(List<Integer> values) {
		  addCriterion("sex in", values, "sex");
		return (Criteria) this;
		}
    public Criteria andSexNotIn(List<Integer> values) {
		  addCriterion("sex not in", values, "sex");
		return (Criteria) this;
		}
     public Criteria andSexBetween(Integer value1, Integer value2) {
		   addCriterion("sex between", value1, value2, "sex");
		return (Criteria) this;
		}
     public Criteria andSexNotBetween(Integer value1, Integer value2) {
		   addCriterion("sex not between", value1, value2, "sex");
		return (Criteria) this;
		}
    public Criteria andSexLike(Integer value) {
		  addCriterion("sex like", value, "sex");
		return (Criteria) this;
		}
    public Criteria andSexNotLike(Integer value) {
		  addCriterion("sex not like", value, "sex");
		return (Criteria) this;
		}
 public Criteria andHaveTurtorIsNull() {
		 addCriterion("have_turtor is null");
		return (Criteria) this;
		}
  public Criteria andHaveTurtorIsNotNull(){
		addCriterion("have_turtor is not null");
		return (Criteria) this;
		}
  public Criteria andHaveTurtorEqualTo(Integer value) {
		  addCriterion("have_turtor =", value, "haveTurtor");
		return (Criteria) this;
		}
   public Criteria andHaveTurtorNotEqualTo(Integer value) {
		  addCriterion("have_turtor <>", value, "haveTurtor");
		return (Criteria) this;
		}
    public Criteria andHaveTurtorGreaterThan(Integer value) {
		 addCriterion("have_turtor >", value, "haveTurtor");
		return (Criteria) this;
		}
  public Criteria andHaveTurtorGreaterThanOrEqualTo(Integer value) {
		  addCriterion("have_turtor >=", value, "HaveTurtor");
		return (Criteria) this;
		}
   public Criteria andHaveTurtorLessThan(Integer value) {
		  addCriterion("have_turtor <", value, "haveTurtor");
		return (Criteria) this;
		}
    public Criteria andHaveTurtorLessThanOrEqualTo(Integer value) {
		  addCriterion("have_turtor <=", value, "haveTurtor");
		return (Criteria) this;
		}
    public Criteria andHaveTurtorIn(List<Integer> values) {
		  addCriterion("have_turtor in", values, "haveTurtor");
		return (Criteria) this;
		}
    public Criteria andHaveTurtorNotIn(List<Integer> values) {
		  addCriterion("have_turtor not in", values, "haveTurtor");
		return (Criteria) this;
		}
     public Criteria andHaveTurtorBetween(Integer value1, Integer value2) {
		   addCriterion("have_turtor between", value1, value2, "haveTurtor");
		return (Criteria) this;
		}
     public Criteria andHaveTurtorNotBetween(Integer value1, Integer value2) {
		   addCriterion("have_turtor not between", value1, value2, "haveTurtor");
		return (Criteria) this;
		}
    public Criteria andHaveTurtorLike(Integer value) {
		  addCriterion("have_turtor like", value, "haveTurtor");
		return (Criteria) this;
		}
    public Criteria andHaveTurtorNotLike(Integer value) {
		  addCriterion("have_turtor not like", value, "haveTurtor");
		return (Criteria) this;
		}
 public Criteria andCollegeIdIsNull() {
		 addCriterion("college_id is null");
		return (Criteria) this;
		}
  public Criteria andCollegeIdIsNotNull(){
		addCriterion("college_id is not null");
		return (Criteria) this;
		}
  public Criteria andCollegeIdEqualTo(Integer value) {
		  addCriterion("college_id =", value, "collegeId");
		return (Criteria) this;
		}
   public Criteria andCollegeIdNotEqualTo(Integer value) {
		  addCriterion("college_id <>", value, "collegeId");
		return (Criteria) this;
		}
    public Criteria andCollegeIdGreaterThan(Integer value) {
		 addCriterion("college_id >", value, "collegeId");
		return (Criteria) this;
		}
  public Criteria andCollegeIdGreaterThanOrEqualTo(Integer value) {
		  addCriterion("college_id >=", value, "CollegeId");
		return (Criteria) this;
		}
   public Criteria andCollegeIdLessThan(Integer value) {
		  addCriterion("college_id <", value, "collegeId");
		return (Criteria) this;
		}
    public Criteria andCollegeIdLessThanOrEqualTo(Integer value) {
		  addCriterion("college_id <=", value, "collegeId");
		return (Criteria) this;
		}
    public Criteria andCollegeIdIn(List<Integer> values) {
		  addCriterion("college_id in", values, "collegeId");
		return (Criteria) this;
		}
    public Criteria andCollegeIdNotIn(List<Integer> values) {
		  addCriterion("college_id not in", values, "collegeId");
		return (Criteria) this;
		}
     public Criteria andCollegeIdBetween(Integer value1, Integer value2) {
		   addCriterion("college_id between", value1, value2, "collegeId");
		return (Criteria) this;
		}
     public Criteria andCollegeIdNotBetween(Integer value1, Integer value2) {
		   addCriterion("college_id not between", value1, value2, "collegeId");
		return (Criteria) this;
		}
    public Criteria andCollegeIdLike(Integer value) {
		  addCriterion("college_id like", value, "collegeId");
		return (Criteria) this;
		}
    public Criteria andCollegeIdNotLike(Integer value) {
		  addCriterion("college_id not like", value, "collegeId");
		return (Criteria) this;
		}
 public Criteria andClassIdIsNull() {
		 addCriterion("class_id is null");
		return (Criteria) this;
		}
  public Criteria andClassIdIsNotNull(){
		addCriterion("class_id is not null");
		return (Criteria) this;
		}
  public Criteria andClassIdEqualTo(Integer value) {
		  addCriterion("class_id =", value, "classId");
		return (Criteria) this;
		}
   public Criteria andClassIdNotEqualTo(Integer value) {
		  addCriterion("class_id <>", value, "classId");
		return (Criteria) this;
		}
    public Criteria andClassIdGreaterThan(Integer value) {
		 addCriterion("class_id >", value, "classId");
		return (Criteria) this;
		}
  public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
		  addCriterion("class_id >=", value, "ClassId");
		return (Criteria) this;
		}
   public Criteria andClassIdLessThan(Integer value) {
		  addCriterion("class_id <", value, "classId");
		return (Criteria) this;
		}
    public Criteria andClassIdLessThanOrEqualTo(Integer value) {
		  addCriterion("class_id <=", value, "classId");
		return (Criteria) this;
		}
    public Criteria andClassIdIn(List<Integer> values) {
		  addCriterion("class_id in", values, "classId");
		return (Criteria) this;
		}
    public Criteria andClassIdNotIn(List<Integer> values) {
		  addCriterion("class_id not in", values, "classId");
		return (Criteria) this;
		}
     public Criteria andClassIdBetween(Integer value1, Integer value2) {
		   addCriterion("class_id between", value1, value2, "classId");
		return (Criteria) this;
		}
     public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
		   addCriterion("class_id not between", value1, value2, "classId");
		return (Criteria) this;
		}
    public Criteria andClassIdLike(Integer value) {
		  addCriterion("class_id like", value, "classId");
		return (Criteria) this;
		}
    public Criteria andClassIdNotLike(Integer value) {
		  addCriterion("class_id not like", value, "classId");
		return (Criteria) this;
		}
 public Criteria andResearchIdIsNull() {
		 addCriterion("research_id is null");
		return (Criteria) this;
		}
  public Criteria andResearchIdIsNotNull(){
		addCriterion("research_id is not null");
		return (Criteria) this;
		}
  public Criteria andResearchIdEqualTo(Integer value) {
		  addCriterion("research_id =", value, "researchId");
		return (Criteria) this;
		}
   public Criteria andResearchIdNotEqualTo(Integer value) {
		  addCriterion("research_id <>", value, "researchId");
		return (Criteria) this;
		}
    public Criteria andResearchIdGreaterThan(Integer value) {
		 addCriterion("research_id >", value, "researchId");
		return (Criteria) this;
		}
  public Criteria andResearchIdGreaterThanOrEqualTo(Integer value) {
		  addCriterion("research_id >=", value, "ResearchId");
		return (Criteria) this;
		}
   public Criteria andResearchIdLessThan(Integer value) {
		  addCriterion("research_id <", value, "researchId");
		return (Criteria) this;
		}
    public Criteria andResearchIdLessThanOrEqualTo(Integer value) {
		  addCriterion("research_id <=", value, "researchId");
		return (Criteria) this;
		}
    public Criteria andResearchIdIn(List<Integer> values) {
		  addCriterion("research_id in", values, "researchId");
		return (Criteria) this;
		}
    public Criteria andResearchIdNotIn(List<Integer> values) {
		  addCriterion("research_id not in", values, "researchId");
		return (Criteria) this;
		}
     public Criteria andResearchIdBetween(Integer value1, Integer value2) {
		   addCriterion("research_id between", value1, value2, "researchId");
		return (Criteria) this;
		}
     public Criteria andResearchIdNotBetween(Integer value1, Integer value2) {
		   addCriterion("research_id not between", value1, value2, "researchId");
		return (Criteria) this;
		}
    public Criteria andResearchIdLike(Integer value) {
		  addCriterion("research_id like", value, "researchId");
		return (Criteria) this;
		}
    public Criteria andResearchIdNotLike(Integer value) {
		  addCriterion("research_id not like", value, "researchId");
		return (Criteria) this;
		}
 public Criteria andGradeIdIsNull() {
		 addCriterion("grade_id is null");
		return (Criteria) this;
		}
  public Criteria andGradeIdIsNotNull(){
		addCriterion("grade_id is not null");
		return (Criteria) this;
		}
  public Criteria andGradeIdEqualTo(Integer value) {
		  addCriterion("grade_id =", value, "gradeId");
		return (Criteria) this;
		}
   public Criteria andGradeIdNotEqualTo(Integer value) {
		  addCriterion("grade_id <>", value, "gradeId");
		return (Criteria) this;
		}
    public Criteria andGradeIdGreaterThan(Integer value) {
		 addCriterion("grade_id >", value, "gradeId");
		return (Criteria) this;
		}
  public Criteria andGradeIdGreaterThanOrEqualTo(Integer value) {
		  addCriterion("grade_id >=", value, "GradeId");
		return (Criteria) this;
		}
   public Criteria andGradeIdLessThan(Integer value) {
		  addCriterion("grade_id <", value, "gradeId");
		return (Criteria) this;
		}
    public Criteria andGradeIdLessThanOrEqualTo(Integer value) {
		  addCriterion("grade_id <=", value, "gradeId");
		return (Criteria) this;
		}
    public Criteria andGradeIdIn(List<Integer> values) {
		  addCriterion("grade_id in", values, "gradeId");
		return (Criteria) this;
		}
    public Criteria andGradeIdNotIn(List<Integer> values) {
		  addCriterion("grade_id not in", values, "gradeId");
		return (Criteria) this;
		}
     public Criteria andGradeIdBetween(Integer value1, Integer value2) {
		   addCriterion("grade_id between", value1, value2, "gradeId");
		return (Criteria) this;
		}
     public Criteria andGradeIdNotBetween(Integer value1, Integer value2) {
		   addCriterion("grade_id not between", value1, value2, "gradeId");
		return (Criteria) this;
		}
    public Criteria andGradeIdLike(Integer value) {
		  addCriterion("grade_id like", value, "gradeId");
		return (Criteria) this;
		}
    public Criteria andGradeIdNotLike(Integer value) {
		  addCriterion("grade_id not like", value, "gradeId");
		return (Criteria) this;
		}
 public Criteria andTermIdIsNull() {
		 addCriterion("term_id is null");
		return (Criteria) this;
		}
  public Criteria andTermIdIsNotNull(){
		addCriterion("term_id is not null");
		return (Criteria) this;
		}
  public Criteria andTermIdEqualTo(Integer value) {
		  addCriterion("term_id =", value, "termId");
		return (Criteria) this;
		}
   public Criteria andTermIdNotEqualTo(Integer value) {
		  addCriterion("term_id <>", value, "termId");
		return (Criteria) this;
		}
    public Criteria andTermIdGreaterThan(Integer value) {
		 addCriterion("term_id >", value, "termId");
		return (Criteria) this;
		}
  public Criteria andTermIdGreaterThanOrEqualTo(Integer value) {
		  addCriterion("term_id >=", value, "TermId");
		return (Criteria) this;
		}
   public Criteria andTermIdLessThan(Integer value) {
		  addCriterion("term_id <", value, "termId");
		return (Criteria) this;
		}
    public Criteria andTermIdLessThanOrEqualTo(Integer value) {
		  addCriterion("term_id <=", value, "termId");
		return (Criteria) this;
		}
    public Criteria andTermIdIn(List<Integer> values) {
		  addCriterion("term_id in", values, "termId");
		return (Criteria) this;
		}
    public Criteria andTermIdNotIn(List<Integer> values) {
		  addCriterion("term_id not in", values, "termId");
		return (Criteria) this;
		}
     public Criteria andTermIdBetween(Integer value1, Integer value2) {
		   addCriterion("term_id between", value1, value2, "termId");
		return (Criteria) this;
		}
     public Criteria andTermIdNotBetween(Integer value1, Integer value2) {
		   addCriterion("term_id not between", value1, value2, "termId");
		return (Criteria) this;
		}
    public Criteria andTermIdLike(Integer value) {
		  addCriterion("term_id like", value, "termId");
		return (Criteria) this;
		}
    public Criteria andTermIdNotLike(Integer value) {
		  addCriterion("term_id not like", value, "termId");
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
