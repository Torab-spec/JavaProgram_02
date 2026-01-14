package chapterEleven.challenge97;

public enum Day {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWeekDay;

    Day(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }

    public String getType() {
        return isWeekDay ? "WeekDay" : "WeekEnd";
    }

    public boolean laborDay() {
        return isWeekDay;
    }
}
