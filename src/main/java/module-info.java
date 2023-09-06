module com.example.githubgameproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.githubgameproject to javafx.fxml;
    exports com.example.githubgameproject;
}