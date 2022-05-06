package bug;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class BugDao {
	
	//String sql = "create table Bug_Tracking_System (projectId int primary key,projectName varchar(30),email varchar(30),owner varchar(30),priority varchar(30),status varchar(30),ownerProject varchar(30),createdDate varchar(30),completionDate varchar(30),description varchar(30),attchedfiles varchar(30))";
		  
	
	private Connection conn;

	public BugDao() throws Exception{
		String url="jdbc:postgresql://127.0.0.1:5432/postgres";
	    String user ="postgres";
	    String pass = "Vijay@123";
	    Class.forName("org.postgresql.Driver");
	    conn = DriverManager.getConnection(url,user,pass);
	}
	
	public Bug createBug(Bug bug) throws SQLException {
		String query = "insert into Bug_Tracking_System values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, bug.getProjectId());
		ps.setString(2,bug.getProjectName());
		ps.setString(3,bug.getEmail());
		ps.setString(4,bug.getOwner());
		ps.setString(5,bug.getPriority());
		ps.setString(6,bug.getStatus());
		ps.setString(7,bug.getOwnerProject());
		ps.setString(8,bug.getCreatedDate());
		ps.setString(9,bug.getCompletionDate());
		ps.setString(10,bug.getDescription());
		ps.setString(11,bug.getAttachedFiles());
		ps.executeUpdate();
		
		
		return bug;
	}

	public Bug updateBug(Bug bug) throws SQLException {
		
		String query = "update  Bug_Tracking_System set priority=?,status=?,description=? where projectId=?";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setString(1,bug.getPriority());
		ps.setString(2,bug.getStatus());
		ps.setString(3,bug.getDescription());
		ps.setInt(4, bug.getProjectId());
		ps.executeUpdate();
		
		return bug;
	}

	 public LinkedList showAllBugs() throws SQLException {
			
			LinkedList<Bug> list = new LinkedList<>(); 
	        String query ="Select * from Bug_Tracking_System";
	        Statement st = conn.createStatement();
	        ResultSet rs = st.executeQuery(query);
	        while(rs.next()) {
	        	Bug bug = new Bug();
	        	bug.setProjectId(rs.getInt(1));
	        	bug.setProjectName(rs.getString(2));
	        	bug.setEmail(rs.getString(3));
	        	bug.setOwner(rs.getString(4));
	        	bug.setPriority(rs.getString(5));
	        	bug.setStatus(rs.getString(6));
	        	bug.setOwnerProject(rs.getString(7));
	        	bug.setCreatedDate(rs.getString(8));
	        	bug.setCompletionDate(rs.getString(9));
	        	bug.setDescription(rs.getString(10));
	        	bug.setAttachedFiles(rs.getString(11));
	        	list.add(bug);
	        }

	        st.close();
	    	return list;
	    }
}


