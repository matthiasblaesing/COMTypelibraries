
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020913-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020913-0000-0000-C000-000000000046}")
public interface TableOfContents extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "UseHeadingStyles", dispId = 0x1)
    Boolean getUseHeadingStyles();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseHeadingStyles", dispId = 0x1)
    void setUseHeadingStyles(Boolean param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "UseFields", dispId = 0x2)
    Boolean getUseFields();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseFields", dispId = 0x2)
    void setUseFields(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "UpperHeadingLevel", dispId = 0x3)
    Integer getUpperHeadingLevel();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "UpperHeadingLevel", dispId = 0x3)
    void setUpperHeadingLevel(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "LowerHeadingLevel", dispId = 0x4)
    Integer getLowerHeadingLevel();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "LowerHeadingLevel", dispId = 0x4)
    void setLowerHeadingLevel(Integer param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "TableID", dispId = 0x5)
    String getTableID();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "TableID", dispId = 0x5)
    void setTableID(String param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "HeadingStyles", dispId = 0x6)
    HeadingStyles getHeadingStyles();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "RightAlignPageNumbers", dispId = 0x7)
    Boolean getRightAlignPageNumbers();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RightAlignPageNumbers", dispId = 0x7)
    void setRightAlignPageNumbers(Boolean param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "IncludePageNumbers", dispId = 0x8)
    Boolean getIncludePageNumbers();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IncludePageNumbers", dispId = 0x8)
    void setIncludePageNumbers(Boolean param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Range", dispId = 0x9)
    Range getRange();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "TabLeader", dispId = 0xa)
    WdTabLeader getTabLeader();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code WdTabLeader}
     */
    @ComProperty(name = "TabLeader", dispId = 0xa)
    void setTabLeader(WdTabLeader param0);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x64)
    void Delete();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(29)</p>
     */
    @ComMethod(name = "UpdatePageNumbers", dispId = 0x65)
    void UpdatePageNumbers();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(30)</p>
     */
    @ComMethod(name = "Update", dispId = 0x66)
    void Update();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "UseHyperlinks", dispId = 0xb)
    Boolean getUseHyperlinks();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseHyperlinks", dispId = 0xb)
    void setUseHyperlinks(Boolean param0);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "HidePageNumbersInWeb", dispId = 0xc)
    Boolean getHidePageNumbersInWeb();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HidePageNumbersInWeb", dispId = 0xc)
    void setHidePageNumbersInWeb(Boolean param0);
            
    
}