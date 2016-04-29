
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({54F46DC4-F6A6-48CC-BD66-46C1DDEADD22})</p>
 */
@ComInterface(iid="{54F46DC4-F6A6-48CC-BD66-46C1DDEADD22}")
public interface ContentControlListEntries {
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Application", dispId = 0x64)
    Application getApplication();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x65)
    Integer getCreator();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x66)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Count", dispId = 0x67)
    Integer getCount();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "Clear", dispId = 0x68)
    void Clear();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    ContentControlListEntry Item(Integer Index);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComMethod(name = "Add", dispId = 0x6a)
    ContentControlListEntry Add(String Text,
            String Value,
            Integer Index);
            
    
}