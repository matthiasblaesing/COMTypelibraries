
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlCalculatedMemberType implements IComEnum {
    
    /**
     * (0)
     */
    xlCalculatedMember(0),
    
    /**
     * (1)
     */
    xlCalculatedSet(1),
    
    /**
     * (2)
     */
    xlCalculatedMeasure(2),
    ;

    private XlCalculatedMemberType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}