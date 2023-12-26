import java.util.Scanner;


class student{
	String usn,name;
	int n;
	String subject[]=new String[10];
	int credits[]=new int[10];
	int marks[]=new int[10];
	
		
	void read(){
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter your name:");
		name=input.nextLine();
		
		System.out.print("\n");
		System.out.print("Enter your USN:");
		usn=input.nextLine();
		System.out.print("\n");

		System.out.print("Enter number of subjects:");
		n=input.nextInt();

		input.nextLine();

		
		System.out.print("\n");
		for(int i=0;i<n;i++){
			System.out.println("---------------------");
			System.out.print("Enter subject:");
			subject[i]=input.nextLine();
			
			System.out.print("\n");

			System.out.print("Enter credits:");
			credits[i]=input.nextInt();

			System.out.print("\n");
			
			System.out.print("Enter Marks:");
			marks[i]=input.nextInt();


			System.out.print("\n");
			System.out.println("---------------------");
			input.nextLine();
			

		}
		
	
	}

	void display(){
		

		
		System.out.println("-------------------------------------------");

		System.out.println("Name:"+name);
		System.out.println("USN:"+usn+"\n");
		
		System.out.println("Subject\tCredits\tMarks");
		System.out.println("---------------------");
		for(int i=0;i<n;i++){
		
			System.out.println(subject[i]+"\t"+credits[i]+"\t"+marks[i]);
		}
		System.out.println("--------------------------------------------");
	}
	
	int grade(int a){
		
		while(a/10!=0){
			a=a/10;
		}
		if((a+1)>5){
			return (a+1);
		}
		else if((a+1)==5){	
			return a;
		}
		else{return 0;}
	
	}

	void calculate(){
		
		int total_credits=0;
		int marks_credits=0;

		
		for(int i=0;i<n;i++){
		
			total_credits+=credits[i];
			marks_credits+=grade(marks[i])*credits[i];
		
		}
		
		System.out.println("SGPA is "+(double)marks_credits/total_credits); 
	}
}

class marks{
	public static void main(String[] args){
	
	student calc= new student();
	calc.read();
	calc.display();
	calc.calculate();

	}
}