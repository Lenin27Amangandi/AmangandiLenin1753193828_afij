package alFanerozoico;

import alProterozoico.ALAmniota;

public abstract class ALReptiles extends ALAmniota {
    public ALReptiles() {
        alMostrarSpiner();
        System.out.println("|" + "-".repeat(18) + " Reptiles");
    }

}
