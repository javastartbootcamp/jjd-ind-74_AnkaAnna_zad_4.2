package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan", "Kowalski");
        Worker worker2 = new Worker("Beata", "Nowak");

        Work work1 = new Work("sprzątanie pokoju ",
                "odkurzanie,układnaie przedmiotów na pólkach, wycieranie kurzu, ",
                5.0, worker2);
        Work work2 = new Work("koszenie trawnika",
                "koszenie trawnika w ogrodzie za budynkiem", 0.0, worker1);
        Work work3 = new Work("Podlewanie kwiatów", "podlewanie kwiatów w pokojach gościnnych");

        System.out.println("Praca pierwsza do wykonania: " + work1.getName() + ", "
                + "Pracownik: " + worker2.getName() + " " + worker2.getLastName() + ", "
                + "Priorytet wykonania wysoki: " + work1.highPriority());
        System.out.println("Praca druga do wykonania: " + work2.getName() + ", "
                + "Pracownik: " + worker1.getName() + " " + worker1.getLastName() + ", "
                + "Priorytet wykonania normalny: " + work2.mediumPriority());
    }
}