<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>客户管理 - 编辑客户</title>
</head>
<body>

<h1>编辑客户界面</h1>

<%-- TODO --%>
<form action="customer_edit" method="post">


    名字:<input type="text" name="name" /><br>
    联系人:<input type="text" name="contact" /><br>
    电话:<input type="text" name="telephone" /><br>
    邮箱:<input type="text" name="email" /><br>
    备注: <input type="text" name="remark">

        <input type="submit" name="submit" value="提交" />



</form>

</body>
</html>