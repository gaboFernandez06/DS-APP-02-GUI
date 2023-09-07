package com.example.githubgameproject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.EventObject;

public class HelloController {
    public static int rand;
    public static int score;
    public static int roundsPlayed;
    public static double accuracy;
    public static int wrong;
    @FXML private Button buttonSubmit;
    @FXML private Label welcomeText;
    @FXML private Label defbox;
    @FXML private Button buttonA;
    @FXML private Button buttonB;
    @FXML private Button buttonC;
    @FXML private Button buttonD;
    @FXML private  Label  wrongLabel;
    @FXML private  Label correctLabel;
    @FXML public  Label accuracyLabel;
    @FXML private ImageView imageView;

    public  void initialize() {
        if (roundsPlayed <= 25) {
            roundsPlayed++;
            welcomeText.setText("Please click which button this  word this definition matches with:");
            defbox.setText("Definition :  ");
                rand = (int) (Math.random() *GameLogic.wordList.size());
                String def = GameLogic.defList2.get(rand);
                String word = GameLogic.wordList2.get(rand);
                String removeWord = GameLogic.wordList.get(rand);
                String modifiedDef = def.replace(removeWord, "________");
                defbox.setText(modifiedDef);
                buttonA.setText(word);
                Shuffle();
            }
        welcomeText.setText("Game Over Thank You ");
        if (accuracy < 70) {
            accuracyLabel.setStyle("-fx-text-fill: red;");
        } else if (accuracy >= 70 && accuracy < 79) {
            accuracyLabel.setStyle("-fx-text-fill: orange;");
        } else if (accuracy >= 80 && accuracy < 89) {
        accuracyLabel.setStyle("-fx-text-fill: blue;");
    }else if (accuracy >= 90 && accuracy <= 100) {
            accuracyLabel.setStyle("-fx-text-fill: green;");
        }
    }
    public void buttonClicked(ActionEvent itemClicked )
    {
        Button buttonClicked= (Button) itemClicked.getSource();
        String buttonText = buttonClicked.getText();
            String currentWord = GameLogic.wordList2.get(rand);
            if (currentWord.equals(buttonText)) {
                GameLogic.defList2.remove(rand);
               GameLogic.wordList.remove(rand);
                GameLogic.defList.remove(rand);
                GameLogic.wordList2.remove(rand);
                ScoreCount();
                defbox.setText((GameLogic.defList.get(rand)));
            } else {
                defbox.setText(GameLogic.defList.get(rand));
                GameLogic.defList2.remove(rand);
                GameLogic.wordList.remove(rand);
                GameLogic.defList.remove(rand);
                GameLogic.wordList2.remove(rand);

                // rand = (int) (Math.random() * GameLogic.wordList.size());
                ScoreWrong();
            }
        initialize();
    }

    public void ScoreCount() {
        score++;
        accuracy=((100.0*score)/ 25);
        correctLabel.setText(String.valueOf(score));
        accuracyLabel.setText(String.valueOf(accuracy));
    }
    public  void ScoreWrong(){
        wrong++;
        wrongLabel.setText(String.valueOf((wrong)));
    }
    private void Shuffle() {
        int rand2 = (int) ((Math.random() *GameLogic.wordList.size()));
        int rand3 = (int) ((Math.random() *GameLogic.wordList.size()));
        int rand4 = (int) ((Math.random() *GameLogic.wordList.size()));
        // if ((rand2 !=(rand) && rand3 !=(rand) && rand4 !=(rand)) && (rand2 != rand3 || rand3 != rand4 || rand2 != rand4))
        // if (((rand < rand2 || rand < rand3 || rand < rand4) && (rand > rand2 || rand > rand3 || rand > rand4)) && (rand2 != rand3 || rand3 != rand4 || rand2 != rand4)) {
        if (((rand != rand2) && (rand != rand3) && (rand != rand4)) && ((rand2 != rand3) && (rand4 != rand3) && (rand2 != rand4))) {
            buttonB.setText(GameLogic.wordList2.get(rand2));
            buttonC.setText(GameLogic.wordList2.get(rand3));
            buttonD.setText(GameLogic.wordList2.get(rand4));
        } else {
            buttonB.setText(GameLogic.wordList2.get((int) ((Math.random() * GameLogic.wordList2.size()))));
            buttonC.setText(GameLogic.wordList2.get((int) ((Math.random() * GameLogic.wordList2.size()))));
            buttonD.setText(GameLogic.wordList2.get((int) ((Math.random() * GameLogic.wordList2.size()))));
        }
    }
}


