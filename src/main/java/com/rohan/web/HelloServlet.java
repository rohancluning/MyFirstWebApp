package com.rohan.web;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Date;

/**
 * Created by rohanclunig on 14-01-17.
 */
public class HelloServlet extends HttpServlet
{
    private String greeting="Hello World ";
    public HelloServlet(){}

    public HelloServlet(String greeting)
    {
        this.greeting=greeting;
    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("<h1>"+greeting+ new Date() + " even  +more</h1>");
        response.getWriter().println("session=" + request.getSession(true).getId());
    }
}