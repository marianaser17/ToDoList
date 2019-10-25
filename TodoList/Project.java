package TodoList;
import java.time.LocalDate;
import java.util.ArrayList;
import java.io.Serializable;


public class Project implements Serializable, Comparable<Project> {
	
	private static final long serialVersionUID = 1L;
	private ArrayList<Task> taskList;
	private String projectName;
	private int pID; //id
	private LocalDate pCreatedAt;
	private static int projectCounter=0;
	
	public Project () {
	}
	
	public Project(String projectName) {
		this.projectName = projectName;
		this.pCreatedAt = LocalDate.now();
		projectCounter++;
		pID= projectCounter;
		taskList= new ArrayList<Task>() ;	
	}	
	
	public ArrayList<Task> getTaskList(){
		return this.taskList;
	}

	public void setTaskList(ArrayList<Task> taskList) {
		this.taskList = taskList;
	}
	
	public int getPID() {
		return pID;
	}
	
	public void setPID(int pID) {
		this.pID= pID;
	}
	
	public String getProjectName() {
		return projectName;
		}
	
	public void setProjectName(String pName) {
		this.projectName = pName;
		}
		
	public LocalDate getPCreatedAt() {
		return pCreatedAt;
		}
	
	public void setPCreatedAt(LocalDate pCreatedAt) {
		this.pCreatedAt= pCreatedAt;
		}
	
//	public Task getTask() {
//		return task;
//	}
//	
//	public void setTask(Task task) {
//		this.task= task;
//	}
	
	// methods: 
	
	//add a task
	public void addTask(Task task) {
		this.getTaskList().add(task);	
		System.out.println("Task: " + task.getTaskName()+ " Due date: "+ task.getDueDate());
		System.out.println("\n");
	}
	
	// remove a Task
	public void removeTask(int taskID) {
		Task task= this.findTask(taskID);
		if (task != null) {
			this.taskList.remove(task);
		}
				}
	
	// find a Task 
	public Task findTask(int taskID) {
		for (Task task: this.taskList) {
			if(task.getTaskID()==taskID) {
				return task;
			}
		}
	return null;		
	}
	
	//rename task 
	public void renameTask  (int taskID, String newTaskName) {
        Task tempTask= findTask(taskID);
        if (tempTask != null) {
        	tempTask.setTaskName(newTaskName);
        }
	}
	
	public void changeStatus(int taskID, boolean completed) {
		 Task tempTask= findTask(taskID);
	        if (tempTask != null) {
	        	tempTask.setStatus(completed);
	        }
	}
	
	public void changeDueDate(int taskID, String newDueDate) {
		 Task tempTask= findTask(taskID);
	        if (tempTask != null) {
	        	tempTask.setDueDate(newDueDate);
	        }
	}
	
	
	public int compareTo(Project o) {
		// TODO Auto-generated method stub
		return this.getProjectName().compareTo(o.getProjectName());
		
	}
	
	@Override
	public String toString() {
		return "Project " + projectName + " date: "+ pCreatedAt;
	}
	}
	
	
	

