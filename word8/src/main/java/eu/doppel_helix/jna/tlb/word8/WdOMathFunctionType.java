
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({74779721-3C00-363D-BED4-B0AF3595EB05})</p>
 */
public enum WdOMathFunctionType implements IComEnum {
    
    /**
     * (1)
     */
    wdOMathFunctionAcc(1),
    
    /**
     * (2)
     */
    wdOMathFunctionBar(2),
    
    /**
     * (3)
     */
    wdOMathFunctionBox(3),
    
    /**
     * (4)
     */
    wdOMathFunctionBorderBox(4),
    
    /**
     * (5)
     */
    wdOMathFunctionDelim(5),
    
    /**
     * (6)
     */
    wdOMathFunctionEqArray(6),
    
    /**
     * (7)
     */
    wdOMathFunctionFrac(7),
    
    /**
     * (8)
     */
    wdOMathFunctionFunc(8),
    
    /**
     * (9)
     */
    wdOMathFunctionGroupChar(9),
    
    /**
     * (10)
     */
    wdOMathFunctionLimLow(10),
    
    /**
     * (11)
     */
    wdOMathFunctionLimUpp(11),
    
    /**
     * (12)
     */
    wdOMathFunctionMat(12),
    
    /**
     * (13)
     */
    wdOMathFunctionNary(13),
    
    /**
     * (14)
     */
    wdOMathFunctionPhantom(14),
    
    /**
     * (15)
     */
    wdOMathFunctionScrPre(15),
    
    /**
     * (16)
     */
    wdOMathFunctionRad(16),
    
    /**
     * (17)
     */
    wdOMathFunctionScrSub(17),
    
    /**
     * (18)
     */
    wdOMathFunctionScrSubSup(18),
    
    /**
     * (19)
     */
    wdOMathFunctionScrSup(19),
    
    /**
     * (20)
     */
    wdOMathFunctionText(20),
    
    /**
     * (21)
     */
    wdOMathFunctionNormalText(21),
    
    /**
     * (22)
     */
    wdOMathFunctionLiteralText(22),
    ;

    private WdOMathFunctionType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}