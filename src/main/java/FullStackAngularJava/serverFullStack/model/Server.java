package FullStackAngularJava.serverFullStack.model;

import FullStackAngularJava.serverFullStack.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    @NotEmpty(message = "ip adddress cannot be empty or null")
    private String IpAddress;
    private String name;

    @Override
    public String toString() {
        return "Server{" +
                "id=" + id +
                ", IpAddress='" + IpAddress + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", status=" + status +
                '}';
    }

    private String type;
    private String imageUrl;

    public Server() {
    }

    public Server(String ipAddress, String name, String type, String imageUrl, Status status) {
        IpAddress = ipAddress;
        this.name = name;
        this.type = type;
        this.imageUrl = imageUrl;
        this.status = status;
    }

    //enumn
    private Status status;
}
