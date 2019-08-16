
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020915-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020915-0000-0000-C000-000000000046}")
public interface CustomLabel extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Index", dispId = 0x1)
    Integer getIndex();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2)
    String getName();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x2)
    void setName(String param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "TopMargin", dispId = 0x3)
    Float getTopMargin();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "TopMargin", dispId = 0x3)
    void setTopMargin(Float param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "SideMargin", dispId = 0x4)
    Float getSideMargin();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "SideMargin", dispId = 0x4)
    void setSideMargin(Float param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Height", dispId = 0x5)
    Float getHeight();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Height", dispId = 0x5)
    void setHeight(Float param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Width", dispId = 0x6)
    Float getWidth();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Width", dispId = 0x6)
    void setWidth(Float param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "VerticalPitch", dispId = 0x7)
    Float getVerticalPitch();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "VerticalPitch", dispId = 0x7)
    void setVerticalPitch(Float param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "HorizontalPitch", dispId = 0x8)
    Float getHorizontalPitch();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "HorizontalPitch", dispId = 0x8)
    void setHorizontalPitch(Float param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "NumberAcross", dispId = 0x9)
    Integer getNumberAcross();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "NumberAcross", dispId = 0x9)
    void setNumberAcross(Integer param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "NumberDown", dispId = 0xa)
    Integer getNumberDown();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "NumberDown", dispId = 0xa)
    void setNumberDown(Integer param0);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "DotMatrix", dispId = 0xb)
    Boolean getDotMatrix();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "PageSize", dispId = 0xc)
    WdCustomLabelPageSize getPageSize();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code WdCustomLabelPageSize}
     */
    @ComProperty(name = "PageSize", dispId = 0xc)
    void setPageSize(WdCustomLabelPageSize param0);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Valid", dispId = 0xd)
    Boolean getValid();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x65)
    void Delete();
            
    
}