
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoFileDialogView implements IComEnum {
    
    /**
     * (1)
     */
    msoFileDialogViewList(1),
    
    /**
     * (2)
     */
    msoFileDialogViewDetails(2),
    
    /**
     * (3)
     */
    msoFileDialogViewProperties(3),
    
    /**
     * (4)
     */
    msoFileDialogViewPreview(4),
    
    /**
     * (5)
     */
    msoFileDialogViewThumbnail(5),
    
    /**
     * (6)
     */
    msoFileDialogViewLargeIcons(6),
    
    /**
     * (7)
     */
    msoFileDialogViewSmallIcons(7),
    
    /**
     * (8)
     */
    msoFileDialogViewWebView(8),
    
    /**
     * (9)
     */
    msoFileDialogViewTiles(9),
    ;

    private MsoFileDialogView(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}