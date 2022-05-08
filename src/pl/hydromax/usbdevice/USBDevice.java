package pl.hydromax.usbdevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
