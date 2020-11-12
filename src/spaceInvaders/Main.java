package spaceInvaders;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("space_invaders.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("GameOver1P.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("GameOver2P.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("Highscore.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("Home_Screen.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("Instructions.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("Start_Screen.fxml"));
        primaryStage.setTitle("Space Invaders 2020");
        primaryStage.setScene(new Scene(root, 900, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
