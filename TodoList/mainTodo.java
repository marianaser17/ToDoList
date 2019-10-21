package TodoList;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class mainTodo {

	private ArrayList<Project> projectList;
	// TaskManager tasks;
	
	public mainTodo() {
		// tasks = new TaskManager();
	}
	
	public void run() {
		// TODO Auto-generated method stub
		projectList=new ArrayList<Project>();
		Scanner scan = new Scanner (System.in);
		
		while (true) {
			
		
		int option1;	
		ProjectReg projectReg = new ProjectReg();
		
		System.out.println("Choose an option:");
		System.out.println("Enter 1 to: Add new task"); //description 
		System.out.println("Enter 2 to: Edit a task");
		System.out.println("Enter 3 to: Delete task");
		System.out.println("ENter 4 to: Show list of tasks");
		System.out.println("ENter 5 to: Create new project"); 
		System.out.println("ENter 6 to: Edit project");
		System.out.println("ENter 7 to: Delete project");
		System.out.println("Enter 0 to: Exit");
		
		option1=scan.nextInt();		
		scan.nextLine(); //empty \n only after nextInt
		

			
		switch (option1) {
			
			case 1: 
			
			projectList=projectReg.addNewTask(projectList);
			
			break;
			
//			if (projectReg.getProjectList().size()> 0) {
//				
//				String description;
//				String dueDate;
//				
//				System.out.println("Enter Task");
//				description=scan.nextLine();
//				
//				System.out.println("Enter due Date");
//				dueDate=scan.nextLine();	
//				
//				Task task= new Task(description, dueDate);
//				
//				task.toString();
								
//			}
//			else {
//				System.out.println("Enter 6 to: Create new project");
//			}
		
		
		
		case 2:
			
			String description;
			String newDescription;
			String newDueDate;
			
			
			System.out.println("Enter Task name");
			description=scan.nextLine();
			
			Project project = new Project();
			project.findTask(description);
			
			System.out.println("Enter new description");
			newDescription=scan.nextLine();
			
			System.out.println("Enter new due date");
			newDueDate=scan.nextLine();
			
			project.editTask(description, newDescription, newDueDate);
			
			break;
		
		
		
			
//		case 3: 
//				
//				String description;
//				
//				System.out.println("Enter Task name");
//				description=scan.nextLine();
//				
//				Project project = new Project();
//				project.findTask(description);
//				
//				project.removeTask(description);
//				
//				break;
//				
			
		 
		//	else if (option1== 4) {
				
				
			//}
		
		
		case 5:
				
				projectList=projectReg.createNewProject();
				
				
				
				break;
				
//			String pName;
//			
//			System.out.println("Enter Project name");
//			pName=scan.nextLine();
//		
//
//			projectReg.addProject(new Project(pName));	
//			
//			}
//		else {
//			System.out.println("Please try again");
//
//		}
		
		
		
		
		
		
		case 0: 
			
			return;
			
			 
		default: 
			
			System.out.println("Select a valid option");
		 
		 
		 
			}
		
	
		
		
	
		
			}
		
			
		
		
	
		
	
		
		
		
	}
	
	
	public static void main(String[] args) {

		mainTodo todo = new mainTodo();
		todo.run();
		
		
		
	}
		
}

