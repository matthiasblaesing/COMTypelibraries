
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum WdStylisticSet implements IComEnum {
    
    /**
     * (0)
     */
    wdStylisticSetDefault(0),
    
    /**
     * (1)
     */
    wdStylisticSet01(1),
    
    /**
     * (2)
     */
    wdStylisticSet02(2),
    
    /**
     * (4)
     */
    wdStylisticSet03(4),
    
    /**
     * (8)
     */
    wdStylisticSet04(8),
    
    /**
     * (16)
     */
    wdStylisticSet05(16),
    
    /**
     * (32)
     */
    wdStylisticSet06(32),
    
    /**
     * (64)
     */
    wdStylisticSet07(64),
    
    /**
     * (128)
     */
    wdStylisticSet08(128),
    
    /**
     * (256)
     */
    wdStylisticSet09(256),
    
    /**
     * (512)
     */
    wdStylisticSet10(512),
    
    /**
     * (1024)
     */
    wdStylisticSet11(1024),
    
    /**
     * (2048)
     */
    wdStylisticSet12(2048),
    
    /**
     * (4096)
     */
    wdStylisticSet13(4096),
    
    /**
     * (8192)
     */
    wdStylisticSet14(8192),
    
    /**
     * (16384)
     */
    wdStylisticSet15(16384),
    
    /**
     * (32768)
     */
    wdStylisticSet16(32768),
    
    /**
     * (65536)
     */
    wdStylisticSet17(65536),
    
    /**
     * (131072)
     */
    wdStylisticSet18(131072),
    
    /**
     * (262144)
     */
    wdStylisticSet19(262144),
    
    /**
     * (524288)
     */
    wdStylisticSet20(524288),
    ;

    private WdStylisticSet(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}