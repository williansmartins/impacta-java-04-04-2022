package br.com.impacta.java;

import br.com.impacta.java.dao.DAOException;
import br.com.impacta.java.dao.FuncionarioDAO;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Tela extends Application{
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void start(Stage stage) throws Exception {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");

        Button button = new Button("Click");
        button.setOnAction(value ->  {
//            button.setText("Clicked!");
        	try {
				System.out.println(new FuncionarioDAO().findByName("luis"));
			} catch (DAOException e) {
				e.printStackTrace();
			}
        });
        
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(button), 640, 480);
        

        stage.setScene(scene);
        stage.show();
    }
}
