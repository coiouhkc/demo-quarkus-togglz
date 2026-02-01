package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.togglz.core.context.FeatureContext;
import org.togglz.core.manager.FeatureManager;

@Path("/hello")
public class GreetingResource {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST, say-my-name=" + FeatureContext.getFeatureManager().isActive(MyFeatures.FEATURE_SAY_MY_NAME);
    }

}
