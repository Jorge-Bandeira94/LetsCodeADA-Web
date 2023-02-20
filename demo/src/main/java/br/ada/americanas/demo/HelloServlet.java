package br.ada.americanas.demo;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/cadastramento") //value vinculado no index.jsp no href
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Boa noite Jorge Luís";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter(); //respondendo direto para o cliente (em vez de no temrinal)
        out.println("<html><body>"); //este codigo é uma escrita htlm para o cliente
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}