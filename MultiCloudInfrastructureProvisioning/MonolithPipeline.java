public class MonolithPipeline extends ProvisioningPipeline {

    @Override
    public Application createApp() {
        return new MonolithApp();
    }

}
