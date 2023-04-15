package chap06;

public class CommandLineArgumentExam {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("사용법 : CommandLineArgumentExam 값 값 ...");
            System.exit(0); // return; 으로 변경 가능
        }

        // a b "hello world" 큰따옴표로 묶으면 하나로 취급
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}

/*
System.exit(0) 이 안에 0은 뭐를 의미?

Hello.java 파일 작성하고 javac Hello.java 했을 때
아무 메세지가 안나오면? 좋은거지. 에러 없이 컴파일 잘 된거니까

명령을 실행할 때 성공하면 아무런 메시지도 출력하지 않는다. -> Unix 철학
Linux도 Unix의 계열

작은 명령들을 조합해서 또 다른 명령을 만든다. (쉘 스크립트 작성)

작은 명령들이 실행되고 종료될 때, 이게 성공하고 실패하는 지 궁금하다

그때 사용되는 것이 System.exit()의 파라미터인 종료코드이다.

터미널에서 man wc를 해보면 EXIT STATUS가 나온다. 0이면 성공, 오류가 발생하면 0보다 큰거

 */