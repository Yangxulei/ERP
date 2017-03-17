<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门架构</title>
<!-- 引入 EasyUI 核心 UI 文件 CSS-->
<link rel="stylesheet" type="text/css"
	href="easyui/themes/default/easyui.css" />
<!--引入 EasyUI 图标文件 -->
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />

<!-- 引入 jQuery 核心库 -->
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<!-- 引入 jQuery EasyUI 核心库，这里采用的是 1.3.6 -->
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<!-- 引入 EasyUI 中文提示信息 -->
<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="js/baseDepartment.js"></script>
</head>
<body>
	部门名称:<select id="deptName" class="easyui-combobox" data-options="width:'100px'">
                 <option value="-1">全部</option>
		</select>
	   <a href="javascript:void(0);"  id="btnSearch" class="easyui-linkbutton" data-options="width:'100px',iconCls:'icon-search'">检索</a>
      <a href="javascript:void(0);"  id="btnAdd" class="easyui-linkbutton" data-options="width:'100px',iconCls:'icon-add'">新增</a>
      <table id="tblResult" class="easyui-datagrid" data-options="singleSelect:true">
             <thead>
			<tr>
				<th data-options="field:'id',width:80">编号</th>
				<th data-options="field:'deptName',width:80">部门名称</th>
				<th data-options="field:'deptParent',width:80">上级部门</th>
				<th data-options="field:'enable',width:80,formatter:enableFormatter">屏蔽</th>
			</tr>
		</thead>
     </table>
     <div id="divToolbar">
		<a href="javascript:void(0)" id="btnEnable" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">屏蔽/解除屏蔽</a>
		<a href="javascript:void(0)" id="btnEdit" class="easyui-linkbutton" data-options="iconCls:'icon-save',width:'120px'">编辑</a>
     </div>
          
     <div id="divDeptValueEdit" class="easyui-window" title="部门信息项目编辑"
                 data-options="closed:true,minimizable:false,collapsible:false,maximizable:false,
                                         resizable:false,modal:true,width:'350px',iconCls:'icon-save'">
             <form id="valueEditForm">
                     <ul style="list-style: none ;line-height:30px">
                        <li>上级部门：<select id="deptParent" class="easyui-combobox" data-options="width:'100px'"></select></li>
                        <li>部门名称：<input type="text" id="deptName" class="easyui-textbox" data-options="prompt:'部门名称'"></input></li>
                        <li>备注说明：<input type="text" id="deptComment" class="easyui-numberbox" data-options="prompt:'备注信息'"></input></li>
                        <li>锁定：<input type="checkbox" id="chkEnable" class="easyui-switchbutton" name="enable" data-options="onText:'解锁',offText:'锁定'" checked /></li>
                        <li>
                              <a href="javascript:void(0);" id="btnSave" id="btnAdd" class="easyui-linkbutton"
                                      data-options="width:'100px',iconCls:'icon-save'">保存</a>
                               <a href="javascript:void(0);" id="btnSave" id="btnCancel" class="easyui-linkbutton"
                                      data-options="width:'100px',iconCls:'icon-cancel'">取消</a>       
                          </li>
                      </ul>
             </form>
     </div>
     </body>
	</html>