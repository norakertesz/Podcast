public class Notebook implements PodcastAbonenntInnen {
    private String name;
    private PodcastServer podcastServer;
    public Notebook(String name, PodcastServer podcastServer) {
        this.name=name;
        this.podcastServer=podcastServer;
        System.out.println("--Notebook " + name + " erstellt.");
        podcastServer.addSubscriber((PodcastAbonenntInnen) this);
    }
    @Override
    public void update(Podcast podcast) {
        System.out.println("Notebook " + name + " received update: " + podcast);
    }

    @Override
    public String getName() {
        return name;
    }


}
