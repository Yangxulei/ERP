<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="bootstrap/bootStrap-addTabs/theme/css/bootstrap.min.css" />
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="bootstrap/bootStrap-addTabs/theme/css/bootstrap.addtabs.css"
	type="text/css" media="screen" />
<link rel="stylesheet" href="bootstrap/css/matrix-style.css" />
<link rel="stylesheet" href="bootstrap/css/fullcalendar.css" />
<link rel="stylesheet" href="bootstrap/css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="bootstrap/css/matrix-media.css" />
<link href="bootstrap/font-awesome/css/font-awesome.css"
	rel="stylesheet" />
<link rel="stylesheet" href="bootstrap/css/jquery.gritter.css" />
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800'
	rel='stylesheet' type='text/css'>

<script src="bootstrap/js/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="bootstrap/bootStrap-addTabs/theme/js/bootstrap.addtabs.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$('#tabs').addtabs();

	});
</script>

<title>首页</title>
</head>
<body>
	<div id="header"
		style="height: 66px; background: url(images/mxcpsmartcity.jpg);">
		<img src="images/ISSLogo.png" />
	</div>

	<div id="sidebar">
		<ul>
			<li class="active"><a href="javascript:location.reload(true);"
				data-addtab="Menu_groupPresenting" href="groupPresenting.jsp"> 
				<i class="icon icon-home"></i><span>小组展示</span></a></li>
			<li class="submenu">
				<a href="#"><i class="icon icon-user"></i><span>普通员工</span></a>

				<ul id="menuitem">
					<li><a href="javascript:void(0);"
						data-addtab="Menu_normalEmployeeManage"
						url="normalEmployeeManage.jsp">普通员工管理</a></li>
					<li><a href="javascript:void(0);"
						data-addtab="Menu_normalEmployeePayment"
						url="normalEmployeePayment.jsp">普通员工薪资管理</a></li>
				</ul>
			</li>

			<li class="submenu"><a href="#"><i class="icon icon-user"></i>
					<span>实习生</span></a>

				<ul id="menuitem">
					<li><a href="javascript:void(0);"
						data-addtab="Menu_studentEmployeeManage"
						url="studentEmployeeManage.jsp">实习生管理</a></li>
					<li><a href="javascript:void(0);"
						data-addtab="Menu_studentEmployeePayment"
						url="studentEmployeePayment.jsp">实习生薪资管理</a></li>
				</ul></li>

			<li class="submenu"><a href="#"><i class="icon icon-user"></i>
					<span>外协人员</span></a>

				<ul id="menuitem">
					<li><a href="javascript:void(0);"
						data-addtab="Menu_jobbingEmployeeManage"
						url="jobbingEmployeeManage.jsp">外协人员管理</a></li>
					<li><a href="javascript:void(0);"
						data-addtab="Menu_jobbingEmployeePayment"
						url="jobbingEmployeePayment.jsp">外协人员薪资管理</a></li>
				</ul></li>

			<li class="submenu"><a href="#"><i class="icon icon-user"></i>
					<span>外包人员</span></a>

				<ul id="menuitem">
					<li><a href="javascript:void(0);"
						data-addtab="Menu_outerEmployeeManage"
						url="outerEmployeeManage.jsp">外包人员管理</a></li>
					<li><a href="javascript:void(0);"
						data-addtab="Menu_outerEmployeePayment"
						url="outerEmployeePayment.jsp">外包人员薪资管理</a></li>
				</ul></li>

			<li class="submenu"><a href="#"><i class="icon icon-file"></i>
					<span>系统管理</span></a>
				<ul id="menuitem">
					<li><a href="javascript:void(0);"
						data-addtab="Menu_baseDictType" url="baseDictType.jsp">数据字典</a></li>
					<li><a href="javascript:void(0);" data-addtab="Menu_sysUser"
						url="baseSysUser.jsp">系统用户</a></li>
					<li><a href="javascript:void(0);"
						data-addtab="Menu_companyStructure" url="baseDepartment.jsp">公司架构</a></li>
					<li><a href="javascript:void(0);"
						data-addtab="Menu_jobDescription" url="baseJob.jsp">岗位职责</a></li>
				</ul></li>
		</ul>
	</div>
	<div id="content" class="main">
		<div id="tabs">
			<ul class="nav nav-tabs" id="frame_tabs" role="tablist">
			</ul>
			<div class="tab-content">
				<div class="tab-pane active" id="tab_Menu_grouppresenting"
					role="tabpanel">
					<iframe class="iframeClass" frameborder="no" border="0"
						src="groupPresenting.jsp" style="height: 621px;" height="621"></iframe>
				</div>
			</div>
		</div>

	</div>

	<script src="bootstrap/js/excanvas.min.js"></script>
	<script src="bootstrap/js/jquery.ui.custom.js"></script>
	<script src="bootstrap/js/jquery.flot.min.js"></script>
	<script src="bootstrap/js/jquery.flot.resize.min.js"></script>
	<script src="bootstrap/js/jquery.peity.min.js"></script>
	<script src="bootstrap/js/fullcalendar.min.js"></script>
	<script src="bootstrap/js/matrix.js"></script>
	<!-- <script src="bootstrap/js/matrix.dashboard.js"></script>  -->
	<script src="bootstrap/js/jquery.gritter.min.js"></script>
	<!-- <script src="bootstrap/js/matrix.interface.js"></script> -->
	<script src="bootstrap/js/matrix.chat.js"></script>
	<script src="bootstrap/js/jquery.validate.js"></script>
	<script src="bootstrap/js/matrix.form_validation.js"></script>
	<script src="bootstrap/js/jquery.wizard.js"></script>
	<script src="bootstrap/js/jquery.uniform.js"></script>
	<script src="bootstrap/js/select2.min.js"></script>
	<script src="bootstrap/js/matrix.popover.js"></script>
	<script src="bootstrap/js/jquery.dataTables.min.js"></script>
	<script src="bootstrap/js/matrix.tables.js"></script>

</body>
</html>