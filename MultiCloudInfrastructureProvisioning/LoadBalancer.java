public class LoadBalancer {
    private final String name;
    private final boolean sslEnabled;
    private final int maxConnections;
    private final int timeoutMs;

    private LoadBalancer(Builder builder) {
        this.name = builder.name;
        this.sslEnabled = builder.sslEnabled;
        this.maxConnections = builder.maxConnections;
        this.timeoutMs = builder.timeoutMs;
    }

    public String getName() {
        return name;
    }

    public boolean isSslEnabled() {
        return sslEnabled;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public int getTimeoutMs() {
        return timeoutMs;
    }

    public void routeTraffic() {
        System.out.println(
                "LoadBalancer [name=" + name + ", sslEnabled=" + sslEnabled + ", maxConnections=" + maxConnections
                        + ", timeoutMs=" + timeoutMs + "]");
    }

    public static class Builder {
        private final String name;
        private boolean sslEnabled = false;
        private int maxConnections = 1000;
        private int timeoutMs = 5000;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setSslEnabled(boolean sslEnabled) {
            this.sslEnabled = sslEnabled;
            return this;
        }

        public Builder setMaxConnections(int maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }

        public Builder setTimeoutMs(int timeoutMs) {
            this.timeoutMs = timeoutMs;
            return this;
        }

        public LoadBalancer build() {
            return new LoadBalancer(this);
        }
    }
}
