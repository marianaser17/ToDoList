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
	
	private Project project;
	private ArrayList<Project> projectList = new ArrayList<>();

	public ProjectReg() {
		
	}
	// {
//		projectList= new ArrayList<Project>();
//	}

	public ArrayList<Project> getProjectList() {
	
		return projectList;
	}
	
	public Project project() {
		return project;
	}
	public void setProject(Project project) {
		this.project= project;
	}
	
	public void setProjects(ArrayList<Project> projectList) {
		this.projectList=projectList;
	}
		
	
	public void findATask(int taskID) {
		project.findTask(taskID);
	}
	
	public void renameATask(int taskID,String newTaskName) {
		project.renameTask(taskID, newTaskName);
	}
	public void changeStatus(int taskID, boolean completed) {
		project.changeStatus(taskID, completed);
	}
	public void changeDueDate(int taskID, String newDueDate) {
		project.changeDueDate(taskID, newDueDate);
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
		String toReturn = "";
		for ( Project project: getProjectList()) {
			
//			System.out.println(aProject.toString());
			for(Task i : project.getTaskList()) {
				toReturn += i.getTaskName() + " " + i.getDueDate();
			}
			}
	}
	
	//add new task to a project
	public void addNewTask(int pID, String description, String dueDate) {
			Task task = new Task(description, dueDate);
			findProject(pID).addTask(task); //CREATE NEW ONE IF IT DOESNT EXIST
			
	}
	
	//delete task from a project using project ID and task ID 
	public void deleteTaskFromProject(int pID, int taskID) {
		this.findProject(pID).removeTask(taskID);
	}
	
	//edit a task 
	public void editATask(int pID, int taskID) {
	}	

	public String toString() {
		String s = "";
		for(Project p : projectList) {
			for(Task t : p.getTaskList())
				s.concat(t.toString()+"\n");
		}			System.out.println("WRONG??" + s);

		return s;
		
	}
	
}


