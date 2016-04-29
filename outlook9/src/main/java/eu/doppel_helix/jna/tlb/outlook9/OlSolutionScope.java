
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlSolutionScope implements IComEnum {
    
    /**
     * (0)
     */
    olHideInDefaultModules(0),
    
    /**
     * (1)
     */
    olShowInDefaultModules(1),
    ;

    private OlSolutionScope(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}