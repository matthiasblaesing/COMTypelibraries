
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPageBreak implements IComEnum {
    
    /**
     * (-4105)
     */
    xlPageBreakAutomatic(-4105),
    
    /**
     * (-4135)
     */
    xlPageBreakManual(-4135),
    
    /**
     * (-4142)
     */
    xlPageBreakNone(-4142),
    ;

    private XlPageBreak(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}