package bug;

import java.io.File;

public class Bug {

	private int projectId;
	private String projectName;
	private String email;
	private String owner;
	private String priority;
	private String status;
	private String ownerProject;
	private String createdDate;
	private String completionDate;
	private String description;
	private String attachedFiles;
	
	public Bug() {
		
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOwnerProject() {
		return ownerProject;
	}

	public void setOwnerProject(String ownerProject) {
		this.ownerProject = ownerProject;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAttachedFiles() {
		return attachedFiles;
	}

	public void setAttachedFiles(String attachedFiles) {
		this.attachedFiles = attachedFiles;
	}

	public String toString() {
		return "Bug [projectId=" + projectId + ", projectName=" + projectName + ", email=" + email + ", owner=" + owner
				+ ", priority=" + priority + ", status=" + status + ", ownerProject=" + ownerProject + ", createdDate="
				+ createdDate + ", completionDate=" + completionDate + ", description=" + description
				+ ", attachedFiles=" + attachedFiles + "]";
	}


	
}
