package application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
		
		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("C:\\Users\\mperez5\\Documents\\test.dat", true));) 
		{
			
				// Write arrays to the object output stream
				output.writeInt(integers[0]);
				output.writeObject(date);
				output.writeDouble(myDouble);
		}
		
		
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("C:\\Users\\mperez5\\Documents\\test.dat"));)
		{
			
			int outputInt = input.readInt();
			Date date1 = (Date)(input.readObject());
			double outputDouble = input.readDouble();
			
					
			System.out.println("New Test: \nDouble: " + outputDouble + "\nDate: " + date1 + "\nInteger: " + outputInt);
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}

/*
Write a program that stores an array of the five int values 1, 2, 3, 4, and 5, a Date object for the current time, and the double value 5.5 into the file named Exercise17_05.dat.
*/