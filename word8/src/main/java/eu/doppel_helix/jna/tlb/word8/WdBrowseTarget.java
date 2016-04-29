
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D82B33F8-1B6D-3829-BBCA-57D150E4C00D})</p>
 */
public enum WdBrowseTarget implements IComEnum {
    
    /**
     * (1)
     */
    wdBrowsePage(1),
    
    /**
     * (2)
     */
    wdBrowseSection(2),
    
    /**
     * (3)
     */
    wdBrowseComment(3),
    
    /**
     * (4)
     */
    wdBrowseFootnote(4),
    
    /**
     * (5)
     */
    wdBrowseEndnote(5),
    
    /**
     * (6)
     */
    wdBrowseField(6),
    
    /**
     * (7)
     */
    wdBrowseTable(7),
    
    /**
     * (8)
     */
    wdBrowseGraphic(8),
    
    /**
     * (9)
     */
    wdBrowseHeading(9),
    
    /**
     * (10)
     */
    wdBrowseEdit(10),
    
    /**
     * (11)
     */
    wdBrowseFind(11),
    
    /**
     * (12)
     */
    wdBrowseGoTo(12),
    ;

    private WdBrowseTarget(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}