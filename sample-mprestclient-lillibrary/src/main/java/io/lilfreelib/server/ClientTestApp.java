package io.lilfreelib.server
;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("client")
public class ClientTestApp extends Application {

	public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(ClientTestResource.class);
        return classes;
    }
}

