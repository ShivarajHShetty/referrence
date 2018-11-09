import java.util.*;

public class Stack_Working {
	public static void main(String[] args) throws Exception {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		LinkedList<Integer> ll = new LinkedList<Integer>();
		int c;
		for (;;) {
			System.out.println("Enter your choice\n 1:push\n 2:pop\n 3:display\n 4:exit");
			c = sc.nextInt();

			switch (c) {
			case 1:
				ll.push(sc.nextInt());
				break;
			case 2:
				try {
					System.out.println(ll.get(0));
					ll.pop();
					break;

				} catch (IndexOutOfBoundsException e) {
					System.out.println("Stack is empty can't pop\n");
				}

			case 3:
				display(ll);
				break;

			case 4:
				System.exit(0);
				break;
			default:
				break;
			}
		}

	}

	private static void display(LinkedList<Integer> ll) {

		if (ll == null) {
			System.out.println("Stack empty \n");
		} else {
			for (int i = 0; i < ll.size(); i++) {
				System.out.println(ll.get(i) + "\t");
			}
		}
	}

}
