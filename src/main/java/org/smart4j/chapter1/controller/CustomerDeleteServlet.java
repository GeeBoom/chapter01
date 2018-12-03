package org.smart4j.chapter1.controller;

import org.smart4j.chapter1.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 删除客户
 */
@WebServlet("/customer_delete")
public class CustomerDeleteServlet extends HttpServlet {
    private CustomerService customerService;
    @Override
    public void init() throws ServletException {
        customerService = new CustomerService();
    }

    /**
     * 处理 删除客户 请求
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));


        customerService.deleteCustomer(id);
        resp.sendRedirect(req.getContextPath()+"/customer");
    }




}
