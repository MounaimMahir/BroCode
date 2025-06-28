import java.sql.SQLOutput;
import java.util.Scanner;

public class QuizGame {

    public String answer;

   public int choiceQuestion;

    public static int counter = 0;

    boolean done = true;
    static Scanner scanner = new Scanner(System.in);


    public void setQuestion_1() {
        scanner.nextLine();
        String[] question_1 = new String[]{"Venus", "Mars", "Jupiter", "Mercury"};

                System.out.println("1️⃣ Question: Which planet is known as the Red Planet?");
        for (int i = 0; i < question_1.length; i++) {
            System.out.println(" ");
            System.out.println(question_1[i]);

        }
        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase(question_1[1])) {
            System.out.println("Good answer");
            counter++;
        } else {
            System.out.println("Wrong, answer was " + question_1[1]);
        }
    }

        public void setQuestion_2 () {
            scanner.nextLine();

String [] question_2 = new String []{"Charles Dickens","Jane Austen","William Shakespeare","Mark Twain"};
                      System.out.println("2️⃣ Question: Who wrote the play “Romeo and Juliet”?");
            for (int i = 0; i < question_2.length; i++) {
                System.out.println(question_2[i]);

            }
             answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(question_2[2])) {
                System.out.println("Good answer");
                counter++;
            } else {
                System.out.println("Wrong, answer was " + question_2[2]);
            }
        }

        public void setQuestion_3(){
            scanner.nextLine();
        String [] question_3 = new String[]{"Atlantic Ocean","Indian Ocean","Arctic Ocean", "Pacific Ocean"};
            System.out.println("️3️⃣ Question: What is the largest ocean on Earth?");
            //3️⃣ Question: What is the largest ocean on Earth?
           //         A) Atlantic Ocean
         //   B) Indian Ocean
          //  C) Arctic Ocean
          //  D) Pacific Ocean ✅
            for (int i = 0; i < question_3.length; i++) {
                System.out.println(question_3[i]);
        }
            System.out.println(" ");
             answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(question_3[3])) {
                System.out.println("Good answer");
                counter++;
            } else {
                System.out.println("Wrong, answer was " + question_3[3]);
            }}

        public void setQuestion_4(){
            scanner.nextLine();
        String[] question_4 = new String[]{"Gold","Oxygen","Iron","Silver"};
            System.out.println("4️⃣ Question: Which element has the chemical symbol “O”?");
           /* Question: Which element has the chemical symbol “O”?
            A) Gold
            B) Oxygen ✅
            C) Iron
            D) Silver*/
            for (int i = 0; i < question_4.length; i++) {
                System.out.println(question_4[i]);
            }
                answer = scanner.nextLine();
                if (answer.equalsIgnoreCase(question_4[1])) {
                    System.out.println("Good answer");
                    counter++;
                } else {
                    System.out.println("Wrong, answer was " + question_4[1]);
                }
        }


        public void questions () {


while (done){

    System.out.println("Choice a question ect:  1,2,3...");
    String[] questions = new String[]{"Planet","Romeo and Juliet","Ocean","chemical symbol","Quit"};
    for (String printQuestions: questions){
        System.out.println(printQuestions);
    }
    choiceQuestion = scanner.nextInt();

    switch (choiceQuestion){
        case 1: setQuestion_1();break;
        case 2: setQuestion_2();break;
        case 3: setQuestion_3();break;
        case 4: setQuestion_4();break;
        case 5: done = false;break;
        default:
            System.out.println("not valid option");
    }



}

            System.out.println(" your score is " + counter +"/4");
            System.out.println("thanks for playing");
    }

    public static void main(String[] args) {
        QuizGame quizGame = new QuizGame();
        quizGame.questions();
    }

}