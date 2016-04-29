
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({28594D1A-A83A-3372-A275-C1700CFB7D42})</p>
 */
public enum WdStoryType implements IComEnum {
    
    /**
     * (1)
     */
    wdMainTextStory(1),
    
    /**
     * (2)
     */
    wdFootnotesStory(2),
    
    /**
     * (3)
     */
    wdEndnotesStory(3),
    
    /**
     * (4)
     */
    wdCommentsStory(4),
    
    /**
     * (5)
     */
    wdTextFrameStory(5),
    
    /**
     * (6)
     */
    wdEvenPagesHeaderStory(6),
    
    /**
     * (7)
     */
    wdPrimaryHeaderStory(7),
    
    /**
     * (8)
     */
    wdEvenPagesFooterStory(8),
    
    /**
     * (9)
     */
    wdPrimaryFooterStory(9),
    
    /**
     * (10)
     */
    wdFirstPageHeaderStory(10),
    
    /**
     * (11)
     */
    wdFirstPageFooterStory(11),
    
    /**
     * (12)
     */
    wdFootnoteSeparatorStory(12),
    
    /**
     * (13)
     */
    wdFootnoteContinuationSeparatorStory(13),
    
    /**
     * (14)
     */
    wdFootnoteContinuationNoticeStory(14),
    
    /**
     * (15)
     */
    wdEndnoteSeparatorStory(15),
    
    /**
     * (16)
     */
    wdEndnoteContinuationSeparatorStory(16),
    
    /**
     * (17)
     */
    wdEndnoteContinuationNoticeStory(17),
    ;

    private WdStoryType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}