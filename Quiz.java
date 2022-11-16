import java.util.Scanner;

public class Quiz 
{
	private Question[]Q;
	
	
	void result()
	{
		int score=0;
		int c=0;
		for(int i=0;i<Q.length;i++)
		{
			if(Q[i].getYourAns()==Q[i].getRightAns())
			{
				score++;
				c++;
			}
			else
				score--;
		}
		System.out.println("Score : "+score);
		System.out.println("Total right answers : "+c);
	}
	
	void readQuiz()
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("No of questions ");
		int n=sc.nextInt();
		
		Q=new Question[n];
		for(int i=0;i<Q.length;i++)
		{
			Q[i]=new Question();
			Q[i].readQuestion();
		}
	}
	
	void startQuiz()
	{
		for(int i=0;i<Q.length;i++)
			Q[i].showQuestion();
		
	}
	public static void main(String[] args) 
	{
		Quiz quiz=new Quiz();
		quiz.readQuiz();
		quiz.startQuiz();
		quiz.result();
	}
}

