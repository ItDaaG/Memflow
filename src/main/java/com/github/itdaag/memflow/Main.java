package com.github.itdaag.memflow;

import com.github.itdaag.memflow.data.Subject;
import com.github.itdaag.memflow.user.User;
import com.github.itdaag.memflow.user.UsersHandler;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public final class Main extends Application {
    private ObservableList<Subject> userModules;
    private ListView<Subject> moduleListView;

    private final UsersHandler usersHandler = new UsersHandler();

    @Override
    public void start(Stage primaryStage) {
        User user = usersHandler.get("Ghuas");
        Label welcomeLabel = new Label("Welcome to Memflow! " + user.getUserName());


        userModules = FXCollections.observableArrayList(user.getSubjects());

        ListView<Subject> moduleListView = new ListView<>(userModules);

        Button addModuleButton = new Button("Add Module");
        addModuleButton.setOnAction(e -> addModuleToUser(user));


        VBox vbox = new VBox(10, welcomeLabel, addModuleButton, moduleListView );
        vbox.setPadding(new Insets(10));

        Scene scene = new Scene(vbox, 600, 600);
        primaryStage.setTitle("Homepage");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addModuleToUser(User user) {
        Stage stage = new Stage();
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));

        TextField moduleInput = new TextField("Enter Module Name");
        Button submitButton = new Button("Submit");

        submitButton.setOnAction(e -> {
            String moduleName = moduleInput.getText();
            Subject module = new Subject(moduleName);
            user.addSubject(module);
            userModules.add(module);
            System.out.println("Module added: " + moduleName);
            stage.close();
        });

        layout.getChildren().addAll(moduleInput, submitButton);
        Scene scene = new Scene(layout, 400, 200);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
