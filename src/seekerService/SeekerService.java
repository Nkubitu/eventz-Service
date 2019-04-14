package seekerService;

import utils.Event;
import utils.Provider;

import java.util.Set;

/**
 * Created by elainemnkubitu on 11/11/18.
 */
public interface SeekerService {
    public String addEvent(Event event);
    public void getMyEvents();
    public void deleteMyEvent();
    public void getMySelectedServices();
    public Set<Provider> searchServiceProviders(String service);

}

