public class AzureFactory extends ComponentFactory {

    @Override
    public CloudStorage createCloudStorage() {
        return new AzureCloudStorage();
    }

    @Override
    public VirtualMachine createVirtualMachine() {
        return new AzureVirtualMachine();
    }

}
