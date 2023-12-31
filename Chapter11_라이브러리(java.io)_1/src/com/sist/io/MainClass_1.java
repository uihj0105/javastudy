package com.sist.io;
import java.net.URLEncoder;
/*
 *   자바 입출력 (입력 : InputStream , 출력 : OutputStream)
 *             ---------------------------------------- IO
 *    => 반드시 예외처리를 해야 된다
 *    => 반드시 => import를 이용해서 클래스를 읽어온다
 *               ------- import java.io.*;
 *    => 특징
 *        => 단방향
 *        => 데이터 이동통로를 이용하고 있다
 *           ----------------- Stream
 *        => 이동 통로
 *           -------
 *             1) 1byte : 바이트 스트림
 *                        ~InputStream , ~OutputStream
 *                        => 파일 업로드 / 파일 다운로드
 *                        => 네트워크는 1바이트...
 *             2) 2byte : 문자 스트림
 *                        ~Reader , ~Writer
 *                        => 파일 쓰기 / 파일 읽기
 *       -----------------------------------------------------
 *        바이트 스트림 => File(File클래스 공부하기)
 *          InputStream             OutputStream
 *              |                        |
 *         FileInputStream         FileOutputStream
 *         ObjectInputStream       ObjectOutputStream
 *         
 *        문자 스트림
 *           Reader                   Writer
 *             |                        |
 *         FileReader               FileWriter
 *       ------------------------------------------------------
 *        보조 스트림
 *         Buffered~
 *           => BufferedReader , BufferedWriter
 *              BufferInputStream , BufferedOutputStream
 *       ------------------------------------------------------
 *   
 *    1) 자바 특징
 *       -------
 *        자바에서는 IO는 Stream을 사용하고 있다
 *                     ------
 *                       | 데이터를 이동하는 통로
 *                         ----------------- FIFO = Queue
 *                         LIFO = Stack(메모리)
 *        => IO
 *            = 메모리 입출력
 *            = 파일 입출력
 *            = 네트워크 입출력 => 웹
 *        => IO는 단방향 통신
 *                양방향 => 쓰레드를 이용해서 두개의 프로그램을 동시에 처리
 *                -----채팅
 *        => 읽기/쓰기(1byte,2byte)
 *           자바(서버) =======> 브라우저 =======> 화면 출력
 *              |                |               |
 *              |               C/C++            |
 *          char=>2byte        char=>1        char=>2
 *                char->byte로 변경   byte->char로 변경
 *                  encoding           decoding
 *          = 1byte : 바이트 스트림
 *             ~InputStrea , ~OutputStream
 *          = 2byte : 문자 스트림
 *             ~Reader , ~Writer
 *             ** 한글은 1글자 2byte => 한글이 깨진다
 *         
 *    책 P.356
 *     메모리(데이터 저장) ======= 자바응용프로그램 ======= 모니터 전송
 *                        |                    |
 *                   InputStream          OutputStream
 *                    System.in            System.out
 *                   
 *                   class System
 *                   {
 *                      static InputStream in;
 *                      static OutputStream out;
 *                   }
 *    P. 357 IO 관련 클래스
 *                       Object
 *                         |
 *       -----------------------------------------------------------------------------
 *        |          |                     |                         |              |
 *       File   InputStream           OutputStream                 Reader         Writer
 *                   |                     |                         |              |
 *          **FileInputStream      **FileOutputStream        ** BufferedReader   BufferedWriter
 *           FilterInputStream       FilterOutputStream      ** FileReader       **FileWriter
 *                   |                     |                 ----------------------------------
 *        **BufferedInputStream    **BufferedOutputStream     **ObjetInputStream **ObjectOutputStream
 *        
 *        ==> 파일 모드(mode) => r,w,a
 *             r--w--
 *            
 *             r
 *              FileReader r=new FileReader("경로")
 *             w
 *              FileWriter w=new FileWriter("경로")     ==>  create
 *             a
 *              FileWriter a=new FileWriter("경로",true) ==> append
 *        ==> File : 독립된 클래스
 *            ----
 *              = File정보
 *                 new File("경로명\\파일명")
 *              = 디렉토리정보
 *                 new File("경로명")
 *              = 주요 기능
 *                 => getName() : 파일명 , 폴더명
 *                 => getPath() : 경로명 ~ 파일명
 *                 => getParent() : 경로명
 *                 => 특성
 *                     1. canRead() : 읽기 전용
 *                     2. canWrite() : 쓰기 전용
 *                     3. isHidden() : 숨김파일
 *                 => 파일/폴더 확인
 *                     isFile() , isDirectory()
 *                    
 */
import java.util.*;
 /*
  *  int[] arr=new int[10];
  *  int index=0;
  *  for(int i=0;i<arr.length;i++)  ==> Queue(먼저들어온걸 먼저뺀다)
  *  
  *  int index=9;
  *  for(int i=9;i>=0;i--)  ==> Steak(나중에들어온걸 먼저뺀다)
  */
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Queue<Integer> q=new LinkedList<Integer>();   //Queue객체생성은 LinkedList사용
//		
//		//데이터 첨부
//		q.offer(10);  //add(X) offer(O)
//		q.offer(20);
//		q.offer(30);
//		q.offer(40);
//		q.offer(50);
//		
//		while(!q.isEmpty())
//		{
//			System.out.println(q.poll());     //데이터 꺼낼때 poll
//		}
//		
//		System.out.println("==============");
//		Stack<Integer> s=new Stack<Integer>();
//		s.push(10);
//		s.push(20);
//		s.push(30);
//		s.push(40);
//		s.push(50);
//		
//		while(!s.isEmpty())
//		{
//			System.out.println(s.pop());
//		}
		
		//%EC%9E%90%EB%B0%94
		String s="자바";
		byte[] b=s.getBytes();
		System.out.println(Arrays.toString(b));
		//System.out.println(URLEncoder.encode(s,"UTF-8")); => %EC%9E%90%EB%B0%94
		
	}

}
