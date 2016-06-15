
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({B67DE22C-BC01-4A73-A99B-070D1B5A795D})</p>
 */
@ComInterface(iid="{B67DE22C-BC01-4A73-A99B-070D1B5A795D}")
public interface Broadcast extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "AttendeeUrl", dispId = 0x1)
    String getAttendeeUrl();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "State", dispId = 0x2)
    eu.doppel_helix.jna.tlb.office2.MsoBroadcastState getState();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Capabilities", dispId = 0x3)
    Integer getCapabilities();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "PresenterServiceUrl", dispId = 0x4)
    String getPresenterServiceUrl();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "SessionID", dispId = 0x5)
    String getSessionID();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Start", dispId = 0x65)
    void Start(String serverUrl);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "Pause", dispId = 0x66)
    void Pause();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComMethod(name = "Resume", dispId = 0x67)
    void Resume();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "End", dispId = 0x68)
    void End();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComMethod(name = "AddMeetingNotes", dispId = 0x69)
    void AddMeetingNotes(String notesUrl,
            String notesWacUrl);
            
    
}