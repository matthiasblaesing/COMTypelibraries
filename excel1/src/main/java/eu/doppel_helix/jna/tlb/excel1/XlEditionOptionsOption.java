
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlEditionOptionsOption implements IComEnum {
    
    /**
     * (4)
     */
    xlAutomaticUpdate(4),
    
    /**
     * (1)
     */
    xlCancel(1),
    
    /**
     * (6)
     */
    xlChangeAttributes(6),
    
    /**
     * (5)
     */
    xlManualUpdate(5),
    
    /**
     * (3)
     */
    xlOpenSource(3),
    
    /**
     * (3)
     */
    xlSelect(3),
    
    /**
     * (2)
     */
    xlSendPublisher(2),
    
    /**
     * (2)
     */
    xlUpdateSubscriber(2),
    ;

    private XlEditionOptionsOption(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}