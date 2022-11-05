import java.util.ArrayList;
import java.util.List;

public class Banka {
    private List<Korisnik> korisnici = new ArrayList<>();
    private List<Uposlenik> uposlenici = new ArrayList<>();

    public Banka() {
    }
    public Uposlenik kreirajNovogUposlenika(String ime, String prezime){
        uposlenici.add(new Uposlenik(ime,prezime));
        return new Uposlenik(ime, prezime);
    }

    public Korisnik kreirajNovogKorisnika(String ime, String prezime){
        korisnici.add(new Korisnik(ime,prezime));
        return new Korisnik(ime, prezime);
    }
    public Racun kreirajRacunZaKorisnika(Korisnik korisnik){
        for(Korisnik korisnik1 : korisnici){
            if(korisnik1.equals(korisnik)){
                korisnik1.dodajRacun(new Racun(111L,new Osoba("ime","prezime")));
            }
        }

        return new Racun(21312L,new Osoba("test","test"));
    }

    public List<Korisnik> getKorisnici() {
        return korisnici;
    }

    public void setKorisnici(List<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public List<Uposlenik> getUposlenici() {
        return uposlenici;
    }

    public void setUposlenici(List<Uposlenik> uposlenici) {
        this.uposlenici = uposlenici;
    }
}
