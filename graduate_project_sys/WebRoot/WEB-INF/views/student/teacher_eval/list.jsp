<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="uri" value="${pageContext.request.contextPath}" />
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>学业评分</title>
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
                    <legend>学业评分</legend>
                    <div class="layui-field-box">
                    <div>
                    <div class="layui-form-item" style="text-align:center;">
                    
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
                    <th>思想品德</th>
                    <th>评价学生</th>
                    <th>学习能力</th>
                    <th>专业技能</th>
                    <th>实践</th>
                    <th>论文成绩</th>
                    <th>评价时间</th>
                    <th>导师ID</th>
                    
                    </tr>
                    </thead>
                    <tbody id="teacher_eval_body">
                    
                    </tbody>
                    </table>
                    
                    <div id="teacher_eval_bar" class="pagination" style="margin-top:20px;">
                    </div>
                    </div>
                    </fieldset>
                    
                    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery-1.11.1.min.js"></script>
                        <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/page/myPagination.js"></script>
                            
                            <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/layui/layui.js"></script>
                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/layuiutil.js"></script>
                                    
                                    
                                    
                                    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=0818"></script>
                                        
                                        
                                        
                                        <script type="text/javascript">
                                        
                                        $(function(){
                                            
                                            ajaxList(1);
                                            
                                            
                                        });
                                        
                                        function ajaxList(page) {
                                            
                                            
                                            showLoading('${pageContext.request.contextPath}/static/common/loading.gif');
                                                $.ajax({
                                                    type : 'get',
                                                    url : "${pageContext.request.contextPath}/student/teacher_eval/queryList",
                                                        data : {
                                                            "projectId":"${data.projectId}",
                                                                
                                                                "page":page
                                                                
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
                                                                    var ideologicalmoralVal=setNullToEmpty(rows[i].teacherEval.ideologicalmoral);
                                                                    html+='<td>'+ ideologicalmoralVal+'</td>';
                                                                    var stuIdVal=setNullToEmpty(rows[i].stuIdStr);
                                                                    html+='<td>'+ stuIdVal+'</td>';
                                                                    var learningabilityVal=setNullToEmpty(rows[i].teacherEval.learningability);
                                                                    html+='<td>'+ learningabilityVal+'</td>';
                                                                    var professionalSkillsVal=setNullToEmpty(rows[i].teacherEval.professionalSkills);
                                                                    html+='<td>'+ professionalSkillsVal+'</td>';
                                                                    var practiveVal=setNullToEmpty(rows[i].teacherEval.practive);
                                                                    html+='<td>'+ practiveVal+'</td>';
                                                                    var papergradeVal=setNullToEmpty(rows[i].teacherEval.papergrade);
                                                                    html+='<td>'+ papergradeVal+'</td>';
                                                                    var createTimeVal=setNullToEmpty(rows[i].teacherEval.createTime);
                                                                    html+='<td>'+ createTimeVal+'</td>';
                                                                    var teacherIdVal=setNullToEmpty(rows[i].teacherIdStr);
                                                                    html+='<td>'+ teacherIdVal+'</td>';
                                                                    html+='</tr>';
                                                                }
                                                                if (rows.length == 0) {
                                                                    html += '<tr><td></td><td></td><td></td><td></td><td>无数据</td><td></td><td></td><td></td></tr>';
                                                                }
                                                                $("#teacher_eval_body").html(html);
                                                                
                                                                
                                                                new myPagination({
                                                                    id: 'teacher_eval_bar',
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
