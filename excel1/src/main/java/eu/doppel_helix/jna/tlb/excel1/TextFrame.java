
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002443D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002443D-0000-0000-C000-000000000046}")
public interface TextFrame extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6d1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "MarginBottom", dispId = 0x6d1)
    Float getMarginBottom();
            
    /**
     * <p>id(0x6d1)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "MarginBottom", dispId = 0x6d1)
    void setMarginBottom(Float param0);
            
    /**
     * <p>id(0x6d2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "MarginLeft", dispId = 0x6d2)
    Float getMarginLeft();
            
    /**
     * <p>id(0x6d2)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "MarginLeft", dispId = 0x6d2)
    void setMarginLeft(Float param0);
            
    /**
     * <p>id(0x6d3)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "MarginRight", dispId = 0x6d3)
    Float getMarginRight();
            
    /**
     * <p>id(0x6d3)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "MarginRight", dispId = 0x6d3)
    void setMarginRight(Float param0);
            
    /**
     * <p>id(0x6d4)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "MarginTop", dispId = 0x6d4)
    Float getMarginTop();
            
    /**
     * <p>id(0x6d4)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "MarginTop", dispId = 0x6d4)
    void setMarginTop(Float param0);
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    eu.doppel_helix.jna.tlb.office2.MsoTextOrientation getOrientation();
            
    /**
     * <p>id(0x86)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTextOrientation}
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    void setOrientation(eu.doppel_helix.jna.tlb.office2.MsoTextOrientation param0);
            
    /**
     * <p>id(0x25b)</p>
     * <p>vtableId(20)</p>
     * @param Start [in, optional] {@code Object}
     * @param Length [in, optional] {@code Object}
     */
    @ComMethod(name = "Characters", dispId = 0x25b)
    Characters Characters(Object Start,
            Object Length);
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    XlHAlign getHorizontalAlignment();
            
    /**
     * <p>id(0x88)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code XlHAlign}
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    void setHorizontalAlignment(XlHAlign param0);
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    XlVAlign getVerticalAlignment();
            
    /**
     * <p>id(0x89)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code XlVAlign}
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    void setVerticalAlignment(XlVAlign param0);
            
    /**
     * <p>id(0x266)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0x266)
    Boolean getAutoSize();
            
    /**
     * <p>id(0x266)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoSize", dispId = 0x266)
    void setAutoSize(Boolean param0);
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    Integer getReadingOrder();
            
    /**
     * <p>id(0x3cf)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    void setReadingOrder(Integer param0);
            
    /**
     * <p>id(0x6d5)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "AutoMargins", dispId = 0x6d5)
    Boolean getAutoMargins();
            
    /**
     * <p>id(0x6d5)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoMargins", dispId = 0x6d5)
    void setAutoMargins(Boolean param0);
            
    /**
     * <p>id(0xb6a)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "VerticalOverflow", dispId = 0xb6a)
    XlOartVerticalOverflow getVerticalOverflow();
            
    /**
     * <p>id(0xb6a)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code XlOartVerticalOverflow}
     */
    @ComProperty(name = "VerticalOverflow", dispId = 0xb6a)
    void setVerticalOverflow(XlOartVerticalOverflow param0);
            
    /**
     * <p>id(0xb6b)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "HorizontalOverflow", dispId = 0xb6b)
    XlOartHorizontalOverflow getHorizontalOverflow();
            
    /**
     * <p>id(0xb6b)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code XlOartHorizontalOverflow}
     */
    @ComProperty(name = "HorizontalOverflow", dispId = 0xb6b)
    void setHorizontalOverflow(XlOartHorizontalOverflow param0);
            
    
}