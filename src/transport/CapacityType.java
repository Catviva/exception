package transport;

public enum CapacityType {
    N1(0.1f, 3.5f),
    N2(3.5f, 12f),
    N3(12.1f, 500f);
    private Float min;
    private Float max;

    CapacityType(Float min, Float max) {
        this.min = min;
        this.max = max;
    }


    public Float getMin() {
        return min;
    }

    public Float getMax() {
        return max;
    }

    public static CapacityType getValue (Float value) {
        for (CapacityType t : CapacityType.values()){
            if (value >= t.getMin() && value <= t.getMax()){
                System.out.println(t);
                return t;
            }
        }
        return null;
    }
}