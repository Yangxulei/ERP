/**
 * 
 */
$(document).ready(function(){
	//初始化表格的工具栏
	$("#tblResult").datagrid({
		toolbar:'#divToolbar',
		height : '500px',
		pageNumber : 1,
		pagination : true,
		loadFilter : pagerFilter
	});
	//下拉列表初始化-检索功能使用
	$("#deptName").combobox({
		url:'JSONData/deptview_a.json',
		valueField:'id',
		textField:'deptName',
		value:'-1',
		editable:false,
		loadFilter:function(items){
			items.push({id:'-1',deptName:'全部'});
			return items;
		}
	});
	//下拉列表初始化-保存功能使用
	$("#deptName").combobox({
		url:'JSONData/deptview_a.json',
		valueField:'id',
		textField:'deptName',
		editable:false,
		required:true,
	});
	
	$("#deptParent").combobox({
		url:'JSONData/deptview_a.json',
		valueField:'id',
		textField:'deptParent',
		value:'1',
		editable:false,
	});
	
	$("#deptParent").combobox({
		url:'JSONData/deptview_a.json',
		valueField:'id',
		textField:'deptParent',
		editable:false,
		required:true,
	});
	
	  //新增按钮相关事件处理
	$('#btnAdd').click(function(){
	     $('#divDeptValueEdit').window('open');
	});
	 //编辑页面的初始化
	 $("#valueEditForm").form('clear');
	 $('#chkEnable').switchbutton('check');
	 
	// $("#divDeptValueEdit").window({
		// title:'部门信息新增'
	// });
   // $('#divDeptValueEdit').window('open');
	
	//屏蔽/解除屏蔽 按钮事件
	$('#btnEnable').click(function(){
		  var row=$('#tblResult').datagrid('getSelected');
		  if(row==null){
			  $.messager.alert("警告","请选择记录后，再操作");
		  } else {
			   $.messager.confirm({
					   title: "屏蔽操作确认",
					   msg: "请您确认将对显示值为<b><font color='red'>"
					                                            +row.show
					                                            +"</font></b>的部门信息项目进行<b><font color='red'>屏蔽/解除屏蔽</font></b>操作",  
				    fn: function(r){
				    	if(r){
				    		$.messager.alert("成功提示","该信息已成功屏蔽/解除屏蔽");
				    	}
				    }
			   }); 
		  }	  
	});
	
	//检索按钮事件处理
	$('#btnSearch').click(function(){
	      $("#tblResult").datagrid({
	    	  url:'JSONData/deptview.json',
	    	  queryParams:{
	    		     typeId:$("#deptName").combobox("getValue")
	    	  }
	      });
	});
	
	$('#btnSave').click(function(){
	    
	});
	
	//保存按钮事件处理
	$('#btnSave').click(function(){
		$("#valueEditForm").form({
			url:"base/addDeptValue.action",
			success:function(data){
				var tmp = $.parseJSON(data);
				$.messager.alert("提示信息",tmp.msg);
			},
		});
		$("#valueEditForm").form("submit");
	}); 
	
	//编辑按钮事件处理
		$("#btnEdit").click(function(){
			
			var row = $('#tblResult').datagrid('getSelected');
			if(row==null){
				$.messager.alert("警告","请选择记录后在操作");
			}else{
				$('#valueEditForm').form('load',row);
				if(row.enable)
					var chkButton = $('#chkEnable').switchbutton('check');
			    else
			    	var chkButton = $('#chkEnable').switchbutton('uncheck');
				$("#divDeptValueEdit").window('open');
			}
		});
});
   
//表格显示-锁定列显示逻辑
var enableFormatter=function(value,row,index){
	  if(value=='1')
		   return "<img src='easyui/themes/icons/ok.png' />";
	  else if(value=='0')
		   return "<img src='easyui/themes/icons/cancel.png' />";
};
//分页数据过滤器
var pagerFilter = function(data){
	//获取相关参数
	var dg = $(this);
	var opts = dg.datagrid('options');
	var pager = dg.datagrid('getPager');
	
	//分页空间参数设置
	pager.pagination({
		onSelectPage : function(pageNum,pageSize){
			opts.pageNumber = pageNum;
			opts.pageSize = pageSize;
			pager.pagination('refresh',{
				pageNumber : pageNum,
				pageSize : pageSize
			});
			dg.datagrid('loadData',data);
		}
	});
	
	
	//原始数据保存
	if(!data.originalRows){
		data.originalRows = (data.rows);
	}
	
	//分页计算
	var start = (opts.pageNumber - 1) * parseInt(opts.pageSize);
	var end = start + parseInt(opts.pageSize);
	data.rows = (data.originalRows.slice(start,end));
	
	//返回数据
	return data;
}