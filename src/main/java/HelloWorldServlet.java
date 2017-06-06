import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");
        if (name == null) {
            out.println("<h1>Hello world</h1>");
        } else {
            out.printf("<h1>Hello %s </h1>", name);
        }
    }

}