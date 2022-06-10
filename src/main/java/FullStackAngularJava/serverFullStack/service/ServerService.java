package FullStackAngularJava.serverFullStack.service;

import FullStackAngularJava.serverFullStack.model.Server;

import java.util.Collection;

public interface ServerService {
    Server create(Server server);

    Server ping(String ipAddress);

    Collection<Server> list(int limit);

    Server get(Long id);

    Server update(Server server);

    Boolean delete(Long id);
}
