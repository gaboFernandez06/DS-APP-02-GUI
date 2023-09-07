package com.example.githubgameproject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
public class HelloController {
    public static int rand;
    public static int score;
    public static int roundsPlayed;
    public static int wrong;
    @FXML private Label welcomeText;
    @FXML private Label defbox;
    @FXML private Button buttonA;
    @FXML private Button buttonB;
    @FXML private Button buttonC;
    @FXML private Button buttonD;
    @FXML private  Label  wrongLabel;
    @FXML private  Label correctLabel;
    @FXML private  Label accuracyLabel;
    public  void initialize() {
        if ( roundsPlayed <= 25) {
            roundsPlayed++;
            welcomeText.setText("Please click which button this  word this definition matches with:");
            defbox.setText("Definition :  ");
            rand = (int) ((Math.random() * GameLogic.wordList.size()));
            String def = GameLogic.defList.get(rand);
            String word = GameLogic.wordList.get(rand);
            String modifiedDef = def.replace(word,"________");
            defbox.setText(modifiedDef);
            buttonA.setText(word);
            Shuffle();
        }else {welcomeText.setText("Game Oover");}
    }
    public void buttonClicked(ActionEvent itemClicked )
    {
     //   GameLogic gameLogic = new GameLogic();
        Button buttonClicked= (Button) itemClicked.getSource();
        String buttonText = buttonClicked.getText();
        String currentWord = GameLogic.wordList.get(rand);
        if (currentWord.equals(buttonText)){
            GameLogic.wordList.remove(rand);
            GameLogic.defList.remove(rand);
            ScoreCount();
            initialize();
        } else {
            GameLogic.wordList.remove(rand);
            GameLogic.defList.remove(rand);
            ScoreWrong();
            initialize();
            //What to do when incorrect
        }
        }
    public void ScoreCount() {
        score++;
        correctLabel.setText(String.valueOf(score));
        accuracyLabel.setText(String.valueOf(((100.0*score)/ 25)));
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
            buttonB.setText(GameLogic.wordList.get(rand2));
            buttonC.setText(GameLogic.wordList.get(rand3));
            buttonD.setText(GameLogic.wordList.get(rand4));
        } else {
            buttonB.setText(GameLogic.wordList2.get((int) ((Math.random() * GameLogic.wordList2.size()))));
            buttonC.setText(GameLogic.wordList2.get((int) ((Math.random() * GameLogic.wordList2.size()))));
            buttonD.setText(GameLogic.wordList2.get((int) ((Math.random() * GameLogic.wordList2.size()))));
        }
    }
}

