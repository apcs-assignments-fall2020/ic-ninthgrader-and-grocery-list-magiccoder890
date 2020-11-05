import java.util.ArrayList;

public class GroceryList {
    private String[] arr;

    public GroceryList() {
        this.arr = new String[10]; 
        for(int i = 0; i < 10; i++){
            arr[i] = "null";
        }
    }

    public void add(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "null") {
                arr[i] = item;
                break;
            }
        }
    }
    public void remove(String item){
        for (int i = 0; i < 10; i++){
            if(arr[i].equals(item)){
                arr[i] = "null";
            }
        }
    }
    public void tostring(){
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + ",");
        }
    }
}