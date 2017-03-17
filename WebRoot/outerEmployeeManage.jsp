<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<!-- 引入 jQuery 核心库 -->
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<!-- 引入 jQuery EasyUI 核心库，这里采用的是 1.3.6 -->
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<!-- 引入 EasyUI 中文提示信息 -->
<script type="text/javascript"
	src="easyui/locale/easyui-lang-zh_CN.js"></script>

<script type="text/javascript" src="js/outerEmployeeManage.js"></script>
<!-- 引入 EasyUI 核心 UI 文件 CSS-->
<link rel="stylesheet" type="text/css"
	href="easyui/themes/default/easyui.css" />
<!--引入 EasyUI 图标文件 -->
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />
</head>
<body>
	<div id="divNormalEmpSearch" title="员工信息检索" class="easyui-panel"
		style="width: 98%">
		<div id="divSearch" class="easyui-panel"
			data-options="style:{margin:'8px'}" title="检索条件">
			<form action="#" method="post" id="empSearchForm">
				<table width="900px" style="font-size: 12px;" cellspacing="10">
					<tr>
						<td>员工姓名：<input class="easyui-textbox" id="tbxNameCN" /></td>
						<td>性别：<select id="selSex">
								<option value="-1">全部</option>
								<option value="1">男</option>
								<option value="0">女</option>
						</select></td>
						<td>员工编号：<input class="easyui-textbox" id="tbxEmpNo" /></td>
						<td>电话：<input class="easyui-numberbox" id="tbxTel" /></td>
						<td>身份证：<input class="easyui-textbox" id="tbxPersonId" /></td>
						<td rowspan="2"><a href="javascript:void(0)" id="btnSearch"
							class="easyui-linkbutton" data-options="iconCls:'icon-search'"
							style="width: 80px; height: 50px;">检索</a></td>
					</tr>
					<td>外派公司：<input class="easyui-textbox" id="sendCor" /></td>
					<td>开始时间：<input name="employee.birth" id="sendBegin" class="easyui-datebox" data-options="editable:false" /></td>

				</table>
				<table id="tblResult" class="easyui-datagrid"
					data-options="toolbar:'#divToolbar',singleSelect:true">
					<thead>
						<tr>
							<th data-options="field:'empNo',width:80">员工编号</th>
							<th data-options="field:'nameCN',width:80">姓名</th>
							<th data-options="field:'sex',width:80">性别</th>
							<th data-options="field:'tel',width:80">电话</th>
							<th data-options="field:'qq',width:80">QQ</th>
							<th data-options="field:'email',width:80">Email</th>
							<th data-options="field:'sendCor',width:80">外派公司</th>
							<th data-options="field:'sendBegin',width:80">开始时间</th>
						</tr>
					</thead>
				</table>
			</form>
		</div>
		<table>
			<div id="divToolbar">
				<a href="javascript:void(0)" id="btnEdit" class="easyui-linkbutton"
					data-options="iconCls:'icon-edit'">编辑</a> <a
					href="javascript:void(0)" id="btnDeptJob" class="easyui-linkbutton"
					data-options="iconCls:'icon-edit'">部门岗位分配</a>  <a
					href="javascript:void(0)" id="btnDismission"
					class="easyui-linkbutton" data-options="iconCls:'icon-edit'">离职处理</a>
				<a href="javascript:void(0)" id="nomalAdd" class="easyui-linkbutton"
					data-options="iconCls:'icon-edit'">员工新增</a>
			</div>
		</table>
		
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
							style="width: 220px;" title="部门分配">
							<div id="divDeptTree"></div>
						</div>
					</td>
					<td>
						<div id="divJobTreePanel" class="easyui-panel"
							style="width: 220px;" title="岗位分配">
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
		
		
		<div id="divEdit" class="easyui-window" title="外包人员编辑"
			data-options="closed:true,minimizable:false,collapsible:false,maximizable:false,
                      resizable:false,modal:true,width:'350px',">
			<form id="valueForm" method="post">
				<ul style="list-style: none; line-hight: 30px">
					<li>员工编号:<input type="text" id="empNo" name="empNo"
						class="easyui-textbox" data-options=""></input></li>
					<li>姓 名:&nbsp<input type="text" id="nameCN" name="nameCn"
						class="easyui-textbox" data-options=""></input></li>
					<li>性 别:&nbsp&nbsp<select id="Sex" name="sex">
							<option value="-1">全部</option>
							<option value="1">男</option>
							<option value="0">女</option>
					</select></li>
					<li>电 话:&nbsp<input type="text" id="email" name="tel"
						class="easyui-textbox" data-options="field:'desc',width:80"></input>
					</li>
					<li>Q Q:&nbsp&nbsp<input type="text" id="qq" name="qq"
						class="easyui-textbox" data-options="field:'desc',width:80"></input>
					</li>
					<li>Email:&nbsp<input type="text" id="email" name="email"
						class="easyui-textbox" data-options="field:'desc',width:80"></input>
					</li>
					<li>地址:&nbsp&nbsp<input type="text" id="add" name="add"
						class="easyui-textbox" data-options="field:'desc',width:100"></input>
					</li>
					<li>邮编:&nbsp&nbsp<input type="text" id="postCode"
						name="postCode" class="easyui-textbox"
						data-options="field:'desc',width:100"></input>
					</li>
					<li>国籍:&nbsp&nbsp<select id="country" name="country">
							<option value="-1">中国</option>
							<option value="1"></option>
							<option value="0"></option>
					</select></li>
					<li>户籍地:&nbsp&nbsp<input type="text" id="birthplace"
						name="birthplace" class="easyui-textbox"
						data-options="field:'desc',width:100"></input>
					</li>
					<li>开始时间：<input class="easyui-datebox" id="birth" style="width:110px" />
					</li>
					<li>身份证:&nbsp&nbsp<input type="text" id="personID"
						name="personID" class="easyui-textbox"
						data-options="field:'desc',width:100"></input>
					</li>
					<li>民族:&nbsp&nbsp<select id="country" name="country">
							<option value="-1">汉</option>
							<option value="1"></option>
							<option value="0"></option>
					</select></li>
					<li>外派公司<input type="text" id="sendCor"
						name="eduHistory" class="easyui-textbox"
						data-options="field:'desc',width:80"></input>
					</li>
					<li>开始时间：<input name="employee.birth" id="sendBegin" class="easyui-datebox" data-options="editable:false" /></input>
					</li>
					<li>外派公司联络人：<input type="text" id="sendContact"
						name="personID" class="easyui-textbox"
						data-options="field:'desc',width:100"></input>
					</li>
					<li>外派合同期限<input type="text" id="cycle"
						name="personID" class="easyui-textbox"
						data-options="field:'desc',width:100"></input>
					</li>
					<li><a href="javascript:void(0);" id="btnSave"
						class="easyui-linkbutton"
						data-options="width:'100px',iconCls:'icon-save'">保存</a> <a
						href="javascript:void(0);" id="btnCancel"
						class="easyui-linkbutton"
						data-options="width:'100px',iconCls:'icon-cancel'">取消</a></li>
				</ul>

			</form>
		</div>
		<div id="divAdd" class="easyui-window" title="外包人员新增"
			data-options="closed:true,minimizable:false,collapsible:false,maximizable:false,
                      resizable:false,modal:true,width:'350px',">
			<form id="valueFormAdd" method="post">
				<ul style="list-style: none; line-hight: 30px">
					<li>员工编号:<input type="text" id="empNo" name="empNo"
						class="easyui-textbox" data-options=""></input></li>
					<li>姓&nbsp名:&nbsp<input type="text" id="nameCN" name="nameCn"
						class="easyui-textbox" data-options=""></input></li>
					<li>性 别:&nbsp&nbsp<input type="radio" id="male" name="male"
						class="easyui-radiobox" value="1" checked>男</input> <input
						type="radio" id="female" name="female" class="easyui-radiobox"
						value="0">女</input></li>
					<li>Email:&nbsp&nbsp<input type="text" id="email" name="email"
						class="easyui-textbox" data-options="field:'desc',width:100"></input>
					</li>
					<li>电 话:&nbsp<input type="text" id="email" name="tel"
						class="easyui-textbox" data-options="field:'desc',width:100"></input>
					</li>
					<li>Q Q:&nbsp&nbsp<input type="text" id="qq" name="qq"
						class="easyui-textbox" data-options="field:'desc',width:100"></input>
					</li>
					<li>地址:&nbsp&nbsp<input type="text" id="add" name="add"
						class="easyui-textbox" data-options="field:'desc',width:100"></input>
					</li>
					<li>邮编:&nbsp&nbsp<input type="text" id="postCode"
						name="postCode" class="easyui-textbox"
						data-options="field:'desc',width:100"></input>
					</li>
					<li>国籍:&nbsp&nbsp<select id="country" name="country">
							<option value="-1">中国</option>
							<option value="1"></option>
							<option value="0"></option>
					</select></li>
					<li>户籍地:&nbsp&nbsp<input type="text" id="birthplace"
						name="birthplace" class="easyui-textbox"
						data-options="field:'desc',width:100"></input>
					</li>
					<li>开始时间：<input class="easyui-datebox" id="birth" style="width:110px" />
					</li>
					<li>身份证:&nbsp&nbsp<input type="text" id="personID"
						name="personID" class="easyui-textbox"
						data-options="field:'desc',width:100"></input>
					</li>
					<li>民族:&nbsp&nbsp<select id="country" name="country">
							<option value="-1">汉</option>
							<option value="1"></option>
							<option value="0"></option>
					</select></li>
					<li>外派公司:<input type="text" id="sendCor"
						name="birthplace" class="easyui-textbox"
						data-options="field:'desc',width:100"></input></li>
					<li>开始日期：<input class="easyui-datebox" id="dateSendBegin" style="width:110px" />
					</li>
					<li>外派公司联络人：<input type="text" id="sendContact"
						name="personID" class="easyui-textbox"
						data-options="field:'desc',width:100"></input>
					</li>
					<li>外派合同期限<input type="text" id="cycle"
						name="personID" class="easyui-textbox"
						data-options="field:'desc',width:100"></input>
					</li>
					<li><a href="javascript:void(0);" id="btnSave"
						class="easyui-linkbutton"
						data-options="width:'100px',iconCls:'icon-save'">保存</a> <a
						href="javascript:void(0);" id="btnCancel"
						class="easyui-linkbutton"
						data-options="width:'100px',iconCls:'icon-cancel'">取消</a></li>
				</ul>

			</form>
		</div>
</body>
</html>