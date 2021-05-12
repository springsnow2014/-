<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/pcchat/css/qq.css"/>
</head>
<body>
<div class="qqBox">
	<div class="BoxHead">
		<div class="headImg">
		   <c:if test="${userImg==null or userImg==''}">
		   <img src="${pageContext.request.contextPath}/static/pcchat/img/em_07.jpg"/>
		   </c:if>
		    <c:if test="${userImg!=null and userImg!=''}">
		   <img src="${userImg}"/>
		   </c:if>
		</div>
		<div class="internetName">${login.name}</div>
	</div>
	<div class="context">
		<div class="conLeft">
			<ul>
			</ul>
		</div>
		<div class="conRight">
			<div class="Righthead">
				<div class="headName"></div>
				<div class="headConfig">
					<ul>
<%-- 						<li><img src="${pageContext.request.contextPath}/static/pcchat/img/20170926103645_06.jpg"/></li> --%>
<%-- 						<li><img src="${pageContext.request.contextPath}/static/pcchat/img/20170926103645_08.jpg"/></li> --%>
<%-- 						<li><img src="${pageContext.request.contextPath}/static/pcchat/img/20170926103645_10.jpg"/></li> --%>
<%-- 						<li><img src="${pageContext.request.contextPath}/static/pcchat/img/20170926103645_12.jpg"/></li> --%>
					</ul>
				</div>
			</div>
			<div class="RightCont">
				<ul class="newsList">
				</ul>
			</div>
			<div class="RightFoot">
				<div class="emjon">
					<ul>
						<li data-id="[emoji_02]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_02.jpg"/></li>
						<li data-id="[emoji_05]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_05.jpg"/></li>
						<li data-id="[emoji_07]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_07.jpg"/></li>
						<li data-id="[emoji_12]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_12.jpg"/></li>
						<li data-id="[emoji_14]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_14.jpg"/></li>
						<li data-id="[emoji_16]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_16.jpg"/></li>
						<li data-id="[emoji_20]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_20.jpg"/></li>
						<li data-id="[emoji_23]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_23.jpg"/></li>
						<li data-id="[emoji_25]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_25.jpg"/></li>
						<li data-id="[emoji_30]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_30.jpg"/></li>
						<li data-id="[emoji_31]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_31.jpg"/></li>
						<li data-id="[emoji_33]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_33.jpg"/></li>
						<li data-id="[emoji_37]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_37.jpg"/></li>
						<li data-id="[emoji_38]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_38.jpg"/></li>
						<li data-id="[emoji_40]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_40.jpg"/></li>
						<li data-id="[emoji_45]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_45.jpg"/></li>
						<li data-id="[emoji_47]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_47.jpg"/></li>
						<li data-id="[emoji_48]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_48.jpg"/></li>
						<li data-id="[emoji_52]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_52.jpg"/></li>
						<li data-id="[emoji_54]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_54.jpg"/></li>
						<li data-id="[emoji_55]"><img src="${pageContext.request.contextPath}/static/pcchat/img/em_55.jpg"/></li>
					</ul>
				</div>
				<div class="footTop">
					<ul>
						<li class="ExP"><img src="${pageContext.request.contextPath}/static/pcchat/img/20170926103645_33.jpg"/></li>
					</ul>
				</div>
				<div class="inputBox">
					<textarea id="dope" style="width: 99%;height: 75px; border: none;outline: none;" name="" rows="" cols=""></textarea>
					<button class="sendBtn" onclick="sendMsg()">发送(s)</button>
				</div>
			</div>
		</div>
	</div>
</div>
<audio id="player" controls="controls" autoplay" style="display:none">
   <source src="${pageContext.request.contextPath}/static/pcchat/tip.wav"/>
