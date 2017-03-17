<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>软通动力</title>



<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="bootstrap/css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="bootstrap/css/matrix-login.css" />
<link href="bootstrap/font-awesome/css/font-awesome.css"
	rel="stylesheet" />


<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.validate.min.js"></script>


<script type="text/javascript">
	function inputFocus(obj, str) {
		obj.className = str + "_focus";
	}
	function inputBlur(obj, str) {
		obj.className = str;
	}
	// 验证表单
	function validateForm() {
		//alert(validateCodeString);
		return true;
	}

	$(document).ready(function() {
		var msg = "${msg}";
		if (msg != "") {
			//alert(msg);
		}
	});

	$(document).ready(function() {

		$("#loginForm").validate({
			rules : {
				"sysUser.name" : {
					required : true,
					minlength : 3
				},
				"sysUser.pass" : {
					required : true,
					minlength : 3
				}
			},

			messages : {
				"sysUser.name" : {
					required : '用户名不能为空',
					minlength : '长度过低'
				},
				"sysUser.pass" : {
					required : '密码不能为空',
					minlength : '长度过低'
				}
			},

			errorElement : "em", //用来创建错误提示信息标签
			success : function(label) { //验证成功后的执行的回调函数
				//label指向上面那个错误提示信息标签em
				label.text(" ") //清空错误提示消息
				.addClass("success"); //加上自定义的success类
			}
		});
	});
</script>

<style>
.col-center-block {
	float: none;
	display: table;
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body class="login"
	style="background-image: url(./images/loginbackground.jpg)">
<body scroll="no">
	<div id="loginbox" align="center">
		<form id="loginform" class="form-vertical" method="post"
			action="userLogin.action" onsubmit="return validateForm();">
			<input name="method" type="hidden" value="doLogin" />

			<div class="control-group normal_text">
				<h3>
					<img src="bootstrap/img/loginlogo1.png" alt="Logo" />
					软通动力
				</h3>
			</div>
			<div class="control-group">
				<div class="controls">
					<div class="main_input_box">
						<span class="add-on bg_lg"><i class="icon-user"></i></span><input
							type="text" placeholder="用户名"
							onfocus="inputFocus(this,'userName')"
							onblur="inputBlur(this,'userName')" name="sysUser.uid"
							maxlength="19" />
					</div>
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<div class="main_input_box">
						<span class="add-on bg_ly"><i class="icon-lock"></i></span><input
							type="password" placeholder="密码"
							onfocus="inputFocus(this,'password')"
							onblur="inputBlur(this,'password')" name="sysUser.pwd"
							maxlength="16" />
					</div>
				</div>
			</div>

			<div class="form-actions ">
				<span class="pull-left"><input type="reset" value="重置"
					class="flip-link btn btn-info" /></span> <span class="pull-right"><input
					type="submit" class="btn btn-success" value="登录" /></span>
			</div>

		</form>

	</div>

	<script src="bootstrap/js/jquery.min.js"></script>
	<script src="bootstrap/js/matrix.login.js"></script>


</body>
</html>