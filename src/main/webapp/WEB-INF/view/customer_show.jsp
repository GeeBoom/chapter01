<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>客户管理 - 查看客户</title>
</head>
<body>

<h1>查看客户界面</h1>

<table>
    <tr>
        <th>ID号</th>
        <th>客户名称</th>
        <th>联系人</th>
        <th>电话号码</th>
        <th>邮箱地址</th>
        <th>备注</th>


    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.contact}</td>
            <td>${customer.telephone}</td>
            <td>${customer.email}</td>
            <td>${customer.remark}</td>
            <td>




                <a href="customer_edit?id=${customer.id}">编辑</a>



                    <a href="${BASE}/customer_delete?id=${customer.id}">删除</a>


            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>