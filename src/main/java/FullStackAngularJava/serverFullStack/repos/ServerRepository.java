package FullStackAngularJava.serverFullStack.repos;

import FullStackAngularJava.serverFullStack.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server,Long> {
    Server findByIpAddress(String ipAddress);
    //Server findByName(String name);
}
