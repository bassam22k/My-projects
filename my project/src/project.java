import java.util.Scanner;
//ÇáãßÊÈÉ ãä ÇáÓßÇäÑ äÓÊÏÚí
public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner ToDay = new Scanner(System.in);
		String  Day = Day.concat(str);		
		// String [ ] Days= new String [5] ;
		Days[0] = "ÇáÃÍÏ" ;
		Days[1] = "ÇáÅËäíä" ;
		Days[2] = "ÇáËáÇËÇÁ" ;
		Days[3] = "ÇáÅÑÈÚÇÁ" ;
		Days[4] = "ÇáÎãíÓ" ;
		System.out.println("To Day" + Days);*/
		
		//ÇáãÓÊÎÏã ãä ÇáãÏÎáÇÊ áŞÑÇÁÉ ÓßÇäÑ äæÚ ãä ßÇÆä ÇäÔÆ
		Scanner Calculator = new Scanner(System.in);
		//ÇáãÏÎáÇÊ ãä ÇáÃæá ÇáÚÏÏ ÃŞÑÃ
		System.out.println("ÇáÃæá ÇáÚÏÏ ÃÏÎá");
		int a=Calculator.nextInt();
		//ÇáãÏÎáÇÊ ãä ÇáÚãáíÉ äæÚ ÃŞÑÃ
		System.out.println("ÇáÚãáíÉ äæÚ ÃÏÎá");
	    String c=Calculator.next();
	    //ÇáãÏÎáÇÊ ãä ÇáËÇäí ÇáÚÏÏ ÃŞÑÃ
		System.out.println("ÇáËÇäí ÇáÚÏÏ ÃÏÎá");
		int b=Calculator.nextInt();
		//ÇáãÏÎáÇÊ ãä ÇáäåÇÆí ÇáäÇÊÌ ÅØÈÚ
		System.out.println(":åí ÇáÅÌÇÈÉ");
		
		
		switch (c) {
		//ÌãÚ ÇáÚãáíÉ İÅä + ÇáãÓÊÎÏã ÃÏÎá ÅĞÇ
		case "+" : System.out.print(a+b); break;
		//ØÑÍ ÇáÚãáíÉ İÅä - ÇáãÓÊÎÏã ÃÏÎá ÅĞÇ
		case "-" : System.out.print(a-b); break;
		//ÖÑÈ ÇáÚãáíÉ İÅä * ÇáãÓÊÎÏã ÃÏÎá ÅĞÇ
		case "*" : System.out.print(a*b); break;
		//ŞÓãÉ ÇáÚãáíÉ İÅä / ÇáãÓÊÎÏã ÃÏÎá ÅĞÇ
		case "/" : System.out.print(a/b); break;
		//ãÆæíÉ äÓÈÉ ÇáÚãáíÉ İÅä % ÇáãÓÊÎÏã ÃÏÎá ÅĞÇ
		case "%" : System.out.print(a%b); break;
		//ÊÒÇíÏ ÇáÚãáíÉ İÅä ++ ÇáãÓÊÎÏã ÃÏÎá ÅĞÇ
		case "++" : System.out.print(a++); break;
		//ÊäÇŞÕ ÇáÚãáíÉ İÅä -- ÇáãÓÊÎÏã ÃÏÎá ÅĞÇ
	    case "--" : System.out.print(a--); break;
	    //ÍÓÇÈí ãÊæÓØ ÇáÚãáíÉ İÅä av ÇáãÓÊÎÏã ÃÏÎá ÅĞÇ
	    case "av" : System.out.print(a+b/2); break;
	    //ãáÛÇå ÇáÚãáíÉ İÅä Ğáß ÛíÑ ÇáãÓÊÎÏã ÃÏÎá ÅĞÇ
		default : System.out.println("!!!ÇáÕÍíÍÉ ÇáÚãáíÉ ÃÏÎá");
		//for ( error = 0; error<=6;error++); 
		//System.out.print("!!!ÇáÕÍíÍÉ ÇáÚãáíÉ ÃÏÎá");
		
		}
		
		
		
		
		
		
	}

}
