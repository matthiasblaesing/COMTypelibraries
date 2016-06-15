
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020942-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020942-0000-0000-C000-000000000046}")
public interface Footnotes extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
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
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Location", dispId = 0x64)
    WdFootnoteLocation getLocation();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Location", dispId = 0x64)
    void setLocation(WdFootnoteLocation param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "NumberStyle", dispId = 0x65)
    WdNoteNumberStyle getNumberStyle();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "NumberStyle", dispId = 0x65)
    void setNumberStyle(WdNoteNumberStyle param0);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "StartingNumber", dispId = 0x66)
    Integer getStartingNumber();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "StartingNumber", dispId = 0x66)
    void setStartingNumber(Integer param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "NumberingRule", dispId = 0x67)
    WdNumberingRule getNumberingRule();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "NumberingRule", dispId = 0x67)
    void setNumberingRule(WdNumberingRule param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Separator", dispId = 0x68)
    Range getSeparator();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "ContinuationSeparator", dispId = 0x69)
    Range getContinuationSeparator();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "ContinuationNotice", dispId = 0x6a)
    Range getContinuationNotice();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Footnote Item(Integer Index);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "Add", dispId = 0x4)
    Footnote Add(Range Range,
            Object Reference,
            Object Text);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComMethod(name = "Convert", dispId = 0x5)
    void Convert();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "SwapWithEndnotes", dispId = 0x6)
    void SwapWithEndnotes();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComMethod(name = "ResetSeparator", dispId = 0x7)
    void ResetSeparator();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComMethod(name = "ResetContinuationSeparator", dispId = 0x8)
    void ResetContinuationSeparator();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComMethod(name = "ResetContinuationNotice", dispId = 0x9)
    void ResetContinuationNotice();
            
    
}