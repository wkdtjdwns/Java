package hash;

import java.util.HashMap;

public class HashMapEx {

    public static void main(String[] args) {

        // 선언법 : HashMap<Key의 자료형, Value의 자료형> 변수명 = new HashMap<>();
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("ABC", 10);
        hashMap.put("BBB", 20);
        hashMap.put("AAA", 30);
        hashMap.put("ABC", 15); // 기존 키의 value인 10 대신 15가 들어감.

        System.out.println(hashMap.isEmpty()); // false
        System.out.println(hashMap.get("ABC")); // 15
        System.out.println(hashMap.containsKey("ABC")); // true

        hashMap.remove("ABC");
        System.out.println(hashMap.containsKey("ABC")); // false
        System.out.println(hashMap.size()); // 2

        hashMap.clear();
        System.out.println(hashMap.isEmpty()); // true
    }
}
