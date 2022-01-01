package Array1;

import java.util.Scanner;

/* 배열이란? 하나의 이름으로 여러개의 많은 데이터 변수들을 선언하는 정적인 구조의 자료구조.
 * - 크기가 고정, 많은 데이터 처리가 필요한 경우에
 * 1차원: 행과 열을 동일시합니다. 점의 세계, [], int A[] = new int[5];
 * 2차원: 행과 열을 구분하여 사용, 선의 세계. [][], int B[][] = new int[][];
 * 3차원: 면을 기준으로 행과 열을 사용, 면의 세계, [][][], int C[][][] = new int[][][];
 * - index를 기준으로 처리합니다. 시작은 항상 0번으로
 * 
 * 번호, 이름, 자바, JSP, Spring, 총점, 평균 구하여 출력하세요. 
 * int, String, double, double, double, double, double
 * 
 * //정수형 1차원 배열 선언 
		int arr[] = new int[5]; //n-1
		arr[0] = 10;//arr배열의 첫번째 구성요소
		arr[1] = 20;//arr배열의 두번째 구성요소
		arr[2] = 30;//arr배열의 세번째 구성요소
		arr[3] = 40;//arr배열의 네번째 구성요소
		arr[4] = 50;//arr배열의 다섯번째 구성요소
		
		//1.데이터 출력
		System.out.println(arr[0]);//10
		System.out.println(arr[1]);//20
		System.out.println(arr[2]);//30
		System.out.println(arr[3]);//40
		System.out.println(arr[4]);//50
		System.out.println("-----------------------");
		
		//1.5 데이터 출력
			int datalength = arr.length;
			System.out.println("datalength : " + datalength);//5
		System.out.println("-----------------------");
		
		//2.데이터 출력  5 < 5   i=0,1,2,3,4, 5
		for(int i=0; i < arr.length; i++){
			System.out.println((i+1)+":" + arr[i]);
			//[0]=10, [1]=20,[2]=30,[3]=40,[4]=50
		}
		System.out.println("-----------------------");
		
		//3.데이터 출력: 가변for문이나 확장 for문
		int sum=0;
		
		for(int s:arr){
			System.out.println(s);//
			sum+=s;
		}
		System.out.println("합계:" + sum);//	
		System.out.println("-----------------------");
 * 
 * 
 * //4.배열 복사
		int data[] = new int[5];
//			data[0] = arr[0];
//			data[1] = arr[1];
//			data[2] = arr[2];
//			data[3] = arr[3];
//			data[4] = arr[4];
//		
		for(int i=0; i < data.length; i++){
			data[i] = arr[i];//데이터 복사
		}
		
		int sum2 =0;
		for(int i=0; i < data.length; i++){
			System.out.println(sum2+=data[i]);//복사된 데이터 출력
		}	
		
		}catch(ArrayIndexOutOfBoundsException e){
			//e.printStackTrace();
			System.out.println("배열 인덱스와 관련된 오류(예외상황)가 발생하였습니다.");
		}
	}
 * 
 * 
 */
public class ArraySample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적처리 인원수를 입력해주세요.");
		int inwon = sc.nextInt();// 3

		int bunho[] = new int[inwon];// bunho[] 배열에 데이터를 저장
		String name[] = new String[inwon];
		double java[] = new double[inwon];
		double jsp[] = new double[inwon];
		double spring[] = new double[inwon];
		double total[] = new double[inwon];
		double aver[] = new double[inwon];

		for (int i = 0; i < inwon; i++) {
			System.out.println("번호 배열에 정수형 데이터를 입력 하시오.");
			bunho[i] = sc.nextInt();// bunho[] 배열에 데이터를 저장

			System.out.println("이름 배열에 문자열 데이터를 입력 하시오.");
			name[i] = sc.next();

			for (int j = 0; j < 1; j++) {
				System.out.println("Java 배열에 실수형 데이터를 입력 하시오.");
				double javajumsu = sc.nextDouble();

				if (javajumsu >= 0 && javajumsu <= 100)
					java[i] = javajumsu;
				else {
					System.out.println("점수의 범위는 0이상 100이하입니다.");
					j--;
					continue;
				}

				System.out.println("JSP 배열에 실수형 데이터를 입력 하시오.");
				double jspjumsu = sc.nextDouble();
				
				if(jspjumsu >=0 && jspjumsu <=100)
					jsp[i] = jspjumsu;
				else {
					System.out.println("점수의 범위는 0이상 100이하입니다.");
					j--;
					continue;					
				}
				
				System.out.println("Spring 배열에 실수형 데이터를 입력 하시오.");
				double springjumsu = sc.nextDouble();
				
				if(springjumsu >=0 && springjumsu<=100) 
					spring[i] = springjumsu;				
				else {
					System.out.println("점수의 범위는 0이상 100이하입니다.");
					j--;
					continue;					
				}
							
			}

			total[i] = java[i] + jsp[i] + spring[i];
			aver[i] = total[i] / 3.0;// inwon
		}

		System.out.println("======================== 성 적 처 리 =======================");
		System.out.println("번호\t이름\tJava\tJSP\tSpring\ttotal\taver");//
		System.out.println("----------------------------------------------------------");//
		for (int i = 0; i < inwon; i++) {
			System.out.print(bunho[i] + "\t" + name[i] + "\t" + java[i] + "\t" + jsp[i] + "\t" + spring[i] + "\t");
			System.out.printf("%5.2f \t %5.2f \n", total[i], aver[i]);
		}
		System.out.println("===============================================================");
	}

}
