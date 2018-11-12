package seekerService;

import utils.Event;

/**
 * Created by elainemnkubitu on 11/11/18.
 */
public interface SeekerService {
    public String addEvent(Event event);
    public void getMyEvents();
    public void deleteMyEvent();
    public void getMySelectedServices();
}
