public class Factory {
    public String owner = "Cooper";
    public boolean isOpen = true;
    public int yearFounded = 1985;
    public Pizza pizzaOrder1;
    public Pizza pizzaOrder2;
    public Pizza pizzaOrder3;



    public int randomNumber;
    public int randomNumber2;


    public static void main(String[] args) {

        Factory a = new Factory();
    }


    public Factory() {
        System.out.println("welcome to Cooper's  Pizza Factory");
        System.out.println("the factory was founded in");
        System.out.println(yearFounded);
        System.out.println("it is" + isOpen + "that the factory is open");


        pizzaOrder1 = new Pizza("Pepperoni", true);
        pizzaOrder2 = new Pizza("Cheese", false);
        pizzaOrder3 = new Pizza("Buffalo", true);

        //pizza order 1
        System.out.println(pizzaOrder1.numberOfSlices);
        System.out.println(pizzaOrder1.numberOfSlices + "slices please");
        System.out.println("all" + pizzaOrder1.extraCheese);
        System.out.println("it is" + pizzaOrder1.extraCheese + "that I want extra cheese");



        //pizza order 2




        pizzaOrder2.addSlices();
        pizzaOrder2. changePizzaType("Cheese");
        pizzaOrder2.printInfo();
    }


}


