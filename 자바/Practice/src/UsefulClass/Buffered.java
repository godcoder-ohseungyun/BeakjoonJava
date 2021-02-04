package UsefulClass;
import java.io.*;
import java.util.StringTokenizer;



public class Buffered {

	public static void main(String[] args) throws IOException { //보통 throws 예외처리함
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String s = bf.readLine();	//String으로 고졍됨
		
		int i = Integer.parseInt(s);	//다른 값을 원하면 형변환 필수적
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(s); //출력은 무조건 string타입 임 (수 type을 넣으면 Ascii로 해석)
		
		
		StringTokenizer st = new StringTokenizer(s," ",true); //s를 " "를 기준으로 나누고 " "도 토큰에 포함(default: false)
		
		String token = st.nextToken(); //sting 반환
		
		
		
		bw.newLine(); //줄바꿈
		bw.flush();   //남은데이터 제거
		bw.close();	  //버퍼 닫음
		
		
	}

}

