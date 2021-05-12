<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="uri" value="${pageContext.request.contextPath}" />
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>导师</title>
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
                    <legend>导师</legend>
                    <div class="layui-field-box">
                    <div>
                    <div class="layui-form-item" style="text-align:center;">
                    
                    <div class="layui-inline" style="margin-left:100px;">
                    <label>工号</label>
                    </div>
                    <div class="layui-inline">
                    <div class="layui-input-inline" >
                    <input type="text"  style="display:inline;width:250px;"  placeholder="请输入工号进行查询" id="tno" class="layui-input">
                    </div>
                    </div>
                    
                    <div class="layui-inline" style="margin-left:100px;">
                    <label>姓名</label>
                    </div>
                    <div class="layui-inline">
                    <div class="layui-input-inline" >
                    <input type="text"  style="display:inline;width:250px;"  placeholder="请输入姓名进行查询" id="realName" class="layui-input">
                    </div>
                    </div>
                    
                    <div class="layui-inline" style="margin-left:100px;">
                    <label>是否可选</label>
                    </div>
                    <div class="layui-inline">
                    <div class="layui-input-inline" >
                    <select  id="isSelect" style="display:inline;height:30px;width:250px;" >
                    <option value="">全部</option>
                    <c:forEach items="${isSelectList}" var="item">
                        <option value="${item.id}">${item.name}</option>
                            </c:forEach>
                            </select>
                            
                            </div>
                            </div>
                            
                            <div class="layui-inline" style="margin-left:100px;">
                            <label>所属学院</label>
                            </div>
                            <div class="layui-inline">
                            <div class="layui-input-inline" >
                            <select  id="collegeId" style="display:inline;height:30px;width:250px;" >
                            <option value="">全部</option>
                            <c:forEach items="${collegeInfoList}" var="item">
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
                                    <a href="${pageContext.request.contextPath}/admin/teacher_info/add" class="layui-btn layui-btn-radius">新增</a>
                                        
                                        </span>
                                        </div>
                                        <hr>
                                        <table class="layui-table">
                                        
                                        <thead>
                                        <tr  style="text-align:center">
                                        <th>工号</th>
                                        <th>密码</th>
                                        <th>姓名</th>
                                        <th>联系电话</th>
                                        <th>邮箱</th>
                                        <th>教学简介</th>
                                        <th>电子照片</th>
                                        <th>性别</th>
                                        <th>职称</th>
                                        <th>是否可选</th>
                                        <th>已选学生数</th>
                                        <th>所属学院</th>
                                        <th>研究方向</th>
                                        <th style="width:200px;">操作</th>
                                        
                                        </tr>
                                        </thead>
                                        <tbody id="teacher_info_body">
                                        
                                        </tbody>
                                        </table>
                                        
                                        <div id="teacher_info_bar" class="pagination" style="margin-top:20px;">
                                        </div>
                                        </div>
                                        </fieldset>
                                        
                                        <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery-1.11.1.min.js"></script>
                                            <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/page/myPagination.js"></script>
                                                
                                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/layui/layui.js"></script>
                                                    <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/layuiutil.js"></script>
                                                        
                                                        
                                                        
                                                        <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=5385"></script>
                                                            <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/common/selectSearch/jquery.searchableSelect.css?d=12939" />
                                                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/selectSearch/jquery.searchableSelect.js?d=124393"></script>
                                                                    
                                                                    
                                                                    
                                                                    <script type="text/javascript">
                                                                    
                                                                    $(function(){
                                                                        $('#collegeId').next().remove();
                                                                        $('#collegeId').searchableSelect();
                                                                        $("#collegeId").change(function(){
                                                                            changeCollegeIdVal();
                                                                        });
                                                                        changeCollegeIdVal();
                                                                        
                                                                        ajaxList(1);
                                                                        
                                                                        
                                                                    });
                                                                    
                                                                    function ajaxList(page) {
                                                                        var tno = $("#tno").val();
                                                                        var realName = $("#realName").val();
                                                                        var isSelect = $("#isSelect").val();
                                                                        var collegeId = $("#collegeId").val();
                                                                        
                                                                        
                                                                        showLoading('${pageContext.request.contextPath}/static/common/loading.gif');
                                                                            $.ajax({
                                                                                type : 'get',
                                                                                url : "${pageContext.request.contextPath}/admin/teacher_info/queryList",
                                                                                    data : {
                                                                                        
                                                                                        "page":page,
                                                                                        "tno":tno,
                                                                                        "realName":realName,
                                                                                        "isSelect":isSelect,
                                                                                        "collegeId":collegeId
                                                                                        
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
                                                                                            var tnoVal=setNullToEmpty(rows[i].teacherInfo.tno);
                                                                                            html+='<td>'+ tnoVal+'</td>';
                                                                                            var passwordVal=setNullToEmpty(rows[i].teacherInfo.password);
                                                                                            html+='<td>'+ passwordVal+'</td>';
                                                                                            var realNameVal=setNullToEmpty(rows[i].teacherInfo.realName);
                                                                                            html+='<td>'+ realNameVal+'</td>';
                                                                                            var celPhoneVal=setNullToEmpty(rows[i].teacherInfo.celPhone);
                                                                                            html+='<td>'+ celPhoneVal+'</td>';
                                                                                            var emailVal=setNullToEmpty(rows[i].teacherInfo.email);
                                                                                            html+='<td>'+ emailVal+'</td>';
                                                                                            var personalIntroVal=setNullToEmpty(rows[i].teacherInfo.personalIntro);
                                                                                            html+='<td>'+ personalIntroVal+'</td>';
                                                                                            var headImgStr = rows[i].teacherInfo.headImg;
                                                                                            if(headImgStr!=null){
                                                                                                var headImgSplit = headImgStr.split(";");
                                                                                                var tmp = '';
                                                                                                for(var j=0;j<headImgSplit.length;j++){
                                                                                                    if(headImgSplit[j]!=''){
                                                                                                        tmp+='<div style="display:inline"><img src="'+headImgSplit[j]+'" style="width:100px" onclick="maxImg(this)"></div>';
                                                                                                    }
                                                                                                }
                                                                                                html+='<td>'+tmp+'</td>';
                                                                                                }else{
                                                                                                    html+='<td></td>';
                                                                                                }
                                                                                                var sexVal=setNullToEmpty(rows[i].sexStr);
                                                                                                html+='<td>'+sexVal+'</td>';
                                                                                                var jobNameVal=setNullToEmpty(rows[i].teacherInfo.jobName);
                                                                                                html+='<td>'+ jobNameVal+'</td>';
                                                                                                var isSelectVal=setNullToEmpty(rows[i].isSelectStr);
                                                                                                if(rows[i].teacherInfo.isSelect=='1'){
                                                                                                    isSelectVal ='<span class="layui-badge layui-bg-green"  style="width:80px;">'+isSelectVal+'</span>';
                                                                                                    
                                                                                                    
                                                                                                }
                                                                                                if(rows[i].teacherInfo.isSelect=='2'){
                                                                                                    isSelectVal ='<span class="layui-badge"  style="width:80px;">'+isSelectVal+'</span>';
                                                                                                    
                                                                                                    
                                                                                                }
                                                                                                html+='<td>'+isSelectVal+'</td>';
                                                                                                var selectedNumVal=setNullToEmpty(rows[i].teacherInfo.selectedNum);
                                                                                                html+='<td>'+ selectedNumVal+'</td>';
                                                                                                var collegeIdVal=setNullToEmpty(rows[i].collegeIdStr);
                                                                                                html+='<td>'+ collegeIdVal+'</td>';
                                                                                                var researchIdVal=setNullToEmpty(rows[i].researchIdStr);
                                                                                                html+='<td>'+ researchIdVal+'</td>';
                                                                                                html+='<td>';
                                                                                                html+='<a href="${pageContext.request.contextPath}/admin/teacher_info/update?id='+rows[i].teacherInfo.id+'" class="layui-btn layui-btn-normal layui-btn-radius btnStyle">修改</a>';
                                                                                                    html+='<a href="javascript:void(0)" onclick="del(this)" data-id="'+rows[i].teacherInfo.id+'" class="layui-btn layui-btn-danger layui-btn-radius btnStyle">删除</a>';
                                                                                                    html+='</td>';
                                                                                                    html+='</tr>';
                                                                                                }
                                                                                                if (rows.length == 0) {
                                                                                                    html += '<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td>无数据</td><td></td><td></td><td></td><td></td><td></td><td></td></tr>';
                                                                                                }
                                                                                                $("#teacher_info_body").html(html);
                                                                                                
                                                                                                
                                                                                                new myPagination({
                                                                                                    id: 'teacher_info_bar',
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
                                                                                    
                                                                                    function changeCollegeIdVal(){
                                                                                        var id = $("#collegeId").val();
                                                                                        $.ajax({
                                                                                            async:false,
                                                                                            type: 'post',
                                                                                            url: '${pageContext.request.contextPath}/admin/teacher_info/getResearchInfoListByCid',
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
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                        function del(e){
                                                                                            if(window.confirm('你确定要删除该导师吗')){
                                                                                                var id = $(e).attr("data-id");
                                                                                                $.ajax({
                                                                                                    type : 'get',
                                                                                                    url : "${pageContext.request.contextPath}/admin/teacher_info/del",
                                                                                                        data : {
                                                                                                            "id":id
                                                                                                        },
                                                                                                        success : function(result) {
                                                                                                            alert(result.msg);
                                                                                                            if(result.code==1){
                                                                                                                ajaxList(1);
                                                                                                            }
                                                                                                        }
                                                                                                    });
                                                                                                    return true;
                                                                                                    }else{
                                                                                                        return false;
                                                                                                    }
                                                                                                }
                                                                                                
                                                                                                
                                                                                                function gotoPage(e){
                                                                                                    
                                                                                                    var url = $(e).attr("data-url");
                                                                                                    window.location.href=url;
                                                                                                }
                                                                                                
                                                                                                </script>
                                                                                                
                                                                                                </body>
                                                                                                </html>
