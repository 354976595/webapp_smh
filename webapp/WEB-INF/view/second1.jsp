<%--
  Created by IntelliJ IDEA.
  User: MACHENIKE
  Date: 2017/12/12
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    pageContext.setAttribute("basePath", basePath);
%>
<html>
<head>
    <base href=<%=basePath%> />
    <title></title>
    <script language="JavaScript" src="/jquery-3.0.0/jquery-3.0.0.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            alert("ready")

        });
        $.holdReady(true);
        $.getScript("/doc/sb.xlsx",function(){
            alert("get script callback")
            $("body").append("<div onclick='haha()' style='background-color: crimson;width: 500px;height: 500px'' ></div>");
           // $("div").html("test append html");

        });
        function haha(){
            alert("function haha")
        }



    </script>
</head>
<body>

second1
haha:=<%=response.getHeader("haha")%>

<div style="background-color: bisque;">
    <button name="button1" value="button1value" onclick="btclick(this)">button1</button>


</div>
<script type="text/javascript">
    function btclick(ev){
       var e= $(ev);
        var nameAttr=  e.attr("name");
        alert("name attr="+nameAttr)
    }

</script>
</body>
</html>
