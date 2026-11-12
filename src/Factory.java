public class Factory {
    public String owner = "Cooper";
    public boolean isOpen = true;
    public int yearFounded = 1985;
    public Pizza pizzaOrder1;
    public Pizza pizzaOrder2;
    public Pizza pizzaOrder3;




    public static void main(String[] args) {

        Factory a = new Factory();
    }


    public Factory() {
        System.out.println("welcome to Cooper's  Pizza Factory");
        System.out.println("the factory was founded in");
        System.out.println( yearFounded);
        System.out.println("it is" + isOpen + "that the factory is open");


        pizzaOrder1 = new Pizza( true,  "pepperoni");
        pizzaOrder2 = new Pizza( false,  "cheese");
        pizzaOrder3 = new Pizza( true,  "Buffalo");

        //pizza order 1
        System.out.println(pizzaOrder1.numberOfSlices);
        System.out.println(pizzaOrder1.numberOfSlices + "slices please");
        System.out.println("all" + pizzaOrder1.topping);
        System.out.println("it is" + pizzaOrder1.extraCheese + "that I want extra cheese");

        pizzaOrder1.numberOfSlices = pizzaOrder1.numberOfSlices + 1;
        System.out.println(pizzaOrder1.numberOfSlices + "order 1 slices");



        //pizza order 2
        pizzaOrder2. changeTopping( "Cheese");
        System.out.println(pizzaOrder2.numberOfSlices);

        //pizza order 3
        System.out.println(pizzaOrder3.numberOfSlices);
        System.out.println(pizzaOrder3.numberOfSlices + "slices please");
        System.out.println("all" + pizzaOrder3.topping);
        System.out.println("it is" + pizzaOrder3.extraCheese + "that I want extra cheese");

        pizzaOrder1.printInfo();

        pizzaOrder2.addSlices();
        pizzaOrder2.printInfo();

        pizzaOrder3.changeTopping(  "pinapple");
        pizzaOrder3.printInfo();
    }


}


