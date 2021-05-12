<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="uri" value="${pageContext.request.contextPath}" />
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>学生项目申请</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/admin/layui/css/layui.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/static/admin/css/global.css">
            <link rel="stylesheet" href="${pageContext.request.contextPath}/static/admin/icheck/minimal/red.css">
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/common/page/myPagination.css?t=4" />
                    
                    </head>
                    <body class="layui-layout-body" style="overflow:scroll;">
                    <style type="text/css">
                    .btnStyle{
                        margin-left:8px;
                        margin-top:8px
                    }
                    .loadingModel {
                        position: absolute;
                        top: 0;
                        left: 0;
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
                    <div id="loadingDiv"></div>
                    <div id="imgModal"></div>
                    <fieldset class="layui-elem-field">
                    <legend>学生项目申请</legend>
                    <div class="layui-field-box">
                    <div>
                    <div class="layui-form-item" style="text-align:center;">
                    
                    <div class="layui-inline" style="margin-left:100px;">
                    <label>导师ID</label>
                    </div>
                    <div class="layui-inline">
                    <div class="layui-input-inline" >
                    <select  id="teacherId" style="display:inline;height:30px;width:250px;" >
                    <option value="">全部</option>
                    <c:forEach items="${teacherInfoList}" var="item">
                        <option value="${item.id}">${item.name}</option>
                            </c:forEach>
                            </select>
                            
                            </div>
                            </div>
                            
                            <div class="layui-inline" style="margin-left:100px;">
                            <label>项目题目</label>
                            </div>
                            <div class="layui-inline">
                            <div class="layui-input-inline" >
                            <input type="text"  style="display:inline;width:250px;"  placeholder="请输入项目题目进行查询" id="projectTitle" class="layui-input">
                            </div>
                            </div>
                            
                            <div class="layui-inline" style="margin-left:100px;">
                            <label>学生ID</label>
                            </div>
                            <div class="layui-inline">
                            <div class="layui-input-inline" >
                            <select  id="stuId" style="display:inline;height:30px;width:250px;" >
                            <option value="">全部</option>
                            <c:forEach items="${studentInfoList}" var="item">
                                <option value="${item.id}">${item.name}</option>
                                    </c:forEach>
                                    </select>
                                    
                                    </div>
                                    </div>
                                    
                                    <button type="button" onclick="ajaxList(1);" style="margin-left:50px" class="layui-btn layui-btn-radius" ><i class="layui-icon layui-icon-search"></i>查询</button>
                                    
                                    </div>
                                    </div>
                                    
                                    <hr>
                                    <div class="layui-form-item">
                                    
                                    <span id="batchUpdateDiv">
                                    
                                    </span>
                                    <span class="l" id="globalBtns">
                                    
                                    </span>
                                    </div>
                                    <hr>
                                    <table class="layui-table">
                                    
                                    <thead>
                                    <tr  style="text-align:center">
                                    <th>导师ID</th>
                                    <th>项目题目</th>
                                    <th>项目介绍</th>
                                    <th>相关文件</th>
                                    <th>学生备注</th>
                                    <th>学生ID</th>
                                    <th>申请状态</th>
                                    <th>导师备注</th>
                                    <th>申请时间</th>
                                    
                                    </tr>
                                    </thead>
                                    <tbody id="stu_apply_log_body">
                                    
                                    </tbody>
                                    </table>
                                    
                                    <div id="stu_apply_log_bar" class="pagination" style="margin-top:20px;">
                                    </div>
                                    </div>
                                    </fieldset>
                                    
                                    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery-1.11.1.min.js"></script>
                                        <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/page/myPagination.js"></script>
                                            
                                            <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/layui/layui.js"></script>
                                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/layuiutil.js"></script>
                                                    
                                                    
                                                    
                                                    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=3396"></script>
                                                        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/common/selectSearch/jquery.searchableSelect.css?d=12939" />
                                                            <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/selectSearch/jquery.searchableSelect.js?d=124393"></script>
                                                                
                                                                
                                                                
                                                                <script type="text/javascript">
                                                                
                                                                $(function(){
                                                                    $('#teacherId').next().remove();
                                                                    $('#teacherId').searchableSelect();
                                                                    $('#stuId').next().remove();
                                                                    $('#stuId').searchableSelect();
                                                                    
                                                                    ajaxList(1);
                                                                    
                                                                    
                                                                });
                                                                
                                                                function ajaxList(page) {
                                                                    var teacherId = $("#teacherId").val();
                                                                    var projectTitle = $("#projectTitle").val();
                                                                    var stuId = $("#stuId").val();
                                                                    
                                                                    
                                                                    showLoading('${pageContext.request.contextPath}/static/common/loading.gif');
                                                                        $.ajax({
                                                                            type : 'get',
                                                                            url : "${pageContext.request.contextPath}/admin/stu_apply_log/queryList",
                                                                                data : {
                                                                                    
                                                                                    "page":page,
                                                                                    "teacherId":teacherId,
                                                                                    "projectTitle":projectTitle,
                                                                                    "stuId":stuId
                                                                                    
                                                                                },
                                                                                success : function(result) {
                                                                                    hideLoading();
                                                                                    var rows = result.list;//得到数据列
                                                                                    var total = result.count;//得到数据总数
                                                                                    lastPage=result.totalPage;
                                                                                    totalCount=total;
                                                                                    var html = '';
                                                                                    for (var i = 0; i < rows.length; i++) {
                                                                                        html += '<tr>' ;
                                                                                        var teacherIdVal=setNullToEmpty(rows[i].teacherIdStr);
                                                                                        html+='<td>'+ teacherIdVal+'</td>';
                                                                                        var projectTitleVal=setNullToEmpty(rows[i].stuApplyLog.projectTitle);
                                                                                        html+='<td>'+ projectTitleVal+'</td>';
                                                                                        var projectIntroVal=setNullToEmpty(rows[i].stuApplyLog.projectIntro);
                                                                                        html+='<td>'+ projectIntroVal+'</td>';
                                                                                        var profileStr = rows[i].stuApplyLog.profile;
                                                                                        if(profileStr!=null){
                                                                                            var profileSplit = profileStr.split(";");
                                                                                            var tmp = '';
                                                                                            for(var j=0;j<profileSplit.length;j++){
                                                                                                if(profileSplit[j]!=''){
                                                                                                    tmp+='<div style="display:inline"><a  href="javascript:void(0)" onclick="window.open(\''+profileSplit[j]+'\')">点击链接下载相关文件</a></div>';
                                                                                                }
                                                                                            }
                                                                                            html+='<td>'+tmp+'</td>';
                                                                                            }else{
                                                                                                html+='<td></td>';
                                                                                            }
                                                                                            var stuRemarkVal=setNullToEmpty(rows[i].stuApplyLog.stuRemark);
                                                                                            html+='<td>'+ stuRemarkVal+'</td>';
                                                                                            var stuIdVal=setNullToEmpty(rows[i].stuIdStr);
                                                                                            html+='<td>'+ stuIdVal+'</td>';
                                                                                            var selectStatusVal=setNullToEmpty(rows[i].selectStatusStr);
                                                                                            if(rows[i].stuApplyLog.selectStatus=='1'){
                                                                                                selectStatusVal ='<span class="layui-badge layui-bg-orange"  style="width:80px;">'+selectStatusVal+'</span>';
                                                                                                
                                                                                                
                                                                                            }
                                                                                            if(rows[i].stuApplyLog.selectStatus=='2'){
                                                                                                selectStatusVal ='<span class="layui-badge layui-bg-green"  style="width:80px;">'+selectStatusVal+'</span>';
                                                                                                
                                                                                                
                                                                                            }
                                                                                            if(rows[i].stuApplyLog.selectStatus=='3'){
                                                                                                selectStatusVal ='<span class="layui-badge"  style="width:80px;">'+selectStatusVal+'</span>';
                                                                                                
                                                                                                
                                                                                            }
                                                                                            if(rows[i].stuApplyLog.selectStatus=='4'){
                                                                                                selectStatusVal ='<span class="layui-badge-rim"  style="width:80px;">'+selectStatusVal+'</span>';
                                                                                                
                                                                                                
                                                                                            }
                                                                                            html+='<td>'+selectStatusVal+'</td>';
                                                                                            var teacherRemarkVal=setNullToEmpty(rows[i].stuApplyLog.teacherRemark);
                                                                                            html+='<td>'+ teacherRemarkVal+'</td>';
                                                                                            var createTimeVal=setNullToEmpty(rows[i].stuApplyLog.createTime);
                                                                                            html+='<td>'+ createTimeVal+'</td>';
                                                                                            html+='</tr>';
                                                                                        }
                                                                                        if (rows.length == 0) {
                                                                                            html += '<tr><td></td><td></td><td></td><td></td><td>无数据</td><td></td><td></td><td></td><td></td></tr>';
                                                                                        }
                                                                                        $("#stu_apply_log_body").html(html);
                                                                                        
                                                                                        
                                                                                        new myPagination({
                                                                                            id: 'stu_apply_log_bar',
                                                                                            curPage:page, //初始页码
                                                                                            pageTotal: result.totalPage, //总页数
                                                                                            pageAmount: 10,  //每页多少条
                                                                                            dataTotal: total, //总共多少条数据
                                                                                            pageSize: 5, //可选,分页个数
                                                                                            showPageTotalFlag:true, //是否显示数据统计
                                                                                            showSkipInputFlag:false, //是否支持跳转
                                                                                            getPage: function (page) {
                                                                                                ajaxList(page);
                                                                                            }
                                                                                        })
                                                                                        
                                                                                    }
                                                                                });
                                                                            }
                                                                            
                                                                            
                                                                            
                                                                            function gotoPage(e){
                                                                                
                                                                                var url = $(e).attr("data-url");
                                                                                window.location.href=url;
                                                                            }
                                                                            
                                                                            </script>
                                                                            
                                                                            </body>
                                                                            </html>
