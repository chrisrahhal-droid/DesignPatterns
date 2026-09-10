public abstract class ProvisioningPipeline {
    public abstract Application createApp();

    public Application deploy() {
        Application app = createApp();
        app.setDeployementID(java.util.UUID.randomUUID().toString());
        return app;
    }
}
