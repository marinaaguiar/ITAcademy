package n1exercise1;

public enum InstrumentType {
    PERCUSSION, WIND, STRING;

    public String getName() {
        switch (this) {
            case PERCUSSION:
                return PERCUSSION.toString().toLowerCase();
            case WIND:
                return WIND.toString().toLowerCase();
            case STRING:
                return STRING.toString().toLowerCase();
            default:
                return "Unknown";
        }
    }
}
