public class Podcast {
    private String name;

    private String URL;
    private double lange;

    public void setName(String name) {
        this.name = name;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void setLange(double lange) {
        this.lange = lange;
    }

    public Podcast(String name, String URL, double lange) {
        this.name = name;
        this.URL = URL;
        this.lange = lange;
    }

    public String getName() {
        return name;
    }

    public String getURL() {
        return URL;
    }

    public double getLange() {
        return lange;
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "name='" + name + '\'' +
                ", URL='" + URL + '\'' +
                ", lange=" + lange +
                '}';
    }
}
