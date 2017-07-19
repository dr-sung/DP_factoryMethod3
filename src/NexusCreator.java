/*
 * Participant: ConcreteCreator (ConcreteFactory)
 */

public class NexusCreator extends SmartPhoneCreator {
    
    @Override
    public Case makeCase() {
        return new NexusCase();
    }
    
    @Override
    public Screen makeScreen() {
        return new NexusScreen();
    }
    
}
