
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({3BD9B6CC-D6CF-34C9-A032-B9131B8081D4})</p>
 */
public enum WdEditorType implements IComEnum {
    
    /**
     * (-1)
     */
    wdEditorEveryone(-1),
    
    /**
     * (-4)
     */
    wdEditorOwners(-4),
    
    /**
     * (-5)
     */
    wdEditorEditors(-5),
    
    /**
     * (-6)
     */
    wdEditorCurrent(-6),
    ;

    private WdEditorType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}