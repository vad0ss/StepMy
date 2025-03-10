package by.Prileipishev.out.production.L_10_03_2025.Transport2;

import java.util.*;

public class TransportManager {

    private final Map<String, Transport> transportByPlate = new HashMap<>();
    private final Map<String, List<Transport>> transportByType = new HashMap<>();


    public void addTransport(Transport transport) {
        transportByPlate.putIfAbsent(transport.getLicensePlate(), transport);

        transportByType.putIfAbsent(transport.getClass().getSimpleName(), new ArrayList<>());
        List<Transport> transports = transportByType.get(transport.getClass().getSimpleName());
        transports.add(transport);
    }

    public void removeTransport(String licensePlate) {
        Transport removeTransport = transportByPlate.remove(licensePlate);

        List<Transport> list = transportByType.get(removeTransport.getClass().getSimpleName());
        list.remove(removeTransport);
    }

    public Transport findTransportByPlate(String licensePlate) {
        return transportByPlate.get(licensePlate);
    }

    public List<Transport> getTransportByType(String type) {

    }

}
