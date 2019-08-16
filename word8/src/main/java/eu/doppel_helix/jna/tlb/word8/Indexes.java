
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
    WdIndexFormat getFormat();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code WdIndexFormat}
     */
    @ComProperty(name = "Format", dispId = 0x2)
    void setFormat(WdIndexFormat param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(14)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Index Item(Integer Index);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(15)</p>
     * @param Range [in] {@code Range}
     * @param HeadingSeparator [in, optional] {@code Object}
     * @param RightAlignPageNumbers [in, optional] {@code Object}
     * @param Type [in, optional] {@code Object}
     * @param NumberOfColumns [in, optional] {@code Object}
     * @param AccentedLetters [in, optional] {@code Object}
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
     * <p>vtableId(16)</p>
     * @param Range [in] {@code Range}
     * @param Entry [in, optional] {@code Object}
     * @param EntryAutoText [in, optional] {@code Object}
     * @param CrossReference [in, optional] {@code Object}
     * @param CrossReferenceAutoText [in, optional] {@code Object}
     * @param BookmarkName [in, optional] {@code Object}
     * @param Bold [in, optional] {@code Object}
     * @param Italic [in, optional] {@code Object}
     * @param Reading [in, optional] {@code Object}
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
     * <p>vtableId(17)</p>
     * @param Range [in] {@code Range}
     * @param Entry [in, optional] {@code Object}
     * @param EntryAutoText [in, optional] {@code Object}
     * @param CrossReference [in, optional] {@code Object}
     * @param CrossReferenceAutoText [in, optional] {@code Object}
     * @param BookmarkName [in, optional] {@code Object}
     * @param Bold [in, optional] {@code Object}
     * @param Italic [in, optional] {@code Object}
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
     * <p>vtableId(18)</p>
     * @param ConcordanceFileName [in] {@code String}
     */
    @ComMethod(name = "AutoMarkEntries", dispId = 0x67)
    void AutoMarkEntries(String ConcordanceFileName);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(19)</p>
     * @param Range [in] {@code Range}
     * @param HeadingSeparator [in, optional] {@code Object}
     * @param RightAlignPageNumbers [in, optional] {@code Object}
     * @param Type [in, optional] {@code Object}
     * @param NumberOfColumns [in, optional] {@code Object}
     * @param AccentedLetters [in, optional] {@code Object}
     * @param SortBy [in, optional] {@code Object}
     * @param IndexLanguage [in, optional] {@code Object}
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