
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020986-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020986-0000-0000-C000-000000000046}")
public interface PageNumbers extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "NumberStyle", dispId = 0x2)
    WdPageNumberStyle getNumberStyle();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code WdPageNumberStyle}
     */
    @ComProperty(name = "NumberStyle", dispId = 0x2)
    void setNumberStyle(WdPageNumberStyle param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "IncludeChapterNumber", dispId = 0x3)
    Boolean getIncludeChapterNumber();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IncludeChapterNumber", dispId = 0x3)
    void setIncludeChapterNumber(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "HeadingLevelForChapter", dispId = 0x4)
    Integer getHeadingLevelForChapter();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HeadingLevelForChapter", dispId = 0x4)
    void setHeadingLevelForChapter(Integer param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "ChapterPageSeparator", dispId = 0x5)
    WdSeparatorType getChapterPageSeparator();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code WdSeparatorType}
     */
    @ComProperty(name = "ChapterPageSeparator", dispId = 0x5)
    void setChapterPageSeparator(WdSeparatorType param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "RestartNumberingAtSection", dispId = 0x6)
    Boolean getRestartNumberingAtSection();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RestartNumberingAtSection", dispId = 0x6)
    void setRestartNumberingAtSection(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "StartingNumber", dispId = 0x7)
    Integer getStartingNumber();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "StartingNumber", dispId = 0x7)
    void setStartingNumber(Integer param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "ShowFirstPageNumber", dispId = 0x8)
    Boolean getShowFirstPageNumber();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowFirstPageNumber", dispId = 0x8)
    void setShowFirstPageNumber(Boolean param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(26)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    PageNumber Item(Integer Index);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(27)</p>
     * @param PageNumberAlignment [in, optional] {@code Object}
     * @param FirstPage [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x65)
    PageNumber Add(Object PageNumberAlignment,
            Object FirstPage);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "DoubleQuote", dispId = 0xa)
    Boolean getDoubleQuote();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DoubleQuote", dispId = 0xa)
    void setDoubleQuote(Boolean param0);
            
    
}