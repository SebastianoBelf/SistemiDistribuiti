import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Prova1 extends HttpServlet {
    Connection dbConn;
    public String url = "jdbc:mysql://localhost/db1";
    public void init()
    {
        try {
            dbConn = DriverManager.getConnection(url, "root", "root");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    /**
     * @param request
     * @param response
     * @throws IOException
     */
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
        PrintWriter out =null;
        response.setContentType("text/html");
        out = response.getWriter();
        Statement statement;
        ResultSet result;
        try{
            statement = dbConn.createStatement();
            result = statement.executeQuery("SELECT * FROM flist");
            out.write("<table>");
            while(result.next())
            {
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        


        
    }
}
