public class GroceryListClient {
    public static void main(String[] args) {
        GroceryList list1 = new GroceryList();
        list1.add("milk");
        //list1.tostring();
        list1.add("eggs");
        //list1.tostring();
        list1.add("cheese");
        //list1.tostring();
        list1.remove("milk");
        list1.tostring();
    }
}