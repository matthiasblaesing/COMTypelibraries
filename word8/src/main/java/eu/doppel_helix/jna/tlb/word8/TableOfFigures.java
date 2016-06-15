
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020921-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020921-0000-0000-C000-000000000046}")
public interface TableOfFigures extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Caption", dispId = 0x1)
    String getCaption();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x1)
    void setCaption(String param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "IncludeLabel", dispId = 0x2)
    Boolean getIncludeLabel();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "IncludeLabel", dispId = 0x2)
    void setIncludeLabel(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "RightAlignPageNumbers", dispId = 0x3)
    Boolean getRightAlignPageNumbers();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "RightAlignPageNumbers", dispId = 0x3)
    void setRightAlignPageNumbers(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "UseHeadingStyles", dispId = 0x4)
    Boolean getUseHeadingStyles();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "UseHeadingStyles", dispId = 0x4)
    void setUseHeadingStyles(Boolean param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "LowerHeadingLevel", dispId = 0x5)
    Integer getLowerHeadingLevel();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "LowerHeadingLevel", dispId = 0x5)
    void setLowerHeadingLevel(Integer param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "UpperHeadingLevel", dispId = 0x6)
    Integer getUpperHeadingLevel();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "UpperHeadingLevel", dispId = 0x6)
    void setUpperHeadingLevel(Integer param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "IncludePageNumbers", dispId = 0x7)
    Boolean getIncludePageNumbers();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "IncludePageNumbers", dispId = 0x7)
    void setIncludePageNumbers(Boolean param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Range", dispId = 0x8)
    Range getRange();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "UseFields", dispId = 0x9)
    Boolean getUseFields();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "UseFields", dispId = 0x9)
    void setUseFields(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "TableID", dispId = 0xa)
    String getTableID();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "TableID", dispId = 0xa)
    void setTableID(String param0);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "HeadingStyles", dispId = 0xb)
    HeadingStyles getHeadingStyles();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "TabLeader", dispId = 0xc)
    WdTabLeader getTabLeader();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "TabLeader", dispId = 0xc)
    void setTabLeader(WdTabLeader param0);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x64)
    void Delete();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "UpdatePageNumbers", dispId = 0x65)
    void UpdatePageNumbers();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "Update", dispId = 0x66)
    void Update();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "UseHyperlinks", dispId = 0xd)
    Boolean getUseHyperlinks();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "UseHyperlinks", dispId = 0xd)
    void setUseHyperlinks(Boolean param0);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "HidePageNumbersInWeb", dispId = 0xe)
    Boolean getHidePageNumbersInWeb();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "HidePageNumbersInWeb", dispId = 0xe)
    void setHidePageNumbersInWeb(Boolean param0);
            
    
}