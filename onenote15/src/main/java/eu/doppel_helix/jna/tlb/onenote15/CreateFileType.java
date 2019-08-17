
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B5EB9D34-5278-4D8A-AE1F-2F88EA56BBCE})</p>
 */
public enum CreateFileType implements IComEnum {
    
    /**
     * (0)
     */
    cftNone(0),
    
    /**
     * (1)
     */
    cftNotebook(1),
    
    /**
     * (2)
     */
    cftFolder(2),
    
    /**
     * (3)
     */
    cftSection(3),
    ;

    private CreateFileType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}