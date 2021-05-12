<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="uri" value="${pageContext.request.contextPath}" />
    
    <script type="text/javascript">
    var uri='${uri}';
        </script>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <title>修改-学生</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/static/admin/layui/css/layui.css">
            <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/common/webupload/webuploader.css">
                
                <style type="text/css">
                
                .loadingModel {
                    position: absolute;
                    top: 0;
                    left: 0;
                    display: none;
                    background-color: rgba(9, 9, 9, 0.63);
                    width: 100%;
                    height: 100%;
                    z-index: 1000;
                }
                .loading-content {
                    width: 50%;
                    text-align: center;
                    background: #ffffff;
                    border-radius: 6px;
                    line-height: 30px;
                    z-index: 10001;
                }
                </style>
                </head>
                <div id="loadingDiv"></div>
                <div id="imgModal"></div>
                <div class="layui-container" style="overflow:hidden;min-height:850px">
                <div class="layui-row">
                <div class="layui-col-lg12">
                <fieldset class="layui-elem-field">
                <legend>修改-学生</legend>
                <div class="layui-field-box">
                <div >
                
                
                <div class="layui-form-item layui-form-text" id="stuNoParentContent">
                <label class="layui-form-label">学号</label>
                <div class="layui-input-block">
                <input type="text"  style="display:inline;width:500px;" value="${data.stuNo}" placeholder="请输入学号" id="stuNo" class="layui-input">	<span style="color:red">*必填</span>
                    
                    </div>
                    </div>
                    
                    <div class="layui-form-item layui-form-text" id="passwordParentContent">
                    <label class="layui-form-label">密码</label>
                    <div class="layui-input-block">
                    <input type="text"  style="display:inline;width:500px;" value="${data.password}" placeholder="请输入密码" id="password" class="layui-input">	<span style="color:red">*必填</span>
                        
                        </div>
                        </div>
                        
                        <div class="layui-form-item layui-form-text" id="realNameParentContent">
                        <label class="layui-form-label">姓名</label>
                        <div class="layui-input-block">
                        <input type="text"  style="display:inline;width:500px;" value="${data.realName}" placeholder="请输入姓名" id="realName" class="layui-input">	<span style="color:red">*必填</span>
                            
                            </div>
                            </div>
                            
                            <div class="layui-form-item layui-form-text" id="celPhoneParentContent">
                            <label class="layui-form-label">联系电话</label>
                            <div class="layui-input-block">
                            <input type="text"  style="display:inline;width:500px;" value="${data.celPhone}" placeholder="请输入联系电话" id="celPhone" class="layui-input">	<span style="color:red">*必填</span>
                                
                                </div>
                                </div>
                                
                                <div class="layui-form-item layui-form-text" id="emailParentContent">
                                <label class="layui-form-label">邮箱</label>
                                <div class="layui-input-block">
                                <input type="text"  style="display:inline;width:500px;" value="${data.email}" placeholder="请输入邮箱" id="email" class="layui-input">	<span style="color:red">*必填</span>
                                    
                                    </div>
                                    </div>
                                    
                                    <div class="layui-form-item layui-form-text" id="headImgParentContent">
                                    <label class="layui-form-label">电子照片</label>
                                    <div class="layui-input-block">
                                    <div class="imgUpload" tip="请上传电子照片，数量不超过1" red-tip="(*必填)"   upload-num="1" init-val="${data.headImg}" upload-type="1" id="headImg"></div>
                                        
                                        </div>
                                        </div>
                                        
                                        <div class="layui-form-item layui-form-text" id="sexParentContent">
                                        <label class="layui-form-label">性别</label>
                                        <div class="layui-input-block">
                                        <select  id="sex" style="display:inline;height:30px;width:500px;" >
                                        <c:forEach items="${sexList}" var="item">
                                            <c:if test="${item.id==data.sex}">
                                                <option value="${item.id}" selected>${item.name}</option>
                                                    </c:if>
                                                    <c:if test="${item.id!=data.sex}">
                                                        <option value="${item.id}">${item.name}</option>
                                                            </c:if>
                                                            </c:forEach>
                                                            </select>
                                                            <span style="color:red">*必填</span>
                                                            
                                                            </div>
                                                            </div>
                                                            
                                                            <div class="layui-form-item layui-form-text" id="collegeIdParentContent">
                                                            <label class="layui-form-label">所属学院</label>
                                                            <div class="layui-input-block">
                                                            <select  id="collegeId" style="display:inline;height:30px;width:500px;" >
                                                            <c:forEach items="${collegeInfoList}" var="item">
                                                                <c:if test="${item.id==data.collegeId}">
                                                                    <option value="${item.id}" selected>${item.name}</option>
                                                                        </c:if>
                                                                        <c:if test="${item.id!=data.collegeId}">
                                                                            <option value="${item.id}">${item.name}</option>
                                                                                </c:if>
                                                                                </c:forEach>
                                                                                </select>
                                                                                <span style="color:red">*必填</span>
                                                                                
                                                                                </div>
                                                                                </div>
                                                                                
                                                                                <div class="layui-form-item layui-form-text" id="classIdParentContent">
                                                                                <label class="layui-form-label">班级</label>
                                                                                <div class="layui-input-block">
                                                                                <select  id="classId" style="display:inline;height:30px;width:500px;" >
                                                                                <c:forEach items="${classInfoList}" var="item">
                                                                                    <c:if test="${item.id==data.classId}">
                                                                                        <option value="${item.id}" selected>${item.name}</option>
                                                                                            </c:if>
                                                                                            <c:if test="${item.id!=data.classId}">
                                                                                                <option value="${item.id}">${item.name}</option>
                                                                                                    </c:if>
                                                                                                    </c:forEach>
                                                                                                    </select>
                                                                                                    <span style="color:red">*必填</span>
                                                                                                    
                                                                                                    </div>
                                                                                                    </div>
                                                                                                    
                                                                                                    <div class="layui-form-item layui-form-text" id="researchIdParentContent">
                                                                                                    <label class="layui-form-label">研究方向</label>
                                                                                                    <div class="layui-input-block">
                                                                                                    <select  id="researchId" style="display:inline;height:30px;width:500px;" >
                                                                                                    <c:forEach items="${researchInfoList}" var="item">
                                                                                                        <c:if test="${item.id==data.researchId}">
                                                                                                            <option value="${item.id}" selected>${item.name}</option>
                                                                                                                </c:if>
                                                                                                                <c:if test="${item.id!=data.researchId}">
                                                                                                                    <option value="${item.id}">${item.name}</option>
                                                                                                                        </c:if>
                                                                                                                        </c:forEach>
                                                                                                                        </select>
                                                                                                                        <span style="color:red">*必填</span>
                                                                                                                        
                                                                                                                        </div>
                                                                                                                        </div>
                                                                                                                        
                                                                                                                        <div class="layui-form-item layui-form-text" id="gradeIdParentContent">
                                                                                                                        <label class="layui-form-label">年级</label>
                                                                                                                        <div class="layui-input-block">
                                                                                                                        <select  id="gradeId" style="display:inline;height:30px;width:500px;" >
                                                                                                                        <c:forEach items="${gradeInfoList}" var="item">
                                                                                                                            <c:if test="${item.id==data.gradeId}">
                                                                                                                                <option value="${item.id}" selected>${item.name}</option>
                                                                                                                                    </c:if>
                                                                                                                                    <c:if test="${item.id!=data.gradeId}">
                                                                                                                                        <option value="${item.id}">${item.name}</option>
                                                                                                                                            </c:if>
                                                                                                                                            </c:forEach>
                                                                                                                                            </select>
                                                                                                                                            <span style="color:red">*必填</span>
                                                                                                                                            
                                                                                                                                            </div>
                                                                                                                                            </div>
                                                                                                                                            
                                                                                                                                            <div class="layui-form-item layui-form-text" id="termIdParentContent">
                                                                                                                                            <label class="layui-form-label">学期</label>
                                                                                                                                            <div class="layui-input-block">
                                                                                                                                            <select  id="termId" style="display:inline;height:30px;width:500px;" >
                                                                                                                                            <c:forEach items="${termInfoList}" var="item">
                                                                                                                                                <c:if test="${item.id==data.termId}">
                                                                                                                                                    <option value="${item.id}" selected>${item.name}</option>
                                                                                                                                                        </c:if>
                                                                                                                                                        <c:if test="${item.id!=data.termId}">
                                                                                                                                                            <option value="${item.id}">${item.name}</option>
                                                                                                                                                                </c:if>
                                                                                                                                                                </c:forEach>
                                                                                                                                                                </select>
                                                                                                                                                                <span style="color:red">*必填</span>
                                                                                                                                                                
                                                                                                                                                                </div>
                                                                                                                                                                </div>
                                                                                                                                                                
                                                                                                                                                                <div class="layui-form-item">
                                                                                                                                                                <div class="layui-input-block">
                                                                                                                                                                <button class="layui-btn" onclick="submitData();" >立即提交</button>
                                                                                                                                                                <button  class="layui-btn layui-btn-primary"  onclick="javascript:history.back(-1);" >返回</button>
                                                                                                                                                                </div>
                                                                                                                                                                </div>
                                                                                                                                                                <div style="height:200px"></div>
                                                                                                                                                                </div>
                                                                                                                                                                </div>
                                                                                                                                                                </fieldset>
                                                                                                                                                                </div>
                                                                                                                                                                </div>
                                                                                                                                                                </div>
                                                                                                                                                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery-1.11.1.min.js"></script>
                                                                                                                                                                    
                                                                                                                                                                    
                                                                                                                                                                    
                                                                                                                                                                    
                                                                                                                                                                    
                                                                                                                                                                    <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/layui/layui.js"></script>
                                                                                                                                                                        <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=1026"></script>
                                                                                                                                                                            <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/webupload/webuploader.js"></script>
                                                                                                                                                                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/webupload/upload.js"></script>
                                                                                                                                                                                    
                                                                                                                                                                                    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/common/selectSearch/jquery.searchableSelect.css?d=129339" />
                                                                                                                                                                                        <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/selectSearch/jquery.searchableSelect.js?d=1293393"></script>
                                                                                                                                                                                            
                                                                                                                                                                                            
                                                                                                                                                                                            <script type="text/javascript">
                                                                                                                                                                                            
                                                                                                                                                                                            
                                                                                                                                                                                            
                                                                                                                                                                                            $(function(){
                                                                                                                                                                                                
                                                                                                                                                                                                createFileUpload('${pageContext.request.contextPath}');
                                                                                                                                                                                                    $('#collegeId').next().remove();
                                                                                                                                                                                                    $('#collegeId').searchableSelect();
                                                                                                                                                                                                    $("#collegeId").change(function(){
                                                                                                                                                                                                        changeCollegeIdVal();
                                                                                                                                                                                                        changeCollegeIdVal2();
                                                                                                                                                                                                    });
                                                                                                                                                                                                    changeCollegeIdVal();
                                                                                                                                                                                                    changeCollegeIdVal2();
                                                                                                                                                                                                    $('#classId').next().remove();
                                                                                                                                                                                                    $('#classId').searchableSelect();
                                                                                                                                                                                                    $('#researchId').next().remove();
                                                                                                                                                                                                    $('#researchId').searchableSelect();
                                                                                                                                                                                                    $('#gradeId').next().remove();
                                                                                                                                                                                                    $('#gradeId').searchableSelect();
                                                                                                                                                                                                    $("#gradeId").change(function(){
                                                                                                                                                                                                        changeGradeIdVal();
                                                                                                                                                                                                    });
                                                                                                                                                                                                    changeGradeIdVal();
                                                                                                                                                                                                    $('#termId').next().remove();
                                                                                                                                                                                                    $('#termId').searchableSelect();
                                                                                                                                                                                                    
                                                                                                                                                                                                    
                                                                                                                                                                                                })
                                                                                                                                                                                                
                                                                                                                                                                                                
                                                                                                                                                                                                
                                                                                                                                                                                                function changeCollegeIdVal(){
                                                                                                                                                                                                    var id = $("#collegeId").val();
                                                                                                                                                                                                    $.ajax({
                                                                                                                                                                                                        async:false,
                                                                                                                                                                                                        type: 'post',
                                                                                                                                                                                                        url: '${pageContext.request.contextPath}/admin/student_info/getClassInfoListByCid',
                                                                                                                                                                                                            data:{
                                                                                                                                                                                                                "cid":id
                                                                                                                                                                                                            },
                                                                                                                                                                                                            success: function(result) {
                                                                                                                                                                                                                var html='<option value="" >全部</option>';
                                                                                                                                                                                                                for(var i=0;i<result.length;i++){
                                                                                                                                                                                                                    html+='<option value='+result[i].id+' >'+result[i].name+'</option>';
                                                                                                                                                                                                                }
                                                                                                                                                                                                                $("#classId").html(html);
                                                                                                                                                                                                                $("#classId").next().remove();
                                                                                                                                                                                                                $("#classId").searchableSelect();
                                                                                                                                                                                                                if('${data.classId}'!=''&&'${data.classId}'!='null'&&'${data.classId}'!=null){
                                                                                                                                                                                                                    $("#classId").val('${data.classId}');
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            });
                                                                                                                                                                                                        }
                                                                                                                                                                                                        function changeCollegeIdVal2(){
                                                                                                                                                                                                            var id = $("#collegeId").val();
                                                                                                                                                                                                            $.ajax({
                                                                                                                                                                                                                async:false,
                                                                                                                                                                                                                type: 'post',
                                                                                                                                                                                                                url: '${pageContext.request.contextPath}/admin/student_info/getResearchInfoListByCid',
                                                                                                                                                                                                                    data:{
                                                                                                                                                                                                                        "cid":id
                                                                                                                                                                                                                    },
                                                                                                                                                                                                                    success: function(result) {
                                                                                                                                                                                                                        var html='<option value="" >全部</option>';
                                                                                                                                                                                                                        for(var i=0;i<result.length;i++){
                                                                                                                                                                                                                            html+='<option value='+result[i].id+' >'+result[i].name+'</option>';
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        $("#researchId").html(html);
                                                                                                                                                                                                                        $("#researchId").next().remove();
                                                                                                                                                                                                                        $("#researchId").searchableSelect();
                                                                                                                                                                                                                        if('${data.researchId}'!=''&&'${data.researchId}'!='null'&&'${data.researchId}'!=null){
                                                                                                                                                                                                                            $("#researchId").val('${data.researchId}');
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    });
                                                                                                                                                                                                                }
                                                                                                                                                                                                                function changeGradeIdVal(){
                                                                                                                                                                                                                    var id = $("#gradeId").val();
                                                                                                                                                                                                                    $.ajax({
                                                                                                                                                                                                                        async:false,
                                                                                                                                                                                                                        type: 'post',
                                                                                                                                                                                                                        url: '${pageContext.request.contextPath}/admin/student_info/getTermInfoListByGid',
                                                                                                                                                                                                                            data:{
                                                                                                                                                                                                                                "gid":id
                                                                                                                                                                                                                            },
                                                                                                                                                                                                                            success: function(result) {
                                                                                                                                                                                                                                var html='<option value="" >全部</option>';
                                                                                                                                                                                                                                for(var i=0;i<result.length;i++){
                                                                                                                                                                                                                                    html+='<option value='+result[i].id+' >'+result[i].name+'</option>';
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                $("#termId").html(html);
                                                                                                                                                                                                                                $("#termId").next().remove();
                                                                                                                                                                                                                                $("#termId").searchableSelect();
                                                                                                                                                                                                                                if('${data.termId}'!=''&&'${data.termId}'!='null'&&'${data.termId}'!=null){
                                                                                                                                                                                                                                    $("#termId").val('${data.termId}');
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            });
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        function submitData(){
                                                                                                                                                                                                                            var stuNo= $('#stuNo').val();
                                                                                                                                                                                                                            var password= $('#password').val();
                                                                                                                                                                                                                            var realName= $('#realName').val();
                                                                                                                                                                                                                            var celPhone= $('#celPhone').val();
                                                                                                                                                                                                                            var email= $('#email').val();
                                                                                                                                                                                                                            var headImg=getUploadFileStr('headImg');
                                                                                                                                                                                                                            var sex= $('#sex').val();
                                                                                                                                                                                                                            var collegeId= $('#collegeId').val();
                                                                                                                                                                                                                            var classId= $('#classId').val();
                                                                                                                                                                                                                            var researchId= $('#researchId').val();
                                                                                                                                                                                                                            var gradeId= $('#gradeId').val();
                                                                                                                                                                                                                            var termId= $('#termId').val();
                                                                                                                                                                                                                            
                                                                                                                                                                                                                            $.ajax({
                                                                                                                                                                                                                                type: 'post',
                                                                                                                                                                                                                                url: '${pageContext.request.contextPath}/admin/student_info/update_submit',
                                                                                                                                                                                                                                    data:{
                                                                                                                                                                                                                                        "id":'${data.id}',
                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                            "stuNo":stuNo,
                                                                                                                                                                                                                                            "password":password,
                                                                                                                                                                                                                                            "realName":realName,
                                                                                                                                                                                                                                            "celPhone":celPhone,
                                                                                                                                                                                                                                            "email":email,
                                                                                                                                                                                                                                            "headImg":headImg,
                                                                                                                                                                                                                                            "sex":sex,
                                                                                                                                                                                                                                            "collegeId":collegeId,
                                                                                                                                                                                                                                            "classId":classId,
                                                                                                                                                                                                                                            "researchId":researchId,
                                                                                                                                                                                                                                            "gradeId":gradeId,
                                                                                                                                                                                                                                            "termId":termId
                                                                                                                                                                                                                                        },
                                                                                                                                                                                                                                        success: function(result) {
                                                                                                                                                                                                                                            if(result.code == 0){
                                                                                                                                                                                                                                                alert(result.msg);
                                                                                                                                                                                                                                                }else{
                                                                                                                                                                                                                                                    alert(result.msg);
                                                                                                                                                                                                                                                    self.location=document.referrer;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        });
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                    </script>
                                                                                                                                                                                                                                    </body>
                                                                                                                                                                                                                                    </html>
