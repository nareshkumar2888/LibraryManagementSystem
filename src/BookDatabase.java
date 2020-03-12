import java.util.*;

public class BookDatabase {

	List<Book> l=new ArrayList<Book>();
	Scanner scan=new Scanner(System.in);
	Book b=null;
	public boolean addBook() {
		
		System.out.println("Enter Book Name:");
		String bName=scan.next();
		scan.nextLine();

		System.out.println("Enter Author Name:");
		String aName=scan.next();
		scan.nextLine();
		
		System.out.println("Enter Book Price:");
		double price=scan.nextDouble();
		b=new Book(bName,aName,price);
		l.add(b);

		return false;
		
	}
	
	public void remove() {
		System.out.println("Enter Book Name");
		String name=scan.next();
		for(int i=0;i<l.size();i++) {
			if(l.get(i).getBookName().equalsIgnoreCase(name)) {
				l.remove(l.get(i));
			}
		}
		
	}
	
	public void search() {
		System.out.println("1.Search by bookName\n2.Search by AuthorName");
		System.out.println("Enter Your choice:");
		int i=scan.nextInt();
		switch(i) {
		case 1:
			searchBookName();
			break;
		case 2:
			searchAuthorName();
			
			break;
		}
	}
	
	public void disply() {
		System.out.println("bookName \t\t authorName \t\t price ");
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
	}
	
	public void searchAuthorName() {
		System.out.println("Enter Author Name:");
		String name=scan.next();
		for(int i=0;i<l.size();i++) {
			if(l.get(i).getAuthorName().equalsIgnoreCase(name)) {
				System.out.println(l.get(i));
			}
		}
	}
	
	public void searchBookName() {
		System.out.println("Enter Book Name:");
		String name=scan.next();
		for(int i=0;i<l.size();i++) {
			if(l.get(i).getBookName().equalsIgnoreCase(name)) {
				System.out.println(l.get(i));
			}
		}
		
	}
}
