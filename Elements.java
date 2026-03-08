import java.util.*;

class Elements {
    public static void main(String[] args){

        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Bangalore");

        if(cities.contains("Delhi")){
            System.out.println("Delhi exists in the set");
        } else {
            System.out.println("Delhi not found");
        }
    }
}
