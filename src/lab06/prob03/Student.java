package lab06.prob03;

import java.util.Vector;

public class Student implements Persoana {

    private String numeStudent;
    private Vector<Double> medii;

    // Constructor simplu: initializeaza automat vectorul intern
    public Student(String nume) {
        this.numeStudent = nume;
        this.medii = new Vector<>();
    }

    // Constructor cu vector gata format (daca am deja datele)
    public Student(String nume, Vector<Double> medii) {
        this.numeStudent = nume;
        this.medii = medii;
    }

    @Override
    public double calculMedieGenerala() {
        if (medii == null || medii.isEmpty()) {
            return 0.0;
        }
        double sumaMediilor = 0;
        for (int i = 0; i < medii.size(); i++) {
            sumaMediilor = sumaMediilor + medii.get(i);
        }
        return sumaMediilor / medii.size();
    }

    @Override
    public String getNume() {
        return numeStudent;
    }

    @Override
    public void setNume(String nume) {
        this.numeStudent = nume;
    }

    public void addMedie(double medie) {
        if (this.medii == null) {
            this.medii = new Vector<>();
        }
        this.medii.add(medie);
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;

        // 1. Criteriul principal: alfabetic dupa nume
        // merge si int rezNume = this.numeStudent.compareTo(s.numeStudent); pt ca
        // Orice bucată de cod scrisă în interiorul fișierului class Student are drepturi depline
        // să acceseze câmpurile private ale oricărui obiect de tip Student. Metoda compareTo se
        // afla chiar in interiorul clasei Student, deci compilatorul ii permite sa citeasca s.numeStudent

        int rezNume = this.numeStudent.compareTo(s.getNume());
        if (rezNume != 0) {
            return rezNume;
        }

        // 2. Criteriul secundar: La nume identice, cel cu media mai mare este primul (descrescator)
        // Compar s.calculMedieGenerala() cu this.calculMedieGenerala() pt ORDINEA DESCRESCATOARE
        return Double.compare(s.calculMedieGenerala(), this.calculMedieGenerala());

        // asa e pentru crescator, pt medie mare si dupa cel cu medie mai mica pun invers: intai s. si dupa this.
        // return Double.compare(this.calculMedieGenerala(), s.calculMedieGenerala());
    }

    /*
     * Deoarece interfața este declarată ```interface Persoana extends Comparable```, orice clasă
     * care implementează ```Persoana``` este obligată să implementeze metoda
     * ```public int compareTo(Object o)```.
     * NU ai nevoie de un câmp separat de tip Comparator în interiorul lui Student.

    Comparator alfabeticAZ =
            // ce urmeaza acum intre { } este o CLASA ANONIMA
            // daca vr sa refolosesc acest criteriu de comparatie, mai bine scriu o clasa concreta
            new Comparator() {
                @Override
                public int compare(Object numeStudent1, Object numeStudent2) {
                    String nume1 = (String) numeStudent1;
                    String nume2 = (String) numeStudent2;
                    return nume1.compareTo(nume2);
                }
            };

    */

    @Override
    public String toString() {
        return "\n" + numeStudent + " " + medii + ", media generala: " + calculMedieGenerala();

    }
}
