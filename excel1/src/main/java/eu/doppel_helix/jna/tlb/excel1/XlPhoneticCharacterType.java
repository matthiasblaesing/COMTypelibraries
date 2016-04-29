
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPhoneticCharacterType implements IComEnum {
    
    /**
     * (0)
     */
    xlKatakanaHalf(0),
    
    /**
     * (1)
     */
    xlKatakana(1),
    
    /**
     * (2)
     */
    xlHiragana(2),
    
    /**
     * (3)
     */
    xlNoConversion(3),
    ;

    private XlPhoneticCharacterType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}