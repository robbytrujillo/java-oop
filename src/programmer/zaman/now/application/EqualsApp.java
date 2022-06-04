package programmer.zaman.now.application;

public class EqualsApp { // membandingkan apakah objeknya bernilai sama di memory atau tidak
    public static void main(String[] args) {


        String first = "Robby";
        first = first + " " + "Ilhamkusuma";

        System.out.println(first);

        String second = "Robby Ilhamkusuma";
        System.out.println(second);

        System.out.println(first == second); //false (karena Stringnya berbeda antara first & second)
        System.out.println(first.equals(second)); //coding yang benar

        String third = "Robby Ilhamkusuma";

        System.out.println(second == third); //true (karena Stringnya sama antara second & third)
        System.out.println(second.equals(third)); //coding yang benar
    }
}
