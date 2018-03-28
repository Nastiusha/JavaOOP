package task01;

public class Main {

    public static void main(String[] args) {

        /*This is Marvel*/
        Cat catOne = new Cat();
        catOne.setName("Marvel");
        catOne.setAge(2);
        catOne.setBreed("Scottish Fold");
        String[] color1 = {"grey"};
        catOne.setColor(color1);

        /*This is DC*/
        Cat catTwo = new Cat();
        catTwo.setName("DC");
        catTwo.setAge(3);
        catTwo.setBreed("Maine Coon");
        String[] color2 = {"white", "foxy"};
        catTwo.setColor(color2);

        /*Printing info about Marvel and DC*/
        System.out.println(catOne.toString());
        System.out.println(catTwo.toString());

    }
}
