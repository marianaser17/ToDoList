package TodoList;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.util.ArrayList;
	//import java.util.Collections;
//import java.util.Scanner;



public class ProjectReg {
	
	private ArrayList<Project> projectList = new ArrayList<>();

	public ProjectReg() {
		
	}
	// {
//		projectList= new ArrayList<Project>();
//	}

	public ArrayList<Project> getProjectList() {
		System.out.println("I'm inside getProjectList");
		return projectList;
	}
	
	public void setProjects(ArrayList<Project> projectList) {
		this.projectList=projectList;
	}
		
	//add method
	public void addProject(Project p) {
		getProjectList().add(p);
	}
	
	//add newProject
	public void addNewProject(String pName) {	
		Project tempProject= new Project(pName);
		addProject(tempProject);
		showProjects();
	}
	
	// remove method
	public void removeProject(int pID) {
		Project project= this.findProject(pID);
		if (project != null) {
			this.projectList.remove(project);
		}
				}
	
	// remove a project
	public void removeAProject(int pID) {
		this.showProjects();
		this.removeProject(pID);
		this.showProjects();	
	}
	
	// find method 
	public Project findProject(int pID) {
		for (Project project: this.projectList) {
			if(project.getPID()==pID) {
				return project;
			}
		}
	return null;	
	}		
	
	// rename method
	public void setProjectTitle(int pID, String newName) {
			Project a = this.findProject(pID);
			if (a != null) {
				a.setProjectName(newName);
			}
		}
	
	//change name to a project
	public void RenameAProject(int pID, String newName) {
		this.showProjects();
		this.setProjectTitle(pID, newName);		
		this.showProjects();	
	}
	
	//show list of projects
	public void showProjects() {
//		String toReturn = "";
		System.out.println("I'm in showProjects before the for");
		for ( Project project: getProjectList()) {
			System.out.println("I'm in showProjects inside the for");
//			System.out.println(aProject.toString());
//			for(Task i : aProject.getTaskList()) {
//				toReturn += i.getTaskName() + " " + i.getDueDate();
//			}
			}
	}
	
	//show tasks from project 
	public void showTasksFromProject(int pID) {
		
		this.showProjects();
//		for (Task task: this.findProject(pID).getTaskList()) {
//			String t = task.toString();
//			
//			System.out.println(t);
//		}
//		
//		System.out.println("");
		
		
		Project P = this.findProject(pID);
		
		if (P != null) {
			for (Task erikaTask : P.getTaskList()) {
				int taskID = erikaTask.getTaskID();
				String taskName = erikaTask.getTaskName();
				String dueDate = erikaTask.getDueDate();
				
				System.out.println("Task ID: " + taskID + " Task name: " + taskName + "Due Date" + dueDate);
			}
		}
	
	}
	
	
	//add new task to a project
	public void addNewTask(int pID, String description, String dueDate) {
			Task task = new Task(description, dueDate);
			this.findProject(pID).addTask(task);
			
	}
	
	//delete task from a project using project ID and task ID 
	public void deleteTaskFromProject(int pID, int taskID) {
		this.findProject(pID).removeTask(taskID);
	}
	
	//edit a task 
	public void editATask(int pID, int taskID) {
	}	

	
}


