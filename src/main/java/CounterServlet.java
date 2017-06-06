import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by frenchfryes on 6/6/17.
 */
@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {

    private int counter = 0;

    protected void doGet(
            HttpServletRequest req, HttpServletResponse res
    ) throws ServletException, IOException {
        counter++;
        res.getWriter().printf("<h1>You have visited this page %d times</h1>", counter);
    }
}
