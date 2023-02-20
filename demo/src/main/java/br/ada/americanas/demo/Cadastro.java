package br.ada.americanas.demo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Cadastro", value = "/cadastro")
public class Cadastro extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = String.valueOf(request.getParameter("name"));
        String cpf = String.valueOf(request.getParameter("cpf"));

        PrintWriter writer = response.getWriter();
        writer.println("<html><body> O cliente  " + name + " foi cadastrado com o cpf " + cpf + "</body></html>");
    }
}
