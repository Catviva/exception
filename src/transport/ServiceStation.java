package transport;

import java.util.List;
import java.util.Queue;

public class ServiceStation {

    private Queue<Transport> queue;

    public ServiceStation(Queue<Transport> queue) {
        this.queue = queue;
    }

   public void addCarToQueue (Transport transport) {
        if (transport.needDiagnostic()) {
            queue.add(transport);
        }
   }
   public void carryOutCarInspection (Queue<Transport> queue) {
        if (queue.isEmpty()) {
            System.out.println("У данного трнспорта нет механика");
        } else {
            while (!queue.isEmpty()){
                Transport currentTransport = queue.poll();
                List<Mechanic> mechanicList = currentTransport.getMechanicList();
                for (Mechanic mechanic : mechanicList) {
                    mechanic.carryOutMaintenance(currentTransport);

                }
            }
        }
   }
}
