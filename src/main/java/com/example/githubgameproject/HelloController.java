package com.example.githubgameproject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
public class HelloController {
    @FXML private Label welcomeText;
    @FXML private Label textbox;
    @FXML private Button buttonA;
    @FXML private Button buttonB;
    @FXML private Button buttonC;
    @FXML private Button buttonD;
    @FXML private Button myButton;
    @FXML protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    public  void initialize() {}
    public void buttonClicked(ActionEvent itemClicked )
    {
        Button buttonClicked= (Button) itemClicked.getSource();
        welcomeText.setText(buttonClicked.getText());
    }

}

