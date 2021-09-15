package Decorator;

public class CoffeeTest {

    public static void main(String[] args) {


        Coffee kayaCoffee = new KenyaCoffee();
        kayaCoffee.brewing();

        System.out.println("----------------------------------------");
        Coffee kayaLattee = new Latte(kayaCoffee);
        kayaLattee.brewing();

        System.out.println("----------------------------------------");
        Coffee mocha = new Latte(new MochaCoffee(new Latte(kayaCoffee)));
        mocha.brewing();

        Coffee etiopiaCoffee  = new Latte(new EtiopiaCoffee());
        System.out.println("----------------------------------------");

        etiopiaCoffee.brewing();
    }


}
