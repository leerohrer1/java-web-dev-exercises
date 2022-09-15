package org.launchcode.java.studios.spinningdiscs;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String name, String storageCapacity, String contents, String discType) {
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
