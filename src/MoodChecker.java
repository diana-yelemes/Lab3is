import java.util.*;
public class MoodChecker
{
    public static void main(String[] args)
    {
        System.out.print("Enter a text: ");
        Scanner sc= new Scanner(System.in);
        String text= sc.nextLine();
        nlpPipeline.init();
        nlpPipeline.estimatingSentiment(text);
    }
}