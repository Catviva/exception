package transport;

public enum Capacity {
    EXTRA_SMALL(1, 10),
    SMALL(11, 25),
    MIDDLE(26, 60),
    BIG(61, 100),
    EXTRA_BIG(101, 120);
    private Integer min;
    private Integer max;

    Capacity(int min, int max) {
        this.min = min;
        this.max = max;
    }


    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public static Capacity getValue(int value) {
        for (Capacity c : Capacity.values()) {
            if (value >= c.getMin() && value <= c.getMax()) {
                System.out.println(c);
                return c;
            }
        }
        return null;
    }
}
