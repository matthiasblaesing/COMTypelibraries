
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209E2-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209E2-0000-0000-C000-000000000046}")
public interface Frameset extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x3eb)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "ParentFrameset", dispId = 0x3eb)
    Frameset getParentFrameset();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Type", dispId = 0x0)
    WdFramesetType getType();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "WidthType", dispId = 0x1)
    WdFramesetSizeType getWidthType();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code WdFramesetSizeType}
     */
    @ComProperty(name = "WidthType", dispId = 0x1)
    void setWidthType(WdFramesetSizeType param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "HeightType", dispId = 0x2)
    WdFramesetSizeType getHeightType();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code WdFramesetSizeType}
     */
    @ComProperty(name = "HeightType", dispId = 0x2)
    void setHeightType(WdFramesetSizeType param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Width", dispId = 0x3)
    Integer getWidth();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Width", dispId = 0x3)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Height", dispId = 0x4)
    Integer getHeight();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Height", dispId = 0x4)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ChildFramesetCount", dispId = 0x5)
    Integer getChildFramesetCount();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(22)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "ChildFramesetItem", dispId = 0x6)
    Frameset getChildFramesetItem(Integer Index);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "FramesetBorderWidth", dispId = 0x14)
    Float getFramesetBorderWidth();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "FramesetBorderWidth", dispId = 0x14)
    void setFramesetBorderWidth(Float param0);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "FramesetBorderColor", dispId = 0x15)
    WdColor getFramesetBorderColor();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code WdColor}
     */
    @ComProperty(name = "FramesetBorderColor", dispId = 0x15)
    void setFramesetBorderColor(WdColor param0);
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "FrameScrollbarType", dispId = 0x1e)
    WdScrollbarType getFrameScrollbarType();
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code WdScrollbarType}
     */
    @ComProperty(name = "FrameScrollbarType", dispId = 0x1e)
    void setFrameScrollbarType(WdScrollbarType param0);
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "FrameResizable", dispId = 0x1f)
    Boolean getFrameResizable();
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FrameResizable", dispId = 0x1f)
    void setFrameResizable(Boolean param0);
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "FrameName", dispId = 0x22)
    String getFrameName();
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FrameName", dispId = 0x22)
    void setFrameName(String param0);
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "FrameDisplayBorders", dispId = 0x23)
    Boolean getFrameDisplayBorders();
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FrameDisplayBorders", dispId = 0x23)
    void setFrameDisplayBorders(Boolean param0);
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "FrameDefaultURL", dispId = 0x24)
    String getFrameDefaultURL();
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FrameDefaultURL", dispId = 0x24)
    void setFrameDefaultURL(String param0);
            
    /**
     * <p>id(0x25)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "FrameLinkToFile", dispId = 0x25)
    Boolean getFrameLinkToFile();
            
    /**
     * <p>id(0x25)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FrameLinkToFile", dispId = 0x25)
    void setFrameLinkToFile(Boolean param0);
            
    /**
     * <p>id(0x32)</p>
     * <p>vtableId(39)</p>
     * @param Where [in] {@code WdFramesetNewFrameLocation}
     */
    @ComMethod(name = "AddNewFrame", dispId = 0x32)
    Frameset AddNewFrame(WdFramesetNewFrameLocation Where);
            
    /**
     * <p>id(0x33)</p>
     * <p>vtableId(40)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x33)
    void Delete();
            
    
}