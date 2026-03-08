import java.util.*;

class Duplicates {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        Set<Integer> set = new HashSet<>(list);

        System.out.println(set);
    }
}