package adminService;

import utils.Event;
import utils.Provider;
import utils.Seeker;

import java.util.Set;

/**
 * Created by elainemnkubitu on 4/14/19.
 */
public interface adminService {
    public Set<Provider> getAllProviders();
    public Set<Event> getAllListedEvents();
    public Set<Seeker> getAllSeekers();
    public void suspendAccount();
    public Set<String> getAllServiceProviders(String service);

}
