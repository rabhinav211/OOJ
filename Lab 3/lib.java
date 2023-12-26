
import java.util.Scanner;

class books{
	String author,book;
	int price,numPages;

	books(String book,String author, int price, int numPages){
		this.book=book;
		this.author=author;
		this.price=price;
		this.numPages=numPages;
	}	

	public String toString(){
        return "Book Name:"+this.book+"\n"+"Author:"+this.author+"\n"+"Price:"+this.price+"\n"+"Number of pages:"+this.numPages+"\n";
	}

}



class lib{
	public static void main(String[] args){
		String author,book;
		int price,numPages;
		
		int num_book;

		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter number of books:");
		num_book=input.nextInt();
		System.out.print("\n");

		

		books b[]=new books[num_book];	

		for(int i=0;i<num_book;i++){
			System.out.println("-------------------------\nBook "+(i+1)+"\n--------------------------");
			input.nextLine();
			System.out.print("Enter the name of book:");
			book=input.nextLine();
		
			System.out.print("Enter Authors name:");
			author=input.nextLine();



			System.out.print("Enter the price:");
			price=input.nextInt();

			System.out.print("Enter the number of pages:");
			numPages=input.nextInt();
            
			b[i]=new books(book,author,price,numPages);		
				

		}

		for(int i=0;i<num_book;i++){
			System.out.println("--------------------\nBook "+(i+1)+" details\n----------------------");
			
			String a=b[i].toString();
			System.out.println(a);
		
		}
		
	}
}