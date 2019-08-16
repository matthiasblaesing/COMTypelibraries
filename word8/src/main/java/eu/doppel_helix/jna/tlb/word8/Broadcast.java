
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "AttendeeUrl", dispId = 0x1)
    String getAttendeeUrl();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "State", dispId = 0x2)
    eu.doppel_helix.jna.tlb.office2.MsoBroadcastState getState();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Capabilities", dispId = 0x3)
    Integer getCapabilities();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "PresenterServiceUrl", dispId = 0x4)
    String getPresenterServiceUrl();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "SessionID", dispId = 0x5)
    String getSessionID();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(14)</p>
     * @param serverUrl [in] {@code String}
     */
    @ComMethod(name = "Start", dispId = 0x65)
    void Start(String serverUrl);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Pause", dispId = 0x66)
    void Pause();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Resume", dispId = 0x67)
    void Resume();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "End", dispId = 0x68)
    void End();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(18)</p>
     * @param notesUrl [in] {@code String}
     * @param notesWacUrl [in] {@code String}
     */
    @ComMethod(name = "AddMeetingNotes", dispId = 0x69)
    void AddMeetingNotes(String notesUrl,
            String notesWacUrl);
            
    
}