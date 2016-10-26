package application;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

import javafx.application.Application;
import javafx.stage.Stage;

public class Assignment_17_5b extends Application {

	@Override
	public void start(Stage primaryStage) throws ClassNotFoundException, IOException {
		
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("C:\\Users\\mperez5\\Documents\\Exercise17_05.dat"));)
		{
			int[] newNumbers = (int[])(input.readObject());
			Date date1 = (Date)(input.readObject());
			double outputDouble = input.readDouble();
			for(int i = 0; i < newNumbers.length; i++)
			{
				System.out.println("Array: " + newNumbers[i]);
			}
			System.out.println(date1);
			System.out.println(outputDouble);
			
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
