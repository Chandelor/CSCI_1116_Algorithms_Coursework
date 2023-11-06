/**
 * @author Chandelor
 */

package application;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise_21_11 extends Application {
	
	private Map<String, Integer>[] mapForBoy = new HashMap[10];
	private Map<String, Integer>[] mapForGirl = new HashMap[10];
	
	private Button btFindRanking = new Button("Find Ranking");
	private ComboBox<Integer> cboYear = new ComboBox<>();
	private ComboBox<String> cboGender = new ComboBox<>();
	private TextField tfName = new TextField();
	private Label lblResult = new Label();
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws IOException {
		
		sortNames();
		
		GridPane gridPane = new GridPane();
		gridPane.add(new Label("Select a year:"), 0, 0);
		gridPane.add(new Label("Boy or girl?"), 0, 1);
		gridPane.add(new Label("Enter a name:"), 0, 2);
		gridPane.add(cboYear, 1, 0);
		gridPane.add(cboGender, 1, 1);
		gridPane.add(tfName, 1, 2);
		gridPane.add(btFindRanking, 1, 3);
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		  
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(gridPane);
		borderPane.setBottom(lblResult);
		BorderPane.setAlignment(lblResult, Pos.CENTER);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 370, 160);
		primaryStage.setTitle("Exercise_21_11"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
		for (int year = 2001; year <= 2010; year++) {
			cboYear.getItems().add(year);
		}
		
		cboYear.setValue(2001);
		cboGender.getItems().addAll("Male", "Female");
		cboGender.setValue("Male");
		
		btFindRanking.setOnAction(e -> {
			String gender = cboGender.getValue();
			String name = tfName.getText();
			int year = cboYear.getValue() - 2000;
			
			switch (gender) {
				case "Male": lblResult.setText("Boy name " + name + " is ranked #" + mapForBoy[year - 1].get(name) + " in year " + (year + 2000)); break;
				case "Female": lblResult.setText("Girl name " + name + " is ranked #" + mapForGirl[year - 1].get(name) + " in year " + (year + 2000)); break;
			}
				
		});
		
	}

	public void sortNames() throws IOException {
		
		for (int n = 1; n < 11; n++) {
			
			try {
				URL url = new URL("http://liveexample.pearsoncmg.com/data/babynamesranking200" + n + ".txt");
				if (n >= 10 && n < 100) url = new URL("http://liveexample.pearsoncmg.com/data/babynamesranking20" + n + ".txt");
				Scanner input = new Scanner(url.openStream());
				Map<String, Integer> tempBoyMap = new HashMap<>();
				Map<String, Integer> tempGirlMap = new HashMap<>();
				
				while (input.hasNext()) {
					int rank = input.nextInt();
					String boyName = input.next();
					input.nextInt();
					String girlName = input.next();
					input.nextInt();
					
					tempBoyMap.put(boyName, rank);
					tempGirlMap.put(girlName, rank);
				}
				
				mapForBoy[n - 1] = tempBoyMap;
				mapForGirl[n - 1] = tempGirlMap;
			}
			
			catch (MalformedURLException ex) {
				ex.printStackTrace();
			}
			
		}
		
	}
	
	/**
	* The main method is only needed for the IDE with limited
	* JavaFX support. Not needed for running from the command line.
	*/
	public static void main(String[] args) {
		launch(args);
	}

}
