$(document).ready(function(){
	//初始化表格的工具栏
	$("#tblResult").datagrid({
		toolbar:'#divToolbar',
		height : '500px',
		pageNumber : 1,
		pagination : true, //分页控件
		loadFilter : pagerFilter
	});
	
	
	// 初始化岗位及部门下拉列表
	fillComboxtree("selJob", "JSONData/deptjobtree.json", "200px");
	fillComboxtree("selDept", "JSONData/deptment.json", "200px");
	
	// 保存薪酬信息
	$('#btnPaymentSave').click(function() {
	});
	
	// 检索按钮功能
	$("#btnSearch").click(function() {
		$('#tblResult').datagrid({
			url:'JSONData/employeepaymentview.json',
			queryParams:{
				'type':'NE',
				'employee.nameCn':$('#tbxNameCn').val(),
				'employee.empNo':$('#tbxEmpNo').val(),
				'employee.jobId':$('#selJob').combotree('getValue'),
				'employee.deptId':$('#selDept').combotree('getValue')
			}
		});
	});
});

// 填充下拉列表工具
var fillComboxtree = function(id, url, width) {
	$("#" + id).combotree({
		url: url,
		width: width,
		loadFilter:function(data, parent) {
			data.push({id:-1,text:'全部'});
			return data;
		},
		onLoadSuccess:function(node, data) {
			$("#" + id).combotree("setValue","-1");
		}
	});
};

// 格式化性别列
var fromatSex = function(value, row) {
	if(value==1) {
		return '男';
	} else {
		return '女';
	}
};

// 维护员工薪资信息按钮
var showPaymentEdit = function() {
	var row = $('#tblResult').datagrid("getSelected");
	if(row==null) {
		$.messager.alert('错误提示','请选择记录后再进行相关操作');
	} else {
		$('#spanNameCn').html(row.nameCn);
		$('#spanDeptName').html(row.deptName);
		$('#spanJobTitle').html(row.jobTitle);
		
		$('#base').numberbox('setValue', row.base);
		$('#job').numberbox('setValue', row.job);
		$('#traffic').numberbox('setValue', row.traffic);
		$('#communicate').numberbox('setValue', row.communicate);
		$('#trip').numberbox('setValue', row.trip);
		$('#endowment').numberbox('setValue', row.endowment);
		$('#medical').numberbox('setValue', row.medical);
		$('#unemployment').numberbox('setValue', row.unemployment);
		$('#pafhc').numberbox('setValue', row.pafhc);
		
		$('#divPaymentInfo').window('open');
	}
};

// 保存薪资信息按钮
var savePaymentInfo = function() {
	var row = $('#tblResult').datagrid("getSelected");
	$('#hidEmpId').val(row.empid);
	$('#hidId').val(row.id);
	$('#paymentInfoForm').form({
		url: 'Payment/savePaymentInfo.action',
		success: function(data) {
			var tmp = $.parseJSON(data);
			if(tmp.success) {
				$.messager.alert('成功提示','信息保存成功');
				$('#tblResult').datagrid('load');
				$('#divPaymentInfo').window('close');
			} else {
				$.messager.alert('错误提示','系统错误，请联系管理员');
			}
		}
	});
	$('#paymentInfoForm').submit();
};

// 格式化货币列
var formatCurrency = function(value, row) {
	return ParseMoney(value);
};

// 工具方法 - 直接使用
var ParseMoney = function(num) {
	var sign = "";
	if (isNaN(num)) {
		num = 0;
	}
	if (num < 0) {
		sign = "-";
	}
	var strNum = num + "";
	var arr1 = strNum.split(".");
	var hasPoint = true;// 是否有小数部分
	var piontPart = "";// 小数部分
	var intPart = strNum;// 整数部分
	if (arr1.length >= 2) {
		hasPoint = true;
		piontPart = arr1[1];
		intPart = arr1[0];
	}

	var res = '';// 保存添加逗号的部分
	var intPartlength = intPart.length;// 整数部分长度
	var maxcount = Math.ceil(intPartlength / 3);// 整数部分需要添加几个逗号
	for (var i = 1; i <= maxcount; i++)// 每三位添加一个逗号
	{
		var startIndex = intPartlength - i * 3;// 开始位置
		if (startIndex < 0)// 开始位置小于0时修正为0
		{
			startIndex = 0;
		}
		var endIndex = intPartlength - i * 3 + 3;// 结束位置
		var part = intPart.substring(startIndex, endIndex) + ",";
		res = part + res;
	}
	res = res.substr(0, res.length - 1);// 去掉最后一个逗号
	for(i=2; i >= (piontPart+'').length;i--) // 保证小数点后两位
		piontPart += '0';
	if (hasPoint) {
		return "￥" + sign + res + "." + piontPart;
	} else {
		return "￥" + sign + res;
	}
};

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