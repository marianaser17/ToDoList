package TodoList;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
	//import java.util.Collections;
import java.util.Scanner;



public class ProjectReg {

	
	
	private ArrayList<Project> ProjectList;	
	private String chosenProject;
	
	public ProjectReg() {
		ProjectList= new ArrayList<Project>();
	}

	
	public ArrayList<Project> getProjectList() {
		return this.ProjectList;
	}
	
	public void setProjects(ArrayList<Project> projectList) {
		this.ProjectList=projectList;
	}
		
 //add method
	public void addProject(Project pName) {
		this.getProjectList().add(pName);
		
		System.out.println("The Project " + pName + " has been created");
		
	}
	// remove method
	public void removeProject(String pName) {
		Project project= this.findProject(pName);
		if (project != null) {
			this.ProjectList.remove(project);
			
		System.out.println("The Project " + pName + " has been removed");
			
		}
		
		
				}
	// find method 
	public Project findProject(String pName) {
		for (Project project: this.ProjectList) {
			if(project.getPName().equals(pName)) {
				return project;
			}
			
		}
	return null;	
	}		
	
	// rename method
		public void setProjectTitle(String pName, String newName) {
			Project a = this.findProject(pName);

			if (a != null) {
				a.setName(newName);
				
				
			}
		}

	public void showProjects() {
		for ( Project project: this.ProjectList) {
			
			
			System.out.println("These are your Projects: " + project);
		}
		
	}
	
	public void showTasksFromProject() {
		Scanner scan = new Scanner(System.in);
		this.showProjects();
		System.out.println("Please choose the project to view by typing its title: ");
		
		System.out.printf("> ");
		chosenProject = scan.nextLine();

		System.out.println("These are all the tasks in your chosen project: ");
		this.findProject(chosenProject).getTaskList();
		
		scan.close();
	}
	
	public ArrayList<Project> addNewTask(ArrayList<Project> projectList) {
		ArrayList<Task>tempTaskList=new ArrayList<Task>();

		Scanner scan = new Scanner (System.in);
		
		if (projectList.size()> 0) {
			
			String description;
			String dueDate;
			
			System.out.println("Enter Task");
			description=scan.nextLine();
			
			System.out.println("Enter due Date");
			dueDate=scan.nextLine();	
			
			Task task= new Task(description, dueDate);
			task.setProject(projectList.get(0));
			//Project project = new Project();
			//project.addTask(task);
		
			tempTaskList.add(task);
			//task.toString();
			projectList.get(0).setTaskList(tempTaskList);
					
		}
		else {
			System.out.println("Enter 6 to: Create new project");
		}
		scan.close();
		return projectList;
	}
	
	public ArrayList<Project> createNewProject() {
		
		Scanner scan = new Scanner (System.in);
		
		String pName;
		
		System.out.println("Enter Project name");
		pName=scan.nextLine();
		

		Project project= new Project(pName);
		this.addProject(project);
		
		return this.getProjectList();
		
	
		
		
		
	
		
	}
	
		
	
		
	public void writeToFile() {

		try {
			FileOutputStream f = new FileOutputStream(new File("MyFile.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// write objects to file
			for (Project aProject : this.getProjectList()) {
				o.writeObject(aProject);
			}
			o.close();
			f.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			// System.out.println("Error initializing stream");
		}

	}

	public void readFromFile() {

		try {
			FileInputStream fi = new FileInputStream(new File("MyFile.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);

			// read objects from file
			Project p = (Project) oi.readObject();

			while (p != null) {
				this.addProject(p);
				p = (Project) oi.readObject();
			}

			oi.close();
			fi.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			// System.out.println("Error initializing stream");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

//		public void sortProject() {
//		Collections.sort(this.getProjectList());
//	}

	
	
	
	
}


