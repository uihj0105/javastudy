
public class 메소드_매개변수전송법_2 {
	static void swap(int a)
	{
		a=100;
		System.out.println("a="+a);
	}
	static void swap2(int[] arr)
	{
		System.out.println("arr="+arr);
		arr[0]=100;
	}
	// => 배열 => 메모리 주소이용
	// => 기본형 => 실제 저장된 값 이용
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=10;    //원본=>Call By Value
		swap(b);
		System.out.println("b="+b);
		
		/*
		 *    int b=10;
		 *    int a=b;
		 *    a=100;
		 */
		int[] kkk={1,2,3};
		swap2(kkk);
		System.out.println("kkk[0]="+kkk[0]);
	}

}
