
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D3F5A756-4BAC-4D3D-9BAF-90935121AAA6})</p>
 */
public enum Error implements IComEnum {
    
    /**
     * (-2147213312)
     */
    hrMalformedXML(-2147213312),
    
    /**
     * (-2147213311)
     */
    hrInvalidXML(-2147213311),
    
    /**
     * (-2147213310)
     */
    hrCreatingSection(-2147213310),
    
    /**
     * (-2147213309)
     */
    hrOpeningSection(-2147213309),
    
    /**
     * (-2147213308)
     */
    hrSectionDoesNotExist(-2147213308),
    
    /**
     * (-2147213307)
     */
    hrPageDoesNotExist(-2147213307),
    
    /**
     * (-2147213306)
     */
    hrFileDoesNotExist(-2147213306),
    
    /**
     * (-2147213305)
     */
    hrInsertingImage(-2147213305),
    
    /**
     * (-2147213304)
     */
    hrInsertingInk(-2147213304),
    
    /**
     * (-2147213303)
     */
    hrInsertingHtml(-2147213303),
    
    /**
     * (-2147213302)
     */
    hrNavigatingToPage(-2147213302),
    
    /**
     * (-2147213301)
     */
    hrSectionReadOnly(-2147213301),
    
    /**
     * (-2147213300)
     */
    hrPageReadOnly(-2147213300),
    
    /**
     * (-2147213299)
     */
    hrInsertingOutlineText(-2147213299),
    
    /**
     * (-2147213298)
     */
    hrPageObjectDoesNotExist(-2147213298),
    
    /**
     * (-2147213297)
     */
    hrBinaryObjectDoesNotExist(-2147213297),
    
    /**
     * (-2147213296)
     */
    hrLastModifiedDateDidNotMatch(-2147213296),
    
    /**
     * (-2147213295)
     */
    hrGroupDoesNotExist(-2147213295),
    
    /**
     * (-2147213294)
     */
    hrPageDoesNotExistInGroup(-2147213294),
    
    /**
     * (-2147213293)
     */
    hrNoActiveSelection(-2147213293),
    
    /**
     * (-2147213292)
     */
    hrObjectDoesNotExist(-2147213292),
    
    /**
     * (-2147213291)
     */
    hrNotebookDoesNotExist(-2147213291),
    
    /**
     * (-2147213290)
     */
    hrInsertingFile(-2147213290),
    
    /**
     * (-2147213289)
     */
    hrInvalidName(-2147213289),
    
    /**
     * (-2147213288)
     */
    hrFolderDoesNotExist(-2147213288),
    
    /**
     * (-2147213287)
     */
    hrInvalidQuery(-2147213287),
    
    /**
     * (-2147213286)
     */
    hrFileAlreadyExists(-2147213286),
    
    /**
     * (-2147213285)
     */
    hrSectionEncryptedAndLocked(-2147213285),
    
    /**
     * (-2147213284)
     */
    hrDisabledByPolicy(-2147213284),
    
    /**
     * (-2147213283)
     */
    hrNotYetSynchronized(-2147213283),
    
    /**
     * (-2147213282)
     */
    hrLegacySection(-2147213282),
    
    /**
     * (-2147213281)
     */
    hrMergeFailed(-2147213281),
    
    /**
     * (-2147213280)
     */
    hrInvalidXMLSchema(-2147213280),
    
    /**
     * (-2147213278)
     */
    hrFutureContentLoss(-2147213278),
    
    /**
     * (-2147213277)
     */
    hrTimeOut(-2147213277),
    
    /**
     * (-2147213276)
     */
    hrRecordingInProgress(-2147213276),
    
    /**
     * (-2147213275)
     */
    hrUnknownLinkedNoteState(-2147213275),
    
    /**
     * (-2147213274)
     */
    hrNoShortNameForLinkedNote(-2147213274),
    
    /**
     * (-2147213273)
     */
    hrNoFriendlyNameForLinkedNote(-2147213273),
    
    /**
     * (-2147213272)
     */
    hrInvalidLinkedNoteUri(-2147213272),
    
    /**
     * (-2147213271)
     */
    hrInvalidLinkedNoteThumbnail(-2147213271),
    
    /**
     * (-2147213270)
     */
    hrImportLNTThumbnailFailed(-2147213270),
    
    /**
     * (-2147213269)
     */
    hrUnreadDisabledForNotebook(-2147213269),
    
    /**
     * (-2147213268)
     */
    hrInvalidSelection(-2147213268),
    
    /**
     * (-2147213267)
     */
    hrConvertFailed(-2147213267),
    
    /**
     * (-2147213266)
     */
    hrRecycleBinEditFailed(-2147213266),
    
    /**
     * (-2147213264)
     */
    hrAppInModalUI(-2147213264),
    ;

    private Error(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}