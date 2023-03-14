package homeworks.enum_homeworks.enum2.exercise_5;

public class Test {
    public static void main(String[] args) {
        Seasons season1 = Seasons.SPRING;
        Seasons season2 = Seasons.SPRING;
        Seasons season3 = Seasons.SPRING;
        Seasons season4 = Seasons.SPRING;
        SeasonsTemperatures season = new SeasonsTemperatures();
        season.findSeasons(17);
        season.findSeasons(37);
        season.findSeasons(13);
        season.findSeasons(-3);
        season.findSeasons(45);
    }
}
