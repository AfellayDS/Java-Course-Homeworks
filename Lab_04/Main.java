public class Main {
    public static void main(String[] args) {
        // planets arranged in order of distance from the Sun
        int num = 3;
        String planet = switch(num) {
            case 1 -> "Mercury";
            case 2 -> "Venus";
            case 3 -> "Earth";
            case 4 -> "Mars";
            case 5 -> "Jupiter";
            case 6 -> "Saturn";
            case 7 -> "Uranus";
            case 8 -> "Neptune";
            default -> null;
        };
        System.out.println(planet);

        enum Language {JAVA, PYTHON, CPP}
        Language language = Language.JAVA;
        switch (language) {
            case JAVA:
                System.out.println("Best");
                break;
            case PYTHON:
                System.out.println("Comfortable");
                break;
            case CPP:
                System.out.println("Fast");
                break;
        }

        String day = "Saturday";
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("working day");
                break;
            case "Saturday":
                System.out.println("shabbat");
                break;
            case "Sunday":
                System.out.println("day off");
                break;
        }
    }
}