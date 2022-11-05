import java.util.Objects;

public class Racun {
    private boolean odobrenjePrekoracenja;
    private Long brojRacuna;
    private Osoba korisnikRacuna;
    private Double stanjeRacuna;

    public Racun(Long brojRacuna, Osoba korisnikRacuna) {
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = korisnikRacuna;
    }

    private boolean provjeriOdobrenjePrekoracenja(Double prekoracenje){
        return true;
    }
    public boolean izvrsiIsplatu(Double isplata) throws IllegalArgumentException{
        if(isplata > stanjeRacuna)throw new IllegalArgumentException("Isplata veca od stanja racuna!");
        stanjeRacuna = stanjeRacuna - isplata;
        return true;
    }
    public void odobriPrekoracenje(Double prekoracenje){

    }
    public boolean izvrsiUplatu(Double uplata){
        stanjeRacuna = stanjeRacuna + uplata;
        return true;
    }

    public boolean isOdobrenjePrekoracenja() {
        return odobrenjePrekoracenja;
    }

    public void setOdobrenjePrekoracenja(boolean odobrenjePrekoracenja) {
        this.odobrenjePrekoracenja = odobrenjePrekoracenja;
    }

    public Long getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(Long brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public Osoba getKorisnikRacuna() {
        return korisnikRacuna;
    }

    public void setKorisnikRacuna(Osoba korisnikRacuna) {
        this.korisnikRacuna = korisnikRacuna;
    }

    public Double getStanjeRacuna() {
        return stanjeRacuna;
    }

    public void setStanjeRacuna(Double stanjeRacuna) {
        this.stanjeRacuna = stanjeRacuna;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Racun racun = (Racun) o;
        return odobrenjePrekoracenja == racun.odobrenjePrekoracenja && Objects.equals(brojRacuna, racun.brojRacuna) && Objects.equals(korisnikRacuna, racun.korisnikRacuna) && Objects.equals(stanjeRacuna, racun.stanjeRacuna);
    }

    @Override
    public int hashCode() {
        return Objects.hash(odobrenjePrekoracenja, brojRacuna, korisnikRacuna, stanjeRacuna);
    }
}
