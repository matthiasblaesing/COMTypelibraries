
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
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "CorrectDays", dispId = 0x1)
    Boolean getCorrectDays();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "CorrectDays", dispId = 0x1)
    void setCorrectDays(Boolean param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "CorrectInitialCaps", dispId = 0x2)
    Boolean getCorrectInitialCaps();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "CorrectInitialCaps", dispId = 0x2)
    void setCorrectInitialCaps(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "CorrectSentenceCaps", dispId = 0x3)
    Boolean getCorrectSentenceCaps();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "CorrectSentenceCaps", dispId = 0x3)
    void setCorrectSentenceCaps(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "ReplaceText", dispId = 0x4)
    Boolean getReplaceText();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "ReplaceText", dispId = 0x4)
    void setReplaceText(Boolean param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Entries", dispId = 0x6)
    AutoCorrectEntries getEntries();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "FirstLetterExceptions", dispId = 0x7)
    FirstLetterExceptions getFirstLetterExceptions();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "FirstLetterAutoAdd", dispId = 0x8)
    Boolean getFirstLetterAutoAdd();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "FirstLetterAutoAdd", dispId = 0x8)
    void setFirstLetterAutoAdd(Boolean param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "TwoInitialCapsExceptions", dispId = 0x9)
    TwoInitialCapsExceptions getTwoInitialCapsExceptions();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "TwoInitialCapsAutoAdd", dispId = 0xa)
    Boolean getTwoInitialCapsAutoAdd();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "TwoInitialCapsAutoAdd", dispId = 0xa)
    void setTwoInitialCapsAutoAdd(Boolean param0);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "CorrectCapsLock", dispId = 0xb)
    Boolean getCorrectCapsLock();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "CorrectCapsLock", dispId = 0xb)
    void setCorrectCapsLock(Boolean param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "CorrectHangulAndAlphabet", dispId = 0xc)
    Boolean getCorrectHangulAndAlphabet();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "CorrectHangulAndAlphabet", dispId = 0xc)
    void setCorrectHangulAndAlphabet(Boolean param0);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "HangulAndAlphabetExceptions", dispId = 0xd)
    HangulAndAlphabetExceptions getHangulAndAlphabetExceptions();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "HangulAndAlphabetAutoAdd", dispId = 0xe)
    Boolean getHangulAndAlphabetAutoAdd();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "HangulAndAlphabetAutoAdd", dispId = 0xe)
    void setHangulAndAlphabetAutoAdd(Boolean param0);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "ReplaceTextFromSpellingChecker", dispId = 0xf)
    Boolean getReplaceTextFromSpellingChecker();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "ReplaceTextFromSpellingChecker", dispId = 0xf)
    void setReplaceTextFromSpellingChecker(Boolean param0);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "OtherCorrectionsAutoAdd", dispId = 0x10)
    Boolean getOtherCorrectionsAutoAdd();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "OtherCorrectionsAutoAdd", dispId = 0x10)
    void setOtherCorrectionsAutoAdd(Boolean param0);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "OtherCorrectionsExceptions", dispId = 0x11)
    OtherCorrectionsExceptions getOtherCorrectionsExceptions();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "CorrectKeyboardSetting", dispId = 0x12)
    Boolean getCorrectKeyboardSetting();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "CorrectKeyboardSetting", dispId = 0x12)
    void setCorrectKeyboardSetting(Boolean param0);
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "CorrectTableCells", dispId = 0x13)
    Boolean getCorrectTableCells();
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "CorrectTableCells", dispId = 0x13)
    void setCorrectTableCells(Boolean param0);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "DisplayAutoCorrectOptions", dispId = 0x14)
    Boolean getDisplayAutoCorrectOptions();
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "DisplayAutoCorrectOptions", dispId = 0x14)
    void setDisplayAutoCorrectOptions(Boolean param0);
            
    
}