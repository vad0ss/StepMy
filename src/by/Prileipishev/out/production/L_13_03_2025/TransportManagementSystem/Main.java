package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem;

import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.Transports.Transport;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.Transports.TransportFactory;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.Transports.TransportUserManager;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.User.User;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.User.UserFactory;

public class Main {

    public static void main(String[] args) {

        TransportUserManager transportUserManager = new TransportUserManager();

        for (int i = 0; i < 20; i++) {
            User user = UserFactory.next();
            Transport transport = TransportFactory.next(user);
            transportUserManager.addTransport(transport);
        }

        transportUserManager.printAllOwnersAndTransport();

        System.out.println(transportUserManager.findOwnerWithMostCars().getName());

    }

}
