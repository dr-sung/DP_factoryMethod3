/*
 * Factory Method design pattern
 */

public class Main {
    
    public static void main(String[] args) {
        
        SmartPhoneCreator creator1 = new SmartPhoneCreator();
        SmartPhone genericPhone = creator1.createSmartPhone();
        System.out.println(genericPhone.getSpecification());
        
        SmartPhoneCreator creator2 = new NexusCreator();
        SmartPhone nexusPhone = creator2.createSmartPhone();
        System.out.println(nexusPhone.getSpecification());
        
    }
    
}
