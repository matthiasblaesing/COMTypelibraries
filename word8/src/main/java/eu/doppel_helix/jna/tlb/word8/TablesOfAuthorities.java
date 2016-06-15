
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020912-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020912-0000-0000-C000-000000000046}")
public interface TablesOfAuthorities extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Format", dispId = 0x2)
    WdToaFormat getFormat();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Format", dispId = 0x2)
    void setFormat(WdToaFormat param0);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    TableOfAuthorities Item(Integer Index);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Add", dispId = 0x64)
    TableOfAuthorities Add(Range Range,
            Object Category,
            Object Bookmark,
            Object Passim,
            Object KeepEntryFormatting,
            Object Separator,
            Object IncludeSequenceName,
            Object EntrySeparator,
            Object PageRangeSeparator,
            Object IncludeCategoryHeader,
            Object PageNumberSeparator);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComMethod(name = "NextCitation", dispId = 0x67)
    void NextCitation(String ShortCitation);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "MarkCitation", dispId = 0x65)
    Field MarkCitation(Range Range,
            String ShortCitation,
            Object LongCitation,
            Object LongCitationAutoText,
            Object Category);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "MarkAllCitations", dispId = 0x66)
    void MarkAllCitations(String ShortCitation,
            Object LongCitation,
            Object LongCitationAutoText,
            Object Category);
            
    
}