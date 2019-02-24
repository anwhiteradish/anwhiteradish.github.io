<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="favicon.ico" >
<link rel="Shortcut Icon" href="favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/h-ui.admin/css/style.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/lib/ueditor/themes/default/css/ueditor.css" />

<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<!--/meta 作为公共模版分离出去-->

<title>新增文章 - 资讯管理 - H-ui.admin v3.0</title>
<meta name="keywords" content="H-ui.admin v3.0,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description" content="H-ui.admin v3.0，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<article class="page-container">
	<form method="post" action="${pageContext.request.contextPath }/manage/updateSelectivity" class="form form-horizontal" id="form-article-add">
		<input type="hidden" name="id" value="${blog.id }"/>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>title：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${blog.title }" placeholder="" id="title" name="title">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">summary：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${blog.summary }" placeholder="" id="summary" name="summary">
			</div>
		</div>
		<!-- <div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">releaseDate：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="date" class="input-text" value="" placeholder="" id="releaseDate" name="releaseDate">
			</div>
		</div> -->
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">keyWord：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${blog.keyWord }" placeholder="" id="keyWord" name="keyWord">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">blogType：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<select name="blogType" id="blogType">
					<option value="1">原创</option>
					<option value="2">转载</option>
					<option value="3">翻译</option>
				</select>
			</div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">文章内容：</label>
			<div class="formControls col-xs-8 col-sm-9"> 
				<script id="editor" name="content" type="text/plain" style="width:100%;height:300px;">
				${blog.content}
				</script> 
				
			</div>
		</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
				<input type="submit" value="submit" class="btn btn-primary radius">
				<input type="submit" value="updateSubmit" onclick="updateSubmit()" class="btn btn-primary radius">
				<!-- <button onClick="article_save_submit();" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存并提交审核</button>
				<button onClick="article_save();" class="btn btn-secondary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 保存草稿</button>
				<button onClick="removeIframe();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button> -->
			</div>
		</div>
	</form>
</article>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/static/h-ui.admin/js/H-ui.admin.page.js"></script> 
<!--/_footer /作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/jquery.validation/1.14.0/messages_zh.js"></script>   
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/webuploader/0.1.5/webuploader.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/ueditor/ueditor.config.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/ueditor/ueditor.all.min.js"> </script> 
<script type="text/javascript" src="${pageContext.request.contextPath }/lib/ueditor/lang/zh-cn/zh-cn.js"></script>
<script type="text/javascript">

var ue = UE.getEditor('editor',{
    
    autoHeightEnabled: true,
    autoFloatEnabled: true
});


/* function updateSubmit(){
	document.form.action="${pageContext.request.contextPath }/manage/updateSelectivity";
	document.form.submit();
} */
/* $('form[id=form1]').attr('action','${pageContext.request.contextPath}/arrangeTheVehicle/arrangeTheVehicleStatistics2.do');
$("#form1").submit(); */

</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>