public class switchExample {
    public static void main(String[] args) {

        int planets = 8;
        String planetString;
        switch (planets) {
            case 1:  planetString = "Mercury";
                break;
            case 2:  planetString = "Venus";
                break;
            case 3:  planetString = "Earth";
                break;
            case 4:  planetString = "Mars";
                break;
            case 5:  planetString= "Jupiter";
                break;
            case 6:  planetString = "Saturn";
                break;
            case 7:  planetString = "Uranus";
                break;
            case 8:  planetString = "Neptune";
                break;
            default: planetString = "Invalid string";
                break;
        }
        System.out.println(planetString);
    }
}
