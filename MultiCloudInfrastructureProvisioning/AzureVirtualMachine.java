public class AzureVirtualMachine implements VirtualMachine {

    @Override
    public void boot() {
        System.out.println("Booting azure virtual machine");
    }

}
