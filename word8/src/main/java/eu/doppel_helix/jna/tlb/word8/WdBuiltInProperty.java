
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B9EDE5B0-50FA-3327-B624-B21F9391AD5B})</p>
 */
public enum WdBuiltInProperty implements IComEnum {
    
    /**
     * (1)
     */
    wdPropertyTitle(1),
    
    /**
     * (2)
     */
    wdPropertySubject(2),
    
    /**
     * (3)
     */
    wdPropertyAuthor(3),
    
    /**
     * (4)
     */
    wdPropertyKeywords(4),
    
    /**
     * (5)
     */
    wdPropertyComments(5),
    
    /**
     * (6)
     */
    wdPropertyTemplate(6),
    
    /**
     * (7)
     */
    wdPropertyLastAuthor(7),
    
    /**
     * (8)
     */
    wdPropertyRevision(8),
    
    /**
     * (9)
     */
    wdPropertyAppName(9),
    
    /**
     * (10)
     */
    wdPropertyTimeLastPrinted(10),
    
    /**
     * (11)
     */
    wdPropertyTimeCreated(11),
    
    /**
     * (12)
     */
    wdPropertyTimeLastSaved(12),
    
    /**
     * (13)
     */
    wdPropertyVBATotalEdit(13),
    
    /**
     * (14)
     */
    wdPropertyPages(14),
    
    /**
     * (15)
     */
    wdPropertyWords(15),
    
    /**
     * (16)
     */
    wdPropertyCharacters(16),
    
    /**
     * (17)
     */
    wdPropertySecurity(17),
    
    /**
     * (18)
     */
    wdPropertyCategory(18),
    
    /**
     * (19)
     */
    wdPropertyFormat(19),
    
    /**
     * (20)
     */
    wdPropertyManager(20),
    
    /**
     * (21)
     */
    wdPropertyCompany(21),
    
    /**
     * (22)
     */
    wdPropertyBytes(22),
    
    /**
     * (23)
     */
    wdPropertyLines(23),
    
    /**
     * (24)
     */
    wdPropertyParas(24),
    
    /**
     * (25)
     */
    wdPropertySlides(25),
    
    /**
     * (26)
     */
    wdPropertyNotes(26),
    
    /**
     * (27)
     */
    wdPropertyHiddenSlides(27),
    
    /**
     * (28)
     */
    wdPropertyMMClips(28),
    
    /**
     * (29)
     */
    wdPropertyHyperlinkBase(29),
    
    /**
     * (30)
     */
    wdPropertyCharsWSpaces(30),
    ;

    private WdBuiltInProperty(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}