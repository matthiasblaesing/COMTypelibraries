
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209BA-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209BA-0000-0000-C000-000000000046}")
public interface MailMessage extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x14e)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "CheckName", dispId = 0x14e)
    void CheckName();
            
    /**
     * <p>id(0x14f)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x14f)
    void Delete();
            
    /**
     * <p>id(0x150)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "DisplayMoveDialog", dispId = 0x150)
    void DisplayMoveDialog();
            
    /**
     * <p>id(0x151)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "DisplayProperties", dispId = 0x151)
    void DisplayProperties();
            
    /**
     * <p>id(0x152)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "DisplaySelectNamesDialog", dispId = 0x152)
    void DisplaySelectNamesDialog();
            
    /**
     * <p>id(0x153)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Forward", dispId = 0x153)
    void Forward();
            
    /**
     * <p>id(0x154)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "GoToNext", dispId = 0x154)
    void GoToNext();
            
    /**
     * <p>id(0x155)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "GoToPrevious", dispId = 0x155)
    void GoToPrevious();
            
    /**
     * <p>id(0x156)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "Reply", dispId = 0x156)
    void Reply();
            
    /**
     * <p>id(0x157)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "ReplyAll", dispId = 0x157)
    void ReplyAll();
            
    /**
     * <p>id(0x158)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "ToggleHeader", dispId = 0x158)
    void ToggleHeader();
            
    
}