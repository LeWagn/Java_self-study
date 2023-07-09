package Iterator_Iterable;

public class CustomArrayListRunner {
    public static void main(String[] args) {
        CustomArrayList<String> myCustomArray = new CustomArrayList<>();

        myCustomArray.add("One");
        myCustomArray.add("two");
        myCustomArray.add("three");
        myCustomArray.add("four");
        myCustomArray.add("five");

        for (String str : myCustomArray) {
            System.out.println(str);
        }
    }
}
