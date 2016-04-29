
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020915-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020915-0000-0000-C000-000000000046}")
public interface CustomLabel {
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
    @ComProperty(name = "Index", dispId = 0x1)
    Integer getIndex();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2)
    String getName();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2)
    void setName(String param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "TopMargin", dispId = 0x3)
    Float getTopMargin();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "TopMargin", dispId = 0x3)
    void setTopMargin(Float param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "SideMargin", dispId = 0x4)
    Float getSideMargin();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "SideMargin", dispId = 0x4)
    void setSideMargin(Float param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Height", dispId = 0x5)
    Float getHeight();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Height", dispId = 0x5)
    void setHeight(Float param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Width", dispId = 0x6)
    Float getWidth();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Width", dispId = 0x6)
    void setWidth(Float param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "VerticalPitch", dispId = 0x7)
    Float getVerticalPitch();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "VerticalPitch", dispId = 0x7)
    void setVerticalPitch(Float param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "HorizontalPitch", dispId = 0x8)
    Float getHorizontalPitch();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "HorizontalPitch", dispId = 0x8)
    void setHorizontalPitch(Float param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "NumberAcross", dispId = 0x9)
    Integer getNumberAcross();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "NumberAcross", dispId = 0x9)
    void setNumberAcross(Integer param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "NumberDown", dispId = 0xa)
    Integer getNumberDown();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "NumberDown", dispId = 0xa)
    void setNumberDown(Integer param0);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "DotMatrix", dispId = 0xb)
    Boolean getDotMatrix();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "PageSize", dispId = 0xc)
    WdCustomLabelPageSize getPageSize();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "PageSize", dispId = 0xc)
    void setPageSize(WdCustomLabelPageSize param0);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "Valid", dispId = 0xd)
    Boolean getValid();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x65)
    void Delete();
            
    
}