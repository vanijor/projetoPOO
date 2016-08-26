/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.ads.poo.tp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wsilv
 */
@WebServlet(name = "TpServlet", urlPatterns = {"/TpServlet"})
public class TpServlet extends HttpServlet {

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    String nome = request.getParameter("nome");
    Float Capital = Float.parseFloat( request .getParameter("Capital"));
    Float Taxa = Float.parseFloat( request .getParameter("Taxa"));
    Float periodo = Float.parseFloat( request .getParameter("periodo"));
    Float Juros = Capital*Taxa/100*periodo;
    Float Montante = Juros+Capital;
         
         
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TpServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2> O total de juros pago foi de R$ " + Juros + "</h2>" + "<br>");
            out.println("<h1> O Montante foi de R$ " + Montante + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }}

    
 

    
    
  
