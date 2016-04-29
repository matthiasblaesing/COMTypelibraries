
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlTaskStatus implements IComEnum {
    
    /**
     * (0)
     */
    olTaskNotStarted(0),
    
    /**
     * (1)
     */
    olTaskInProgress(1),
    
    /**
     * (2)
     */
    olTaskComplete(2),
    
    /**
     * (3)
     */
    olTaskWaiting(3),
    
    /**
     * (4)
     */
    olTaskDeferred(4),
    ;

    private OlTaskStatus(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}