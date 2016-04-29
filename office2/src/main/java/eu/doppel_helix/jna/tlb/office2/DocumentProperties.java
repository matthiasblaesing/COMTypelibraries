
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({2DF8D04D-5BFA-101B-BDE5-00AA0044DE52})</p>
 */
@ComInterface(iid="{2DF8D04D-5BFA-101B-BDE5-00AA0044DE52}")
public interface DocumentProperties {
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT getItem(Object Index,
            Integer lcid,
            VARIANT ppIDocProp);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Count", dispId = 0x4)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT pc);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComMethod(name = "Add", dispId = 0x5)
    com.sun.jna.platform.win32.WinNT.HRESULT Add(String Name,
            Boolean LinkToContent,
            Object Type,
            Object Value,
            Object LinkSource,
            Integer lcid,
            VARIANT ppIDocProp);
            
    /**
     * <p>id(0x60020005)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020005)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT ppidisp);
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020006)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT plCreator);
            
    
}