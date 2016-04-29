
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({41700B9A-149A-3173-9324-E651080B9918})</p>
 */
public enum WdDefaultFilePath implements IComEnum {
    
    /**
     * (0)
     */
    wdDocumentsPath(0),
    
    /**
     * (1)
     */
    wdPicturesPath(1),
    
    /**
     * (2)
     */
    wdUserTemplatesPath(2),
    
    /**
     * (3)
     */
    wdWorkgroupTemplatesPath(3),
    
    /**
     * (4)
     */
    wdUserOptionsPath(4),
    
    /**
     * (5)
     */
    wdAutoRecoverPath(5),
    
    /**
     * (6)
     */
    wdToolsPath(6),
    
    /**
     * (7)
     */
    wdTutorialPath(7),
    
    /**
     * (8)
     */
    wdStartupPath(8),
    
    /**
     * (9)
     */
    wdProgramPath(9),
    
    /**
     * (10)
     */
    wdGraphicsFiltersPath(10),
    
    /**
     * (11)
     */
    wdTextConvertersPath(11),
    
    /**
     * (12)
     */
    wdProofingToolsPath(12),
    
    /**
     * (13)
     */
    wdTempFilePath(13),
    
    /**
     * (14)
     */
    wdCurrentFolderPath(14),
    
    /**
     * (15)
     */
    wdStyleGalleryPath(15),
    
    /**
     * (19)
     */
    wdBorderArtPath(19),
    ;

    private WdDefaultFilePath(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}