
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * A DeviceEvent's type is composed of bits from the WiaEventFlags enumeration. You can test a DeviceEvent's type by using the AND operation with DeviceEvent.Type and a member from the WiaEventFlags enumeration.
 *
 * <p>uuid({D346BBB7-9EDC-4FC9-AB79-A65E2F204ED3})</p>
 */
public enum WiaEventFlag implements IComEnum {
    
    /**
     * Indicates that the DeviceEvent is intended to notify an application that is already running that this event has occurred. (1)
     */
    NotificationEvent(1),
    
    /**
     * Indicates that the DeviceEvent can, if necessary, launch an application if this event occurs. (2)
     */
    ActionEvent(2),
    ;

    private WiaEventFlag(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}