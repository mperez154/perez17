package application;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

import javafx.application.Application;
import javafx.stage.Stage;

public class Assignment_17_5 extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException, ClassNotFoundException {
		int[] integers = {1,2,3,4,5};
		Date date = new Date();
		double myDouble = 5.5;
		
		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("C:\\Users\\mperez5\\Documents\\Exercise17_05.dat", true));) 
		{
			
				// Write arrays to the object output stream
				output.writeObject(integers);
				output.writeObject(date);
				output.writeDouble(myDouble);
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}