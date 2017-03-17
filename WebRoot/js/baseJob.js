/**
 * 
 */
$(document).ready(function() {
	
	//初始化表格的工具栏
	$('#tblResult').datagrid({
			toolbar:'#divToolbar',
			loadMsg : '正在努力为您加载数据',
		    singleSelect:true,
	        height:'500px',
	        toolbar:'#toolbar',
	        pagination: true,//分页控件 
	        pageNumber: 1,
	        pageSize: 10,
	        pageList: [10,15,20],
	        loadFilter: pagerFilter//前端分页加载函数

	});
	
	//新增按钮事件处理
	$('#btnAdd').click(function(){
		//编辑页面初始化
		$("#jobEidtForm").form('clear');
		$('#chkEnable').switchbutton('check');
		$('#divbaseJobEdit').window({
			title:'岗位架构新增'
		});	
		$('#divbaseJobEdit').window('open');	
	});
	//保存按钮事件处理
	$('#btnSave').click(function(){
		
		$("#jobEidtForm").form({
			url:"base/saveJobvalue.action",
			success: function(data){
		        var tmp =$.parseJSON(data);
		        $.messager.alert("提示信息",tmp.msg);
			},
		})
		$("#jobEidtForm").form("submit");
	});
	
	//检索按钮事件处理
	$('#btnSearch').click(function(){
		$("#tblResult").datagrid({
			url:'JSONData/jobTitle.json'		
		});
	});
    
	//下拉列表初始化 
	$('#jobParent').combobox({
		url:'JSONData/jobTitle_a.json',
		valueField:'id',
		textField:'jobTitle',
		editable:false,
		required:true	
	});
		
	 //屏蔽/解除屏蔽 按钮事件
	$('#btnEnable').click(function(){  
		var row=$('#tblResult').datagrid('getSelected');
		if(row==null){
			$.messager.alert("警告","请选择记录后，再操作");
		}else{
			$.messager.confirm({
				title:"屏蔽操作确认",
				msg:"请您确认将对显示值为<b><font color='red'>"
					+row.jobTitle
					+"</font></b>的公司架构项目进行<b><font color='red'>屏蔽/解除屏蔽</font></b>操作",
				fn:function(r){
					if(r){
						$.messager.alert("成功提示","该公司架构项目已成功屏蔽/解除屏蔽");
					}
				}
			});
		}
	});

	//编辑按钮事件处理
	$('#btnEdit').click(function(){
		var row =$('#tblResult').datagrid('getSelected');
		if(row==null){
			 $.messager.alert("警告","请选择记录后，再操作");
		} else{
			$('#jobEditForm').form('load',{
				"jobEmployeeValue.id":row.id,
				"jobEmployeeValue.jobTitle":row.jobTitle,
				"jobEmployeeValue.jobparent":row.jobparent,
				"jobEmployeeValue.desc":row.desc
			});
			
			if(row.enable)
				var chkButton=$('#chkEnable').switchbutton('check');
			else
				var chkButton=$('#chkEnable').switchbutton('uncheck');
			$('#divbaseJobEdit').window({
				title:'岗位架构编辑'
			});
	
			$('#divbaseJobEdit').window('open');
		}
	 });
	
	
});
//表格显示 - 锁定列显示逻辑
var enableFormatter=function(value, row, index){
	if(value=='1')
        return "<img src='easyui/themes/icons/ok.png'/>";
	else if(value=='0')
		return "<img src='easyui/themes/icons/cancel.png'/>";
} ;

//分页数据过滤器
function pagerFilter(data){
    if (typeof data.length == 'number' && typeof data.splice == 'function'){    // 判断数据是否是数组
        data = {
            total: data.length,
            rows: data
        }
    }
    //获取相关参数
    var dg = $(this);
    var opts = dg.datagrid('options');
    var pager = dg.datagrid('getPager');
    //分页控件参数设置
    pager.pagination({
        onSelectPage:function(pageNum, pageSize){
            opts.pageNumber = pageNum;
            opts.pageSize = pageSize;
            pager.pagination('refresh',{
                pageNumber:pageNum,
                pageSize:pageSize
            });
            dg.datagrid('loadData',data);
        }
    });
    //原始数据保存
    if (!data.originalRows){
        data.originalRows = (data.rows);
    }
    //分页计算
    var start = (opts.pageNumber-1)*parseInt(opts.pageSize);
    var end = start + parseInt(opts.pageSize);
    data.rows = (data.originalRows.slice(start, end));
    //返回数据
    return data;
}









