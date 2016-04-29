
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020986-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020986-0000-0000-C000-000000000046}")
public interface PageNumbers {
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
    @ComProperty(name = "NumberStyle", dispId = 0x2)
    WdPageNumberStyle getNumberStyle();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "NumberStyle", dispId = 0x2)
    void setNumberStyle(WdPageNumberStyle param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "IncludeChapterNumber", dispId = 0x3)
    Boolean getIncludeChapterNumber();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "IncludeChapterNumber", dispId = 0x3)
    void setIncludeChapterNumber(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "HeadingLevelForChapter", dispId = 0x4)
    Integer getHeadingLevelForChapter();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "HeadingLevelForChapter", dispId = 0x4)
    void setHeadingLevelForChapter(Integer param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "ChapterPageSeparator", dispId = 0x5)
    WdSeparatorType getChapterPageSeparator();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "ChapterPageSeparator", dispId = 0x5)
    void setChapterPageSeparator(WdSeparatorType param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "RestartNumberingAtSection", dispId = 0x6)
    Boolean getRestartNumberingAtSection();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "RestartNumberingAtSection", dispId = 0x6)
    void setRestartNumberingAtSection(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "StartingNumber", dispId = 0x7)
    Integer getStartingNumber();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "StartingNumber", dispId = 0x7)
    void setStartingNumber(Integer param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "ShowFirstPageNumber", dispId = 0x8)
    Boolean getShowFirstPageNumber();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "ShowFirstPageNumber", dispId = 0x8)
    void setShowFirstPageNumber(Boolean param0);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    PageNumber Item(Integer Index);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Add", dispId = 0x65)
    PageNumber Add(Object PageNumberAlignment,
            Object FirstPage);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "DoubleQuote", dispId = 0xa)
    Boolean getDoubleQuote();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "DoubleQuote", dispId = 0xa)
    void setDoubleQuote(Boolean param0);
            
    
}