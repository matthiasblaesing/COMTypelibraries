
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlEditionType implements IComEnum {
    
    /**
     * (1)
     */
    xlPublisher(1),
    
    /**
     * (2)
     */
    xlSubscriber(2),
    ;

    private XlEditionType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}