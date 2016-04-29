
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({2865FA06-2E76-3355-A5BC-60F362370C60})</p>
 */
public enum WdTabLeader implements IComEnum {
    
    /**
     * (0)
     */
    wdTabLeaderSpaces(0),
    
    /**
     * (1)
     */
    wdTabLeaderDots(1),
    
    /**
     * (2)
     */
    wdTabLeaderDashes(2),
    
    /**
     * (3)
     */
    wdTabLeaderLines(3),
    
    /**
     * (4)
     */
    wdTabLeaderHeavy(4),
    
    /**
     * (5)
     */
    wdTabLeaderMiddleDot(5),
    ;

    private WdTabLeader(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}