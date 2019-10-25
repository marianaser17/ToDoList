package TodoList;
import java.io.Serializable;

public class Task implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String taskName;
	private boolean completed;
	private String dueDate;
	private int taskID;
	private Project project;
	private static int taskCounter=0;
	
	public Task (String initialDescription, String initialDueDate) {
		taskCounter++;
		taskID= taskCounter;
		this.taskName= initialDescription;
		this.completed= false;
		this.dueDate=initialDueDate;
	}
	
	public Task() {
	}
	
	public String getTaskName() {
		return taskName;
	}
	
	public void setTaskName(String description) {
		this.taskName= description;	
	}
	
	public boolean getDone() {
		return completed;
	}
	
	public void setStatus (boolean done) {
		this.completed=done;
	}
	
	public String getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(String dueDate) {
		this.dueDate= dueDate;
	}
	
	public int getTaskID() {
		return taskID;
	}
	
	public void setTaskID(int taskID) {
		this.taskID=taskID;
	}
		
	public Project getProject() {
		return project;
	}
	
	public void setProject(Project project) {
		this.project=project;
	}
	
	@Override
	public String toString() {
		return "Task: " + taskName + " Status: " + completed + " Due date: "+ dueDate;
	}
}
	
