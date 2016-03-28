import java.util.Scanner;
public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ss s1 = new ss ();
		Scanner scan = new Scanner(System.in);
		System.out.println("Ведіть радіус кола");
        int r = scan.nextInt();
        s1.r = r ;
	 double Yourss = s1.calcsquare();
			System.out.println("Ваша площа кола " + Yourss);
		}
	}


