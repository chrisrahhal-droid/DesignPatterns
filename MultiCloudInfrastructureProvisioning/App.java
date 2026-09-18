public class App {
    public static void main(String[] args) {
        RegionManager.getInstance().setRegion("eu-central-1");
        ComponentFactory azure = new AzureFactory();
        VirtualMachine azureVM = azure.createVirtualMachine();
        CloudStorage azureStorage = azure.createCloudStorage();
        azureVM.boot();
        azureStorage.mount();
        LoadBalancer loadBalancer = new LoadBalancer.Builder("MainGateway").setSslEnabled(true).setTimeoutMs(1000)
                .build();
        loadBalancer.routeTraffic();
        ProvisioningPipeline pipeline = new MicroservicePipeline();
        Application app = pipeline.createApp();
        app.start();
        DatabaseSnapshot snapshot = new DatabaseSnapshot();
        snapshot.setEnvironment("Env");
        DatabaseSnapshot clone = snapshot.clone();
        clone.setEnvironment("Staging");
        snapshot.inspect();
        clone.inspect();
    }
}
