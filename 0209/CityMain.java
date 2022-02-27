public class CityMain {
    public static void main(String[] args) {
        for (City city : City.values()) {
            System.out.println(city.toString());
        }

        System.out.println(WeekDay.SUN.nextDay());
        System.out.println(WeekDay.SUN.nextDay(20));
        System.out.println(WeekDay.SUN.getName("hu"));
        System.out.println(WeekDay.SUN.getName("en"));
        System.out.println(WeekDay.SUN.getName("de"));
    }
}
