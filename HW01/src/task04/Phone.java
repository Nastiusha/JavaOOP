package task04;

import java.util.List;

public class Phone {

    private String phoneNumber;
    private String ownerName;
    private String phoneModel
            ;

    public Phone() {
    }

    public Phone(String phoneNumber, String ownerName, String phoneModel) {
        this.phoneNumber = phoneNumber;
        this.ownerName = ownerName;
        this.phoneModel = phoneModel;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /*Imagine there is no mistakes in our world and all possible numbers are valid*/
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", phoneModel='" + phoneModel + '\'' +
                '}';
    }

    public boolean registration(Network n) {

        Phone ph = new Phone();

        ph.setOwnerName(ownerName);
        ph.setPhoneNumber(phoneNumber);
        ph.setPhoneModel(phoneModel);

        List<Phone> phs = n.getPhs();

        return phs.add(ph);
    }

    public boolean containsNumber(final List<Phone> list, final String number){
        return list.stream().filter(o -> o.getPhoneNumber().equals(number)).findFirst().isPresent();
    }

    public String call(Phone ph2, Network n) {

        List<Phone> phs = n.getPhs();

        String message;

        if (containsNumber(phs, ph2.getPhoneNumber())) {
            message = "You are calling " + ph2.getPhoneNumber();
            ph2.income();
        } else {
            message = "Dialing does not work";
        }

        return message;
    }

    public void income() {
        System.out.println(phoneNumber + " is calling");
    }

}
