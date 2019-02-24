<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="head-left.jsp"></jsp:include>
    <!-- 右侧主体开始 -->
    <div class="page-content">
        <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
          <ul class="layui-tab-title">
            <li class="home"><i class="layui-icon">&#xe68e;</i>我的桌面</li>
          </ul>
          <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
            	
                <iframe src='/welcome.jsp' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
          </div>
        </div>
    </div>
    <div class="page-content-bg"></div>
    <!-- 右侧主体结束 -->
    <!-- 中部结束 -->
    <!-- 底部开始 -->
    <div class="footer">
        <div class="copyright">Copyright ©2017 x-admin v2.3 All Rights Reserved</div>  
    </div>
    <!-- 底部结束 -->
</body>
<!-- <script type="text/javascript">
$("#btn1").click(function(){
	alert(123)
	$.post("${pageContext.request.contextPath}/selectSecondMenu",{"id":$("#btn2").val()},function(data){
		for(var i=0;i<data.length;i++){
		var aaa="<li><a href='"+data.url+"'><i class='iconfont'>&#xe6a7;</i><cite>"+data.name+"</cite></a></li>";
		$(".sub-menu").appendTo(aaa);
		}
	})
}) -->


</script>
</html>