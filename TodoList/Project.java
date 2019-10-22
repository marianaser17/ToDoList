package TodoList;
import java.time.LocalDate;
import java.util.ArrayList;

public class Project {
	
	
	private ArrayList<Task> taskList;
	private Task task;
	private String pName;
	private String pID; //id
	private LocalDate pCreatedAt;
	
	public Project () {
		 taskList= new ArrayList<Task>() ;
		
	}
	
	public Project( String pName) {
		
		this.pID = pID;
		this.pName = pName;
		this.pCreatedAt = LocalDate.now();
	}	
	
	public ArrayList<Task> getTaskList(){
		return this.taskList;
	}

	public void setTaskList(ArrayList<Task> taskList) {
		this.taskList = taskList;
	}
	
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task= task;
	}
	public String getPID() {
		return pID;
	}
	public void setPID(String PID) {
		this.pID= PID;
	}
	
	public String getPName() {
		return pName;
		}
	
	public void setName(String pName) {
		this.pName = pName;
		}
		
	public LocalDate getPCreatedAt() {
		return pCreatedAt;
		}
	
	public void setPCreatedAt(LocalDate pCreatedAt) {
		this.pCreatedAt= pCreatedAt;
		}
	// methods: 
	
	public void addTask(Task task) {
		this.getTaskList().add(task);
		
		
		
		
		System.out.println("The task" + task + "has been added");
		
	}
	
	// create a new Task: 
	
	
	
	public void removeTask(String taskName) {
		Task task= this.findTask(taskName);
		if (task != null) {
			this.taskList.remove(task);
			
		System.out.println("The task" + taskName + "has been removed");
			
		}
		
		
				}
	
	public Task findTask(String taskName) {
		for (Task task: this.taskList) {
			if(task.getDescription().equals(taskName)) {
				return task;
			}
			
		}
	return null;		
	}
	
	public void editTask  (String description, String newDescription, String newDueDate) {
        Task tempTask;
        tempTask = this.findTask(description);
        tempTask.setDescription(newDescription);
        tempTask.setDueDate(newDueDate);
        
        System.out.println("Your task has been edited");
	}
	
	public int compareTo(Project o) {
		// TODO Auto-generated method stub
		return this.getPName().compareTo(o.getPName());
	}

	
	public String toString() {
		return pName;
	}
		
		
		
		
	}
	
	
	

