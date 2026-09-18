public class AWSFactory extends ComponentFactory {

    @Override
    public CloudStorage createCloudStorage() {
        return new AWSCloudStorage();
    }

    @Override
    public VirtualMachine createVirtualMachine() {
        return new AWSVirtualMachine();
    }

}
