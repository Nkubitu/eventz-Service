package providerService;

import utils.Event;
import utils.Provider;
import utils.Service;

import java.util.Set;

/**
 * Created by elainemnkubitu on 4/14/19.
 */
public interface ProviderService {
    public String addService(Service service);
    public void getAllMySListedServices();
    public void deleteMyService(String serviceName);
    public void getMyRequestedServices();
    //see other service providers
    //see recent searches

}
