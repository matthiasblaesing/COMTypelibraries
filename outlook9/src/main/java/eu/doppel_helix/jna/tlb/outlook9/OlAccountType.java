
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlAccountType implements IComEnum {
    
    /**
     * (0)
     */
    olExchange(0),
    
    /**
     * (1)
     */
    olImap(1),
    
    /**
     * (2)
     */
    olPop3(2),
    
    /**
     * (3)
     */
    olHttp(3),
    
    /**
     * (4)
     */
    olEas(4),
    
    /**
     * (5)
     */
    olOtherAccount(5),
    ;

    private OlAccountType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}