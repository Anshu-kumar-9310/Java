package Question97;

public enum Day {

    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWeekday;

    public boolean isWeekday() {
        return isWeekday;
    }

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getDayType(){
        return isWeekday ? "Weekday" : "Weekend";
    }
}
