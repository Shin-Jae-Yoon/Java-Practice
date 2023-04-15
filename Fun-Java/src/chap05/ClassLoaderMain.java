package chap05;

import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String[] args) throws Exception {
//        Bus b1 = new Bus();
//        b1.a();

        // a() 메서드를 가지고 있는 클래스가 있다.
        // 이 클래스 이름이 무엇인지 아직 모르겠다.
        // 나중에 이 클래스 이름을 알려주겠다.
        // a() 메서드를 실행할 수 있도록 코드를 작성하라

        // 이럴때 클래스로더를 이용해보자.
        // JVM의 클래스로더는 클래스를 CLASSPATH에서 찾는다.
        // Class명 다음에 바로 나왔으니 forName은 static한 메서드겠네
        // 클래스이름을 넣어주면 클래스 이름에 해당되는 클래스를 CLASSPATH에서 찾고
        // 그 클래스 정보를 앞에 있는 변수 clazz에다가 넣어준다.

        // 즉 className에 해당하는 클래스 정보를 CLASSPATH에서 읽어들이고,
        // 그 정보를 clazz가 참조하도록 한다.
//        String className = "";
//        Class clazz = Class.forName(className);

        String className = "chap05.Bus";
        Class clazz = Class.forName(className);
        // clazz가 가지고 있는 메서드 정보 여러개를 리턴받음
//        Method[] declaredMethods = clazz.getDeclaredMethods();
//        for (Method m : declaredMethods) {
//            System.out.println(m.getName());
//        }
        Object o = clazz.newInstance();
        // Object o = new Bus(); 와 같다

//        Bus bus = (Bus)o;
//        bus.a();

//        Car car = (Car)o;
//        car.a();

        Method m = clazz.getDeclaredMethod("a", null);// a() 메서드 정보를 가지고 있는 Method를 반환하라.
        // m이라는 메서드 정보를 통해서 실행하라.
        m.invoke(o, null); // Object o가 참조하는 객체의 m 메서드를 실행하라


        // 클래스 정보를 얻고 그 정보를 통해서 인스턴스를 만들거다.
        // 메서드 이름을 통해서 실행
        // 문자열로 된 클래스 이름과 문자열로 된 메서드 이름만 있어도 표현할 수 있는 방법이 있구나! reflect!


        // 팩토리 메서드 패턴 + 리플렉션
        // 아 클래스 이름만 가지고 인스턴스를 달라고 하면
        // 복잡환 과정을 거쳐 인스턴스를 생성해주는 공장을 만들 수 있겠구나
    }
}
