
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlConsolidationFunction implements IComEnum {
    
    /**
     * (-4106)
     */
    xlAverage(-4106),
    
    /**
     * (-4112)
     */
    xlCount(-4112),
    
    /**
     * (-4113)
     */
    xlCountNums(-4113),
    
    /**
     * (-4136)
     */
    xlMax(-4136),
    
    /**
     * (-4139)
     */
    xlMin(-4139),
    
    /**
     * (-4149)
     */
    xlProduct(-4149),
    
    /**
     * (-4155)
     */
    xlStDev(-4155),
    
    /**
     * (-4156)
     */
    xlStDevP(-4156),
    
    /**
     * (-4157)
     */
    xlSum(-4157),
    
    /**
     * (-4164)
     */
    xlVar(-4164),
    
    /**
     * (-4165)
     */
    xlVarP(-4165),
    
    /**
     * (1000)
     */
    xlUnknown(1000),
    
    /**
     * (11)
     */
    xlDistinctCount(11),
    ;

    private XlConsolidationFunction(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}