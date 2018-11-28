import java.util.List;

public class Przepis {
    private String nazwaPrzepisu;
    private PoraRoku poraRoku;
    private String trescPrzepisu;
    private int czasWykonaniaDania;
    private List<KrokPrzepisu> krokPrzepisuList;
    private List<Skladnik> listaSkladnikow;

    public Przepis(String nazwaPrzepisu, PoraRoku poraRoku, String trescPrzepisu, int czasWykonaniaDania, List<KrokPrzepisu> krokPrzepisuList, List<Skladnik> listaSkladnikow) {
        this.nazwaPrzepisu = nazwaPrzepisu;
        this.poraRoku = poraRoku;
        this.trescPrzepisu = trescPrzepisu;
        this.czasWykonaniaDania = czasWykonaniaDania;
        this.krokPrzepisuList = krokPrzepisuList;
        this.listaSkladnikow = listaSkladnikow;
    }

    public String getNazwaPrzepisu() {
        return nazwaPrzepisu;
    }

    public PoraRoku getPoraRoku() {
        return poraRoku;
    }

    public String getTrescPrzepisu() {
        return trescPrzepisu;
    }

    public int getCzasWykonaniaDania() {
        return czasWykonaniaDania;
    }

    public List<KrokPrzepisu> getKrokPrzepisuList() {
        return krokPrzepisuList;
    }

    public List<Skladnik> getListaSkladnikow() {
        return listaSkladnikow;
    }
}