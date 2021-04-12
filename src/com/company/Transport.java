package com.company;

public class Transport {
    private boolean isReels;
    private Type type;

    public Transport(boolean isReels, Type type) {
        this.isReels = isReels;
        this.type = type;
    }

    public boolean isReels() {
        return isReels;
    }

    public Type getType() {
        return type;
    }
}
