
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({6F9D1F68-06F7-49EF-8902-185E54EB5E87})</p>
 */
@ComInterface(iid="{6F9D1F68-06F7-49EF-8902-185E54EB5E87}")
public interface OMathAutoCorrect extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "ReplaceText", dispId = 0x67)
    Boolean getReplaceText();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReplaceText", dispId = 0x67)
    void setReplaceText(Boolean param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "UseOutsideOMath", dispId = 0x68)
    Boolean getUseOutsideOMath();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseOutsideOMath", dispId = 0x68)
    void setUseOutsideOMath(Boolean param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Entries", dispId = 0x69)
    OMathAutoCorrectEntries getEntries();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Functions", dispId = 0x6a)
    OMathRecognizedFunctions getFunctions();
            
    
}