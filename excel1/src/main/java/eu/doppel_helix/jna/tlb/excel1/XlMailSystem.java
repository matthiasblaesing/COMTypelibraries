
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlMailSystem implements IComEnum {
    
    /**
     * (1)
     */
    xlMAPI(1),
    
    /**
     * (0)
     */
    xlNoMailSystem(0),
    
    /**
     * (2)
     */
    xlPowerTalk(2),
    ;

    private XlMailSystem(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}