public class Smartwatch implements PodcastAbonenntInnen {
    private String name;
    private PodcastServer podcastServer;

    public Smartwatch(String name, PodcastServer podcastServer) {
        this.name = name;
        this.podcastServer = podcastServer;
        System.out.println("-- Smartwatch " + name + " erstellt.");
        podcastServer.addSubscriber(this);
    }

    @Override
    public void update(Podcast podcast) {
        System.out.println("Smartwatch " + name + " received update: " + podcast);
    }

    @Override
    public String getName() {
        return name;
    }

}
