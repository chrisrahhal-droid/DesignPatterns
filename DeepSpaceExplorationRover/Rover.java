package DeepSpaceExplorationRover;

public class Rover {
    private final String chassisID;
    private final int batteryCapacity;
    private final PayloadUnit payloadUnit;

    private Rover(Builder builder){
        this.chassisID = builder.chassisID;
        this.batteryCapacity = builder.batteryCapacity;
        this.payloadUnit = builder.payloadUnit;
    } 

    public String getChassisID() {
        return chassisID;
    }


    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public PayloadUnit getPayloadUnit() {
        return payloadUnit;
    }

    public static class Builder{
        private final String chassisID;
        private int batteryCapacity = 1000;
        private PayloadUnit payloadUnit;

        public Builder(String chassisID){
            this.chassisID = chassisID;
        }

        public Builder setBatteryCapacity(int batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
            return this;
        }

        public Builder setPayloadUnit(PayloadUnit payloadUnit) {
            this.payloadUnit = payloadUnit;
            return this;
        }

        public Rover commission(){
            return new Rover(this);
        }
        
    }

}
