package UsefulClass;
/**
 * @detail 문자열을 정수로 변환하는 방법
 * abstract Number->wrapper->parseType(str)
 * BufferedReader 는 읽어들일때 무조건 String 임으로 parsing이 필요함.
 */
public class NumberClass {

	public static void main(String[] args) {
		String str = "123";//str은 문자열 123이다. not Int Type
		
		int num = Integer.parseInt(str); //Integer extands Number(abstract) 
		
		System.out.println(num); //123 int type
	}

}
