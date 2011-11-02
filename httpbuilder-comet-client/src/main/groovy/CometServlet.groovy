import javax.servlet.*
import javax.servlet.annotation.*
import javax.servlet.http.*

public class CometServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		
		def out = resp.writer
		
		def random = new Random()
		def ms = random.nextInt(10000)+3000
		sleep(ms)
		
		out.println("sleep(${ms})")
	}
}
