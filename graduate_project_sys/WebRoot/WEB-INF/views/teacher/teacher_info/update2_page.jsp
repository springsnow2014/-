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
        <title>修改-导师</title>
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
                <legend>修改-导师</legend>
                <div class="layui-field-box">
                <div >
                
                
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
                        
                        <div class="layui-form-item layui-form-text" id="personalIntroParentContent">
                        <label class="layui-form-label">教学简介</label>
                        <div class="layui-input-block">
                        <textarea  placeholder="请输入教学简介"  id="personalIntro"  rows="15" cols="100">${data.personalIntro}</textarea>	<span style="color:red">*必填</span>
                            
                            </div>
                            </div>
                            
                            <div class="layui-form-item layui-form-text" id="headImgParentContent">
                            <label class="layui-form-label">电子照片</label>
                            <div class="layui-input-block">
                            <div class="imgUpload" tip="请上传电子照片，数量不超过1" red-tip="(*必填)"   upload-num="1" init-val="${data.headImg}" upload-type="1" id="headImg"></div>
                                
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
                                        <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=8326"></script>
                                            <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/webupload/webuploader.js"></script>
                                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/webupload/upload.js"></script>
                                                    
                                                    
                                                    
                                                    <script type="text/javascript">
                                                    
                                                    
                                                    
                                                    $(function(){
                                                        
                                                        createFileUpload('${pageContext.request.contextPath}');
                                                            
                                                            
                                                        })
                                                        
                                                        
                                                        
                                                        function submitData(){
                                                            var celPhone= $('#celPhone').val();
                                                            var email= $('#email').val();
                                                            var personalIntro= $('#personalIntro').val();
                                                            var headImg=getUploadFileStr('headImg');
                                                            
                                                            $.ajax({
                                                                type: 'post',
                                                                url: '${pageContext.request.contextPath}/teacher/teacher_info/update2_submit',
                                                                    data:{
                                                                        "id":'${data.id}',
                                                                            
                                                                            "celPhone":celPhone,
                                                                            "email":email,
                                                                            "personalIntro":personalIntro,
                                                                            "headImg":headImg
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
