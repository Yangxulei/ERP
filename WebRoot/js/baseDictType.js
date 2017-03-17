/**
*
*/
$(document).ready(function(){
	//初始化表格的工具栏
	$("#tblResult").datagrid({
		toolbar:'#divToolbar',
		height : '500px',
		pageNumber : 1,
		pagination : true, //分页控件
		loadFilter : pagerFilter
	});
	//下拉列表初始化-检索功能使用
	$("#typeList").combobox({
		url:'JSONData/typeList.json',
		valueField:'id',
		textField:'name',
		value:'-1',
		editable:false,
		loadFilter:function(items){
			items.push({id:'-1',name:'全部'});
			return items;
		}
	});
	//下拉列表初始化-保存功能使用
	$("#dictType").combobox({
		url:'JSONData/typeList.json',
		valueField:'id',
		textField:'name',
		editable:false,
		required:true
	});
	
	  //新增按钮事件处理
	$('#btnAdd').click(function(){
		 //编辑页面的初始化
		 $("#valueEditForm").form('clear');
		 $('#chkEnable').switchbutton('check');
		 
		 $("#divDictValueEdit").window({
			 title:'数据字典项目新增'
		 });
	     $('#divDictValueEdit').window('open');
	});
	
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
					                                            +"</font></b>的数据字典项目进行<b><font color='red'>屏蔽/解除屏蔽</font></b>操作",  
				    fn: function(r){
				    	if(r){
				    		$.messager.alert("成功提示","该字典项目已成功屏蔽/解除屏蔽");
				    	}
				    }
			   }); 
		  }	  
	});
	
   
	
	//检索按钮事件处理
	$('#btnSearch').click(function(){
	      $("#tblResult").datagrid({
	    	  url:'JSONData/valueList.json',
	    	  queryParams:{
	    		     typeId:$("#typeList").combobox("getValue")
	    	  }
	      });
	});
	
	$('#btnSave').click(function(){
	    
	});
	
	//保存按钮事件处理
	$('#btnSave').click(function(){
		$("#valueEditForm").form({
			url:"base/addDictValue.action",
			success:function(data){
				var tmp = $.parseJSON(data);
				$.messager.alert("提示信息",tmp.msg);
			},
		});
		$("#valueEditForm").form("submit");
	}); 
	
	
    //编辑按钮事件处理
	$('#btnEdit').click(function() {
		var row = $('#tblResult').datagrid('getSelected');
		if(row==null){
			$.messager.alert("警告","请选择记录后，再操作");
		}else {
			
			$('#valueEditForm').form('load',{
				"sysDictValue.id":row.id,
				"sysDictValue.typeid":row.typeid,
				"sysDictValue.show":row.show,
				"sysDictValue.value":row.value,
				"sysDictValue.desc":row.desc
			});
			
			if(row.enable)
				var chkButton = $('#chkEnable').switchbutton('check');
			else
				var chkButton = $('#chkEnable').switchbutton('uncheck');
			$("#divDictValueEdit").window({
				title:'数据字典项目编辑'
			});
			$('#divDictValueEdit').window('open');
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