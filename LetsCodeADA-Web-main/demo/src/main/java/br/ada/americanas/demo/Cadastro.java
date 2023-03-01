package br.ada.americanas.demo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Cadastro", value = "/cadastro")
public class Cadastro extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = String.valueOf(request.getParameter("name"));
        String cpf = String.valueOf(request.getParameter("cpf"));

        Dados cliente = new Dados();
        cliente.name = name;
        cliente.cpf = cpf;

        var cadastros = recuperaDados(request);
        cadastros.add(cliente);

        //PrintWriter writer = response.getWriter();
        //writer.println("<html><body> O cliente  " + name + " foi cadastrado com o cpf " + cpf + "</body></html>");
        request.getRequestDispatcher("/historico.jsp").forward(request, response); //
    }

    private List<Dados> recuperaDados(HttpServletRequest request){
        HttpSession session = request.getSession(true);
        List<Dados> dados = (List<Dados>) session.getAttribute("historico_cadastros");
        if(dados == null){
            dados = new ArrayList<>();
            session.setAttribute("historico_cadastros", dados);
        }
        return dados;
    }
}
