<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据字典</title>
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
<script type="text/javascript" src="js/baseDictType.js"></script>
</head>
<body>
      类型列表：<select id="typeList" class="easyui-combobox" data-options="width:'100px'"></select>
      <a href="javascript:void(0);"  id="btnSearch" class="easyui-linkbutton" data-options="width:'100px',iconCls:'icon-search'">检索</a>
      <a href="javascript:void(0);"  id="btnAdd" class="easyui-linkbutton" data-options="width:'100px',iconCls:'icon-add'">新增</a>
      <br/>
      <br/>
      <table id="tblResult" class="easyui-datagrid" data-options="singleSelect:true">
        <thead>
                <tr>
                     <th data-options="field:'id',width:80">编号</th>
                     <th data-options="field:'typeid',width:80">类型编号</th>
                     <th data-options="field:'value',width:80">实际值</th>
                     <th data-options="field:'show',width:80">显示项目</th>
                     <th data-options="field:'desc',width:80">描述</th>
                     <th data-options="field:'enable',width:80,formatter:enableFormatter">是否锁定</th>
                </tr>     
        </thead>
     </table>
     <div id="divToolbar">
         
         <a href="javascript:void(0)" id="btnEnable" class="easyui-linkbutton" data-options="iconCls:'icon-edit',width:'120px'">屏蔽/解除屏蔽</a>
         <a href="javascript:void(0)" id="btnEdit" class="easyui-linkbutton" data-options="iconCls:'icon-save',width:'120px'">编辑</a>
     </div>
     <div id="divDictValueEdit" class="easyui-window" title="数据字典项目编辑"
                 data-options="closed:true,minimizable:false,collapsible:false,maximizable:false,
                                         resizable:false,modal:true,width:'350px',iconCls:'icon-save'">
             <form id="valueEditForm" method="post">
                     <input type="hidden" id="hidId" name="sysDictValue.id" />
                     <ul style="list-style: none ;line-height:35px">
                        <li>所属类别：<select id="dictType" class="easyui-combobox" name="sysDictValue.typeid" data-options="width:'100px'"></select></li>
                        <li>字典显示值：<input type="text" id="show" class="easyui-textbox" name="sysDictValue.show" data-options="prompt:'字典显示值'"></input></li>
                        <li>字典实际值：<input type="text" id="value" class="easyui-numberbox" name="sysDictValue.value" data-options="prompt:'字典实际值'"></input></li>
                        <li>说明：<input type="text" id="desc" class="easyui-textbox" name="sysDictValue.desc" /></li>
                        <li>锁定：<input type="checkbox" id="chkEnable" class="easyui-switchbutton" name="sysDictValue.enable" data-options="onText:'解锁',offText:'锁定'" checked /></li>
                          <li><a href="javascript:void(0);" id="btnSave" id="btnAdd" class="easyui-linkbutton"
                                      data-options="width:'100px',iconCls:'icon-save'">保存</a>
                               <a href="javascript:void(0);" id="btnSave" id="btnCancel" class="easyui-linkbutton"
                                      data-options="width:'100px',iconCls:'icon-cancel'">取消</a>       
                          </li>
                      </ul>
             </form>
     </div>
</body>
</html>