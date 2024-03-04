import java.util.Arrays;

public class Main {
    static boolean isFind (int [] arr, int value){
        for (int i :arr) {
            if ( i == value){
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] list ={15,7,8,56,41,8,7,12,8,12,9,9,8};
        int [] duplicate = new int [list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++){

            for (int j = 0; j < list.length; j++){
                if ((i != j) && (list [i] == list [j])){
                    if ((isFind(duplicate,list[i])))
                    duplicate[startIndex++] = list[i];
                    break;
                }
            }
        }
        for (int value : duplicate){
            if (value %2 ==0){
                System.out.print(value + ",");
            }
        }
    }
}