
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C1533-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C1533-0000-0000-C000-000000000046}")
public interface ODSOFilter extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1)
    Integer getIndex();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x2)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Column", dispId = 0x3)
    String getColumn();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Column", dispId = 0x3)
    void setColumn(String param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Comparison", dispId = 0x4)
    MsoFilterComparison getComparison();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Comparison", dispId = 0x4)
    void setComparison(MsoFilterComparison param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "CompareTo", dispId = 0x5)
    String getCompareTo();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "CompareTo", dispId = 0x5)
    void setCompareTo(String param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Conjunction", dispId = 0x6)
    MsoFilterConjunction getConjunction();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Conjunction", dispId = 0x6)
    void setConjunction(MsoFilterConjunction param0);
            
    
}