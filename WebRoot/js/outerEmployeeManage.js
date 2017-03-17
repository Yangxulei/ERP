/**
 * 
 */
$(document)
		.ready(
				function() {
					// 初始化表格的工具栏
					// 下拉列表初始化
					$("#typeList").combobox({
						url : 'JSONData/typeList.json',
						valueField : 'id',
						textField : 'name',
						value : '-1',
						editable : false,
						loadFilter : function(items) {
							items.push({
								id : '-1',
								name : '全部'
							});
							return items;
						}
					});


					// 新增按钮相关事件处理
					$('#btnAdd').click(function() {
						$('#DictValueEdit').form('clear');
						$("#chkEnable").switchbutton('check');
						$("#divDictValueEdit").window({
							title:'外包人员新增项目'
						});
						$('#divDictValueEdit').window('open');
					});

					// 离职
					$('#btnDismission')
							.click(
									function() {
										var row = $('#tblResult').datagrid(
												'getSelected');
										if (row == null) {
											$.messager
													.alert("警告", "请选择记录后，再操作");
										} else {
											$.messager
													.confirm({
														title : "离职操作确认",
														msg : "请您确认将对显示值为<b><font color='red'>"
																+ row.nameCn
																+ "</font></b>的数据字典项目进行<b><font color='red'>离职/解除离职</font></b>操作",
														fn : function(r) {
															if (r) {
																$.messager
																		.alert(
																				"成功提示",
																				"该项已成功离职/解除离职");
															}
														}
													});
										}
									});

					// 部门岗位按钮
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
								url:'JSONData/deptment.json',
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
					
					
					
					// 检索按钮事件处理
					$('#btnSearch').click(function() {
						$("#tblResult").datagrid({
							url : 'JSONData/outerEmployeeManagecheck.json',
						//	queryParams : {
						//		typeId : $("#typeList").combobox("getValue")
						//	},
							toolbar : '#divToolbar',
							height : '500px',
							pagination : true,
							pageNumber : 1,					
							loadFilter : pagerFilter
						});
					});
					$('#btnEdit').click(function(){
						var row = $('#tblResult').datagrid('getSelected');
						if(row==null){
							$.messager.alert("警告","请选择记录后在操作");
						}else{
							$('#valueForm').form('load',row);
							if(row.enable)
								var chkButton = $('#chkEnable').switchbutton('check');
						    else
						    	var chkButton = $('#chkEnable').switchbutton('uncheck');
							$("#divEdit").window('open');
						}
					});
					$('#nomalAdd').click(function(){
						
							$("#divAdd").window('open');
						
					});

					$("#btnSave").click(function() {
                         $("#valueForm").form({
                        	url:"base/addDictValue.action",
                        	success:function(data){
                        		var tmp=$.parseJSON(data);
                        		$.messager.alert("提示信息",tmp.msg);
                        	}
                  
					});
					$("#valueForm").form("submit");
				});
	});
// 表格显示-锁定列显示逻辑
var enableFormatter = function(value, row, index) {
	if (value == '1')
		return "<span style='color:blue'>可用</span>";
	else if (value == '0')
		return "<span style='color:red'>不可用</span>";
};
var pagerFilter = function(data) {
	var dg = $(this);
	var opts = dg.datagrid('options');
	var pager = dg.datagrid('getPager');
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
	if (!data.originalRows) {
		data.originalRows = (data.rows);
	}
	var start = (opts.pageNumber - 1) * parseInt(opts.pageSize);
	var end = start + parseInt(opts.pageSize);
	data.rows = (data.originalRows.slice(start,end));
	return data;
}