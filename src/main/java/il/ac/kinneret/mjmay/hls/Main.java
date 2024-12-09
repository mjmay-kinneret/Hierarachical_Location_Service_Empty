package il.ac.kinneret.mjmay.hls;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Main.class.getResource("hls.fxml"));
        primaryStage.setTitle("Hierarchical Location Client");
        primaryStage.getIcons().add(new Image("file:./hls.png"));
        primaryStage.setScene(new Scene(root, 632, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
