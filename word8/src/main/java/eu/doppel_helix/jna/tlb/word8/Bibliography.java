
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({3834F60F-EE8C-455D-A441-D766675D6D3B})</p>
 */
@ComInterface(iid="{3834F60F-EE8C-455D-A441-D766675D6D3B}")
public interface Bibliography extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x64)
    Application getApplication();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x65)
    Integer getCreator();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x66)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Sources", dispId = 0x67)
    Sources getSources();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "BibliographyStyle", dispId = 0x69)
    String getBibliographyStyle();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BibliographyStyle", dispId = 0x69)
    void setBibliographyStyle(String param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "GenerateUniqueTag", dispId = 0x68)
    String GenerateUniqueTag();
            
    
}