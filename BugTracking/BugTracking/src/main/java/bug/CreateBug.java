package bug;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateBug extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		Bug bug = new Bug();
		
		int projectId = Integer.parseInt(req.getParameter("projectId"));
        String projectName = req.getParameter("projectName");
		String email = req.getParameter("email");
		String owner = req.getParameter("owner");
		String priority = req.getParameter("priority");
		String status = req.getParameter("status");
		String ownerProject = req.getParameter("ownerProject");
		String createdDate = req.getParameter("createdDate");
		String completionDate = req.getParameter("completionDate");
		String description = req.getParameter("description");
		String attachedFiles = req.getParameter("attachedFiles");
		
		bug.setProjectId(projectId);
		bug.setProjectName(projectName);
		bug.setEmail(email);
		bug.setOwner(owner);
		bug.setPriority(priority);
		bug.setStatus(status);
		bug.setOwnerProject(ownerProject);
		bug.setCreatedDate(createdDate);
		bug.setCompletionDate(completionDate);
		bug.setDescription(description);
		bug.setAttachedFiles(attachedFiles);
		
		BugDao bugDao = null;
		try {
			bugDao = new BugDao();
			bugDao.createBug(bug);
			
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
		rd.forward(req, res);
	}

}
