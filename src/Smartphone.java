public class Smartphone implements PodcastAbonenntInnen {
    private String name;
    private PodcastServer podcastServer;

    public Smartphone(String name, PodcastServer podcastServer) {
        this.name = name;
        this.podcastServer = podcastServer;
        System.out.println("-- Smartphone " + name + " erstellt.");
        podcastServer.addSubscriber(this);
    }

    @Override
    public void update(Podcast podcast) {

        System.out.println("Smartphone " + name + " received update: " + podcast);
    }

    @Override
    public String getName() {
        return name;
    }

}
