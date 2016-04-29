
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D08FA7EE-D986-3539-AA28-10DBAB03E863})</p>
 */
public enum WdMonthNames implements IComEnum {
    
    /**
     * (0)
     */
    wdMonthNamesArabic(0),
    
    /**
     * (1)
     */
    wdMonthNamesEnglish(1),
    
    /**
     * (2)
     */
    wdMonthNamesFrench(2),
    ;

    private WdMonthNames(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}