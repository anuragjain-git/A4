import java.util.*;

class Node
{
	protected int regd_no;
    protected float mark;
	protected Node next;
}
public class SingleLinkedList {
	static Scanner sc = new Scanner(System.in);
	static Node start = null;
	public static void create(Node p)
	{
		p = new Node();
		System.out.print("Enter Registration number : ");
		p.regd_no = sc.nextInt();
		System.out.print("Enter Marks : ");
		p.mark = sc.nextFloat();
		p.next = null;
		start = p;
		System.out.print("Want to create more node y/n : ");
		char ch = sc.next().charAt(0);
		while (ch!='n') {
			Node q=new Node();
			System.out.print("Enter Registration number : ");
			q.regd_no = sc.nextInt();
			System.out.print("Enter Marks : ");
			q.mark = sc.nextFloat();
			q.next = null;
			p.next = q;
			p=q;
			System.out.print("Want to create more node y/n : ");
			ch = sc.next().charAt(0);
		}
	}
	public static void display(Node temp)
	{
		while (temp != null) {
		System.out.println("Registration number is "+temp.regd_no+" and mark is "+temp.mark);
		temp=temp.next;
		}
	}
	public static void main(String[] args) {
		int choice;
		while(true) {
			System.out.println("****MENU*****");
			System.out.println("0:Exit");
			System.out.println("1:Create SingleLinkedList");
			System.out.println("2:Display SingleLinkedList");
			System.out.print("Enter the choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 0:
				System.out.println("OVER");
				System.exit(0);
			case 1:
				create(start);
				break;
			case 2:
				display(start);
				break;
			default:
				 System.out.println("Wrong choice");
			}
		}
	}
}

//OUTPUT


//****MENU*****
//0:Exit
//1:Create SingleLinkedList
//2:Display SingleLinkedList
//Enter the choice : 1
//Enter Registration number : 1
//Enter Marks : 87.43
//Want to create more node y/n : n
//****MENU*****
//0:Exit
//1:Create SingleLinkedList
//2:Display SingleLinkedList
//Enter the choice : 2
//Registration number is 1 and mark is 87.43
//****MENU*****
//0:Exit
//1:Create SingleLinkedList
//2:Display SingleLinkedList
//Enter the choice : 0
//OVER