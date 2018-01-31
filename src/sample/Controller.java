package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    private Text speechTopic;

    @FXML
    private Button generateButton;

    Random diceRoll = new Random();

    ArrayList<String> questions = new ArrayList<>();




        @Override
        public void initialize (URL location, ResourceBundle resources){
            addQuestions();
        }

        private void addQuestions () {
            questions.add("Who is somebody you look up to and why?");
            questions.add("Talk about a blind date experience.");
            questions.add("What is your favorite movie and why?");
            questions.add("Talk about the best trip you ever took.");
            questions.add("Talk about your favorite memory of grandma's house.");
            questions.add("Talk about a famous person you have met.");
            questions.add("Talk about your first car you ever owned.");
            questions.add("What is the most proud moment in your life so far.");
            questions.add("If you won the lottery, what would be the first thing you bought and why?");
            questions.add("Are you a dog or cat person and why.");
            questions.add("Talk about the most embarrassing moment you have experienced.");
            questions.add("If you could go anywhere in the world, where would it be and why?");
            questions.add("Tell us about your best or worst vacation ever.");
            questions.add("Give us three famous persons, living or dead, that you'd like to have a dinner party with and why them?");
            questions.add("What was one thing that you got away with as a teenager that your parents never knew?");
            questions.add("Crunchy or creamy peanut butter? Why?");
            questions.add("Tell us about a Homeowner/Renter nightmare.");
        }

    public void hitGenerateButton(ActionEvent actionEvent) {

            int randomQuestion = diceRoll.nextInt(17);
            speechTopic.setText(questions.get(randomQuestion));


    }
    }
