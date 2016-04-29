
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({9C68240F-079D-3FB0-ADA8-09D8F318B022})</p>
 */
public enum WdRevisionsMode implements IComEnum {
    
    /**
     * (0)
     */
    wdBalloonRevisions(0),
    
    /**
     * (1)
     */
    wdInLineRevisions(1),
    
    /**
     * (2)
     */
    wdMixedRevisions(2),
    ;

    private WdRevisionsMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}