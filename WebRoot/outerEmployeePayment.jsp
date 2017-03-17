<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>外包人员薪资管理</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!-- 引入 jQuery 核心库 -->
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<!-- 引入 jQuery EasyUI 核心库，这里采用的是 1.3.6 -->
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<!-- 引入 EasyUI 中文提示信息 -->
<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>

<script type="text/javascript" src="js/normalEmployeePayment.js"></script>
<!-- 引入 EasyUI 核心 UI 文件 CSS-->
<link rel="stylesheet" type="text/css"
	href="easyui/themes/default/easyui.css" />
<!--引入 EasyUI 图标文件 -->
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />
</head>

<body>
	<div id="divNormalEmpSearch" title="员工信息检索"  class="easyui-panel" style="width:98%">
		<div id="divSearch" class="easyui-panel" data-options="style:{margin:'8px'}" title="检索条件">
		<form action="#" method="post" id="empSearchForm">
			<table width="1000px" style="font-size:12px;" cellspacing="10">
				<tr>
					<td>员工姓名：<input class="easyui-textbox" id="tbxNameCn" style="width:100px" /></td>
					<td>员工编号：<input class="easyui-textbox" id="tbxEmpNo" style="width:100px" /></td>
					<td>
						所在部门：<select id="selDept" value="-1" />
					</td>
					<td>岗位：<select id="selJob" value="-1" />
					</td>
					<td>
						<a href="javascript:void(0)" id="btnSearch" class="easyui-linkbutton" 
							data-options="iconCls:'icon-search'" style="width:80px;height:30px;">检索</a>
						
					</td>
				</tr>
			</table>
		</form>
		</div>
		<div id="divResult" class="easyui-panel" data-options="style:{margin:'8px'}" title="检索结果">
			<table width="100%" id="tblResult" class="easyui-datagrid"  data-options="toolbar:'#divToolbar',singleSelect:true">
				<thead>
					<tr>
						<th data-options="field:'empno',width:80" align="center"><b>员工编号</b></th>
						<th data-options="field:'nameCn'" align="center"><b>姓名</b></th>
						<th data-options="field:'sex',width:40,align:'center',formatter:fromatSex" align="center"><b>性别</b></th>
						<th data-options="field:'deptName'" align="center"><b>所在部门</b></th>
						<th data-options="field:'jobTitle'" align="center"><b>岗位</b></th>
						<th data-options="field:'base',align:'right',formatter:formatCurrency">基本工资</th>
						<th data-options="field:'job',align:'right',formatter:formatCurrency">岗位工资</th>
						<th data-options="field:'traffic',align:'right',formatter:formatCurrency">交通补贴</th>
						<th data-options="field:'communicate',align:'right',formatter:formatCurrency">通讯补贴</th>
						<th data-options="field:'trip',align:'right',formatter:formatCurrency">差补标准</th>
						<th data-options="field:'endowment',align:'right',formatter:formatCurrency">养老保险<br/>基数</th>
						<th data-options="field:'medical',align:'right',formatter:formatCurrency">医疗保险</th>
						<th data-options="field:'unemployment',align:'right',formatter:formatCurrency">失业保险</th>
						<th data-options="field:'pafhc',align:'right',formatter:formatCurrency">公积金<br/>基数</th>
					</tr>
				</thead>
			</table>
			<div id="divToolbar">
				<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-edit'" onclick="showPaymentEdit()">维护员工薪资数据</a>
			</div>
		</div>
		<div id="divPaymentInfo" class="easyui-window" title="薪资管理" 
			data-options="modal:true,closed:true,iconCls:'icon-man',minimizable:false,maximizable:false"
			style="width:530px;padding:10px;top:50px">
			<div title="基本信息" class="easyui-panel" data-options="style:{margin:'8px'}">
			<table>
				<tr>
					<td style="font-size:12px">
						<b>员工：</b><span id="spanNameCn"></span>&nbsp;&nbsp;
						<b>类型：</b>外包人员&nbsp;&nbsp;
						<b>所在部门：</b><span id="spanDeptName"></span>&nbsp;&nbsp;
						<b>岗位：</b><span id="spanJobTitle"></span>
					</td>
				</tr>
			</table>
			</div>
			<form id="paymentInfoForm" action="#" method="post">
			<div title="基础薪资" class="easyui-panel" data-options="style:{margin:'8px'}">
			<table style="font-size:12px" cellpadding="8px">
				<tr>
					<td>基本工资：<input name="payment.base" id="base" class="easyui-numberbox" data-options="precision:2,groupSeparator:',',decimalSeparator:'.',prefix:'￥ '" style="width:100px"/></td>
					<td>岗位工资：<input name="payment.job" id="job" class="easyui-numberbox" data-options="precision:2,groupSeparator:',',decimalSeparator:'.',prefix:'￥ '" style="width:100px"/></td>
				</tr>
			</table>
			</div>
			<div title="补贴" class="easyui-panel" data-options="style:{margin:'8px'}">
			<table style="font-size:12px" cellpadding="8px">
				<tr>
					<td>交通补贴：<br/><input name="payment.traffic" id="traffic" class="easyui-numberbox" data-options="precision:2,groupSeparator:',',decimalSeparator:'.',prefix:'￥ '" style="width:100px"/></td>
					<td>通信补贴：<br/><input name="payment.communicate" id="communicate" class="easyui-numberbox" data-options="precision:2,groupSeparator:',',decimalSeparator:'.',prefix:'￥ '" style="width:100px"/></td>
					<td>差补标准：<br/><input name="payment.trip" id="trip" class="easyui-numberbox" data-options="precision:2,groupSeparator:',',decimalSeparator:'.',prefix:'￥ '" style="width:100px"/></td>
				</tr>
			</table>
			</div>
			<div title="保险及公积金" class="easyui-panel" data-options="style:{margin:'8px'}">
			<table style="font-size:12px;color:red" cellpadding="8px">
				<tr>
					<td>养老保险基数：<br/><input name="payment.endowment" id="endowment" class="easyui-numberbox" data-options="precision:2,groupSeparator:',',decimalSeparator:'.',prefix:'￥ '" style="width:100px"/></td>
					<td>医疗保险：<br/><input name="payment.medical" id="medical" class="easyui-numberbox" data-options="precision:2,groupSeparator:',',decimalSeparator:'.',prefix:'￥ '" style="width:100px"/></td>
					<td>失业保险：<br/><input name="payment.unemployment" id="unemployment" class="easyui-numberbox" data-options="precision:2,groupSeparator:',',decimalSeparator:'.',prefix:'￥ '" style="width:100px"/></td>
					<td>公积金基数：<br/><input name="payment.pafhc" id="pafhc" class="easyui-numberbox" data-options="precision:2,groupSeparator:',',decimalSeparator:'.',prefix:'￥ '" style="width:100px"/></td>
				</tr>
			</table>
			</div>
			<div align="center">
				<input type="hidden" id="hidEmpId" name="payment.empId" />
				<input type="hidden" id="hidId" name="payment.id" />
				<a href="javascript:void(0);" id="btnSave" id="btnAdd" class="easyui-linkbutton"
                                      data-options="width:'100px',iconCls:'icon-save'">保存</a>
                <a href="javascript:void(0);" id="btnSave" id="btnCancel" class="easyui-linkbutton"
                                      data-options="width:'100px',iconCls:'icon-cancel'">取消</a> 
			</div>
			</form>
		</div>
	</div>
</body>
</html>
