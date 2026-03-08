import java.util.ArrayList;

class Max {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(25);
        list.add(5);
        list.add(40);
        list.add(15);

        int max = list.get(0);

        for(int num : list){
            if(num > max){
                max = num;
            }
        }

        System.out.println("Maximum Number: " + max);
    }
}
