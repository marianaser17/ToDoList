package TodoList;
import java.util.*;

public class mainTodo {

	public mainTodo() {
		// tasks = new TaskManager();
	}
	
	public void run() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);

		int option1;	
		
		Project project = new Project();
		Task task= new Task ();
		Controller controller = new Controller();
		iohandler iohandler= new iohandler();
		iohandler.readFromFile();
		
		while (true) {
			
		System.out.println("Choose an option:");
		System.out.println("ENter 1 to: Create new project"); //done
		System.out.println("ENter 2 to: Edit project"); //done
		System.out.println("ENter 3 to: Delete project"); //done
		System.out.println("Enter 4 to: Add new task"); //done 
		System.out.println("Enter 5 to: Edit a task"); // done
		System.out.println("Enter 6 to: Delete task"); //done
		System.out.println("ENter 7 to: Show list of projects"); //done
		System.out.println("ENter 8 to: Show tasks from project"); //done
		System.out.println("Enter 0 to: Exit"); //done
		
		option1=scan.nextInt();		
		scan.nextLine(); //empty \n only after nextInt
		
			
		switch (option1) {
		
			case 1:
				//add a new Project				
				System.out.println("Enter a Project Name: ");
				String pName= scan.nextLine();
				controller.addProject(pName);
				System.out.println("The project " + pName + " has been created! ");
				System.out.println("\n");
				break;
			
			case 2:
				//edit name of a project
				System.out.println("Enter the project ID of the project you want to rename: ");
				int pID= scan.nextInt();
				scan.nextLine(); //empty \n only after nextInt
				System.out.println("Enter the new name");
				String newName= scan.nextLine();
				controller.renameAProject(pID, newName);
				System.out.println(" The project " + pID + " has been edited successfully!");
				System.out.println("\n");
				break;
				
			case 3:
				//remove a project
				System.out.println("Enter the project ID of the project you want to remove: ");
				int pID2= scan.nextInt();
				scan.nextLine(); //empty \n only after nextInt
				controller.removeProject(pID2);
				System.out.println(" The project " + pID2 + " has been removed successfully!");
				System.out.println("\n");
				break;
			
			case 4: 
				//add new task to a project
				System.out.println("Please choose a project by ID:  ");
				int pID4= scan.nextInt();
				scan.nextLine();//empty \n only after nextInt
				System.out.println("Enter Task");
				String description=scan.nextLine();
				System.out.println("Enter due Date");
				String dueDate=scan.nextLine();
				controller.addTaskToAProject(pID4, description, dueDate);
//				System.out.println("The task " + task.toString() + " has been added to project: " + pID4);
				
				break;
			
			case 5:
				//edit a task ( change name, change due date, change status) 
				
				System.out.println("Please choose a project by ID:  ");
				int pID5= scan.nextInt();
				scan.nextLine();//empty \n only after nextInt
				System.out.println(controller.projectReg.findProject(pID5).getTaskList());
				System.out.println("Please enter the task ID of the task you want to edit:   ");
				int taskID5= scan.nextInt();
				scan.nextLine();//empty \n only after nextInt
//				Project project = new Project();
				project.findTask(taskID5);
				System.out.println("Enter 1 to rename task ");
				System.out.println("Enter 2 to change status of the task ");
				System.out.println("Enter 3 to change the task's due date ");
				int choice= scan.nextInt();
				scan.nextLine();//empty \n only after nextInt
				if ( choice == 1) {
					System.out.println("Enter the task's new name: ");
					String newTaskName=scan.nextLine();	
					project.renameTask(taskID5, newTaskName);
					System.out.println("The name on task " + taskID5 + " has been edited ");
				}
				
				if ( choice == 2) {
					boolean completed = true;
					project.changeStatus(taskID5, completed);
					System.out.println("The task " + taskID5 + " is completed " );
				}
				
				if ( choice == 3) {
					System.out.println("Enter the task's new due date: ");
					String newDueDate=scan.nextLine();	
					project.changeDueDate(taskID5, newDueDate);
					System.out.println("The task's " + taskID5 + " new Due date is: " + newDueDate);
				}
				controller.editATask(pID5, taskID5);
				System.out.println("\n");
				break;

			case 6:
				//delete a task from a project
				System.out.println("Please choose a project by ID:  ");
				int pID6= scan.nextInt();
				scan.nextLine();//empty \n only after nextInt
				System.out.println("Please enter the task ID of the task you want to remove:   ");
				int taskID= scan.nextInt();
				scan.nextLine();//empty \n only after nextInt
				controller.deleteTaskFromAProject(pID6, taskID);
				System.out.println("The task " + taskID + " has been deleted ");	
				System.out.println("\n");
				break;
				
			case 7:
				//show list of projects 
				
				System.out.println("\n");
				System.out.println("These are your Projects: ");
				controller.showListOfProjects();
				System.out.println("\n");
				System.out.println("\n");
				break;
				
			case 8: 
				//show task list from project 
				System.out.println("Please enter a project ID: ");
				int pID8= scan.nextInt();
				scan.nextLine();//empty \n only after nextInt
			//	controller.showTasksFromProject(pID8);
				System.out.println("These are all the tasks in your chosen project: ");
				//System.out.println(task.toString());
				controller.showTasksFromProject(pID8);
				System.out.println("\n");
				break;
		
			case 0: 
			//Save and quit 
			System.out.println("All changes have been saved!!.....See you soon!!");
			System.out.println("\n");
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

