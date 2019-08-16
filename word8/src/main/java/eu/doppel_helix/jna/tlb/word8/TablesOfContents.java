
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020914-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020914-0000-0000-C000-000000000046}")
public interface TablesOfContents extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Format", dispId = 0x2)
    WdTocFormat getFormat();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code WdTocFormat}
     */
    @ComProperty(name = "Format", dispId = 0x2)
    void setFormat(WdTocFormat param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(14)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    TableOfContents Item(Integer Index);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(15)</p>
     * @param Range [in] {@code Range}
     * @param UseHeadingStyles [in, optional] {@code Object}
     * @param UpperHeadingLevel [in, optional] {@code Object}
     * @param LowerHeadingLevel [in, optional] {@code Object}
     * @param UseFields [in, optional] {@code Object}
     * @param TableID [in, optional] {@code Object}
     * @param RightAlignPageNumbers [in, optional] {@code Object}
     * @param IncludePageNumbers [in, optional] {@code Object}
     * @param AddedStyles [in, optional] {@code Object}
     */
    @ComMethod(name = "AddOld", dispId = 0x64)
    TableOfContents AddOld(Range Range,
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
     * <p>vtableId(16)</p>
     * @param Range [in] {@code Range}
     * @param Entry [in, optional] {@code Object}
     * @param EntryAutoText [in, optional] {@code Object}
     * @param TableID [in, optional] {@code Object}
     * @param Level [in, optional] {@code Object}
     */
    @ComMethod(name = "MarkEntry", dispId = 0x65)
    Field MarkEntry(Range Range,
            Object Entry,
            Object EntryAutoText,
            Object TableID,
            Object Level);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(17)</p>
     * @param Range [in] {@code Range}
     * @param UseHeadingStyles [in, optional] {@code Object}
     * @param UpperHeadingLevel [in, optional] {@code Object}
     * @param LowerHeadingLevel [in, optional] {@code Object}
     * @param UseFields [in, optional] {@code Object}
     * @param TableID [in, optional] {@code Object}
     * @param RightAlignPageNumbers [in, optional] {@code Object}
     * @param IncludePageNumbers [in, optional] {@code Object}
     * @param AddedStyles [in, optional] {@code Object}
     * @param UseHyperlinks [in, optional] {@code Object}
     * @param HidePageNumbersInWeb [in, optional] {@code Object}
     */
    @ComMethod(name = "Add2000", dispId = 0x66)
    TableOfContents Add2000(Range Range,
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
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(18)</p>
     * @param Range [in] {@code Range}
     * @param UseHeadingStyles [in, optional] {@code Object}
     * @param UpperHeadingLevel [in, optional] {@code Object}
     * @param LowerHeadingLevel [in, optional] {@code Object}
     * @param UseFields [in, optional] {@code Object}
     * @param TableID [in, optional] {@code Object}
     * @param RightAlignPageNumbers [in, optional] {@code Object}
     * @param IncludePageNumbers [in, optional] {@code Object}
     * @param AddedStyles [in, optional] {@code Object}
     * @param UseHyperlinks [in, optional] {@code Object}
     * @param HidePageNumbersInWeb [in, optional] {@code Object}
     * @param UseOutlineLevels [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x67)
    TableOfContents Add(Range Range,
            Object UseHeadingStyles,
            Object UpperHeadingLevel,
            Object LowerHeadingLevel,
            Object UseFields,
            Object TableID,
            Object RightAlignPageNumbers,
            Object IncludePageNumbers,
            Object AddedStyles,
            Object UseHyperlinks,
            Object HidePageNumbersInWeb,
            Object UseOutlineLevels);
            
    
}