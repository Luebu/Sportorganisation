public class Halle {
    private Verein mieterliste;
    private double platz;

    public void mieten(Verein pVerein ){
        /*
        Connector.sqlCommand("CREATE TABLE IF NOT EXISTS halle (HalleID int auto_increment, Hallenname String,  Ort String, Straße String, Platz_Insgesamt int, Freier_Platz int, Vergebener_Platz int, primary_key(HalleID))");

         */
    }
    public void freigeben(Verein pVerein) {

    }


    public double getPlatz() {
        return platz;
    }
    public Verein getMieterliste() {
        return mieterliste;
    }
    public void setMieterliste(Verein pMieterliste) {
        mieterliste = pMieterliste;
    }
    public void setPlatz(double pPlatz) {
        platz = pPlatz;
    }
}