import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/part2")
public class Part2 extends HttpServlet {

    private ServletContext sc;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        synchronized (sc) {
            HttpSession session = req.getSession();
            if (session.isNew()) {
                session.setAttribute("namelist", new ArrayList<String>());
            }

            String name = req.getParameter("name");
            if (((ArrayList<String>) session.getAttribute("namelist")).contains(name)) {
                resp.getWriter().printf("<html><body><h2 style=\"color:red\">Error</h2><br>User %s has added<br><a href=\"part2\">Back</a></body></html>", name);
            } else {
                ((ArrayList<String>)req.getAttribute("namelist")).add(name);
            }
        }
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        sc = config.getServletContext();
    }
}
