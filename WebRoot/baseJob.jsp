<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title></title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

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
<script type="text/javascript" src="js/baseJob.js"></script>
</head>

<body>
岗位名称：<select id="deptName" class="easyui-combobox" data-options="width:'100px'">
                 <option value="-1">全部</option>
                 <option value="0">大专</option>
								<option value="1">职员</option>
								<option value="2">部门总监</option>
								<option value="3">项目经理</option>
								<option value="4">开发工程师</option>
								<option value="5">助理开发工程师</option>
								<option value="6">实习生</option>
								<option value="7">高级开发工程师</option>
								<option value="8">架构师</option>
								<option value="9">测试工程师</option>
                 
		</select>

      <a href="javascript:void(0);"  id="btnSearch" class="easyui-linkbutton" data-options="width:'100px',iconCls:'icon-search'">检索</a>
      <a href="javascript:void(0);"  id="btnAdd" class="easyui-linkbutton" data-options="width:'100px',iconCls:'icon-add'">新增</a>
    <table id="tblResult" title="岗位关系值列表" class="easyui-datagrid" >
      <thead>
        <tr>
          <th data-options="field:'ck',checkbox:true"></th>
          <th data-options="field:'id',width:80">ID</th>
      
          <th data-options="field:'jobTitle',width:80">岗位名称</th>
          <th data-options="field:'jobParent',width:80">上级岗位</th>
          <th data-options="field:'desc',width:80">描述</th>
          <th data-options="field:'enable',width:80,formatter:enableFormatter">是否锁定</th>
        </tr>
      </thead>
    </table>

</div>
<div id="toolbar"> 
<a id="btnEnable" href="javascript:viod(0);"  class="easyui-linkbutton"  iconCls="icon-edit">屏蔽/解除屏蔽</a>
<a href="javascript:void(0)" id="btnEdit" class="easyui-linkbutton" data-options="iconCls:'icon-save',width:'120px'">编辑</a>
 
</div>


<div id="divbaseJobEdit" class="easyui-window" title="岗位关系编辑"
                 data-options="closed:true,minimizable:false,collapsible:false,maximizable:false,
                                         resizable:false,modal:true,width:'350px',iconCls:'icon-save'">
             
             <form id="jobEidtForm" method="post">
                   <input type="hidden" id="hidId" name="jobEmployeeValue.id"/>
                     <ul style="list-style: none ;line-height:30px">
                        <li>岗位名称：<input id="jobTitle" class="easyui-textbox" name="jobEmployeeValue.jobTitle" data-options="prompt:'岗位名称'" type="text"/></li>                       
                        <li>上级岗位： <select id="jobParent" class="easyui-combobox" name="jobEmployeeValue。jobParent" data-options="width:'140px'"></select></li>
                        <li>说明：<input type="text" id="desc" class="easyui-textbox" name="jobEmployeeValue.desc"/></li>
                        <li>锁定：<input type="checkbox" id="chkEnable" class="easyui-switchbutton" name="jobEmployeeValue.enable" data-options="onText:'解锁',offText:'锁定'"checked/></li>
                        <li>
                              <a href="javascript:void(0);" id="btnSave"  class="easyui-linkbutton"
                                      data-options="width:'100px',iconCls:'icon-save'">保存</a>
                               <a href="javascript:void(0);"  id="btnCancel" class="easyui-linkbutton"
                                      data-options="width:'100px',iconCls:'icon-cancel'">取消</a>       
                        </li>
                      </ul>
             </form>
</div>

</body>
</html>

