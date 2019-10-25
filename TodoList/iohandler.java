package TodoList;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class iohandler {
	
	public void writeToFile(ProjectReg projectReg) {

		try {
			FileOutputStream f = new FileOutputStream(new File("MyFile.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// write objects to file
			for (Project aProject : projectReg.getProjectList()) {
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

	public ProjectReg readFromFile() {
		ProjectReg projectReg = new ProjectReg();
		try {
			FileInputStream fi = new FileInputStream(new File("MyFile.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);

			// read objects from file
			Project p = (Project) oi.readObject();

			while (p != null) {
				projectReg.addProject(p);
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

		return projectReg;
	}
}
