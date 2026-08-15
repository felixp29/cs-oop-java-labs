package lab05.prob03;

// Definesc o clasa nou care mosteneste comportamentul unei exceptii standard
public class NegativeNumberException extends RuntimeException {

    // constructorul fara parametrii (cazul default)
    public NegativeNumberException() {
        // super(...) apeleaza constructorul din clasa parinte RuntimeException
        // si ii paseaza mesajul implicit
        super("Numarul introdus este negativ!");
    }

    // constructor flexibil cu mesaj la alegere
    public NegativeNumberException(String message) {
        // trimite catre clasa parinte mesajul specificat de programator
        super(message);
    }
}
