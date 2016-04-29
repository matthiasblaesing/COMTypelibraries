
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({57D6BF95-896D-30E5-B0F0-B97327E7C71D})</p>
 */
public enum WdPaperTray implements IComEnum {
    
    /**
     * (0)
     */
    wdPrinterDefaultBin(0),
    
    /**
     * (1)
     */
    wdPrinterUpperBin(1),
    
    /**
     * (1)
     */
    wdPrinterOnlyBin(1),
    
    /**
     * (2)
     */
    wdPrinterLowerBin(2),
    
    /**
     * (3)
     */
    wdPrinterMiddleBin(3),
    
    /**
     * (4)
     */
    wdPrinterManualFeed(4),
    
    /**
     * (5)
     */
    wdPrinterEnvelopeFeed(5),
    
    /**
     * (6)
     */
    wdPrinterManualEnvelopeFeed(6),
    
    /**
     * (7)
     */
    wdPrinterAutomaticSheetFeed(7),
    
    /**
     * (8)
     */
    wdPrinterTractorFeed(8),
    
    /**
     * (9)
     */
    wdPrinterSmallFormatBin(9),
    
    /**
     * (10)
     */
    wdPrinterLargeFormatBin(10),
    
    /**
     * (11)
     */
    wdPrinterLargeCapacityBin(11),
    
    /**
     * (14)
     */
    wdPrinterPaperCassette(14),
    
    /**
     * (15)
     */
    wdPrinterFormSource(15),
    ;

    private WdPaperTray(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}