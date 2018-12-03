<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>客户管理 - 创建客户</title>
</head>
<body>

<h1>创建客户界面</h1>

<%-- TODO --%>
<form action="customer_create" method="post">
    <p>
        id: <input type="text" name="id">
    </p>

    <p>
        名字: <input type="text" name="name">
    </p>
    <p>
        联系人: <input type="text" name="contact">
    </p>
    <p>
        联系方式: <input type="text" name="telephone">
    </p>
    <p>
        邮箱: <input type="text" name="email">
    </p>
    <p>
        备注: <input type="text" name="remark">
    </p>

        <input type="submit" name="submit" value="提交" />






</form>

</body>
</html>