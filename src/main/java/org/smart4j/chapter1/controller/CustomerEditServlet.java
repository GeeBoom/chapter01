package org.smart4j.chapter1.controller;

import org.smart4j.chapter1.model.Customer;
import org.smart4j.chapter1.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 编辑客户
 */
@WebServlet("/customer_edit")
public class CustomerEditServlet extends HttpServlet {
    private CustomerService customerService;
    private  int id ;


    @Override
    public void init() throws ServletException {
        customerService = new CustomerService();
    }

    /**
     * 进入 编辑客户 界面
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customerList = customerService.getCustomerList();
        req.setAttribute("customerList", customerList);
        req.getRequestDispatcher("/WEB-INF/view/customer_edit.jsp").forward(req, resp);

        id = Integer.parseInt(req.getParameter("id"));
    }

    /**
     * 处理 编辑客户 请求
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String,Object> map = new HashMap<String, Object>();


        map.put("contact",req.getParameter("contact"));
        map.put("name",req.getParameter("name"));
        map.put("telephone",req.getParameter("telephone"));

        map.put("remark",req.getParameter("remark"));

        map.put("email",req.getParameter("email"));


        customerService.updateCustomer(id,map);
        resp.sendRedirect(req.getContextPath()+"/customer");


    }
}
