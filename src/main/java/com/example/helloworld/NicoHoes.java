package com.example.helloworld;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "NicoHoes", value = "/hello-nico")
public class NicoHoes extends HttpServlet {
    private String message;

    public void init() {
        message = "Things about me :\r" +
                "i play league\r" +
                "i have a deep desire to end it\r" +
                "what even is the meaning of life\r";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
