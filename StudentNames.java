import java.util.ArrayList;

class StudentNames {
    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<>();

        names.add("Aamna");
        names.add("Pooja");
        names.add("Rahul");
        names.add("Priya");
        names.add("Ali");

        for(String name : names){
            System.out.println(name);
        }
    }
}
