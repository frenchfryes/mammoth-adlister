import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

           //usually header
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            //body
            out.println("<h1>Hello, World!</h1>");
            out.println("This is an example");
        }

    }