</audio>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/pcchat/js/jquery.min.js"></script>
<script type="text/javascript">
	   var currentChatId;//当前聊天用户
	   var currentChatName;
	   var currentChatImg;
		var websocket;
		if ('WebSocket' in window) {
			websocket = new WebSocket("ws://${basePath}/commonapi/chat/websocket");
		} else if ('MozWebSocket' in window) {
			websocket = new MozWebSocket("ws://${basePath}/commonapi/chat/websocket");
		} else {
			websocket = new SockJS("http://${basePath}/commonapi/chat/sockjs/websocket");
		}
		websocket.onopen = function(event) {
			console.log("WebSocket:已连接");
			console.log(event);
		};
		websocket.onmessage = function(event) {
			var data=JSON.parse(event.data);
			    if(currentChatId==data.sendId){
			    	setReadMsg();//当前正在聊天的人，消息都设置为已读
			    	 receive(data);
			    }else{
			    	var divs = $(".liLeft");
			    	var isInList=0;
			    	for(var i=0;i<divs.length;i++){
			    		if($(divs[i]).attr("data-id")==data.sendId){
			    			isInList=1;
			    			break;
			    		}
			    	}
			    	if(isInList==1){
				    	var num =  $("#chatLogCount"+data.sendId).attr("data-num");
				    	num = new Number(num)+1;
				    	 $("#chatLogCount"+data.sendId).attr("data-num",num);
				    	 var html='';
				    	html+='<span   style="background-color:red;color:white; border-radius: 50%;-moz-border-radius: 50%;-webkit-border-radius: 50%;padding:1px;">';
						html+=num+'';
						html+='</span>';
						 $("#chatLogCount"+data.sendId).html(html);
						 if(data.log.length<8){
							 $("#infor"+data.sendId).html(data.log);	 
						 }else{
							 $("#infor"+data.sendId).html(data.log.substring(0,8)+'...');
						 }
			    	}else{
			    		addAUser(data.sendId,data.sendImg,data.sendName,1,"");
			    	}
			    }
			    playMusic(); 
		};
		websocket.onerror = function(event) {
			console.log("WebSocket:发生错误 ");
			console.log(event);
		};
		websocket.onclose = function(event) {
			console.log("WebSocket:已关闭");
			console.log(event);
		}
		//获取全部联系人
		function loadAllLogs(){
		  	$.ajax({
  				type : 'get',
  				url : "${pageContext.request.contextPath}/commonapi/chat/getChatLog",
  				async: false,
  				data : {
  				},
  				success : function(result) {
  					for(var i=0;i<result.length;i++){
  						 addAUser(result[i].uid,result[i].uimg,result[i].uname,result[i].newLogsCount,result[i].newLog);
  					}
  				}
  			});
		}
		function playMusic() {
	        var player = $("#player")[0]; /*jquery对象转换成js对象*/
	        if (player.paused){ /*如果已经暂停*/
	            player.play(); /*播放*/
	        }else {
	            player.pause();/*暂停*/
	        }
	    }
		function addAUser(uid,uimg,uname,newLogsCount,newLogs){
			var html='';
			html+='<ul  onclick="gotoChat(this)" data-id="'+uid+'">';
				html+='<li>';
				html+='	<div class="liLeft" data-id="'+uid+'" >';
				if(uimg!=null&&uimg!=''){
					html+='<img src="'+uimg+'" id="currentChatImg'+uid+'" style="width:42px;height:42px;"/>';	
				}else{
					html+='<img src="${pageContext.request.contextPath}/static/pcchat/img/em_07.jpg" id="currentChatImg'+uid+'" style="width:42px;height:42px;"/>';
				}
				html+='</div>';
				html+='	<div class="liRight">';
				html+='		<span class="intername" id="internameId'+uid+'">'+uname+'</span>';
				html+='		<span class="infor" id="infor'+uid+'">'+newLogs+'</span>';
				html+='</div>';
				if(newLogsCount>0){
					html+='<p id="chatLogCount'+uid+'" data-num="'+newLogsCount+'"  style="position:relative;left:20px;top:-10px;">';
					html+='<span   style="background-color:red;color:white; border-radius: 50%;-moz-border-radius: 50%;-webkit-border-radius: 50%;padding:1px;">';
					html+=newLogsCount+'';
					html+='</span>';
					html+='</p>';
				}else{
					html+='<p id="chatLogCount'+uid+'" data-num="0"  style="position:relative;left:20px;top:-10px;">';
					html+='</p>';
				}
				html+='</li>';
				html+='</ul>';
			$(".conLeft").prepend(html);
		}
		function gotoChat(e){
			var id = $(e).attr("data-id");
			gotoChatAct(id);
		}
		function gotoChatAct(id){
			var divs = $(".liLeft");
			for(var i=0;i<divs.length;i++){
				if($(divs[i]).attr("data-id")==id){
					$(divs[i]).addClass('bg').siblings().removeClass('bg');
					var intername=$("#internameId"+id).text();
					$('.headName').text(intername);
					$('.newsList').html('');
					currentChatName = intername;
					currentChatId = id;
					currentChatImg=$("#currentChatImg"+id).attr("src");
					$("#chatLogCount"+id).html('');
					$("#chatLogCount"+id).attr("data-num",0);
					$(divs[i]).parent().parent().addClass('bg').siblings().removeClass('bg');
					getChatLog(id);
				}
			}
		}
		$(function(){
			loadAllLogs();
			var divs = $(".liLeft");
			var targetId = '${targetId}';
			if(targetId!=undefined&&targetId!=null&&targetId!='null'&&targetId!=''&&targetId!='undefined'){
				var divs = $(".liLeft");
		    	var isInList=0;
		    	for(var i=0;i<divs.length;i++){
		    		if($(divs[i]).attr("data-id")==targetId){
		    			isInList=1;
		    			break;
		    		}
		    	}
				if(isInList==0){
					addAUser('${targetId}','${targetImg}','${targetName}',0,'');	
				}
				gotoChatAct('${targetId}');
			}else{
				if(divs.length>0){
					gotoChat(divs[0]);
				}
			}
		});
		//查找与指定用户的聊天记录
		function getChatLog(id){
		  	$.ajax({
  				type : 'get',
  				url : "${pageContext.request.contextPath}/commonapi/chat/viewUserLogs",
  				async: false,
  				data : {
  					"id":id
  				},
  				success : function(result) {
  					for(var i=0;i<result.length;i++){
  						if(result[i].sendType==1){
  							var data ={};
  	  						data.sendMsg =result[i].log;
  	  						data.senName = result[i].uname;
  	  						data.createTime=result[i].createTime;
  	  						send(data);
  						}else{
  							var data ={};
  	  						data.log =result[i].log;
  	  						data.createTime=result[i].createTime;
  	  						data.sendName =result[i].uname;
  	  					    receive(data);
  						}
  					}
  				}  
  			}); 
		}
		function setReadMsg(){
		  	$.ajax({
  				type : 'get',
  				url : "${pageContext.request.contextPath}/commonapi/chat/setRead",
  				async: false,
  				data : {
  					"id":currentChatId
  				},
  				success : function(result) {
  				}  
  			}); 
		}
		function sendMsg(){
			var msg=$("#dope").val();
			if(currentChatId==null){
				return;
			}
			if(msg==""){
				return;
			}else{
				var data={};
				data.sendMsg=msg;
				data.receiveId=currentChatId;
				data.createTime=getNowFormatDate();
				websocket.send(JSON.stringify(data));//发送消息给服务器
				send(data);
			}
			$("#dope").val('');
		}
		function sendMsg2(emji){
			if(currentChatId==null){
				return;
			}
			if(emji==""){
				return;
			}else{
				var data={};
				data.sendMsg=emji;
				data.receiveId=currentChatId;
				data.createTime=getNowFormatDate();
				websocket.send(JSON.stringify(data));//发送消息给服务器
				send(data);
			}
			$("#dope").val('');
		}
		function send(data){
			var str='';
			str+='<li>'+'<div class="nesHead">';
			var uimg = '${userImg}';
			if(uimg!=null&&uimg!=''&&uimg!='null'){
				str+='<img src="${userImg}"/>';	
			}else{
				str+='<img src="${pageContext.request.contextPath}/static/pcchat/img/em_07.jpg"/>';	
			}
			if(data.sendMsg.startsWith('[emoji')==true){
				var index1 = data.sendMsg.indexOf('_');
				var index2 = data.sendMsg.indexOf(']');
				var tmp = '${pageContext.request.contextPath}/static/pcchat/img/em'+data.sendMsg.substring(index1,index2)+'.jpg';
				str+='</div>'+'<div class="news"><img class="jiao" src="${pageContext.request.contextPath}/static/pcchat/img/20170926103645_03_02.jpg">'
				+'<img class="Expr" src="'+tmp+'">';
				+'</div>'
				+'<p style="float:left;font-size:4px;color:gray">'+data.createTime+'</p>'
				+'</li>';
			}else{
				str+='</div>'+'<div class="news"><img class="jiao" src="${pageContext.request.contextPath}/static/pcchat/img/20170926103645_03_02.jpg">'
				+data.sendMsg
				+'</div>'
				+'<p style="float:left;font-size:4px;color:gray">'+data.createTime+'</p>'
				+'</li>';
			}
			$('.newsList').append(str);
// 			$('.conLeft').find('li.bg').children('.liRight').children('.infor').text(data.sendMsg);
			$('.RightCont').scrollTop($('.RightCont')[0].scrollHeight);
		}
		function getNowFormatDate() {//获取当前时间
			var date = new Date();
			var seperator1 = "-";
			var seperator2 = ":";
			var month = date.getMonth() + 1<10? "0"+(date.getMonth() + 1):date.getMonth() + 1;
			var strDate = date.getDate()<10? "0" + date.getDate():date.getDate();
			var currentdate = date.getFullYear() + seperator1  + month  + seperator1  + strDate
					+ " "  + date.getHours()  + seperator2  + date.getMinutes()
					+ seperator2 + date.getSeconds();
			return currentdate;
		}
		function receive(msg){
			if(currentChatId==null){
				return;
			}
			var answer='';
			answer+='<li><div class="answerHead">';
			if(currentChatImg!=null&&currentChatImg!=''&&currentChatImg!='null'){
				answer+='<img src="'+currentChatImg+'"/>';
			}else{
				answer+='<img src="${pageContext.request.contextPath}/static/pcchat/img/em_07.jpg"/>';
			}
			if(msg.log.startsWith('[emoji')==true){
				var index1 = msg.log.indexOf('_');
				var index2 = msg.log.indexOf(']');
				var tmp = '${pageContext.request.contextPath}/static/pcchat/img/em'+ msg.log.substring(index1,index2)+'.jpg';
				answer+='</div>'+'<div class="answers"><img class="jiao" src="${pageContext.request.contextPath}/static/pcchat/img/jiao.jpg">'
				+'<img style="width:50px;height:30px;margin:5px;" src="'+tmp+'">'+'</div>'
				+'<p style="float:right;font-size:4px;color:gray">'+msg.createTime+'</p>'
				+'</li>';
			}else{
				answer+='</div>'+'<div class="answers"><img class="jiao" src="${pageContext.request.contextPath}/static/pcchat/img/jiao.jpg">'
				+msg.log+'</div>'
				+'<p style="float:right;font-size:4px;color:gray">'+msg.createTime+'</p>'
				+'</li>';
			}
			$('.newsList').append(answer);	
			$('.RightCont').scrollTop($('.RightCont')[0].scrollHeight);
		}
		$('.ExP').on('click',function(){
			var isShow = $($(".emjon")[0]).css("display");
			if(isShow=='none'){
				$('.emjon').show();	
			}else{
				$('.emjon').hide();
			}
		})
		$('.emjon').on('mouseleave',function(){
			$('.emjon').hide();
		})
		$('.emjon li').on('click',function(){
			var imgSrc=$(this).attr("data-id");
			sendMsg2(imgSrc);
			$('.emjon').hide();
			$('.RightCont').scrollTop($('.RightCont')[0].scrollHeight );
		})
</script>
</body>
</html>
