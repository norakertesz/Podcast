import java.util.ArrayList;
import java.util.List;

public class PodcastServer {
    private List<PodcastAbonenntInnen> abonnenten = new ArrayList<>();

    public void veroeffentliche(Podcast podcast) {
        if (podcast == null) {
            return;
        }

        for (PodcastAbonenntInnen abonnent : abonnenten) {
            if (abonnent != null) {
                abonnent.update(podcast);
            }
        }
    }

    public void addSubscriber(PodcastAbonenntInnen abonnent) {
        abonnenten.add(abonnent);
        System.out.println("- Podcast: added Subscriber: " + abonnent.getName()+"!");
    }

    public void removeSubscriber(PodcastAbonenntInnen abonnent) {
        abonnenten.remove(abonnent);
        System.out.println("- PodcastServer: removed Subscriber: " + abonnent.getName()+"!");
    }

}
