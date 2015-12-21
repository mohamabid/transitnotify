package com.notifyme.transitnotify.datamodel;

/**
 * Created by Abid(mohamabid) on 12/20/2015.
 */
public class VehicleDetails {
    private final int routeNo;
    private final String destination;
    private final long arrivalTime;
    private final String vehicleId;
    private final double lat;
    private final double lon;
    private final double heading;
    private final boolean delayed;

    public VehicleDetails(int routeNo, String destination, long arrivalTime, String vehicleId, double lat, double lon, double heading, boolean delayed) {
        this.routeNo = routeNo;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
        this.vehicleId = vehicleId;
        this.lat = lat;
        this.lon = lon;
        this.heading = heading;
        this.delayed = delayed;
    }

    public int getRouteNo() {
        return routeNo;
    }

    public String getDestination() {
        return destination;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public double getHeading() {
        return heading;
    }

    public boolean isDelayed() {
        return delayed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VehicleDetails)) return false;

        VehicleDetails that = (VehicleDetails) o;

        if (getRouteNo() != that.getRouteNo()) return false;
        if (getArrivalTime() != that.getArrivalTime()) return false;
        if (Double.compare(that.getLat(), getLat()) != 0) return false;
        if (Double.compare(that.getLon(), getLon()) != 0) return false;
        if (Double.compare(that.getHeading(), getHeading()) != 0) return false;
        if (isDelayed() != that.isDelayed()) return false;
        if (getDestination() != null ? !getDestination().equals(that.getDestination()) : that.getDestination() != null)
            return false;
        return !(getVehicleId() != null ? !getVehicleId().equals(that.getVehicleId()) : that.getVehicleId() != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getRouteNo();
        result = 31 * result + (getDestination() != null ? getDestination().hashCode() : 0);
        result = 31 * result + (int) (getArrivalTime() ^ (getArrivalTime() >>> 32));
        result = 31 * result + (getVehicleId() != null ? getVehicleId().hashCode() : 0);
        temp = Double.doubleToLongBits(getLat());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getLon());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getHeading());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isDelayed() ? 1 : 0);
        return result;
    }
}
