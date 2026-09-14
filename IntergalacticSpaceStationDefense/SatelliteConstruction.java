package IntergalacticSpaceStationDefense;

public class SatelliteConstruction {
    private final String satelliteId;
    private final int laserPower;
    private final int shieldCapacity;
    private final Boolean stealthMode;
    
    public SatelliteConstruction(Builder builder){
        this.satelliteId = builder.satelliteId;
        this.laserPower = builder.laserPower;
        this.shieldCapacity = builder.shieldCapacity;
        this.stealthMode = builder.stealthMode;
    }
    
    public String getSatelliteId() {
        return satelliteId;
    }


    public int getLaserPower() {
        return laserPower;
    }


    public int getShieldCapacity() {
        return shieldCapacity;
    }


    public Boolean getStealthMode() {
        return stealthMode;
    }

    public void printSpecs() {
            System.out.println("Builder [satelliteId=" + satelliteId + ", laserPower=" + laserPower + ", shieldCapacity="
                    + shieldCapacity + ", stealthMode=" + stealthMode + "]");
    }

    public static class Builder{
        private final String satelliteId;
        private int laserPower = 50, shieldCapacity = 100;
        private Boolean stealthMode = false;

        public Builder(String satelliteId){
            this.satelliteId = satelliteId;
        }

        public Builder setLaserPower(int laserPower) {
            this.laserPower = laserPower;
            return this;
        }

        public Builder setShieldCapacity(int shieldCapacity) {
            this.shieldCapacity = shieldCapacity;
            return this;
        }



        public Builder setStealthMode(Boolean stealthMode) {
            this.stealthMode = stealthMode;
            return this;
        }

        public SatelliteConstruction build(){
            return new SatelliteConstruction(this);
        }
    }
}
