package TodoList;

public class Controller {

	private ProjectReg projectReg;
	private iohandler iohandler = new iohandler();
	
	public void readFromFile() {
		projectReg=iohandler.readFromFile();
	}
	
	public void writeToFile() {
		iohandler.writeToFile(projectReg);
	}

	public void addProject(String pName) {
		
		projectReg.addNewProject(pName);
		//iohandler.writeToFile(projectReg);
		
	}

	public void removeProject(int pID) {
		
		projectReg.removeAProject(pID);
		//iohandler.writeToFile(projectReg);
			
	}
	
	public void renameAProject(int pID, String newName) {
		
		projectReg.RenameAProject(pID, newName);
		//iohandler.writeToFile(projectReg);
		
	}
	
	public void showListOfProjects() {
		
		projectReg.showProjects();
	}
	
	public String showTasksFromProject(int pID) {
		
	return projectReg.toString();
	
	}
	
	public void addTaskToAProject(int pID, String description, String dueDate) {
		
		projectReg.addNewTask(pID, description, dueDate);
		//iohandler.writeToFile(projectReg);
	}
	
	public void deleteTaskFromAProject(int pID, int taskID) {
	
		projectReg.deleteTaskFromProject(pID, taskID);
		//iohandler.writeToFile(projectReg);
	}
	
	public void editATask(int pID, int taskID) {
		
		projectReg.editATask(pID, taskID);
		//iohandler.writeToFile(projectReg);
	}
	
	public void findTask(int taskID) {
		
		projectReg.findATask(taskID);
	}
	public void newTaskName(int taskID, String newTaskName) {
		
		projectReg.renameATask(taskID, newTaskName);
	}
	
	public void changeStatus(int taskID, boolean done) {
		
		projectReg.changeStatus(taskID, true);
	}

	public void changeDueDate(int taskID, String newDueDate) {
		
		projectReg.changeDueDate(taskID, newDueDate);;
	}
}


