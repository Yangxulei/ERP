$(document).ready(function(){
	// 表格工具栏,分页控件
	$('#tblResult').datagrid({
		toolbar : '#divToolbar',
		height : '500px',
		pageNumber : 1,
		pagination : true,
		loadFilter : pagerFilter
	});
	// 离职操作按钮
	$('#btnDismission').click(function() {
		var row = $('#tblResult').datagrid('getSelected');
		if(row==null) {
			$.messager.alert('错误提示','请选择记录后再进行相关操作');
		} else if(row.state==0) {
			$.messager.alert('错误提示','该员工已离职，请不要重复操作');
		} else {
			$.messager.confirm('离职操作确认',
					'&nbsp;&nbsp;&nbsp;&nbsp;请确认您将为编号为 <font color="red"><b>'
					+ row.empNo
					+ '</b></font> 的员工 <font color="red"><b>'
					+ row.nameCn
					+ '</b></font> 办理离职操作，该操作不可撤销，请谨慎办理',
					function(r) {
				if (r) {
					$.messager
							.alert(
									"成功提示",
									"该员工已经成功离职");
				}
					});
		}
	});
	// 员工新增新增
	$('#btnAdd').click(function() {
		$("#empInfoForm").form('reset');
		$('#chkEnable').switchbutton('check');
		
		$("#divEmployeeInfo").window({
			title:'员工项目新增'
		});
		$('#divEmployeeInfo').window('open');
		
	});
	//头像上传按钮
	$("#btnUpload").click(function(){
		$("#formUpload").form({
			url:'commons/picUpload.action',
			success:function(data){
				data=$.parseJSON(data);
				//$.messager.alert('路径',data.msg);
				$("#imgHeadPic").get(0).src=data.msg;
			}
		});
		$("#formUpload").form("submit");
	});
	//员工编辑按钮
	$('#btnEdit').click(function(){
		var row = $('#tblResult').datagrid('getSelected');
		if(row==null){
			$.messager.alert("警告","请选择记录后再進行操作");
		}else{
			$('#empInfoForm').form('load',{
				"normal.eduHistory":row.eduHistory,
				"employee.nameCn":row.nameCn,
				"employee.sex":row.sex,
				"employee.email":row.email,
				"employee.tel":row.tel,
				"employee.qq":row.qq,
				"employee.postCode":row.postCode,
				"employee.add":row.add,
				"employee.country":row.country,
				"employee.birthPlace":row.birthPlace,
				"employee.nationality":row.nationality,
				"employee.personId":row.personId,
				"normal.joinDate":row.joinDate,
				"normal.bank":row.bank,
				"normal.bankNo":row.bankNo,
				"normal.jobCertify":row.jobCertify
			});
			if(row.enable)
				var chkButton = $('#chkEnable').switchbutton('check');
		    else
		    	var chkButton = $('#chkEnable').switchbutton('uncheck');
			
			$("#divEmployeeInfo").window({
				title:'员工项目编辑'
			});
			$("#divEmployeeInfo").window('open');
		}
	});
	// 岗位职责分配按钮
	$("#btnDeptJob").click(function() {
		var row = $('#tblResult').datagrid('getSelected');
		
		if(row==null) {
			$.messager.alert('错误提示','请选择记录后再进行相关操作');
		} else if(row.state==0) {
			$.messager.alert('错误提示','该员工已离职，请不要重复操作');
		} else {
			$('#spanNameCn').html(row.nameCn);
			var deptId = row.deptId;
			var jobId = row.jobId;
			
			$('#divJobTree').tree({
				url:'JSONData/deptjobtree.json',
				onLoadSuccess: function(node, data) {
					if(jobId != -1) {
						var job = $('#divJobTree').tree('find',jobId);
						$('#divJobTree').tree('select',job.target);
					}
				}
			});
			$('#divDeptTree').tree({
				url:'base/buildDeptTree.action',
				onLoadSuccess: function(node, data) {
					if(deptId != -1) {
						var dept = $('#divDeptTree').tree('find', deptId);
						$('#divDeptTree').tree('select',dept.target);
					}
				}
			});
			$('#divDeptJob').window('open');
		}
	});
	
	// 检索按钮功能
	$("#btnSearch").click(function() {
		$('#tblResult').datagrid({
			url:'JSONData/normalemployeeview.json',
			queryParams:{
				'employee.nameCn': $('#tbxNameCn').val(),
				'employee.empNo':$('#tbxEmpNo').val(),
				'employee.tel':$('#tbxTel').val(),
				'employee.sex':$('#selSex').combobox('getValue'),
				'employee.personId':$('#tbxPersonId').val(),
				'employee.state':$('#selState').combobox('getValue'),
				'normal.eduHistory':$('#selEduHistory').combobox('getValue'),
				'normal.bank':$('#tbxBank').val()
			}
		});
	});
});



// 格式化性别列
var fromatSex = function(value, row) {
	if(value==1) {
		return '男';
	} else {
		return '女';
	}
};

//分页数据过滤器
var pagerFilter = function(data) {
	// 获取相关参数
	var dg = $(this);
	var opts = dg.datagrid('options');
	var pager = dg.datagrid('getPager');

	// 分页控件参数设置
	pager.pagination({
		onSelectPage : function(pageNum, pageSize) {
			opts.pageNumber = pageNum;
			opts.pageSize = pageSize;
			pager.pagination('refresh', {
				pageNumber : pageNum,
				pageSize : pageSize
			});
			dg.datagrid('loadData', data);
		}
	});

	// 原始数据保存
	if (!data.originalRows) {
		data.originalRows = (data.rows);
	}
	// 分页计算
	var start = (opts.pageNumber - 1) * parseInt(opts.pageSize);
	var end = start + parseInt(opts.pageSize);
	data.rows = (data.originalRows.slice(start, end));
	// 返回数据
	return data;
}