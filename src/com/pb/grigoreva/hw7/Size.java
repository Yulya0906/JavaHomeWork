package com.pb.grigoreva.hw7;

public enum Size {
    S, M, L, XS, XXS, Description;
    private final Object size;
    int EuroSize;

    Size() {

        size = new Object();
    }

    @Override
    public String toString() {
        return (String) size;
    }

    Size(String name) {
        this.size = null;
    }

    public Object getSize() {
        return size;
    }

    public Object setSize() {
        return size;
    }

    public void getDescription() {
        switch (Description) {
            case L:
            case M:
            case S:
            case XS:
                System.out.println("Взрослый размер");
                break;
            case XXS:
                System.out.println("Детский размер");
            default:
                throw new IllegalStateException("Unexpected value :" + Description);
        }

    }
    public void getEuroSize() {
        switch (EuroSize) {
            case 32:
            case 34:
            case 38:
            case 40:
                System.out.println("Европейский  размер");
                break;
        }
    }
}


