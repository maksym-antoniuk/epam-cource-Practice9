import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calc")
public class Part1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("lll");
        //String s1 = req.getParameter("x").toString();
        int x = Integer.parseInt(req.getParameter("x"));
        int y = Integer.parseInt(req.getParameter("y"));
        String sign = req.getParameter("op");

        int res = 0;
        if ("plus".equals(sign)) {
            res = x + y;
        } else if ("minus".equals(sign)) {
            res = x - y;
        } else if ("mul".equals(sign)) {
            res = x * y;
        } else if ("div".equals(sign)) {
            res = x / y;
        }

        resp.getWriter().printf("<html><body><h1 style=\"color: green\">Result: %s</h1></body></html>", res);
    }
}
