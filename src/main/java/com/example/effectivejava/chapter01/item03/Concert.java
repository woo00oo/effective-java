package com.example.effectivejava.chapter01.item03;

public class Concert {

    private boolean lightsOn;

    private boolean mainStateOpen;

    private IElvis elvis;

    public Concert(IElvis elvis) {
        this.elvis = elvis;
    }

    public void perform() {
        this.mainStateOpen = true;
        this.lightsOn = true;
        elvis.sing();
    }

    public boolean isLightsOn() {
        return this.lightsOn;
    }

    public boolean isMainStateOpen() {
        return this.mainStateOpen;
    }
}
