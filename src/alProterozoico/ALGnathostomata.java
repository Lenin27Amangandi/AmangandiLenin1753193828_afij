package alProterozoico;

public abstract class ALGnathostomata {

    public ALGnathostomata() {
        alMostrarSpiner();
        System.out.println("|" + "-".repeat(3) + " Gnathostomata");
    }

    public void alMostrarSpiner() {
        String charge[] = { "|", "/", "-", "\\" };
        for (int i = 1; i <= 100; i++) {
            System.out.print("\r" + charge[i % charge.length] + " " + i + "%");
            try {
                Thread.sleep(05);
            } catch (InterruptedException ie) {
            }
        }
    }

}
