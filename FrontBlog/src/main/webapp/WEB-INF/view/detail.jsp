<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="head.jsp"%> 


    <!-- 主体（一般只改变这里的内容） -->
    <div class="blog-body">
    	
        <div class="blog-container">
            <blockquote class="layui-elem-quote sitemap layui-breadcrumb shadow">
                <a href="home.html" title="网站首页">网站首页</a>
                <a href="article.html" title="文章专栏">文章专栏</a>
                <a><cite>java&javascript&jquery</cite></a>
            </blockquote>
            <div class="blog-main">
                <div class="blog-main-left">
                    <!-- 文章内容（使用Kingeditor富文本编辑器发表的） -->
                    <div class="article-detail shadow">
                        <div class="article-detail-title">
                            ${blog.title }
                        </div>
                        <div class="article-detail-info">
                            <span>编辑时间：<fmt:formatDate value="${blog.releaseDate }" pattern="yyyy年MM月dd日"/></span>
                            <span>作者：本站站长</span>
                            <span>浏览量：${blog.readCount }</span>
                        </div>
                        <div class="article-detail-content">
                            <p style="text-align:center;">
                                <strong><span style="font-size:18px;">${blog.content }</span></strong>
                            </p>
                            
                            <p>
                                &nbsp; &nbsp; 点赞七月的雨：<a href="http://fly.layui.com/case/2017/" target="_blank"><span style="color:#337FE5;">点击前往</span></a>&nbsp; &nbsp; 完整演示请看后台：<span><a href="http://www.lyblogs.cn/admin" target="_blank"><span style="color:#337FE5;">点击前往</span></a></span>&nbsp; &nbsp; pagesize.js下载地址：<a href="https://pan.baidu.com/s/1kVK8UhT" target="_blank"><span style="color:#337FE5;">点击前往</span></a>
                            </p>
                            <hr />
                            &nbsp; &nbsp; 出自：七月的雨
                            <p>
                                &nbsp; &nbsp; 地址：<a href="http://www.baidu.com" target="_blank">www.baidu.com</a>
                            </p>
                            <p>
                                &nbsp; &nbsp; 转载请注明出处！<img src="http://www.lyblogs.cn/kindeditor/plugins/emoticons/images/0.gif" border="0" alt="" />
                            </p>
                            <p>
                                <br />
                            </p>
                        </div>
                    </div>
                    <!-- 评论区域 -->
                    <div class="blog-module shadow" style="box-shadow: 0 1px 8px #a6a6a6;">
                        <fieldset class="layui-elem-field layui-field-title" style="margin-bottom:0">
                            <legend>来说两句吧</legend>
                            <div class="layui-field-box">
                            
                            <span id="comment"></span>
                                <form name="formName" class="layui-form blog-editor" action=""  method="post">
                                    <div class="layui-form-item">
                                        <input name="blog_id" type="hidden" id="blog_id" value="${blog.id }">
                                    </div>
                                    <div class="layui-form-item">
                                        <input name="userName" id="userName" type="text" placeholder="请输入姓名">
                                    </div>
                                    <div class="layui-form-item">
                                        <input name="email" id="email" type="text" placeholder="请输入email">
                                    </div>
                                    <!-- <div class="layui-form-item">
                                        <textarea  name="content" lay-verify="content" id="remarkEditor" placeholder="请输入内容" class="layui-textarea layui-hide"></textarea>
                                    </div> -->
                                    <div class="layui-form-item">
                        				<textarea  name="content" id="content" placeholder="请输入内容" ></textarea>
                        			</div>
                                    <div class="layui-form-item">
                                        <input type="button" id="btn123" class="layui-btn" lay-submit="formRemark" lay-filter="formRemark" value="提交评论">
                                    </div>
                          			
                                </form>
                            </div>
                        </fieldset>
                        <div class="blog-module-title">最新评论</div>
                        
                        <ul class="blog-comment">
                        
                        <c:forEach items="${commentList }" var="item">
                        	<li>
                                <div class="comment-parent">
                                    <img src="../images/Absolutely.jpg" alt="absolutely" />
                                    <div class="info">
                                        <span class="username">${item.userName}</span>
                                        <span class="time"><fmt:formatDate value="${item.commentDate }" pattern="yyyy-MM-dd"/></span>
                                    </div>
                                    <div class="content">
                                       ${item.content }
                                    </div>
                                </div>
                            </li>
                         </c:forEach>
                        
                        </ul>
                    </div>
                </div>
                	
                <div class="blog-main-right">
                    <!--右边悬浮 平板或手机设备显示-->
                    <div class="category-toggle"><i class="fa fa-chevron-left"></i></div><!--这个div位置不能改，否则需要添加一个div来代替它或者修改样式表-->
                    <div class="article-category shadow">
                        <div class="article-category-title">分类导航</div>
                        <!-- 点击分类后的页面和artile.html页面一样，只是数据是某一类别的 -->
                        <a href="javascript:layer.msg(&#39;切换到相应分类&#39;)">java</a>
                        <a href="javascript:layer.msg(&#39;切换到相应分类&#39;)">SQL</a>
                        <a href="javascript:layer.msg(&#39;切换到相应分类&#39;)">javascript</a>
                        <a href="javascript:layer.msg(&#39;切换到相应分类&#39;)">Web前端</a>
                        <a href="javascript:layer.msg(&#39;切换到相应分类&#39;)">java后端</a>
                        <a href="javascript:layer.msg(&#39;切换到相应分类&#39;)">杂文随笔</a>
                        <div class="clear"></div>
                    </div>
                    <div class="blog-module shadow">
                        <div class="blog-module-title">相似文章</div>
                        <ul class="fa-ul blog-module-ul">
                            <li><i class="fa-li fa fa-hand-o-right"></i><a href="detail.html">java后端</a></li>
                            <li><i class="fa-li fa fa-hand-o-right"></i><a href="detail.html">web前端</a></li>
                            <li><i class="fa-li fa fa-hand-o-right"></i><a href="detail.html">JavaScript</a></li>
                            <li><i class="fa-li fa fa-hand-o-right"></i><a href="detail.html">jQuery</a></li>
                        </ul>
                    </div>
                    <div class="blog-module shadow">
                        <div class="blog-module-title">亲情链接</div>
                        <ul class="fa-ul blog-module-ul">
                            <li><i class="fa-li fa fa-hand-o-right"></i><a href="https://www.ghpym.com/">果核剥核</a></li>
                            
                        </ul>
                    </div>
                    <div class="blog-module shadow">
                        <div class="blog-module-title">随便看看</div>
                        <ul class="fa-ul blog-module-ul">
                            <li><i class="fa-li fa fa-hand-o-right"></i><a href="detail.html">一步步制作时光轴（一）（HTML篇）</a></li>
                            <li><i class="fa-li fa fa-hand-o-right"></i><a href="detail.html">ASP.NET MVC制作404跳转（非302和200）</a></li>
                            <li><i class="fa-li fa fa-hand-o-right"></i><a href="detail.html">ASP.NET MVC 防范跨站请求伪造（CSRF）</a></li>
                            <li><i class="fa-li fa fa-hand-o-right"></i><a href="detail.html">一步步制作时光轴（三）（JS篇）</a></li>
                            <li><i class="fa-li fa fa-hand-o-right"></i><a href="detail.html">基于laypage的layui扩展模块（pagesize.js）！</a></li>
                            <li><i class="fa-li fa fa-hand-o-right"></i><a href="detail.html">一步步制作时光轴（二）（CSS篇）</a></li>
                            <li><i class="fa-li fa fa-hand-o-right"></i><a href="detail.html">写了个Win10风格快捷菜单！</a></li>
                        </ul>
                    </div>
                </div>
                <div class="clear"></div>
            </div>
        </div>
    </div>
    <!-- 底部 -->
    <footer class="blog-footer">
        <p><span>Copyright</span><span>&copy;</span><span>2019</span><a href="http://www.lyblogs.cn">七月的雨</a><span>Design By CXY</span></p>
        <p><a href="http://www.miibeian.gov.cn/" target="_blank">豫ICP备16029915号-1</a></p>
    </footer>
    <!--侧边导航-->
    <!-- <ul class="layui-nav layui-nav-tree layui-nav-side blog-nav-left layui-hide" lay-filter="nav">
        <li class="layui-nav-item">
            <a href="home.html"><i class="fa fa-home fa-fw"></i>&nbsp;首页</a>
        </li>
        <li class="layui-nav-item layui-this">
            <a href="article.html"><i class="fa fa-file-text fa-fw"></i>&nbsp;文章专栏</a>
        </li>
        <li class="layui-nav-item">
            <a href="resource.html"><i class="fa fa-tags fa-fw"></i>&nbsp;资源分享</a>
        </li>
        <li class="layui-nav-item">
            <a href="timeline.html"><i class="fa fa-road fa-fw"></i>&nbsp;点点滴滴</a>
        </li>
        <li class="layui-nav-item">
            <a href="about.html"><i class="fa fa-info fa-fw"></i>&nbsp;关于本站</a>
        </li>
    </ul> -->
    <!--分享窗体-->
    <div class="blog-share layui-hide">
        <div class="blog-share-body">
            <div style="width: 200px;height:100%;">
                <div class="bdsharebuttonbox">
                    <a class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"></a>
                    <a class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"></a>
                    <a class="bds_weixin" data-cmd="weixin" title="分享到微信"></a>
                    <a class="bds_sqq" data-cmd="sqq" title="分享到QQ好友"></a>
                </div>
            </div>
        </div>
    </div>
    <!--遮罩-->
    <div class="blog-mask animated layui-hide"></div>
    
    <script src="../plug/layui/layui.js"></script>
    <!-- 自定义全局脚本 -->
    <script src="../js/global.js"></script>
    <!-- 比较好用的代码着色插件 -->
    <script src="../js/prettify.js"></script>
    <!-- 本页脚本 -->
    <script src="../js/detail.js"></script>
    <script type="text/javascript" src="../js/jquery-3.1.1.min.js"></script>
</body>
<script type="text/javascript">

$("#btn123").click(function(){
	
	 /*document.formName.action="${pageContext.request.contextPath }/comment?id=${blog.id}";
	   document.formName.submit(); */
	   if($("#userName").val()==null || $("#userName").val()==""){
		   return false;
	   }
	   if($("#email").val()==null || $("#email").val()==""){
		   return false;
	   }
	   if($("#content").val()==null || $("#content").val()==""){
		   return false;
	   }
	 $.post(
			"${pageContext.request.contextPath }/comment?id=${blog.id}",
			{"blog_id":$("#blog_id").val(),"userName":$("#userName").val(),"email":$("#email").val(),"content":$("#content").val()},
			function(data){
				if(data=="评论成功"){
					alert(data)
					window.location.reload();
					$("#comment").html(data);
				}
			},"json") 
})

</script>
</html>