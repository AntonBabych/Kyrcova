import java.util.Scanner;
public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ss s1 = new ss ();
                //���������������� ������� � ss � s1
		Scanner scan = new Scanner(System.in);
		System.out.println("����� ����� ����");
                int r = scan.nextInt();
                //����� �� ������� �� �������� ������
                s1.r = r;
                //³������� ������ � ������
                double Yourss = s1.calcsquare();
			System.out.println("���� ����� ���� " + Yourss);
                //��������� ���������� ���������� �� ��������� ����������
		}
	}
