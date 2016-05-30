
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * The WiaDeviceType enumeration specifies the type of device attached to a user's computer. Use the Type property on the DeviceInfo object or the Device object to obtain these values from the device.
 *
 * <p>uuid({E1FCB780-C848-4076-9637-7609156F47A2})</p>
 */
public enum WiaDeviceType implements IComEnum {
    
    /**
     * The Device type is unknown. (0)
     */
    UnspecifiedDeviceType(0),
    
    /**
     * The Device is a scanner. (1)
     */
    ScannerDeviceType(1),
    
    /**
     * The Device is a camera. (2)
     */
    CameraDeviceType(2),
    
    /**
     * The Device provides streaming video. (3)
     */
    VideoDeviceType(3),
    ;

    private WiaDeviceType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}