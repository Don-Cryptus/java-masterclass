package com.musicui;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.musicui.model.*;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main.fxml"));
        Parent root = fxmlLoader.load();
        Controller controller = fxmlLoader.getController();
        controller.listArtists();

        stage.setTitle("Music Database");
        stage.setScene(new Scene(root, 800, 600));
        stage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();
        if(!Datasource.getInstance().open()) {
            System.out.println("FATAL ERROR: Couldn't connect to database");
            Platform.exit();
        }
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        Datasource.getInstance().close();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
