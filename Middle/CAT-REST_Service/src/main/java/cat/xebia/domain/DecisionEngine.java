package cat.xebia.domain;

import java.util.Scanner;

public class DecisionEngine extends decision {

	static int num_level,questions_level,num_students,Min_Ques_To_Attempt,Current_Level,min_pass_marks,total_num_categories,i,T;
	static String a="";
	static String UUID="#exam@";
	static int[] theta;
	static int marks_level[];
	static String QB[][]={{"a","b"},{"c","d"},{"e","f"},{"g","h"},{"i","j"}};// question bank
	static String AB[][]={{"A","B"},{"C","D"},{"E","F"},{"G","H"},{"I","J"}};//answer bank
	static double FR[];
	static int marks_student[];
	static int num_correct_questions[];
	static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number of levels:");
		num_level=sc.nextInt();//number of levels
		
		System.out.println("Enter the number of questions at a particular level");
		questions_level=sc.nextInt();//number of questions per level
		
		System.out.println("Enter total number of categories:");
		total_num_categories=sc.nextInt();//total categories
		
		System.out.println("Enter the number of students:");
		num_students=sc.nextInt();//number of students appearing for the test
		
		System.out.println("Enter the number of questions a student has to answer:");
		Min_Ques_To_Attempt=sc.nextInt();//minimum number of questions to attempt 
		
		
		theta=new int[num_level];//decision factor with respect to every level
		
		//every question of a particular level hold same number of marks
		
		marks_level= new int[num_level];//to store marks per question with respect to a level
		
		Current_Level=num_level/2;//to keep track of a level 
		
		System.out.println("Enter the minimum passing marks for a student:");
		min_pass_marks=sc.nextInt();
		
		//QB= new String [num_level][questions_level];//question bank where l is the number of levels and ql is the number of questions per level
		//AB= new String [num_level][questions_level];//answer bank where l is the number of levels and ql is the number of answers per level
		
		FR=new double [num_students];//to store the final result and decide the ranking of a student
		
		
		marks_student=new int[num_students];//to store marks scored by a student
		num_correct_questions=new int[num_students];//to store number of correct questions per student
		
	//function calls
		
	input();
	calculate();
	results();
		
}//main
	
	
	public static void input()
	{
		
			System.out.println("Enter the number of marks per question with respect to a level:");
				
				for(int z=0;z<num_level;++z)
				{
					marks_level[z]=sc.nextInt();
				}
	}//input
	
	
	public static void calculate()
	{
		T=0;//to keep track of the number of questions answered
		
		//String categories[]={"A","B","C","D","E","F"};
		
		//String categories_display[]={"A","C","E"};//categories from which the questions will be asked
		
		//int p=0;
		
		
		
		for(i=0;i<num_students;++i)// iterate over the number of students
		{
			while(T!=Min_Ques_To_Attempt||min_pass_marks<=marks_student[i])// to iterate over the number of questions answered
			{
				for(int j=0;j<questions_level;++j)
				{
					/*if(p>total_num_categories)
					{
						p=0;
					}*/
					
					//to prevent repetition of a question of the same category
					//if(j!=0 && categories[p]!=categories[p-1]&&(categories[p]=="A"||categories[p]=="C"||categories[p]=="E")) 
					{
					System.out.println(QB[Current_Level][j]);
					System.out.println("your answer:");
					a=sc.next();
					if(a==AB[Current_Level][j])
					{
						marks_student[i]=marks_student[i]+marks_level[Current_Level];//marks add up
						num_correct_questions[i]=++num_correct_questions[i];
						++theta[Current_Level];
					}//inner if
					
					else{
						--theta[Current_Level];
					}//inner else
					
					++T;
					
					}// outer if
					
					//else
						continue;
					
					//++p;
					
				}//j
				
				if(theta[Current_Level]<5)
				{
					--Current_Level;//decrease in level
				}
				else if (theta[Current_Level]>=7)
				{
				++Current_Level;//increase in level
				}
				
			}//while
		
			FR[i]=marks_student[i]/num_correct_questions[i];// calculating final result of a student
		
	}//i
	}//calculate
	
	
	//displaying results after the exam
	
	public static void results()
	{
		
		
				for(int x=0;x<num_students;++x)
				{
					System.out.print(UUID+"0"+"x");
					if(min_pass_marks<=marks_student[x])
					{
						System.out.print("PASS\t");
					}
					else{
						System.out.print("FAIL\t");
					}
					System.out.println(FR[x]);
				}//x

	}//results


	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class
