package bug;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateBug extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		Bug bug = new Bug();
		
		int projectId = Integer.parseInt(req.getParameter("projectId"));
		String priority = req.getParameter("priority");
		String status = req.getParameter("status");
		String description = req.getParameter("description");
		
		
		
		bug.setProjectId(projectId);
		bug.setPriority(priority);
		bug.setStatus(status);
		bug.setDescription(description);
		
		BugDao bugDao = null;
		try {
			bugDao = new BugDao();
			bugDao.updateBug(bug);
			
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
		rd.forward(req, res);
	}

}
