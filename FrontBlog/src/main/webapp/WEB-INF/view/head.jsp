<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; Charset=utf-8">
    <meta http-equiv="Content-Language" content="zh-CN">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
    <title>七月的雨</title>
    <link rel="shortcut icon" href="../images/Logo_40.png" type="image/x-icon">
    <!--Layui-->
    <link href="../plug/layui/css/layui.css" rel="stylesheet" />
    
    <!--font-awesome-->
    <link href="../plug/font-awesome/css/font-awesome.min.css" rel="stylesheet" />
    <!--全局样式表-->
    <link href="../css/global.css" rel="stylesheet" />
    <!-- 本页样式表 -->
    <link href="../css/home.css" rel="stylesheet" />
    <!-- 本页样式表 -->
    <link href="../css/about.css" rel="stylesheet" />
    <!--本页样式表-->
    <link href="../css/article.css" rel="stylesheet" />
    <!-- 比较好用的代码着色插件 -->
    <link href="../css/prettify.css" rel="stylesheet" />
    <!-- 本页样式表 -->
    <link href="../css/detail.css" rel="stylesheet" />
    <!-- 本页样式表 -->
    <link href="../css/resource.css" rel="stylesheet" />
    <!-- 本页样式表 -->
    <link href="../css/timeline.css" rel="stylesheet" />
    <script type="text/javascript" src="../js/jquery-3.1.1.min.js"></script>
</head>
<body>
    <!-- 导航 -->
    <nav class="blog-nav layui-header">
        <div class="blog-container">
            <!-- QQ互联登陆 -->
            <a href="javascript:;" class="blog-user">
                <i class="fa fa-qq"></i>
            </a>
            <a href="javascript:;" class="blog-user layui-hide">
                <img src="../images/Absolutely.jpg" alt="Absolutely" title="Absolutely" />
            </a>
            <!-- 七月的雨 -->
            <a class="blog-logo" href="home.html">七月的雨</a>
            <!-- 导航菜单 -->
            <ul class="layui-nav" lay-filter="nav">
                <li class="layui-nav-item layui-this">
                    <a href="${pageContext.request.contextPath }/"><i class="fa fa-home fa-fw"></i>&nbsp;首页</a>
                </li>
                <li class="layui-nav-item">
                    <a href="${pageContext.request.contextPath }/article"><i class="fa fa-file-text fa-fw"></i>&nbsp;文章专栏</a>
                </li>
                <li class="layui-nav-item">
                    <a href="${pageContext.request.contextPath }/resource"><i class="fa fa-tags fa-fw"></i>&nbsp;资源分享</a>
                </li>
                <li class="layui-nav-item">
                    <a href="${pageContext.request.contextPath }/timeLine"><i class="fa fa-hourglass-half fa-fw"></i>&nbsp;点点滴滴</a>
                </li>
                <li class="layui-nav-item">
                    <a href="${pageContext.request.contextPath }/about"><i class="fa fa-info fa-fw"></i>&nbsp;支援本站</a>
                </li>
                <li class="layui-nav-item">
                    <a href="${pageContext.request.contextPath }/manage/index"><i class="fa fa-info fa-fw"></i>&nbsp;后台管理</a>
                </li>
            </ul>
            <!-- 手机和平板的导航开关 -->
            <a class="blog-navicon" href="javascript:;">
                <i class="fa fa-navicon"></i>
            </a>
        </div>
    </nav>