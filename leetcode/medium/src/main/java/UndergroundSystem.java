import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author harrison
 */
public class UndergroundSystem {
    Map<Integer, TravelRecord> passengerTravelRecords = new HashMap<>();
    Map<Route, TravelTime> routeInfo = new HashMap<>();

    public void checkIn(int id, String stationName, int t) {
        var record = new TravelRecord();
        record.checkIn(stationName, t);
        passengerTravelRecords.put(id, record);
    }

    public void checkOut(int id, String stationName, int t) {
        TravelRecord record = passengerTravelRecords.get(id);
        record.checkOut(stationName, t);

        var route = new Route(record.startStation, record.endStation);
        TravelTime travelTime = routeInfo.getOrDefault(route, new TravelTime());
        travelTime.addTrip(record.checkInTime, record.checkOutTime);
        routeInfo.put(route, travelTime);
    }

    public double getAverageTime(String startStation, String endStation) {
        return routeInfo.get(new Route(startStation, endStation)).getAverageTravelTime();
    }

    static class TravelRecord {
        String startStation;
        String endStation;
        int checkInTime;
        int checkOutTime;

        public void checkIn(String startStation, Integer checkInTime) {
            this.startStation = startStation;
            this.checkInTime = checkInTime;
        }

        public void checkOut(String endStation, Integer checkOutTime) {
            this.endStation = endStation;
            this.checkOutTime = checkOutTime;
        }
    }

    static class Route {
        String startStation;
        String endStation;

        public Route(String startStation, String endStation) {
            this.startStation = startStation;
            this.endStation = endStation;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Route route = (Route) o;
            return Objects.equals(startStation, route.startStation) && Objects.equals(endStation, route.endStation);
        }

        @Override
        public int hashCode() {
            return Objects.hash(startStation, endStation);
        }
    }

    static class TravelTime {
        int totalTimeSpent;
        int numOfTrips;

        double getAverageTravelTime() {
            return (double) totalTimeSpent / numOfTrips;
        }

        void addTrip(int startTime, int endTime) {
            totalTimeSpent += endTime - startTime;
            numOfTrips++;
        }
    }
}
