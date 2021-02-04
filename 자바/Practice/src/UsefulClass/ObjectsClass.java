package UsefulClass;

import java.util.Objects;

/**
 * @detail Object를 보조하는 class인 Objects에 구현된 일부 class을 살펴보자.
 * Object와 달리 Objects는 null에 방어적인게 특징
 */
public class ObjectsClass {

	public static void main(String[] args) {
		String str = "nextLine으로 입력시 널 발생 가능성이 있음";
		//1
		String result = Objects.requireNonNull(str, "널 발생함."); //널 발생시 NPE(NullPointException)아니면 그대로 반환
		//2
		if(Objects.isNull(str)); //널이면 true 아니면 false //반대 개념으로 noneNull도 존재함
		//3
		//equals(),hashCode() //Object와 달리 null값 처리가 필요 x (null가능성있을때 사용,Object와 달리 compareTo도 정의 되어 있음)
	}

}
