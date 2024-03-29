public class Wilder {

    //attributs
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    //getters
    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    //setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        if(this.isAware()==true) {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware";
        }
        return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
    }
}