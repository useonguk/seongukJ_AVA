package mypkgg;
import java.util.Arrays;
import java.util.Scanner;
import printin.*;

public class input {
	public static void main(String[] args)
	{
		String[] strArray = { "준비물 목록 : ",};
		int pnt;
		System.out.println("학교 준비물 목록 만드는 프로그램");
		while(true) {
			System.out.println("준비물 출력 : 1 | 준비물 입력 : 2 | 프로그램 종료 : 3");
			Scanner scan = new Scanner(System.in);
			pnt = scan.nextInt();
			if(pnt == 1) {
				input op = new input(); 
				op.B(strArray);
			}
			else if(pnt == 2){
				input a = new input();
				a.A(strArray);
			}
			else {
				System.out.println("접어");
				System.exit(1);
			}
		}
	}
	public void A(String[] strArray){
		String itme;
		System.out.print("준비물을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		itme = sc.next();
		strArray = Add(strArray, itme);
	}
	
	public void B(String[] strArray) {
		System.out.println(Arrays.toString(strArray));
	}
	
	private static <T> T[] Add(T[] originArray, T Val) {
	    // 순서 1. copyOf() 메서드를 사용하여 복사
	    T[] newArray = Arrays.copyOf(originArray, originArray.length + 1);

	    // 순서 2. 새로운 배열의 마지막 위치에 추가하려는 값을 할당
	    newArray[originArray.length] = Val;

	    // 순서 3. 새로운 배열을 반환
	    return newArray;
	  }
}