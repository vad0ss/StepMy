package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.Transports;

import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.Transports.Interfaces.TransportInterface;

import java.util.*;

public class TransportSpeedGrouper implements TransportInterface {

    private Map<Integer, Set<Transport>> transportBySpeed = new HashMap<>();

    @Override
    public void addTransport(Transport transport) {
        transportBySpeed.putIfAbsent(transport.getSpeed(), new HashSet<Transport>());
        Set<Transport> set = getTransportBySpeed(transport.getSpeed());
        set.add(transport);
        transportBySpeed.put(transport.getSpeed(), set);
    }

    public Set<Transport> getTransportBySpeed(int speed) {
        return transportBySpeed.get(speed) != null ? transportBySpeed.get(speed) : null;
    }

    public void printTransportBySpeed() {
        for (Integer key : transportBySpeed.keySet()) {
            System.out.println(key + "" + getTransportBySpeed(key));
        }
    }

}
