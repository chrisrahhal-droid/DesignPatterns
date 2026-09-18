public class MicroservicePipeline extends ProvisioningPipeline {

    @Override
    public Application createApp() {
        return new MicroserviceApp();
    }

}
