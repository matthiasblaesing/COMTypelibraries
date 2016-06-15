
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208AB-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208AB-0000-0000-C000-000000000046}")
public interface Outline extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x3bf)</p>
     */
    @ComProperty(name = "AutomaticStyles", dispId = 0x3bf)
    Boolean getAutomaticStyles();
            
    /**
     * <p>id(0x3bf)</p>
     */
    @ComProperty(name = "AutomaticStyles", dispId = 0x3bf)
    void setAutomaticStyles(Boolean param0);
            
    /**
     * <p>id(0x3c0)</p>
     */
    @ComMethod(name = "ShowLevels", dispId = 0x3c0)
    Object ShowLevels(Object RowLevels,
            Object ColumnLevels);
            
    /**
     * <p>id(0x3c1)</p>
     */
    @ComProperty(name = "SummaryColumn", dispId = 0x3c1)
    XlSummaryColumn getSummaryColumn();
            
    /**
     * <p>id(0x3c1)</p>
     */
    @ComProperty(name = "SummaryColumn", dispId = 0x3c1)
    void setSummaryColumn(XlSummaryColumn param0);
            
    /**
     * <p>id(0x386)</p>
     */
    @ComProperty(name = "SummaryRow", dispId = 0x386)
    XlSummaryRow getSummaryRow();
            
    /**
     * <p>id(0x386)</p>
     */
    @ComProperty(name = "SummaryRow", dispId = 0x386)
    void setSummaryRow(XlSummaryRow param0);
            
    
}