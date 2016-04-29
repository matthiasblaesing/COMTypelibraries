
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPictureConvertorType implements IComEnum {
    
    /**
     * (1)
     */
    xlBMP(1),
    
    /**
     * (7)
     */
    xlCGM(7),
    
    /**
     * (4)
     */
    xlDRW(4),
    
    /**
     * (5)
     */
    xlDXF(5),
    
    /**
     * (8)
     */
    xlEPS(8),
    
    /**
     * (6)
     */
    xlHGL(6),
    
    /**
     * (13)
     */
    xlPCT(13),
    
    /**
     * (10)
     */
    xlPCX(10),
    
    /**
     * (11)
     */
    xlPIC(11),
    
    /**
     * (12)
     */
    xlPLT(12),
    
    /**
     * (9)
     */
    xlTIF(9),
    
    /**
     * (2)
     */
    xlWMF(2),
    
    /**
     * (3)
     */
    xlWPG(3),
    ;

    private XlPictureConvertorType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}