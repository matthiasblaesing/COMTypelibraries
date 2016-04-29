
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoClipboardFormat implements IComEnum {
    
    /**
     * (-2)
     */
    msoClipboardFormatMixed(-2),
    
    /**
     * (1)
     */
    msoClipboardFormatNative(1),
    
    /**
     * (2)
     */
    msoClipboardFormatHTML(2),
    
    /**
     * (3)
     */
    msoClipboardFormatRTF(3),
    
    /**
     * (4)
     */
    msoClipboardFormatPlainText(4),
    ;

    private MsoClipboardFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}