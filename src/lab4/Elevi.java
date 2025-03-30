package lab4;

import java.util.List;
import java.util.Objects;

public class Elevi {
    private final String nume;
    private final String prenume;
    private final String grupa;
    private final List<Integer> note;

    public Elevi(String nume, String prenume, String grupa, List<Integer> note) {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.note = List.copyOf(note);
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getGrupa() {
        return grupa;
    }

    public double getMedie() {
        return note.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public long getRestante() {
        return note.stream().filter(n -> n < 5).count();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elevi elevi = (Elevi) o;
        return nume.equals(elevi.nume) &&
                prenume.equals(elevi.prenume) &&
                grupa.equals(elevi.grupa) &&
                note.equals(elevi.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume, grupa, note);
    }

    @Override
    public String toString() {
        return nume + " " + prenume + " " + grupa + " " + note;
    }
}
