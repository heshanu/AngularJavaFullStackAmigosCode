package FullStackAngularJava.serverFullStack.implementation;

import FullStackAngularJava.serverFullStack.model.Server;
import FullStackAngularJava.serverFullStack.service.ServerService;

import java.util.Collection;

public class ServerSeriveImplementation implements ServerService {
    @Override
    public Server create(Server server) {
        return null;
    }

    @Override
    public Server ping(String ipAddress) {
        return null;
    }

    @Override
    public Collection<Server> list(int limit) {
        return null;
    }

    @Override
    public Server get(Long id) {
        return null;
    }

    @Override
    public Server update(Server server) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}
