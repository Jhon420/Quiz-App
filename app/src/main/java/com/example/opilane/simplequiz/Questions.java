package com.example.opilane.simplequiz;


public class Questions {
    public String MyQuestions[] = {
        "What are the three colors on the Estonian flag?",
        "What is the current population of Estonia in millions?",
        "Who was the first president of Estonia?",
        "In which year did Estonia, the first time, turn independent and free?",
        "What countries border Estonia?",
        "Which one of these countries is Estonia's most important trade partner?",
        "How long was Estonia occupied by the Soviet Union?",


    };

    public String MyChoices [] [] ={
            {"Blue, yellow, green","Black, blue, white","Blue, black, white","White, black, blue"},
            {"1,278,553","1,352,320","1,595,512","1,258,553"},
            {"Lennart Meri","Jaan Tõnisson","Kersti Kaljulaid","Konstantin Päts"},
            {"1921","1919","1945","1918"},
            {"Russia, Latvia","Latvia, Sweden, Russia, Finland","Russia, Finland, Latvia","Sweden, Finland"},
            {"Finland","Russia","Latvia","Sweden"},
            {"50 years","45 years","40 years","42 years"},
    };

    public String MyCorrectAnswers [] = {
            "Blue, black, white","1,352,320","Konstantin Päts","1919","Russia, Latvia","Finland","50 years"
    };

    public int getLength() {return MyQuestions.length;}

    public String getQuestions(int a) {
        String question = MyQuestions[a];
        return question;
    }

    public String getChoice(int index, int num){
        String choice0=MyChoices[index][num -1];
        return choice0;
    }

    public String getCorrectAnswer (int a){
        String answer = MyCorrectAnswers[a];
        return answer;
    }
}
