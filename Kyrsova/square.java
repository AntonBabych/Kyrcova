import java.util.Scanner;
public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ss s1 = new ss ();
                //Перенайменування підкласу з ss в s1
		Scanner scan = new Scanner(System.in);
		System.out.println("Ведіть радіус кола");
                int r = scan.nextInt();
                //Запит на введеня та введення радіусу
                s1.r = r;
                //Відправка радіусу в підклас
                double Yourss = s1.calcsquare();
			System.out.println("Ваша площа кола " + Yourss);
                //Отримання результату обчислення та виведення результату
		}
	}
