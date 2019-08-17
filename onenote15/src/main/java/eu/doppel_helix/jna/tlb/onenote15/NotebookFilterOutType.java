
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({13F18B04-E76F-42E0-97E6-8B6ABF38B484})</p>
 */
public enum NotebookFilterOutType implements IComEnum {
    
    /**
     * (1)
     */
    nfoLocal(1),
    
    /**
     * (2)
     */
    nfoNetwork(2),
    
    /**
     * (4)
     */
    nfoWeb(4),
    
    /**
     * (8)
     */
    nfoNoWacUrl(8),
    ;

    private NotebookFilterOutType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}