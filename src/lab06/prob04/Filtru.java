package lab06.prob04;

import java.io.FilenameFilter;
import java.io.File;

public class Filtru implements FilenameFilter {

    String extensie;

    Filtru(String extensie) {
        this.extensie = extensie;
    }

    @Override
    public boolean accept(File dir, String nume) {
        return nume.endsWith("." + extensie);
    }
}
