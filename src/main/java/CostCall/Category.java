package CostCall;

public enum Category {
    FOOD,
    TRANSPORT,
    ENTERTAINMENT,
    OTHER;

    public static Category fromString(String value) {
        return Category.valueOf(value.toUpperCase());
    }
}
