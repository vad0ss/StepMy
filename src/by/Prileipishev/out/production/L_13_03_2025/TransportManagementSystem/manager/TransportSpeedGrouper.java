package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.manager;

import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.manager.impl.TransportInterface;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.models.Transport;

import java.util.*;

public class TransportSpeedGrouper implements TransportInterface {

    private final Map<Integer, Set<Transport>> transportBySpeed = new HashMap<>();

    @Override
    public void addTransport(Transport transport) {
        transportBySpeed.putIfAbsent(transport.getSpeed(), new HashSet<Transport>());
        Set<Transport> set = getTransportBySpeed(transport.getSpeed());
        set.add(transport);
    }

    public Set<Transport> getTransportBySpeed(int speed) {
        return transportBySpeed.get(speed);
    }

    public void printTransportBySpeed() {
        for (Integer key : transportBySpeed.keySet()) {
            System.out.println(key + "" + getTransportBySpeed(key));
        }
    }

}
