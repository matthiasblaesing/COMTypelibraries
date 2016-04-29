
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({858C6BC5-2351-363F-9177-BBFFA86CCB78})</p>
 */
public enum WdViewTypeOld implements IComEnum {
    
    /**
     * (3)
     */
    wdPageView(3),
    
    /**
     * (6)
     */
    wdOnlineView(6),
    ;

    private WdViewTypeOld(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}