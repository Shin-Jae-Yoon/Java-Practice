package chap06;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {
    public static void main(String[] args) {
        Item[] items = new Item[]{
                new Item("java", 5000),
                new Item("python", 4000),
                new Item("c++", 7500),
                new Item("javascript", 1000),
                new Item("dart", 20000)
        };

//        Arrays.sort(items);
        // ( items, 정렬 방법을 정의한 객체 )
        // Arrays.sort(items, new ItemSorter());

//        Arrays.sort(items, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Item item1 = (Item)o1;
//                Item item2 = (Item)o2;
//                return item1.getName().compareTo(item2.getName());
//            }
//        });

//        Arrays.sort(items, (Object o1, Object o2) -> {
//            Item item1 = (Item)o1;
//            Item item2 = (Item)o2;
//            return item1.getName().compareTo(item2.getName());
//        });

//        Arrays.sort(items, (item1, item2) -> {
//            return item1.getName().compareTo(item2.getName());
//        });

        Arrays.sort(items, (item1, item2) -> item1.getName().compareTo(item2.getName()));

        for (Item item : items) {
            System.out.println(item);
        }
    }
}

// Item에서 compareTo를 이용해 정렬하면
// 이름으로 정렬할때는 밑에꺼 주석처리하고 그런식으로 계속 할거임?
// Item 외부에서 정렬 해보자.

// 다음으로, 메서드가 1개만 있는 인터페이스다.
// 이건 람다 인터페이스겠네?
class ItemSorter implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Item item1 = (Item)o1;
        Item item2 = (Item)o2;
        return item1.getName().compareTo(item2.getName());
    }
}

// Comparable은 Object의 어떤 부분이 큰 지, 작은 지 기준을 정하는 Interface
class Item implements Comparable {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // 파라미터로 들어온 Object와 내 자신을 비교하는 메서드
    // compareTo에는 Object를 받아들이도록 했지만, 실제로는 Item이 들어온다.
    // 자기 자신과 같은 타입의 객체가 들어온다.
//    @Override
//    public int compareTo(Object o) {
//        Item d = (Item)o;
//        return this.name.compareTo(d.name);
//    }

    @Override
    public int compareTo(Object o) {
        Item d = (Item)o;
        return this.price - d.price;
    }
}
