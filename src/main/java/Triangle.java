class Triangle {

    private double firstLeg;
    private double secondLeg;

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double value) {
        if (value > 0) {
            firstLeg = value;
        } else {
            throw new RuntimeException("Length of a leg cannot be negative");
        }
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double value) {
        if (value > 0) {
            secondLeg = value;
        } else {
            throw new RuntimeException("Length of a leg cannot be negative");
        }
    }

}
