package com.handen.saimmot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("/sample.fxml"));;
        primaryStage.setTitle("LR1");
        primaryStage.setScene(new Scene(loader.load(), 645, 475));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}