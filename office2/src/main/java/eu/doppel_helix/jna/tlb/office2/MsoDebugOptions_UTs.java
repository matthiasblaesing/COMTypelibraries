
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C038A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C038A-0000-0000-C000-000000000046}")
public interface MsoDebugOptions_UTs {
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
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    MsoDebugOptions_UT getItem(Integer Index);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "GetUnitTestsInCollection", dispId = 0x2)
    MsoDebugOptions_UTs GetUnitTestsInCollection(String bstrCollectionName);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "GetUnitTest", dispId = 0x3)
    MsoDebugOptions_UT GetUnitTest(String bstrCollectionName,
            String bstrUnitTestName);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "GetMatchingUnitTestsInCollection", dispId = 0x4)
    MsoDebugOptions_UTs GetMatchingUnitTestsInCollection(String bstrCollectionName,
            String bstrUnitTestNameFilter);
            
    
}