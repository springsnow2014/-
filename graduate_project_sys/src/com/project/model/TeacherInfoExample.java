package com.project.model;
import java.util.ArrayList;
import java.util.List;
public class TeacherInfoExample {
    protected String orderByClause;
    protected boolean distinct;
    protected int startRow;
    protected int pageRows;
    protected List<Criteria> oredCriteria;
    public TeacherInfoExample() {
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
 public Criteria andTnoIsNull() {
		 addCriterion("tno is null");
		return (Criteria) this;
		}
  public Criteria andTnoIsNotNull(){
		addCriterion("tno is not null");
		return (Criteria) this;
		}
  public Criteria andTnoEqualTo(String value) {
		  addCriterion("tno =", value, "tno");
		return (Criteria) this;
		}
   public Criteria andTnoNotEqualTo(String value) {
		  addCriterion("tno <>", value, "tno");
		return (Criteria) this;
		}
    public Criteria andTnoGreaterThan(String value) {
		 addCriterion("tno >", value, "tno");
		return (Criteria) this;
		}
  public Criteria andTnoGreaterThanOrEqualTo(String value) {
		  addCriterion("tno >=", value, "Tno");
		return (Criteria) this;
		}
   public Criteria andTnoLessThan(String value) {
		  addCriterion("tno <", value, "tno");
		return (Criteria) this;
		}
    public Criteria andTnoLessThanOrEqualTo(String value) {
		  addCriterion("tno <=", value, "tno");
		return (Criteria) this;
		}
    public Criteria andTnoIn(List<String> values) {
		  addCriterion("tno in", values, "tno");
		return (Criteria) this;
		}
    public Criteria andTnoNotIn(List<String> values) {
		  addCriterion("tno not in", values, "tno");
		return (Criteria) this;
		}
     public Criteria andTnoBetween(String value1, String value2) {
		   addCriterion("tno between", value1, value2, "tno");
		return (Criteria) this;
		}
     public Criteria andTnoNotBetween(String value1, String value2) {
		   addCriterion("tno not between", value1, value2, "tno");
		return (Criteria) this;
		}
    public Criteria andTnoLike(String value) {
		  addCriterion("tno like", value, "tno");
		return (Criteria) this;
		}
    public Criteria andTnoNotLike(String value) {
		  addCriterion("tno not like", value, "tno");
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
 public Criteria andPersonalIntroIsNull() {
		 addCriterion("personal_intro is null");
		return (Criteria) this;
		}
  public Criteria andPersonalIntroIsNotNull(){
		addCriterion("personal_intro is not null");
		return (Criteria) this;
		}
  public Criteria andPersonalIntroEqualTo(String value) {
		  addCriterion("personal_intro =", value, "personalIntro");
		return (Criteria) this;
		}
   public Criteria andPersonalIntroNotEqualTo(String value) {
		  addCriterion("personal_intro <>", value, "personalIntro");
		return (Criteria) this;
		}
    public Criteria andPersonalIntroGreaterThan(String value) {
		 addCriterion("personal_intro >", value, "personalIntro");
		return (Criteria) this;
		}
  public Criteria andPersonalIntroGreaterThanOrEqualTo(String value) {
		  addCriterion("personal_intro >=", value, "PersonalIntro");
		return (Criteria) this;
		}
   public Criteria andPersonalIntroLessThan(String value) {
		  addCriterion("personal_intro <", value, "personalIntro");
		return (Criteria) this;
		}
    public Criteria andPersonalIntroLessThanOrEqualTo(String value) {
		  addCriterion("personal_intro <=", value, "personalIntro");
		return (Criteria) this;
		}
    public Criteria andPersonalIntroIn(List<String> values) {
		  addCriterion("personal_intro in", values, "personalIntro");
		return (Criteria) this;
		}
    public Criteria andPersonalIntroNotIn(List<String> values) {
		  addCriterion("personal_intro not in", values, "personalIntro");
		return (Criteria) this;
		}
     public Criteria andPersonalIntroBetween(String value1, String value2) {
		   addCriterion("personal_intro between", value1, value2, "personalIntro");
		return (Criteria) this;
		}
     public Criteria andPersonalIntroNotBetween(String value1, String value2) {
		   addCriterion("personal_intro not between", value1, value2, "personalIntro");
		return (Criteria) this;
		}
    public Criteria andPersonalIntroLike(String value) {
		  addCriterion("personal_intro like", value, "personalIntro");
		return (Criteria) this;
		}
    public Criteria andPersonalIntroNotLike(String value) {
		  addCriterion("personal_intro not like", value, "personalIntro");
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
 public Criteria andJobNameIsNull() {
		 addCriterion("job_name is null");
		return (Criteria) this;
		}
  public Criteria andJobNameIsNotNull(){
		addCriterion("job_name is not null");
		return (Criteria) this;
		}
  public Criteria andJobNameEqualTo(String value) {
		  addCriterion("job_name =", value, "jobName");
		return (Criteria) this;
		}
   public Criteria andJobNameNotEqualTo(String value) {
		  addCriterion("job_name <>", value, "jobName");
		return (Criteria) this;
		}
    public Criteria andJobNameGreaterThan(String value) {
		 addCriterion("job_name >", value, "jobName");
		return (Criteria) this;
		}
  public Criteria andJobNameGreaterThanOrEqualTo(String value) {
		  addCriterion("job_name >=", value, "JobName");
		return (Criteria) this;
		}
   public Criteria andJobNameLessThan(String value) {
		  addCriterion("job_name <", value, "jobName");
		return (Criteria) this;
		}
    public Criteria andJobNameLessThanOrEqualTo(String value) {
		  addCriterion("job_name <=", value, "jobName");
		return (Criteria) this;
		}
    public Criteria andJobNameIn(List<String> values) {
		  addCriterion("job_name in", values, "jobName");
		return (Criteria) this;
		}
    public Criteria andJobNameNotIn(List<String> values) {
		  addCriterion("job_name not in", values, "jobName");
		return (Criteria) this;
		}
     public Criteria andJobNameBetween(String value1, String value2) {
		   addCriterion("job_name between", value1, value2, "jobName");
		return (Criteria) this;
		}
     public Criteria andJobNameNotBetween(String value1, String value2) {
		   addCriterion("job_name not between", value1, value2, "jobName");
		return (Criteria) this;
		}
    public Criteria andJobNameLike(String value) {
		  addCriterion("job_name like", value, "jobName");
		return (Criteria) this;
		}
    public Criteria andJobNameNotLike(String value) {
		  addCriterion("job_name not like", value, "jobName");
		return (Criteria) this;
		}
 public Criteria andIsSelectIsNull() {
		 addCriterion("is_select is null");
		return (Criteria) this;
		}
  public Criteria andIsSelectIsNotNull(){
		addCriterion("is_select is not null");
		return (Criteria) this;
		}
  public Criteria andIsSelectEqualTo(Integer value) {
		  addCriterion("is_select =", value, "isSelect");
		return (Criteria) this;
		}
   public Criteria andIsSelectNotEqualTo(Integer value) {
		  addCriterion("is_select <>", value, "isSelect");
		return (Criteria) this;
		}
    public Criteria andIsSelectGreaterThan(Integer value) {
		 addCriterion("is_select >", value, "isSelect");
		return (Criteria) this;
		}
  public Criteria andIsSelectGreaterThanOrEqualTo(Integer value) {
		  addCriterion("is_select >=", value, "IsSelect");
		return (Criteria) this;
		}
   public Criteria andIsSelectLessThan(Integer value) {
		  addCriterion("is_select <", value, "isSelect");
		return (Criteria) this;
		}
    public Criteria andIsSelectLessThanOrEqualTo(Integer value) {
		  addCriterion("is_select <=", value, "isSelect");
		return (Criteria) this;
		}
    public Criteria andIsSelectIn(List<Integer> values) {
		  addCriterion("is_select in", values, "isSelect");
		return (Criteria) this;
		}
    public Criteria andIsSelectNotIn(List<Integer> values) {
		  addCriterion("is_select not in", values, "isSelect");
		return (Criteria) this;
		}
     public Criteria andIsSelectBetween(Integer value1, Integer value2) {
		   addCriterion("is_select between", value1, value2, "isSelect");
		return (Criteria) this;
		}
     public Criteria andIsSelectNotBetween(Integer value1, Integer value2) {
		   addCriterion("is_select not between", value1, value2, "isSelect");
		return (Criteria) this;
		}
    public Criteria andIsSelectLike(Integer value) {
		  addCriterion("is_select like", value, "isSelect");
		return (Criteria) this;
		}
    public Criteria andIsSelectNotLike(Integer value) {
		  addCriterion("is_select not like", value, "isSelect");
		return (Criteria) this;
		}
 public Criteria andSelectedNumIsNull() {
		 addCriterion("selected_num is null");
		return (Criteria) this;
		}
  public Criteria andSelectedNumIsNotNull(){
		addCriterion("selected_num is not null");
		return (Criteria) this;
		}
  public Criteria andSelectedNumEqualTo(Integer value) {
		  addCriterion("selected_num =", value, "selectedNum");
		return (Criteria) this;
		}
   public Criteria andSelectedNumNotEqualTo(Integer value) {
		  addCriterion("selected_num <>", value, "selectedNum");
		return (Criteria) this;
		}
    public Criteria andSelectedNumGreaterThan(Integer value) {
		 addCriterion("selected_num >", value, "selectedNum");
		return (Criteria) this;
		}
  public Criteria andSelectedNumGreaterThanOrEqualTo(Integer value) {
		  addCriterion("selected_num >=", value, "SelectedNum");
		return (Criteria) this;
		}
   public Criteria andSelectedNumLessThan(Integer value) {
		  addCriterion("selected_num <", value, "selectedNum");
		return (Criteria) this;
		}
    public Criteria andSelectedNumLessThanOrEqualTo(Integer value) {
		  addCriterion("selected_num <=", value, "selectedNum");
		return (Criteria) this;
		}
    public Criteria andSelectedNumIn(List<Integer> values) {
		  addCriterion("selected_num in", values, "selectedNum");
		return (Criteria) this;
		}
    public Criteria andSelectedNumNotIn(List<Integer> values) {
		  addCriterion("selected_num not in", values, "selectedNum");
		return (Criteria) this;
		}
     public Criteria andSelectedNumBetween(Integer value1, Integer value2) {
		   addCriterion("selected_num between", value1, value2, "selectedNum");
		return (Criteria) this;
		}
     public Criteria andSelectedNumNotBetween(Integer value1, Integer value2) {
		   addCriterion("selected_num not between", value1, value2, "selectedNum");
		return (Criteria) this;
		}
    public Criteria andSelectedNumLike(Integer value) {
		  addCriterion("selected_num like", value, "selectedNum");
		return (Criteria) this;
		}
    public Criteria andSelectedNumNotLike(Integer value) {
		  addCriterion("selected_num not like", value, "selectedNum");
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
