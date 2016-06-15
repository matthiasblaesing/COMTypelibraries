
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020960-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020960-0000-0000-C000-000000000046}")
public interface Pane extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Document", dispId = 0x1)
    Document getDocument();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Selection", dispId = 0x3)
    Selection getSelection();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "DisplayRulers", dispId = 0x4)
    Boolean getDisplayRulers();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "DisplayRulers", dispId = 0x4)
    void setDisplayRulers(Boolean param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "DisplayVerticalRuler", dispId = 0x5)
    Boolean getDisplayVerticalRuler();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "DisplayVerticalRuler", dispId = 0x5)
    void setDisplayVerticalRuler(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Zooms", dispId = 0x7)
    Zooms getZooms();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Index", dispId = 0x9)
    Integer getIndex();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "View", dispId = 0xa)
    View getView();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "Next", dispId = 0xb)
    Pane getNext();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "Previous", dispId = 0xc)
    Pane getPrevious();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "HorizontalPercentScrolled", dispId = 0xd)
    Integer getHorizontalPercentScrolled();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "HorizontalPercentScrolled", dispId = 0xd)
    void setHorizontalPercentScrolled(Integer param0);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "VerticalPercentScrolled", dispId = 0xe)
    Integer getVerticalPercentScrolled();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "VerticalPercentScrolled", dispId = 0xe)
    void setVerticalPercentScrolled(Integer param0);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "MinimumFontSize", dispId = 0xf)
    Integer getMinimumFontSize();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "MinimumFontSize", dispId = 0xf)
    void setMinimumFontSize(Integer param0);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "BrowseToWindow", dispId = 0x10)
    Boolean getBrowseToWindow();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "BrowseToWindow", dispId = 0x10)
    void setBrowseToWindow(Boolean param0);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "BrowseWidth", dispId = 0x11)
    Integer getBrowseWidth();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x64)
    void Activate();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Close", dispId = 0x65)
    void Close();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "LargeScroll", dispId = 0x66)
    void LargeScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComMethod(name = "SmallScroll", dispId = 0x67)
    void SmallScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "AutoScroll", dispId = 0x68)
    void AutoScroll(Integer Velocity);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComMethod(name = "PageScroll", dispId = 0x69)
    void PageScroll(Object Down,
            Object Up);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComMethod(name = "NewFrameset", dispId = 0x6a)
    void NewFrameset();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComMethod(name = "TOCInFrameset", dispId = 0x6b)
    void TOCInFrameset();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "Frameset", dispId = 0x12)
    Frameset getFrameset();
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "Pages", dispId = 0x13)
    Pages getPages();
            
    
}