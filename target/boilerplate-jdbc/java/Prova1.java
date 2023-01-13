import java.io.PrintWriter;
import java.sql.Connection;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

public class Prova1 extends HttpServlet {
    public void init()
    {
        
    }
    public void doGet(HttpServletRequest request,HttpservletResponse response)
    {
        PrintWriter out =null;
        response.setContentType("text/html");
        out = response.getWriter();
        out.write("ciaooo");
    }
}
