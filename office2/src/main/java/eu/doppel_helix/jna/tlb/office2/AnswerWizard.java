
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0360-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0360-0000-0000-C000-000000000046}")
public interface AnswerWizard extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x60030000)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60030000)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030001)</p>
     */
    @ComProperty(name = "Files", dispId = 0x60030001)
    AnswerWizardFiles getFiles();
            
    /**
     * <p>id(0x60030002)</p>
     */
    @ComMethod(name = "ClearFileList", dispId = 0x60030002)
    void ClearFileList();
            
    /**
     * <p>id(0x60030003)</p>
     */
    @ComMethod(name = "ResetFileList", dispId = 0x60030003)
    void ResetFileList();
            
    
}