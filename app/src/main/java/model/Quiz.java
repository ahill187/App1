package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quiz {
    private Map<Integer, String> answers = new HashMap<>();
    private Map<String, Integer> matches = new HashMap<>();
    private Map<String, QuizMatch> winners = new HashMap<>();
    private List<String> votingSystemList = new ArrayList<>(4);
    private int quizLength = 10;
    public Quiz(){
        Collections.addAll(votingSystemList, "fptp", "dmp", "mmp", "rup");
    }
    public void startQuiz(){

    }

    public void answerQuestion(String answer, int number){
        answers.put(number, answer);
    }

    public void matchVoter(){
        for(int i = 0; i<this.quizLength; i++){
            String answer = this.answers.get(i);

        }
        for(int i = 0; i<4; i++){
            String votingSystem = votingSystemList.get(i);
            int votingSystemScore = matches.get(votingSystem);
            QuizMatch quizMatch = new QuizMatch(votingSystem, votingSystemScore);
            if(i==0){
                winners.put("winner",quizMatch);


            } else {
                if(winners.get("winner").getScore() < votingSystemScore){
                    winners.put("winner", quizMatch);
                } else if(winners.get("winner").equals(quizMatch)){
                    winners.put("winner"+i, quizMatch);
                }
            }
        }
    }

}
