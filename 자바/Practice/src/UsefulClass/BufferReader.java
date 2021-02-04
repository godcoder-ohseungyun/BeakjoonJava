package UsefulClass;
import java.io.*;


public class BufferReader {

	public static void main(String[] args) {
		try { //예외처리 필수
			
			BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter af = new BufferedWriter(new OutputStreamWriter(System.out));
			
			
			
			String str = bf.readLine(); //엔터만 종료 조건으로 받아들임
			
			af.write(str+"\n"); //자동개행 없음 //af.newLine()//개행역할
			
			af.flush();//사용후 잔 데이터 모두 출력
			af.close();//스트림 닫음
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
