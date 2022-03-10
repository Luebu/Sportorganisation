import Databse.Connector;
public class Mitglied {
    private String name;
    private int alter;

    public String terminEinsehen() {
        String termin = null; //null nur um errormeldungen zu vermieden
        return termin;
    }

    public int getAlter() {
        return alter;
    }

    public String getName() {
        return name;
    }

    public void setAlter(int pAlter) {
        alter = pAlter;
    }

    public void setName(String pName) {
        name = pName;
    }

}
