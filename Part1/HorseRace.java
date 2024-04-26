import java.util.Random;

public class HorseRace {
    public static void main(String [] a)
    {
        Race race = new Race(15);
        Horse h1 = new Horse('A', getRandomName(), getRandomConfidence());
        Horse h2 = new Horse('B', getRandomName(), getRandomConfidence());
        Horse h3 = new Horse('C', getRandomName(), getRandomConfidence());

        race.addHorse(h1, 1);
        race.addHorse(h2, 2);
        race.addHorse(h3, 3);

        race.startRace();
    }

    private static String getRandomName() {
        String[] names = {"Axel", "Beames", "Cherry", "Dexter", "Ella", "Finn", "Gemma", "Harley", "Indigo", "Jasper", "Kai", "Luna", "Milo", "Nova", "Olive", "Piper", "Quinn", "Ryder", "Sierra", "Toby"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    private static double getRandomConfidence() {
        double randomConfidence = 0.1 + Math.random() * 0.9;
        return Math.round(randomConfidence * 100.0) / 100.0;
    }
}
