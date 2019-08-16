
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C1534-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C1534-0000-0000-C000-000000000046}")
public interface ODSOFilters extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x2)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(11)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x60030002)
    com.sun.jna.platform.win32.COM.util.IDispatch Item(Integer Index);
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(12)</p>
     * @param Column [in] {@code String}
     * @param Comparison [in] {@code MsoFilterComparison}
     * @param Conjunction [in] {@code MsoFilterConjunction}
     * @param bstrCompareTo [in, optional] {@code String}
     * @param DeferUpdate [in, optional] {@code Boolean}
     */
    @ComMethod(name = "Add", dispId = 0x60030003)
    void Add(String Column,
            MsoFilterComparison Comparison,
            MsoFilterConjunction Conjunction,
            String bstrCompareTo,
            Boolean DeferUpdate);
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(13)</p>
     * @param Index [in] {@code Integer}
     * @param DeferUpdate [in, optional] {@code Boolean}
     */
    @ComMethod(name = "Delete", dispId = 0x60030004)
    void Delete(Integer Index,
            Boolean DeferUpdate);
            
    
}