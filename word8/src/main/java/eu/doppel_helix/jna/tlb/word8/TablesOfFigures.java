
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020922-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020922-0000-0000-C000-000000000046}")
public interface TablesOfFigures extends IUnknown, IRawDispatchHandle, IDispatch {
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
    WdTofFormat getFormat();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Format", dispId = 0x2)
    void setFormat(WdTofFormat param0);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    TableOfFigures Item(Integer Index);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "AddOld", dispId = 0x64)
    TableOfFigures AddOld(Range Range,
            Object Caption,
            Object IncludeLabel,
            Object UseHeadingStyles,
            Object UpperHeadingLevel,
            Object LowerHeadingLevel,
            Object UseFields,
            Object TableID,
            Object RightAlignPageNumbers,
            Object IncludePageNumbers,
            Object AddedStyles);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "MarkEntry", dispId = 0x65)
    Field MarkEntry(Range Range,
            Object Entry,
            Object EntryAutoText,
            Object TableID,
            Object Level);
            
    /**
     * <p>id(0x1bc)</p>
     */
    @ComMethod(name = "Add", dispId = 0x1bc)
    TableOfFigures Add(Range Range,
            Object Caption,
            Object IncludeLabel,
            Object UseHeadingStyles,
            Object UpperHeadingLevel,
            Object LowerHeadingLevel,
            Object UseFields,
            Object TableID,
            Object RightAlignPageNumbers,
            Object IncludePageNumbers,
            Object AddedStyles,
            Object UseHyperlinks,
            Object HidePageNumbersInWeb);
            
    
}