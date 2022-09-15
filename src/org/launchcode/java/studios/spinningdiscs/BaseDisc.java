package org.launchcode.java.studios.spinningdiscs;

import java.util.ArrayList;

public class BaseDisc {
    String name;
    String storageCapacity;
    String contents;
    String discType;

    public BaseDisc(String name, String storageCapacity, String contents, String discType) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.contents = contents;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
}
