/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.suma;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jmmm
 */
@Controller
public class AppController {
    
    @RequestMapping(value = "sumar",method = RequestMethod.POST)
    public ModelAndView add(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        try (PrintWriter out = response.getWriter()) {
            double n1 = Double.parseDouble(request.getParameter("num1"));
            double n2 = Double.parseDouble(request.getParameter("num2"));
                suma Suma = new suma(n1,n2);
        request.setAttribute("Suma", Suma);
        request.getRequestDispatcher("/mostrarResultado.jsp").forward(request, response);
        }
    return null;
    }
}
