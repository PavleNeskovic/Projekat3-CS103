/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programzaunosiproverupasosa;

/**
 *
 * @author Pavle
 */
public class Osoba {
    private String ime, prezime, drzavljanstvo,datumRodjenja,pol;
    private String MestoIDrzavaRodjenja, prebivaliste, izdatOD;
    private String datumIzdavanja, vaziDo, jmbg;
    

    public Osoba() {
    }

    public Osoba(String ime, String prezime, String drzavljanstvo, String datumRodjenja, String pol, String MestoIDrzavaRodjenja, String prebivaliste, String izdatOD, String datumIzdavanja, String vaziDo, String jmbg) {
        this.ime = ime;
        this.prezime = prezime;
        this.drzavljanstvo = drzavljanstvo;
        this.datumRodjenja = datumRodjenja;
        this.pol = pol;
        this.MestoIDrzavaRodjenja = MestoIDrzavaRodjenja;
        this.prebivaliste = prebivaliste;
        this.izdatOD = izdatOD;
        this.datumIzdavanja = datumIzdavanja;
        this.vaziDo = vaziDo;
        this.jmbg = jmbg;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getDrzavljanstvo() {
        return drzavljanstvo;
    }

    public void setDrzavljanstvo(String drzavljanstvo) {
        this.drzavljanstvo = drzavljanstvo;
    }

    public String getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(String datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getMestoIDrzavaRodjenja() {
        return MestoIDrzavaRodjenja;
    }

    public void setMestoIDrzavaRodjenja(String MestoIDrzavaRodjenja) {
        this.MestoIDrzavaRodjenja = MestoIDrzavaRodjenja;
    }

    public String getPrebivaliste() {
        return prebivaliste;
    }

    public void setPrebivaliste(String prebivaliste) {
        this.prebivaliste = prebivaliste;
    }

    public String getIzdatOD() {
        return izdatOD;
    }

    public void setIzdatOD(String izdatOD) {
        this.izdatOD = izdatOD;
    }

    public String getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(String datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }

    public String getVaziDo() {
        return vaziDo;
    }

    public void setVaziDo(String vaziDo) {
        this.vaziDo = vaziDo;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " JMBG: " + jmbg;
    }
    
    

    
    
}
