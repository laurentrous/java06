public class Classroom {
    public static void main(String[] args) {
        Wilder antoine = new Wilder("Antoine", false);
        System.out.println(antoine.whoAmI());

        Wilder elodie = new Wilder("Elodie", true);
        System.out.println(elodie.whoAmI());

        Wilder sebastien = new Wilder("Sébastien", true);
        System.out.println(sebastien.whoAmI());
    }
}