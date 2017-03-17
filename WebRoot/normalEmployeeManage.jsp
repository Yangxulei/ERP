<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>普通员工</title>
<!-- 引入 jQuery 核心库 -->
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<!-- 引入 jQuery EasyUI 核心库，这里采用的是 1.3.6 -->
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<!-- 引入 EasyUI 中文提示信息 -->
<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>

<script type="text/javascript" src="js/normalEmployeeManage.js"></script>
<!-- 引入 EasyUI 核心 UI 文件 CSS-->
<link rel="stylesheet" type="text/css"
	href="easyui/themes/default/easyui.css" />
<!--引入 EasyUI 图标文件 -->
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />
</head>
<body>
	<div id="divNormalEmpSearch" title="员工信息检索" class="easyui-panel"
		style="width: 98%; height: 100%">
		<div id="divSearch" class="easyui-panel"
			data-options="style:{margin:'8px'}" title="检索条件">
			<form action="#" method="post" id="empSearchForm">
				<table width="900px" style="font-size: 12px;" cellspacing="10">
					<tr>
						<td>姓名：<input class="easyui-textbox" id="tbxNameCn" /></td>
						<td>员工编号：<input class="easyui-textbox" id="tbxEmpNo" /></td>
						<td>电话：<input class="easyui-numberbox" id="tbxTel" /></td>
						<td>学历：<select id="selEduHistory" class="easyui-combobox"
							data-options="width:'80px'">
								<option value="1" checked="checked">本科</option>
								<option value="0">大专</option>
								<option value="1">大本</option>
								<option value="2">硕士</option>
								<option value="3">博士</option>
						</select></td>
						<td rowspan="2"><a href="javascript:void(0)" id="btnSearch"
							class="easyui-linkbutton" data-options="iconCls:'icon-search'"
							style="width: 100px; height: 30px;">检索</a>
							<a href="javascript:void(0)" id="btnAdd"
							class="easyui-linkbutton" data-options="iconCls:'icon-add'"
							style="width: 100px; height: 30px;">新增</a></td>
					</tr>
					<tr>
						<td>性别：<select id="selSex" class="easyui-combobox"
							data-options="width:'80px'">
								<option value="-1">全部</option>
								<option value="1">男</option>
								<option value="0">女</option>
						</select></td>
						<td>身份证：<input class="easyui-textbox" id="tbxPersonId" /></td>
						<td>开户行：<input class="easyui-numberbox" id="tbxBank" /></td>
						<td>状态：<select id="selState" class="easyui-combobox"
							data-options="width:'80px'">
								<option value="1" selected>在职</option>
								<option value="0">离职</option>
						</select></td>
					</tr>
				</table>
			</form>
		</div>
		<div id="divResult" class="easyui-panel"
			data-options="style:{margin:'8px'},fit:true" title="检索结果"
			style="width: 98%">
			<table width="98%" id="tblResult" class="easyui-datagrid"
				data-options="toolbar:'#divToolbar',singleSelect:true, remoteSort:false,sortName:'nameCn'">
				<thead>
					<tr>
						<th data-options="field:'empNo',width:80,sortable:true">员工编号</th>
						<th data-options="field:'nameCn',width:80,sortable:true">姓名</th>
						<th
							data-options="field:'sex',width:40,align:'center',formatter:fromatSex">性别</th>
						<th data-options="field:'eduHistory',align:'center',width:50">学历</th>
						<th data-options="field:'personId',width:120">身份证</th>
						<th data-options="field:'tel',width:80">电话</th>
						<th data-options="field:'qq',width:80">QQ</th>
						<th data-options="field:'email',width:100">电子邮件</th>
						<th data-options="field:'bank',width:80">开户行</th>
					</tr>
				</thead>
			</table>
			<div id="divToolbar">
				<a href="javascript:void(0)" id="btnDismission"
					class="easyui-linkbutton" data-options="iconCls:'icon-clear'">离职处理</a>
				<a href="javascript:void(0)" id="btnDeptJob"
					class="easyui-linkbutton" data-options="iconCls:'icon-man'">岗位/部门分配</a>
				<a href="javascript:void(0)" id="btnEdit" class="easyui-linkbutton"
					data-options="iconCls:'icon-save',width:'120px'">编辑</a> 
			</div>
		</div>
		<div id="divDeptJob" class="easyui-window" title="部门岗位分配"
			data-options="modal:true,closed:true,iconCls:'icon-man',minimizable:false,maximizable:false"
			style="width: 480px; padding: 10px; top: 100px">
			<table>
				<tr>
					<td colspan="2" style="font-size: 12px"><b>员工：</b><span
						id="spanNameCn"></span>&nbsp;&nbsp;<b>类型：</b>普通员工</td>
				</tr>
				<tr>
					<td>
						<div id="divDeptTreePanel" class="easyui-panel"
							style="width: 220px;" title="所属部门">
							<div id="divDeptTree"></div>
						</div>
					</td>
					<td>
						<div id="divJobTreePanel" class="easyui-panel"
							style="width: 220px;" title="职责">
							<div id="divJobTree"></div>
						</div>
					</td>
				</tr>
				<tr>
					<th colspan="2">
					    <a href="javascript:void(0)"class="easyui-linkbutton" 
					    id="btnDeptJobSave" style="width: 100px">&nbsp;&nbsp;保存&nbsp;&nbsp;</a>
						<a href="javascript:void(0)" class="easyui-linkbutton"
						id="btnWindowClose" onclick="$('#divDeptJob').window('close')"
						style="width: 100px">&nbsp;&nbsp;取消&nbsp;&nbsp;</a></th>
				</tr>
			</table>
		</div>
		<div id="divEmployeeInfo" class="easyui-window" title="普通员工编辑"
			data-options="closed:true,minimizable:false,collapsible:false,maximizable:false,
                      resizable:false,modal:true,width:'800px',height:'600px'">
			<form id="empInfoForm" method="post">
				<input type="hidden" id="hidEmpID" name="employee.id"
					value='<%=request.getParameter("id")%>' /> <input type="hidden"
					name="employee.empNo" />
				<div id="divEmpBaseInfo" class="easyui-panel"
					data-options="style:{margin:'8px'}" title="基本信息">
					<table width="700px" style="font-size: 12px;" cellspacing="10">
						<tr>
							<td>员工编号：<span id="lblEmployeeNo" /></td>
							<td>姓&nbsp名：<input class="easyui-validatebox textbox"
								data-options="required:true" name="employee.nameCn" /></td>
                                   <td rowspan="9">
								
								 <div style="width:200px;height:200px;border:1px">
								       <img id="imgHeadPic" src="images/noPic.jpg" width="130" height="195">
								  </div>
								
								</td>
						</tr>
						<tr>
						   <td>性&nbsp别：<input type="radio" name="employee.sex" value="1"
								checked="checked" />男 <input type="radio" name="employee.sex"
								value="0" />女
							</td>
							 <td>E-mail：<input name="employee.email"
								class="easyui-validatebox textbox"
								data-options="validType:'email'" />
							</td>
						</tr>
						<tr>
							    <td>电&nbsp话：<input name="employee.tel"
								class="easyui-validatebox easyui-numberbox"
								data-options="required:true" /></td>
								<td>Q&nbsp&nbspQ：<input name="employee.qq" class="easyui-numberbox" /></td>
						</tr>
						<tr>
							<td colspan="2">联系地址：<input name="employee.add"
								class="easyui-textbox" style="width: 360px" /></td>
						</tr>
						<tr>
						        <td>邮&nbsp编：<input name="employee.postCode"
								class="easyui-numberbox" /></td>
								<td>国&nbsp籍：<select id="selCountry" name="employee.country"
								class="easyui-combobox" data-options="width:'140px'"></select></td>
						</tr>
						<tr>
							<td>户籍地：<input name="employee.birthPlace"
								class="easyui-textbox" value="天津" /></td>
							<td>生&nbsp日：<input name="employee.birth" class="easyui-datebox"
								data-options="editable:false" /></td>
						</tr>
						<tr>
							<td>身份证：<input name="employee.personId"
								class="easyui-validatebox textbox" data-options="required:true" /></td>
							<td>民&nbsp族：<select id="selNationality"
								name="employee.nationality" class="easyui-combobox"
								data-options="width:'140px'"></select></td>
							<td></td>
						</tr>
					</table>
				</div>
				<div id="divEmpSpecilInfo" class="easyui-panel"
					data-options="style:{margin:'8px'}" title="附加信息">
					<table width="700px" style="font-size: 12px;" cellspacing="10">
						<tr>
							<td>学历：<select id="selEduHistory" name="normal.eduHistory"
								class="easyui-combobox" data-options="width:80">
									<option value="1" checked="checked">本科</option>
									<option value="0">大专</option>
									<option value="1">大本</option>
									<option value="2">硕士</option>
									<option value="3">博士</option>
							</select></td>
							<td>入职日期：<input name="normal.joinDate"
								class="easyui-datebox" data-options="editable:false" /></td>
							<td>工资卡开户行：<input name="normal.bank" class="easyui-textbox"
								data-options="required:true" /></td>
							<td>工资卡账号：<input name="normal.bankNo"
								class="easyui-numberbox" data-options="required:true" /></td>
						</tr>
						<tr>
							<td colspan="4">职业证书：<br /> <input name="normal.jobCertify"
								class="easyui-textbox" data-options="multiline:true"
								style="width: 600px; height: 100px">
							</td>
						</tr>
					</table>
				</div>
				<div id="divButton" class="easyui-panel"
					data-options="style:{margin:'8px'}"
					style="padding: 10px; padding-left: 100px;">
					<a href="javascript:void(0)" id="btnSave" class="easyui-linkbutton"
						style="width: 150px" data-options="iconCls:'icon-save'">&nbsp;&nbsp;保存&nbsp;&nbsp;</a>
					&nbsp;&nbsp; <a href="javascript:void(0)" id="btnClear"
						class="easyui-linkbutton" style="width: 150px"
						data-options="iconCls:'icon-reload'">&nbsp;&nbsp;重置&nbsp;&nbsp;</a>
				</div>
			</form>
											<td rowspan="9">
								<div>
								        <form id="formUpload" enctype="multipart/form-data" method="post">
								            <input type="hidden" name="type" value="normal" />
								            <input type="text" name="upload" class="easyui-filebox" style="width:300px" data-options="buttonText:'选择照片文件...',accept:'image/*',multiple:false">
								            <a href="javascript:void(0)" id="btnUpload" class="easyui-linkbutton" data-options="iconCls:'icon-add'">确认上传</a>
								        </form> 
								
								</div>
								</td>
		</div>
	</div>
</html>