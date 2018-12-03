package org.smart4j.chapter1.controller;

import org.smart4j.chapter1.model.Customer;
import org.smart4j.chapter1.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * 显示客户基本信息
 */
@WebServlet("/customer_show")
public class CustomerShowServlet extends HttpServlet {
    private CustomerService customerService;
    private Customer customer;

    @Override
    public void init() throws ServletException {
        customerService = new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO
//        handleRequest(req,resp);


       int id =  Integer.parseInt(req.getParameter("id"));
        customer = customerService.getCustomer(id);

        req.setAttribute("customer", customer);
        req.getRequestDispatcher("/WEB-INF/view/customer_show.jsp").forward(req, resp);
    }


        }


