package TodoList;
import java.io.Serializable;

public class Task implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String description;
	private boolean done;
	private String dueDate;
	private String taskID;
	private Project taskList;
	private Project project;
	
	public Task (String initialDescription, String initialDueDate) {
		
		this.description= initialDescription;
		this.done= false;
		this.dueDate=initialDueDate;
		
	}
	
	public Task() {
		
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description= description;
		
	}
	
	public boolean getDone() {
		return done;
	
	}
	
	public void setStatus (boolean done) {
		this.done=done;
	}
	
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate= dueDate;
	}
	
	public Project getTasks() {
		return taskList;
	}
	public void setTasks(Project tasks) {
		this.taskList= tasks;
	}
	public String getTaskID() {
		return taskID;
	}
	public void setTaskID(String taskID) {
		this.taskID=taskID;
	}
		
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project=project;
	}
	//edit method for task ( change name and mark as complete)
	
	
	public String toString() {
		return "Task Description: " + description + " Status: " + done + " Due date: "+ dueDate;
	}
	
	
}
	
