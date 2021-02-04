package UsefulClass;
/**
 * @detail Random Class 에 관하여 알아보자(기본 메소드 위주로 추가적인건 API참고)
 * math.random과 달리 seed값을 지정할수있다는게 특징
 * 정수 메소드는 범위 설정과 정수범주를 갖지만, 실수 메소드는 0.0~<1.0의 범위만 나타낼수있다.
 * Math.Random,rand.nextInt(1),.nextDouble() // from 이상 ~ to "미만"임
 */
import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		Random rand = new Random(); //default: CurrentTime is Seed
		//Random rand = new Random(seed); //매개변수로 seed설정 가능
		
		//1 정수 메소드
		int r1 = rand.nextInt();// Integer.MIN_VALUE ~ Integer.MAX_VALUE
		int r2 = rand.nextInt(5);// 0~4 // 0~n-1
		//2 실수 메소드
		double r3 = rand.nextDouble();// 0.0<=n<1.0 **"미만임을 확인하라"
	}
}
//=====================================================================================================
//**랜덤클래스의 응용
/**
 * @detail 0~9 100개의 난수의 각 수의 빈도 수 많큼 막대그래프 출력
 */
class UsefulRandomMethod1 {
	
    Random rand = new Random();
	private int[] count = new int[10];
	private int[] array = new int[100];
	
	private void makeRandom() {
		for(int i=0;i<100;i++) {
			array[i] = rand.nextInt(10);
		}
	}
	
	private void countArr() {
		for(int i=0;i<100;i++) {
			count[array[i]]++; //난수에 해당하는 index 증가 ****** (좋은 코드)
		}
	}
}
//=====================================================================================================
//**자주 쓰이는 활용 메소드
/**
 *  @detail fillRand(int[] arr,int from,int to) / fillRandData(int[] arr,int [] data) / getRand(int from,int to)
 *          arr을 from~to범위 값으로 채움                                    arr을 data에 있는 값으로 채움                                       from~to 사이의 난수 반환
 */
class UsefulRandomMethod2{
	
	Random rand =  new Random();
	//1
	public int getRand(int from,int to) {
		int result=0;
		
		result = rand.nextInt(1)*(Math.abs(to-from)+1)+Math.min(to, from); //0이상 1"미만"의 수 임으로 abs+1
		
		return result;
	}
	//2
	public int[] fillRand(int[] arr,int from,int to) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=getRand(from,to);
		}
		return arr;
	}
	//3
	public int[] fillRandData(int[] arr,int[] data) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=data[getRand(0,data.length-1)]; //data의 index를 랜덤하게 출력->arr에 전달
		}
		
		return arr;
	}
}


