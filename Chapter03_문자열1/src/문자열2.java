/*
 *   문자열
 *   ---- String 기능이 많다
 *   1. 문자의 갯수 확인 : length()
 *   2. 검색
 *      ---
 *      startsWith : 시작하는 문자열이 같은 경우
 *      endWith   : 끝나는 문자열이 동일 => cookie
 *      ***contains  : 포함된 문자가 있는지
 *      ----------- 추천
 *      ***equals    : 같은 값 ==> id,password
 *         ------ 대소문자 구분
 *   3. 문자열 제어
 *      = 변경 : replace() , replaceAll()
 *              replace('a','b')
 *              replaceAll("[가-힣]","")  //한글 전체 지워라
 *              replaceAll("[0-9A-Za-z]","")   //숫자,영어 전체 지워라
 *              String s="Hello Java"
 *                        0123456789
 *      = 문자 자르기 : substring(1) //1부터 잘림 => ello Java
 *                   substring(4,7)  //4번부터 7번 전까지 잘림
 *                              --제외 ==> 456 o J
 *      = 대문자 : toUpperCase
 *      = 소문자 : toLowerCase
 *   4. 모든 데이터형을 문자열로 변경
 *      = valueOf(1) => "1" ==> 윈도우,웹
 *   5. 분리 : split() => Spring[]
 *            charAt(index)
 *            "Hello Java" => charAt(0) => 'H'
 *            ** index번호가 자바는 무조건 0부터 시작 (오라클 1번부터)
 * 
 *   String => 일반형 =>
 *   ----------------- Call By Value / Call By Reference
 *                           |            => 배열/클래스
 *                         String은 변경x
 *   형식) String s="";
 *        String s=new String("")
 *   
 */
public class 문자열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java!!";
		System.out.println(s.length());  //문자 갯수 => 공백 포함
		
		if(s.startsWith("b"))  //서제스트 만들때
		{
			System.out.println("포함됨");
		}
	}

}
