/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formpendaftaranevent;


/**
 *
 * @author MIA
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FormPendaftaranEvent extends Application {
@Override
    public void start(Stage stage) {
      //creating label email
      Text text1 = new Text("Nama");
      //creating label password
      Text text2 = new Text("NIM");
      Text text3 = new Text("Email");
      //Creating Text Filed for email
      TextField textField1 = new TextField();
      //Creating Text Filed for password
      TextField textField2 = new TextField();
      TextArea textArea1 = new TextArea();
      //Creating Buttons

    Button button1 = new Button("Kirim");
    Button button2 = new Button("Keluar");
    
    //Creating a Grid Pane
    GridPane gridPane = new GridPane();
    //Setting size for the pane
    gridPane.setMinSize(800, 400);
    //Setting the padding
    gridPane.setPadding(new Insets(10, 10, 10, 10));
    //Setting the vertical and horizontal gaps between the columns
    gridPane.setVgap(5);
    gridPane.setHgap(5);
    //Setting the Grid alignment
    gridPane.setAlignment(Pos.CENTER);
    //Arranging all the nodes in the grid
    gridPane.add(text1, 0, 0);
    gridPane.add(textField1, 1, 0);
    gridPane.add(text2, 0, 1);
    gridPane.add(textField2, 1, 1);
    gridPane.add(text3, 0, 2);
    gridPane.add(textArea1, 1, 2);
    gridPane.add(button1, 0, 3);
    gridPane.add(button2, 1, 3);

    //Creating a scene object
    Scene scene = new Scene(gridPane);
    //Setting title to the Stage
    stage.setTitle("FormPendaftaran");
    //Adding scene to the stage
    stage.setScene(scene);
    //Displaying the contents of the stage
    stage.show();
    }
    public static void main(String args[]){
    launch(args);
}
}
    