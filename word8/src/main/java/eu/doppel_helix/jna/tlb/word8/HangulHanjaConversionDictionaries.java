
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209E0-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209E0-0000-0000-C000-000000000046}")
public interface HangulHanjaConversionDictionaries {
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
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Maximum", dispId = 0x2)
    Integer getMaximum();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "ActiveCustomDictionary", dispId = 0x3)
    Dictionary getActiveCustomDictionary();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "ActiveCustomDictionary", dispId = 0x3)
    void setActiveCustomDictionary(Dictionary param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "BuiltinDictionary", dispId = 0x4)
    Dictionary getBuiltinDictionary();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Dictionary Item(Object Index);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Add", dispId = 0x65)
    Dictionary Add(String FileName);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "ClearAll", dispId = 0x66)
    void ClearAll();
            
    
}