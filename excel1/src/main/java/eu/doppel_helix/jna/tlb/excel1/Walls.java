
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208C8-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208C8-0000-0000-C000-000000000046}")
public interface Walls extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x6e)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select();
            
    /**
     * <p>id(0x80)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    Border getBorder();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "ClearFormats", dispId = 0x70)
    Object ClearFormats();
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0x67f)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    ChartFillFormat getFill();
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    Object getPictureType();
            
    /**
     * <p>id(0xa1)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PictureType", dispId = 0xa1)
    void setPictureType(Object param0);
            
    /**
     * <p>id(0xd3)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    void Paste();
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    Object getPictureUnit();
            
    /**
     * <p>id(0xa2)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "PictureUnit", dispId = 0xa2)
    void setPictureUnit(Object param0);
            
    /**
     * <p>id(0xa5c)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Thickness", dispId = 0xa5c)
    Integer getThickness();
            
    /**
     * <p>id(0xa5c)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Thickness", dispId = 0xa5c)
    void setThickness(Integer param0);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Format", dispId = 0x74)
    ChartFormat getFormat();
            
    
}