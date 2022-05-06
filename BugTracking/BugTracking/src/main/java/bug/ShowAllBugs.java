package bug;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowAllBugs extends HttpServlet{

	public ShowAllBugs() {
		
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
	BugDao bugDao;
	try {
		bugDao = new BugDao();
		LinkedList<Bug> list =(LinkedList<Bug>) bugDao.showAllBugs();
		for (int i = 0; i < list.size(); i++) {

			Bug element = (Bug) list.get(i);

			System.out.println(element);
		}
		req.setAttribute("bugs",list);
		RequestDispatcher rd = req.getRequestDispatcher("/showAllBugs.jsp");
		rd.forward(req, res);

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
