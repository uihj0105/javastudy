/*
 *   자바 
 *   ---
 *    1. 데이터 저장 
 *       변수 : 한개만 저장 (메모리 공간) 
 *       => 변수 : 프로그램에 따라 변경이 가능 
 *       => 상수 : 고정 (final)
 *    2. 저장 방법 : 메모리 크기 (기본형,데이터형)
 *       정수
 *        1byte(-128~127) => byte
 *          => 네트워크 (송수신) , 파일업로드,다운로드 , Web
 *        int : default => 모든 컴퓨터는 모든 숫자를 int으로 인식
 *        ---- 4byte(32bit)
 *        long : 64bit(큰 숫자를 저장) : 금융권...
 *        ----  
 *        -------------- 정수 
 *        정수 저장 => 10
 *        int 메모리공간=10
 *            ------- {} 종료시 ,프로그램 종료 => 사라진다 
 *       실수
 *        double : 64bit => 15자리 소수점 저장이 가능
 * 		문자
 *  	 char (0~65535) => 각문자마다 고유번호를 가지고 있다
 *   	  컴퓨터는 무조건 => 0,1(2진법)
 *         => 'A' => 65
 *            'a' => 97
 *            '0' => 48
 *      논리 : 1byte ==> boolean
 *            => 저장할 수 있는 값 : true/false
 *     -----------------------------------------------
 *     데이터 가공
 *     -------- 점수입력(국어,영어,수학) => 평균,총점,등수
 *                                   -----------
 *     웹 => 조회수 증가 , 인기순위 (데이터 가공)
 *          hit=hit+1   sort
 *          => 연산자, 제어문
 *             ----  ---- > 재사용(메소드)
 *                          --------- 컴포넌트/클래스 조립하면 프로그램
 *     연산자
 *    ------
 *      산술연산자(+,-,*,/,%)
 *      => 1. 주의점
 *            => 형변환(연산처리 => 같은 데이터형이여야 연산된다)
 *               int + char + double 
 *               --------------------double : 자동형변환
 *               int + (int)char + (int)double :강제형변환
 *         2. + : 산술, 문자열결합
 *                연산처리시 문자열이 존재하면 => 결과값은 문자열
 *                7+7+7+7+"" => "28"(문자열)
 *                7+"7"+7 => "777"<-"77"+7   ==> System.out.println("a="+a)
 *         3. / : 정수/정수=정수 , 정수/실수=실수
 *                0으로 나눌때 오류 발생
 *         4. % : 왼쪽 부호(+,-)가 남는다
 *         5. 기타
 *              int + double = double
 *              char + int = int
 *             -----------------------
 *              char + char = int
 *              byte + byte = int
 *              char + byte = int 
 *             ----------------------- 산술 규칙
 *      단항연산자
 *        = 증감연산자 (++,--)
 *           = 전치연산자
 *              ++a : 먼저 증가 -> 다른 연산 수행
 *               int b = ++a;
 *                    -- --
 *                       1
 *                     2
 *              --a
 *           = 후치연산자
 *              a++ : 먼저 다른 연산 수행 -> 1개 증가
 *               int b = a++
 *                     -- --
 *                      1
 *                         2
 *              a-- 
 *            **** a는 무조건 1증가
 *            **** 적용 int a=10;
 *                     System.out.println("a="+ a++);   //+((a++))해도 a=10
 *        = 부정연산자(!)
 *           반대효과
 *            ==> boolean 결과값
 *            true=>false , false=>true
 *            a%2==0 ===> a%2==1 , a%2!=0 , !(a%2==0)
 *        = 형변환연산자
 *          (데이터형)
 *                    자동형변환 ==========>
 *          byte < char < int < long < float < double
 *                    <========== 강제형변환
 *           (int)'A'(문자를 숫자로 확인할때) , (double)10
 *           (int)10.5 => 소수점 제거(실수->정수) => 10
 *          ==> 클래스 형변환
 *     --------- boolean(true/false)
 *               제어문 => 조건문,반복문    
 *      비교연산자(문자열은 비교할 수 없다)
 *        정수/실수/문자/논리 => 문자열 : equals,compare
 *        = ==
 *        = !=
 *        = <
 *        = >
 *        = <=
 *        = >=
 *      논리연산자
 *        &&(포함) ||(포함이 안된 경우)
 *         사용법
 *          (조건) && (조건)
 *           => 여기부터 여기까지
 *           a>=1 && a<=100
 *           a>='A' && a<='Z'
 *          -------   -------
 *             |         |
 *            -------------
 *                  |
 *                결과값
 *           ture && true   => true
 *           ture && false  => false
 *           false && true  => false
 *           false && false => false
 *           
 *           a<'A' || a>'Z'
 *          ------   ------
 *            |        |
 *           ------------
 *                 |
 *                결과값
 *           ture || true   => true
 *           ture || false  => true
 *           false || true  => true
 *           false || false => false
 *     ---------
 *      대입연산자
 *        = ==> a=10
 *        += ==> a+=10 ==> 기존의 a에 10을 더한다
 *               ----- a=a+10
 *        -= ==> a-=10 ==> 기존의 a에 10을 뺀다
 *               ----- a=a-10
 *      삼항연산자  : if~else
 *        => 두개의 값을 지정한다 => 조건에 따라  1개의 값을 가지고 온다
 *           (조건)?값1:값2
 *           ----
 *           true => 값1
 *           false => 값2
 *           
 */
public class 자바정리_특징 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		System.out.println("a="+ (a++));
	}

}
