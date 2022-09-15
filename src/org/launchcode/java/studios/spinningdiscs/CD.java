package org.launchcode.java.studios.spinningdiscs;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String name, String storageCapacity, String contents, String discType) {
        super(name, storageCapacity, contents, discType);
    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void writeToDisc() {

    }

    @Override
    public ArrayList<String> reportInfo() {
        return null;
    }
}
