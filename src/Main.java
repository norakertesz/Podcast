public class Main {
    public static void main(String[] args) {
        System.out.println(" PODCAST START ");
        PodcastServer podcastServer = new PodcastServer();

        Notebook notebook = new Notebook("Asus", podcastServer);
        Smartphone smartphone = new Smartphone("Samsung", podcastServer);
        Smartwatch smartwatch = new Smartwatch("Galaxy", podcastServer);

        Podcast newPodcast = new Podcast("Nora Podcast", "https://nora.com", 37.0);
        podcastServer.veroeffentliche(newPodcast);
        
    }
}