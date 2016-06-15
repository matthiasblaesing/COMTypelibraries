
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002097C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002097C-0000-0000-C000-000000000046}")
public interface Indexes extends IUnknown, IRawDispatchHandle, IDispatch {
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
    WdIndexFormat getFormat();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Format", dispId = 0x2)
    void setFormat(WdIndexFormat param0);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Index Item(Integer Index);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "AddOld", dispId = 0x64)
    Index AddOld(Range Range,
            Object HeadingSeparator,
            Object RightAlignPageNumbers,
            Object Type,
            Object NumberOfColumns,
            Object AccentedLetters);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "MarkEntry", dispId = 0x65)
    Field MarkEntry(Range Range,
            Object Entry,
            Object EntryAutoText,
            Object CrossReference,
            Object CrossReferenceAutoText,
            Object BookmarkName,
            Object Bold,
            Object Italic,
            Object Reading);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "MarkAllEntries", dispId = 0x66)
    void MarkAllEntries(Range Range,
            Object Entry,
            Object EntryAutoText,
            Object CrossReference,
            Object CrossReferenceAutoText,
            Object BookmarkName,
            Object Bold,
            Object Italic);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComMethod(name = "AutoMarkEntries", dispId = 0x67)
    void AutoMarkEntries(String ConcordanceFileName);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "Add", dispId = 0x68)
    Index Add(Range Range,
            Object HeadingSeparator,
            Object RightAlignPageNumbers,
            Object Type,
            Object NumberOfColumns,
            Object AccentedLetters,
            Object SortBy,
            Object IndexLanguage);
            
    
}