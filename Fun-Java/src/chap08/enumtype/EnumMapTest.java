package chap08.enumtype;

import java.util.EnumMap;

public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap emap = new EnumMap(Day.class);
        emap.put(Day.SUNDAY, "일요일은 자는 것이 최고");
        emap.put(Day.FRIDAY, "불금은 놀아야지");
        emap.put(Day.MONDAY, "월요병.. 극혐..");

        System.out.println(emap.get(Day.SUNDAY));
    }
}
