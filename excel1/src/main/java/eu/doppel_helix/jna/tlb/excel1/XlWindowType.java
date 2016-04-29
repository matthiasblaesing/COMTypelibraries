
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlWindowType implements IComEnum {
    
    /**
     * (5)
     */
    xlChartAsWindow(5),
    
    /**
     * (4)
     */
    xlChartInPlace(4),
    
    /**
     * (3)
     */
    xlClipboard(3),
    
    /**
     * (-4129)
     */
    xlInfo(-4129),
    
    /**
     * (1)
     */
    xlWorkbook(1),
    ;

    private XlWindowType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}