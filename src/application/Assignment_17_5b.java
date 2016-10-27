package application;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Assignment_17_5b extends Application {
	
	protected TextArea taResults = new TextArea();
	
	protected BorderPane getPane() throws IOException, Exception {		

		// Create variables and required fields
		HBox paneForButton = new HBox(20);
		Button btSubmit = new Button("Show Data");
		
		// Initialize and create parameters for fields
		paneForButton.getChildren().addAll(btSubmit);
		paneForButton.setAlignment(Pos.CENTER_LEFT);
		paneForButton.setPadding(new Insets(5, 3, 5, 3));
		paneForButton.setStyle("-fx-border-color: black");
		
		// Create a main pane
		BorderPane pane = new BorderPane();
		pane.setTop(paneForButton);

		// Create a pane setLeft for the interest rate column
		Pane paneForDataFromFile = new Pane();
		// paneForResults.setMinWidth(150);
		paneForDataFromFile.getChildren().add(taResults);
		pane.setLeft(paneForDataFromFile);

		// Show Table button setOnAction event
		btSubmit.setOnAction(e -> {
			
			try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("C:\\Users\\mperez5\\Documents\\Exercise17_05.dat"));)
			{
				int[] arrayFromFile = (int[])(input.readObject());
				Date date1 = (Date)(input.readObject());
				double doubleFromFile = input.readDouble();
				taResults.clear();	//clears any text previously added
				taResults.appendText("Array Values:\n");
				for(int i = 0; i < arrayFromFile.length; i++)
				{
					taResults.appendText(Integer.toString(arrayFromFile[i]));
					taResults.appendText("\n");
				}
				taResults.appendText("\n");
				taResults.appendText("Date value from file:\n");
				taResults.appendText(String.valueOf(date1));
				taResults.appendText("\n\n");
				taResults.appendText("Double value from file:\n");
				taResults.appendText(Double.toString(doubleFromFile));
				taResults.appendText("\n");
			}
			catch(Exception ex)
			{
				System.out.println("Did not work as expected");
			}
		});

		return pane;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
			
		Scene scene = new Scene(getPane());
		primaryStage.setTitle("Assignment_17_5"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
