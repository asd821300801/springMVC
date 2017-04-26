<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<HTML>
<HEAD>
<TITLE>ZTREE DEMO</TITLE>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link href="${path}/resources/css/demo.css" rel="stylesheet" />
<link href="${path}/resources/css/zTreeStyle/zTreeStyle.css"
	rel="stylesheet" />
<script src="${path}/resources/js/jquery-1.4.4.min.js"></script>
<script src="${path}/resources/js/jquery.ztree.core.js"></script>

<SCRIPT LANGUAGE="JavaScript">
	/*  var zTreeObj;
	 // zTree 的参数配置，深入使用请参考 API 文档（setting 配置详解）
	 var setting = {};
	 // zTree 的数据属性，深入使用请参考 API 文档（zTreeNode 节点数据详解）
	 var zNodes = [
	 {name:"test1", open:true, children:[
	    {name:"test1_1"}, {name:"test1_2"}]},
	 {name:"test2", open:true, children:[
	    {name:"test2_1"}, {name:"test2_2"}]}
	 ];
	 $(document).ready(function(){
	    zTreeObj = $.fn.zTree.init($("#treeDemo"), setting, zNodes);
	 }); */
</SCRIPT>
</HEAD>
<BODY>
	<div>
		<ul id="treeDemo" class="ztree"></ul>
	</div>
	<SCRIPT type="text/javascript">
		var setting = {
			isSimpleData : true, //数据是否采用简单 Array 格式，默认false
			treeNodeKey : "id", //在isSimpleData格式下，当前节点id属性
			treeNodeParentKey : "pId", //在isSimpleData格式下，当前节点的父节点id属性
			showLine : true, //是否显示节点间的连线
			checkable : true
		//每个节点上是否显示 CheckBox
		};
		var zTree;
		var treeNodes;
		$(function() {
			$.ajax({
				async : false,
				cache : false,
				type : 'POST',
				dataType : "json",
				url :"${path}/user/ztree.action?id=1",//请求的action路径
				error : function() {//请求失败处理函数
					
					alert('请求失败');
				},
				success : function(data) { //请求成功后处理函数。 
					alert(data);
					treeNodes = data; //把后台封装好的简单Json格式赋给treeNodes
				}
			});
			zTree = $("#treeDemo").zTree(setting, treeNodes);
		});

		$(document).ready(function() {
			//加载树结构数据  
			$.fn.zTree.init($("#treeDemo"), setting);
		}); 
	</SCRIPT>
</BODY>
</HTML>