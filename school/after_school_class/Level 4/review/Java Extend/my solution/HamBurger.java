package review.extend;

import java.util.ArrayList;

public class HamBurger {

    public String name;
    public ArrayList<String> ingredients = new ArrayList<>();

    public HamBurger() {
        name = "햄버거";
        ingredients.add("패티");
        ingredients.add("피클");
    }

    public void cook() {
        System.out.println(name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");

        for (String ingredient : ingredients) {
            System.out.println("+ " + ingredient);
        }
    }
}
