
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020941-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020941-0000-0000-C000-000000000046}")
public interface Endnotes extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Location", dispId = 0x64)
    WdEndnoteLocation getLocation();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code WdEndnoteLocation}
     */
    @ComProperty(name = "Location", dispId = 0x64)
    void setLocation(WdEndnoteLocation param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "NumberStyle", dispId = 0x65)
    WdNoteNumberStyle getNumberStyle();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code WdNoteNumberStyle}
     */
    @ComProperty(name = "NumberStyle", dispId = 0x65)
    void setNumberStyle(WdNoteNumberStyle param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "StartingNumber", dispId = 0x66)
    Integer getStartingNumber();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "StartingNumber", dispId = 0x66)
    void setStartingNumber(Integer param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "NumberingRule", dispId = 0x67)
    WdNumberingRule getNumberingRule();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code WdNumberingRule}
     */
    @ComProperty(name = "NumberingRule", dispId = 0x67)
    void setNumberingRule(WdNumberingRule param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Separator", dispId = 0x68)
    Range getSeparator();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ContinuationSeparator", dispId = 0x69)
    Range getContinuationSeparator();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "ContinuationNotice", dispId = 0x6a)
    Range getContinuationNotice();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(23)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Endnote Item(Integer Index);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(24)</p>
     * @param Range [in] {@code Range}
     * @param Reference [in, optional] {@code Object}
     * @param Text [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x4)
    Endnote Add(Range Range,
            Object Reference,
            Object Text);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(25)</p>
     */
    @ComMethod(name = "Convert", dispId = 0x5)
    void Convert();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(26)</p>
     */
    @ComMethod(name = "SwapWithFootnotes", dispId = 0x6)
    void SwapWithFootnotes();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(27)</p>
     */
    @ComMethod(name = "ResetSeparator", dispId = 0x7)
    void ResetSeparator();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "ResetContinuationSeparator", dispId = 0x8)
    void ResetContinuationSeparator();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(29)</p>
     */
    @ComMethod(name = "ResetContinuationNotice", dispId = 0x9)
    void ResetContinuationNotice();
            
    
}