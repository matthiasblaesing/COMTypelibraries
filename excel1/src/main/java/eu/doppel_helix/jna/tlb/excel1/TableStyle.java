
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244A7-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244A7-0000-0000-C000-000000000046}")
public interface TableStyle {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x3a9)</p>
     */
    @ComProperty(name = "NameLocal", dispId = 0x3a9)
    String getNameLocal();
            
    /**
     * <p>id(0x229)</p>
     */
    @ComProperty(name = "BuiltIn", dispId = 0x229)
    Boolean getBuiltIn();
            
    /**
     * <p>id(0xab1)</p>
     */
    @ComProperty(name = "TableStyleElements", dispId = 0xab1)
    TableStyleElements getTableStyleElements();
            
    /**
     * <p>id(0xab2)</p>
     */
    @ComProperty(name = "ShowAsAvailableTableStyle", dispId = 0xab2)
    Boolean getShowAsAvailableTableStyle();
            
    /**
     * <p>id(0xab2)</p>
     */
    @ComProperty(name = "ShowAsAvailableTableStyle", dispId = 0xab2)
    void setShowAsAvailableTableStyle(Boolean param0);
            
    /**
     * <p>id(0xab3)</p>
     */
    @ComProperty(name = "ShowAsAvailablePivotTableStyle", dispId = 0xab3)
    Boolean getShowAsAvailablePivotTableStyle();
            
    /**
     * <p>id(0xab3)</p>
     */
    @ComProperty(name = "ShowAsAvailablePivotTableStyle", dispId = 0xab3)
    void setShowAsAvailablePivotTableStyle(Boolean param0);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x40f)</p>
     */
    @ComMethod(name = "Duplicate", dispId = 0x40f)
    TableStyle Duplicate(Object NewTableStyleName);
            
    /**
     * <p>id(0xb82)</p>
     */
    @ComProperty(name = "ShowAsAvailableSlicerStyle", dispId = 0xb82)
    Boolean getShowAsAvailableSlicerStyle();
            
    /**
     * <p>id(0xb82)</p>
     */
    @ComProperty(name = "ShowAsAvailableSlicerStyle", dispId = 0xb82)
    void setShowAsAvailableSlicerStyle(Boolean param0);
            
    /**
     * <p>id(0xc26)</p>
     */
    @ComProperty(name = "ShowAsAvailableTimelineStyle", dispId = 0xc26)
    Boolean getShowAsAvailableTimelineStyle();
            
    /**
     * <p>id(0xc26)</p>
     */
    @ComProperty(name = "ShowAsAvailableTimelineStyle", dispId = 0xc26)
    void setShowAsAvailableTimelineStyle(Boolean param0);
            
    
}