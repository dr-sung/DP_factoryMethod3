/*
 * Participant: Creator (Factory)
 *              also this class is ConcreteCreator
 */

public class SmartPhoneCreator {
 
    public SmartPhone createSmartPhone() {
        SmartPhone phone = new SmartPhone();
        phone.add(makeCase());
        phone.add(makeScreen());
        phone.add(makeCPU());
        return phone;
    }
    
    public Case makeCase() {
        return new Case();
    }
    public Screen makeScreen() {
        return new Screen();
    }
    public CPU makeCPU() {
        return new CPU();
    }
    
}
