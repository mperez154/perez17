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
		// Variables to write to file
		int[] integers = { 1, 2, 3, 4, 5 };
		Date date = new Date();
		double myDouble = 5.5;

		// Open/create file and write to it
		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_05.dat", true));) {

			// Write arrays to the object output stream
			output.writeObject(integers);
			output.writeObject(date);
			output.writeDouble(myDouble);
			// This code worked without the close method, but the book says to use it to avoid resource leaks
			output.close();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}