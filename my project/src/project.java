import java.util.Scanner;
//������� �� ������� ������
public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner ToDay = new Scanner(System.in);
		String  Day = Day.concat(str);		
		// String [ ] Days= new String [5] ;
		Days[0] = "�����" ;
		Days[1] = "�������" ;
		Days[2] = "��������" ;
		Days[3] = "��������" ;
		Days[4] = "������" ;
		System.out.println("To Day" + Days);*/
		
		//�������� �� �������� ������ ����� ��� �� ���� ����
		Scanner Calculator = new Scanner(System.in);
		//�������� �� ����� ����� ����
		System.out.println("����� ����� ����");
		int a=Calculator.nextInt();
		//�������� �� ������� ��� ����
		System.out.println("������� ��� ����");
	    String c=Calculator.next();
	    //�������� �� ������ ����� ����
		System.out.println("������ ����� ����");
		int b=Calculator.nextInt();
		//�������� �� ������� ������ ����
		System.out.println(":�� �������");
		
		
		switch (c) {
		//��� ������� ��� + �������� ���� ���
		case "+" : System.out.print(a+b); break;
		//��� ������� ��� - �������� ���� ���
		case "-" : System.out.print(a-b); break;
		//��� ������� ��� * �������� ���� ���
		case "*" : System.out.print(a*b); break;
		//���� ������� ��� / �������� ���� ���
		case "/" : System.out.print(a/b); break;
		//����� ���� ������� ��� % �������� ���� ���
		case "%" : System.out.print(a%b); break;
		//����� ������� ��� ++ �������� ���� ���
		case "++" : System.out.print(a++); break;
		//����� ������� ��� -- �������� ���� ���
	    case "--" : System.out.print(a--); break;
	    //����� ����� ������� ��� av �������� ���� ���
	    case "av" : System.out.print(a+b/2); break;
	    //����� ������� ��� ��� ��� �������� ���� ���
		default : System.out.println("!!!������� ������� ����");
		//for ( error = 0; error<=6;error++); 
		//System.out.print("!!!������� ������� ����");
		
		}
		
		
		
		
		
		
	}

}
