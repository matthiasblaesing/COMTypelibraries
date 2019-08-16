
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
    @ComProperty(name = "Document", dispId = 0x1)
    Document getDocument();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Selection", dispId = 0x3)
    Selection getSelection();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "DisplayRulers", dispId = 0x4)
    Boolean getDisplayRulers();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayRulers", dispId = 0x4)
    void setDisplayRulers(Boolean param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "DisplayVerticalRuler", dispId = 0x5)
    Boolean getDisplayVerticalRuler();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayVerticalRuler", dispId = 0x5)
    void setDisplayVerticalRuler(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Zooms", dispId = 0x7)
    Zooms getZooms();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Index", dispId = 0x9)
    Integer getIndex();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "View", dispId = 0xa)
    View getView();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Next", dispId = 0xb)
    Pane getNext();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Previous", dispId = 0xc)
    Pane getPrevious();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "HorizontalPercentScrolled", dispId = 0xd)
    Integer getHorizontalPercentScrolled();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "HorizontalPercentScrolled", dispId = 0xd)
    void setHorizontalPercentScrolled(Integer param0);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "VerticalPercentScrolled", dispId = 0xe)
    Integer getVerticalPercentScrolled();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "VerticalPercentScrolled", dispId = 0xe)
    void setVerticalPercentScrolled(Integer param0);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "MinimumFontSize", dispId = 0xf)
    Integer getMinimumFontSize();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MinimumFontSize", dispId = 0xf)
    void setMinimumFontSize(Integer param0);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "BrowseToWindow", dispId = 0x10)
    Boolean getBrowseToWindow();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "BrowseToWindow", dispId = 0x10)
    void setBrowseToWindow(Boolean param0);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "BrowseWidth", dispId = 0x11)
    Integer getBrowseWidth();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(30)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x64)
    void Activate();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(31)</p>
     */
    @ComMethod(name = "Close", dispId = 0x65)
    void Close();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(32)</p>
     * @param Down [in, optional] {@code Object}
     * @param Up [in, optional] {@code Object}
     * @param ToRight [in, optional] {@code Object}
     * @param ToLeft [in, optional] {@code Object}
     */
    @ComMethod(name = "LargeScroll", dispId = 0x66)
    void LargeScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(33)</p>
     * @param Down [in, optional] {@code Object}
     * @param Up [in, optional] {@code Object}
     * @param ToRight [in, optional] {@code Object}
     * @param ToLeft [in, optional] {@code Object}
     */
    @ComMethod(name = "SmallScroll", dispId = 0x67)
    void SmallScroll(Object Down,
            Object Up,
            Object ToRight,
            Object ToLeft);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(34)</p>
     * @param Velocity [in] {@code Integer}
     */
    @ComMethod(name = "AutoScroll", dispId = 0x68)
    void AutoScroll(Integer Velocity);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(35)</p>
     * @param Down [in, optional] {@code Object}
     * @param Up [in, optional] {@code Object}
     */
    @ComMethod(name = "PageScroll", dispId = 0x69)
    void PageScroll(Object Down,
            Object Up);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(36)</p>
     */
    @ComMethod(name = "NewFrameset", dispId = 0x6a)
    void NewFrameset();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(37)</p>
     */
    @ComMethod(name = "TOCInFrameset", dispId = 0x6b)
    void TOCInFrameset();
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "Frameset", dispId = 0x12)
    Frameset getFrameset();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "Pages", dispId = 0x13)
    Pages getPages();
            
    
}