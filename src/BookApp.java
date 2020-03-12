import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		BookDatabase bd=new BookDatabase();
		while(true) {
			System.out.println("1.add book\n2.Remove Book\n3.Search Book\n4.Disply Book");
			System.out.println("Enter your choice:");
			int  num=scan.nextInt();
			switch(num) {
			case 1:
				bd.addBook();
				break;
			case 2:
				bd.remove();
				break;
			case 3:
				bd.search();
				break;
			case 4:
				bd.disply();
				break;
			case 5:
				System.exit(0);

			}
		}
	}

}
