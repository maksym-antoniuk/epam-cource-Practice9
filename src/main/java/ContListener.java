import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.LinkedHashMap;
import java.util.Map;

@WebListener
public class ContListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("Football", 0);
        map.put("Biathlon", 0);
        map.put("Basketball", 0);
        servletContextEvent.getServletContext().setAttribute("list", map);
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
