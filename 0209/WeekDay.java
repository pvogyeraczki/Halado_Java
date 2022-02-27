public enum WeekDay {
    MON("Hétfő", "Monday", "Montag"),
    TUE("Kedd", "Tuesday", "Dienstag"),
    WED("Szerda", "Wednesday", "MittWoch"),
    THU("Csütörtök", "Thursday", "Donnerstag"),
    FRI("Péntek", "Friday", "Freitag"),
    SAT("Szombat", "Saturday", "Samstag"),
    SUN("Vasárnáp", "Sunday", "Sonntag");

    String[] names;
    static final String[] langs = {"hu", "en", "de"};

    WeekDay(String... names) {
        this.names = names;
    }

    public WeekDay nextDay() {
        var allDays = WeekDay.values();
        var nextDayIndex = (this.ordinal()+1) % allDays.length;
        return allDays[nextDayIndex];
    }

    public WeekDay nextDay(int numOfDays) {
        var allDays = WeekDay.values();
        var nextDayIndex = (numOfDays-1) % allDays.length;
        return allDays[nextDayIndex];
    }

    public String getName(String lang) {
        for(int i = 0; i < langs.length; i++) {
            if(lang.equals(langs[i])) {
                if(names.length < i+1) {
                    return "?";
                }
                return names[i];
            }
        }

        return "?";
    }
}