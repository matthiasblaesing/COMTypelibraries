
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({28B55FC9-4A35-3F42-99FA-923EC633B8F1})</p>
 */
public enum WdGutterStyle implements IComEnum {
    
    /**
     * (0)
     */
    wdGutterPosLeft(0),
    
    /**
     * (1)
     */
    wdGutterPosTop(1),
    
    /**
     * (2)
     */
    wdGutterPosRight(2),
    ;

    private WdGutterStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}