package task04;

import java.util.ArrayList;
import java.util.List;

public class Network {

    private List<Phone> phs = new ArrayList<Phone>();
    
    public Network() {
    }

    public Network(List<Phone> phs) {
        this.phs = phs;
    }

    public List<Phone> getPhs() {
        return phs;
    }

    public void setPhs(List<Phone> phs) {
        this.phs = phs;
    }

    @Override
    public String toString() {
        return "Network{" +
                "phs=" + phs +
                '}';
    }
}

//    public void registration(String name, String number, String model) {
//        Phone ph = new Phone();
//
//        ph.setOwnerName(name);
//        ph.setPhoneNumber(number);
//        ph.setPhoneModel(model);
//
//        phs.add(ph);
//    }
//}
