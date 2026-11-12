public class Pizza {

    //three instance variables of different types
    public String topping;
    public boolean extraCheese;
    public int numberOfSlices;


    //Constructor assings values to variables
    public Pizza(boolean pExtraCheese, String pTopping) {
        topping = pTopping;
        extraCheese = pExtraCheese;

        numberOfSlices = (int) (Math.random() * 12) + 1;
    }


    //method 1: print instant variables
    public void printInfo() {

        System.out.println("The pizza topping is" + topping);
        System.out.println("Extra cheese: " + extraCheese);
        System.out.println("the pizza has" + numberOfSlices + "slices");
    }

    // Method 2: add slices
    public void addSlices() {
        numberOfSlices++;

    }

    //method 3: changes pizza top
    public void changeTopping(String newTopping) {
        topping = newTopping;
    }
}//end of file
