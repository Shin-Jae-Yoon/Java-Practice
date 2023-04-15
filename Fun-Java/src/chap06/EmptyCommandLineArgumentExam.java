package chap06;

public class EmptyCommandLineArgumentExam {
    public static void main(String[] args) {
        System.out.println(args.length);
    }
}

// JVM이 실행 시킨 내용은 아래와 같음
// String[] args = new String[0];
// main(args);

// javac EmptyCommandLineArgumentExam .java
// java EmptyCommandLineArgumentExam  a b c d e (얘네가 명령행 아규먼트), 여기서는 공백을 기준으로 5개 문자열 배열

// java -javaagent:어떤설정 EmptyCommandLineArgumentExam a b c
// java 명령과 클래스명 사이에 있는건 자바에 옵션 주는거
// 클래스명 뒤에 있는건 프로그램 아규먼트