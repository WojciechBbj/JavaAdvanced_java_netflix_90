package pl.yellowduck.netflix90;

import com.fasterxml.jackson.databind.ObjectMapper;
import recources.Address;
import recources.CassetteAddException;
import recources.Client;
import recources.VideoCassette;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;

import static recources.ClientStatus.NORMAL;
import static recources.ClientStatus.VIP;

public class Main6 {

    public static void main(String[] args) {

        Set<Client> clients = new HashSet<>();

        Client client1 = new Client("001", "Piotr", "Adamczyk", new Address("Rynek Jeżycki 1", "Poznań", "60-100"), VIP);
        Client client2 = new Client("002", "Tomasz", "Karolak", new Address("Rynek Jeżycki 2", "Poznań", "60-100"), NORMAL);

        clients.add(client1);
        clients.add(client2);

//        File fileClients = new File("fileClients.txt");
//
//        try {
//            PrintWriter printWriter = new PrintWriter("fileClients.txt");
//            printWriter.println(clients);
//            printWriter.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        final Path file = Paths.get("fileClients.txt");



    }
}
