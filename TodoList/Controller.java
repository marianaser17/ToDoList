package TodoList;

public class Controller {

	ProjectReg projectReg = new ProjectReg();
	private iohandler iohandler= new iohandler();
	

	public void addProject(String pName) {
		
		projectReg.addNewProject(pName);
		iohandler.writeToFile(projectReg);
	}

	public void removeProject(int pID) {
		
		projectReg.removeAProject(pID);
		iohandler.writeToFile(projectReg);	
	}
	
	public void renameAProject(int pID, String newName) {
		
		projectReg.RenameAProject(pID, newName);
		iohandler.writeToFile(projectReg);
	}
	
	public void showListOfProjects() {
		
		projectReg.showProjects();
	}
	
	public void showTasksFromProject(int pID) {
		
		projectReg.showTasksFromProject(pID);	
	}
	
	public void addTaskToAProject(int pID, String description, String dueDate) {
		
		projectReg.addNewTask(pID, description, dueDate);
		iohandler.writeToFile(projectReg);
	}
	
	public void deleteTaskFromAProject(int pID, int taskID) {
	
		projectReg.deleteTaskFromProject(pID, taskID);
		iohandler.writeToFile(projectReg);	
	}
	
	public void editATask(int pID, int taskID) {
		
		projectReg.editATask(pID, taskID);
		iohandler.writeToFile(projectReg);	
	}
}


