import java.util.*;
public class Questionsservice {
   
    Questions[] question=new Questions[2];

    String selection[]=new String[2];

    public Questionsservice(){
        // question[0]=new Questions(1,"what is size of int","2","6","4","8","4");
        question[0]=new Questions(1, " DNA Barcoding can be a tool to 1. Assess the age of a plant or animal   2. Distinguish among species that look alike. 3. Identify undesirable animal or plant materials processed foods. ",
        
        "a.1 only","b. 3 only","c. 1 and 2","d. 2 and 3","d");

        question[1]=new Questions(2, ". Recently, scientists observed the merger of giant blackholes\r\n" + //
                        "billions of light years away from the Earth. What is the\r\n" + //
                        "significance of this observation? ",
        
        "(a) Higgs boson particles were detected"," (b) Gravitational waves were detected.","(c) Possibility of intergalactic space travel through\r\n" + //
                        "wormhole was confirmed","(d) It enabled the scientists to understand singularity.","b");

        

       
        // question[1]=new Questions(2,"what is size of double","2","6","4","8","8");
        // question[2]=new Questions(3,"what is size of char","2","6","4","8","2");
        // question[3]=new Questions(4,"what is size of long","2","6","4","8","8");
        // question[4]=new Questions(5,"what is size of boolean","2","1","4","8","1");
        
        
    }
    public void playQuiz(){
        int i=0;
        for(Questions q:question){
        System.out.println("Question no. :"+q.getId());
        System.out.println(q.getQuestions());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());

        Scanner sc=new Scanner(System.in);

        selection[i]=sc.nextLine();
        i++;
        }

        for(String s:selection){
            System.out.println(s);
        } 
    } 
    public void printscore(){
        int score=0;
        
        for(int i=0;i<question.length;i++){
            Questions que=question[i];
            String actualanswer=que.getAnswer();

            String userAnswer=selection[i];

            if(actualanswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("your score is : "+score);
    }

}
