package lab08.prob02;

import java.util.*;

public class Catalog extends TreeSet<Catalog.Student> {

    public class Student implements Comparable<Student> {

        String name;
        double media;
        private int clazz;

        public Student(String nume, double medie, int clazz) {
            this.name = nume;
            this.media = medie;
            this.clazz = clazz;
        }

        @Override
        public int compareTo(Student s) {
            if (this.media == s.media) {
                return this.name.compareTo(s.name);
            }
            return Double.compare(this.media, s.media);

        }

        @Override
        public String toString() {
            return this.name + ", media " + this.media + ", grupa " + this.clazz;
        }
    }

    public Catalog(Comparator<Student> comparator) {
        super(comparator);
    }

    public Catalog() {
        super();
    }

    public void addStudent(String name, double media, int clazz) {
        super.add(new Student(name, media, clazz));
    }

    public Student getStudent(String name) {
        Iterator<Student> it = this.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.name.equals(name)) return s;
        }
        return null;
    }

    public void removeStudent(String name) {
        Student s = getStudent(name);
        if (s != null) {
            super.remove(s);
        }
    }

    /* Dangerous code - possible ConcurrentModificationException
    public void removeStudent(String name) {
        Iterator<Student> it = this.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.name.equals(name)) {
                it.remove();
                break; // iesi din bucla dupa ce l-ai gasit
            }
        }
    }
    */

    // Contine o clasa anonima de tip Comparator ce va fi folosita la crearea Catalog-ului returnat
    public Catalog byClass(int clazz) {
        Comparator<Student> ordineAlfabetica = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        };

        Catalog c = new Catalog(ordineAlfabetica);


        Iterator<Student> it = this.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.clazz == clazz) {
                c.add(s);
            }
        }
        return c;
    }
    /* ATENTIE PRIN CE ITEREZ!
       nu e Iterator<Student> it = c.iterator(); pentru ca
       c este noul catalog pe care abia l-am creat și care în acest moment este
       complet gol!

       Dacă iterez prin c, it.hasNext() va fi false din prima secundă.

       Bucla while nu se va executa niciodată și vei returna un catalog gol.

       Trebuie să iterez prin catalogul curent (this), iar studenții găsiți să îi
       adaug în noul catalog c
     */
}
