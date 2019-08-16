
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020949-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020949-0000-0000-C000-000000000046}")
public interface AutoCorrect extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "CorrectDays", dispId = 0x1)
    Boolean getCorrectDays();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CorrectDays", dispId = 0x1)
    void setCorrectDays(Boolean param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "CorrectInitialCaps", dispId = 0x2)
    Boolean getCorrectInitialCaps();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CorrectInitialCaps", dispId = 0x2)
    void setCorrectInitialCaps(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "CorrectSentenceCaps", dispId = 0x3)
    Boolean getCorrectSentenceCaps();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CorrectSentenceCaps", dispId = 0x3)
    void setCorrectSentenceCaps(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "ReplaceText", dispId = 0x4)
    Boolean getReplaceText();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReplaceText", dispId = 0x4)
    void setReplaceText(Boolean param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Entries", dispId = 0x6)
    AutoCorrectEntries getEntries();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "FirstLetterExceptions", dispId = 0x7)
    FirstLetterExceptions getFirstLetterExceptions();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "FirstLetterAutoAdd", dispId = 0x8)
    Boolean getFirstLetterAutoAdd();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FirstLetterAutoAdd", dispId = 0x8)
    void setFirstLetterAutoAdd(Boolean param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "TwoInitialCapsExceptions", dispId = 0x9)
    TwoInitialCapsExceptions getTwoInitialCapsExceptions();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "TwoInitialCapsAutoAdd", dispId = 0xa)
    Boolean getTwoInitialCapsAutoAdd();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TwoInitialCapsAutoAdd", dispId = 0xa)
    void setTwoInitialCapsAutoAdd(Boolean param0);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "CorrectCapsLock", dispId = 0xb)
    Boolean getCorrectCapsLock();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CorrectCapsLock", dispId = 0xb)
    void setCorrectCapsLock(Boolean param0);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "CorrectHangulAndAlphabet", dispId = 0xc)
    Boolean getCorrectHangulAndAlphabet();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CorrectHangulAndAlphabet", dispId = 0xc)
    void setCorrectHangulAndAlphabet(Boolean param0);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "HangulAndAlphabetExceptions", dispId = 0xd)
    HangulAndAlphabetExceptions getHangulAndAlphabetExceptions();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "HangulAndAlphabetAutoAdd", dispId = 0xe)
    Boolean getHangulAndAlphabetAutoAdd();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HangulAndAlphabetAutoAdd", dispId = 0xe)
    void setHangulAndAlphabetAutoAdd(Boolean param0);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "ReplaceTextFromSpellingChecker", dispId = 0xf)
    Boolean getReplaceTextFromSpellingChecker();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReplaceTextFromSpellingChecker", dispId = 0xf)
    void setReplaceTextFromSpellingChecker(Boolean param0);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "OtherCorrectionsAutoAdd", dispId = 0x10)
    Boolean getOtherCorrectionsAutoAdd();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OtherCorrectionsAutoAdd", dispId = 0x10)
    void setOtherCorrectionsAutoAdd(Boolean param0);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "OtherCorrectionsExceptions", dispId = 0x11)
    OtherCorrectionsExceptions getOtherCorrectionsExceptions();
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "CorrectKeyboardSetting", dispId = 0x12)
    Boolean getCorrectKeyboardSetting();
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CorrectKeyboardSetting", dispId = 0x12)
    void setCorrectKeyboardSetting(Boolean param0);
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "CorrectTableCells", dispId = 0x13)
    Boolean getCorrectTableCells();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CorrectTableCells", dispId = 0x13)
    void setCorrectTableCells(Boolean param0);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "DisplayAutoCorrectOptions", dispId = 0x14)
    Boolean getDisplayAutoCorrectOptions();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayAutoCorrectOptions", dispId = 0x14)
    void setDisplayAutoCorrectOptions(Boolean param0);
            
    
}