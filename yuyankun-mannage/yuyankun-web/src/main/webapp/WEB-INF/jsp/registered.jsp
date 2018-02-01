<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<link rel="stylesheet" href="js/bootstrap/css/bootstrap.css"
	type="text/css">
<link rel="stylesheet" href="css/magic-check.css" type="text/css">
<link rel="stylesheet" href="css/public.css" type="text/css">
<link rel="stylesheet" href="css/base_fagoods.css" type="text/css">
<script src="./js/jquery-2.0.2.js" type="text/javascript"
	charset="utf-8"></script>

</head>
<body>
	<jsp:include page="head.jsp"></jsp:include>
	 <!--  <div style="background: #f4f4f4">
		<div class="fb-form-box">
			<div class="w">
				<form class="form-horizontal form-box" id="releaseGood" action="/userRegistered/addUser" method="post">
					<div class="form-group">
						<label for="" class="col-sm-3 control-label"><em
							class="must_write">*</em>真实名称</label>
						<div class="col-sm-9 ">
							<input type="text" class="form-control" id="addRealNameId"
								placeholder="请输入登录名" name="realname" maxlength="8">
						</div>
					</div>
					
					<div class="form-group">
						<label for="" class="col-sm-3 control-label"><em
							class="must_write">*</em>登陆名</label>
						<div class="col-sm-9 ">
							<input type="text" class="form-control" id="addLoginNameId"
								placeholder="请输入登录名" name="username" maxlength="8">
						</div>
					</div>

	
					
					<div class="form-group">
					<label for="" class="col-sm-3 control-label"><em
							class="must_write">*</em>密码</label>
                        <input type="password" class="form-control" id="passwordId" name="password" placeholder="密码（8-10位数字、字母）" maxlength="10" >
                    </div>



					<div class="form-group">
						<label for="pro-leibie" class="col-sm-3 control-label"><em
							class="must_write">*</em>登陆方式</label>
						<div class="col-sm-9">
							<div class="input-group">
								<select id="usertypeId" class="form-control xuanze"
									name="usertypeId">

									<c:if test="userLerels != null">

										<c:forEach items="userLerels" var="userLevel">
											<option value="${userLevel.usertypenameid}">${userLevel.usertypename}</option>
										</c:forEach>
									</c:if>
								</select>
							</div>
							<input name="usertype" id="usertypeId" type="hidden">
						</div>
					</div>



					<div class="form-group">
						<label for="" class="col-sm-3 control-label"><em
							class="must_write">*</em>性别</label>
						<div class="col-sm-9">
							<div class="opt">
								<input class="magic-radio" type="radio" name="sex" id="r3"
									value="1" checked> <label for="r3">男</label>
							</div>
							<div class="opt">
								<input class="magic-radio" type="radio" name="sex" id="r4"
									value="0"> <label for="r4">女</label>
							</div>
						</div>
					</div>

         <div class="form-group">
						<label for="" class="col-sm-3 control-label"><em
							class="must_write">*</em>年龄</label>
						<div class="col-sm-5 ">
							<input type="text" class="form-control" id="addAgeId"
								placeholder="请输入年龄" name="ade" maxlength="3" >
						</div>
					</div>
					

					<div class="form-group">
						<label for="shenfenzheng" class="col-sm-2 control-label"><em>*</em>身份证号</label>
						<div class="col-sm-9">
							<input type="text" class="form-control" id="idCartId" name="idCart" placeholder="请输入身份证号码" maxlength="18">
						</div>
					</div>

					
					<div class="form-group">
					<label for="" class="col-sm-3 control-label"><em
							class="must_write">*</em>手机号：</label>
                        <input type="text" class="form-control" id="phoneid" name="phone" placeholder="手机号" maxlength="11"
                               onkeyup="this.value=this.value.replace(/\D/g,'')"
                               onblur="this.value=this.value.replace(/\D/g,'')">
                               
                    </div>

					 <div class="item item-new">
                    <div class="fl item-ifo">
                        <input type="checkbox" class="checkbox" checked="checked" id="readme"
                               onclick="agreeonProtocol();">
                        <label for="protocol">我已阅读并同意<a href="#" class="blue" id="protocol">《淘淘用户注册协议》</a></label>
                        <span class="clr"></span>
                        <label id="protocol_error" class="error hide">请接受服务条款</label>
                    </div>
                </div>
					<div class="form-group tijiao-box " >
                <button type="button" id="goodAddSubmit" class="btn btn-default tijiao anniu">注册</button>
            </div>
				</form>
			</div>
		</div>
	</div>-->
	
	<form action="/userRegistered/addUser" method="get">  
                  <div class="form-group">
						<label for="" class="col-sm-3 control-label"><em
							class="must_write">*</em>真实名称</label>
						<div class="col-sm-9 ">
							<input type="text" class="form-control" id="addRealNameId"
								placeholder="请输入登录名" name="realname" maxlength="8">
						</div>
					</div>
					
					<div class="form-group">
						<label for="" class="col-sm-3 control-label"><em
							class="must_write">*</em>登陆名</label>
						<div class="col-sm-9 ">
							<input type="text" class="form-control" id="addLoginNameId"
								placeholder="请输入登录名" name="username" maxlength="8">
						</div>
					</div>

	
					
					<div class="form-group">
					<label for="" class="col-sm-3 control-label"><em
							class="must_write">*</em>密码</label>
                        <input type="password" class="form-control" id="passwordId" name="password" placeholder="密码（8-10位数字、字母）" maxlength="10" >
                    </div>
					
					
        <div class="form-group">
						<label for="pro-leibie" class="col-sm-3 control-label"><em
							class="must_write">*</em>登陆方式</label>
						<div class="col-sm-9">
							<div class="input-group">
								<select id="usertypeId" class="form-control xuanze"
									name="usertypeId">

									<c:if test="userLerels != null">

										<c:forEach items="userLerels" var="userLevel">
											<option value="${userLevel.usertypenameid}">${userLevel.usertypename}</option>
										</c:forEach>
									</c:if>
								</select>
							</div>
							<input name="usertype" id="usertypeId" type="hidden">
						</div>
					</div>
					
					<div class="form-group">
						<label for="" class="col-sm-3 control-label"><em
							class="must_write">*</em>年龄</label>
						<div class="col-sm-5 ">
							<input type="text" class="form-control" id="addAgeId"
								placeholder="请输入年龄" name="ade" maxlength="3" >
						</div>
					</div>

				

				
					<div class="form-group tijiao-box " >
                <input type="button" value="注册"></input>
            </div>
            
    </form>  
	
	<jsp:include page="float.jsp"></jsp:include>

	<script src="./js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="./js/bootstrap/js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" charset="utf-8" src="./js/ueditor/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8" src="./js/ueditor/ueditor.all.js"></script>
	<script type="text/javascript" charset="utf-8" src="./js/ueditor/lang/zh-cn/zh-cn.js"></script>
	
	<script type="text/javascript">
	
		$(document).ready(function() {
			$.post('/userRegistered/registereds',function(data) {
												var grade = $("#usertypeId");
												if (data.success) {
													grade.append('<option value="">请选择</option>');
													var userLerels = data.obj;
													for (var i = 0; i < userLerels.length; i++) {
														grade.append('<option value="' + userLerels[i].usertypenameid + '">'+ userLerels[i].usertypename+ '</option>');
													}
												} else {
													grade.append('<option value="">未查询到用户等级</option>');
												}
											}, "JSON");
						})
	</script>
</body>
</html>