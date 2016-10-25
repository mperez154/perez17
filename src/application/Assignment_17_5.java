package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import javafx.application.Application;
import javafx.stage.Stage;

public class Assignment_17_5 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		int[] integers = {1,2,3,4,5};
		Date date = new Date();
		double myDouble = 5.5;
		
		//FileInputStream input = new FileInputStream("C:\\Users\\mperez5\\Documents\\test.dat");
		//FileOutputStream output = new FileOutputStream("C:\\Users\\mperez5\\Documents\\test.dat");
		
		for(int i = 0; i < integers.length; i++)
		{
			System.out.println("Location " + i + ": " + integers[i]);
		}
		System.out.println("Date: " + date.getTime());
		System.out.println("My Double: " + myDouble);
		
		//testing to see if import worked
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}

/*
Write a program that stores an array of the five int values 1, 2, 3, 4, and 5, a Date object for the current time, and the double value 5.5 into the file named Exercise17_05.dat.
*/