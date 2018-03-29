package task04;

public class Main {

    public static void main(String[] args) {

        /*Create Phones*/
        Phone ph1 = new Phone();
        ph1.setOwnerName("Zhyrkova Anastasia Pavlivna");
        ph1.setPhoneNumber("380667281808");
        ph1.setPhoneModel("Samsung A5 2017");

        Phone ph2 = new Phone();
        ph2.setOwnerName("Bezhenar Arina Sergeevna");
        ph2.setPhoneNumber("380950436968");
        ph2.setPhoneModel("Asus ZenPhone C");

        Phone ph3 = new Phone();
        ph3.setOwnerName("Zhyrkov Pavel Aleksandrovich");
        ph3.setPhoneNumber("380983534192");
        ph3.setPhoneModel("Sony XPeria Z");

        /*Print elements*/
//        System.out.println(ph1.toString());
//        System.out.println(ph2.toString());
//        System.out.println(ph3.toString());

        /*Create network*/
        Network n = new Network();
        /*Register phones in our network*/
        ph1.registration(n);
        ph2.registration(n);
        //ph3.registration(n);
        //n.registration(ph2.getOwnerName(), ph2.getPhoneNumber(), ph2.getPhoneModel());
        //n.registration(ph3.getOwnerName(), ph3.getPhoneNumber(), ph3.getPhoneModel());

        /*Print network*/
        //System.out.println(n.toString());

        /*Call method testing*/
        System.out.println(ph1.call(ph2, n) + "\n");
        System.out.println(ph1.call(ph3, n));
    }
}
