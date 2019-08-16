
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063045-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063045-0000-0000-C000-000000000046}")
public interface Recipient extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x6d)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x3003)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Address", dispId = 0x3003)
    String getAddress();
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "AddressEntry", dispId = 0x79)
    AddressEntry getAddressEntry();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "AutoResponse", dispId = 0x6a)
    String getAutoResponse();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AutoResponse", dispId = 0x6a)
    void setAutoResponse(String param0);
            
    /**
     * <p>id(0x3900)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "DisplayType", dispId = 0x3900)
    OlDisplayType getDisplayType();
            
    /**
     * <p>id(0xf01e)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "EntryID", dispId = 0xf01e)
    String getEntryID();
            
    /**
     * <p>id(0x5b)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Index", dispId = 0x5b)
    Integer getIndex();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "MeetingResponseStatus", dispId = 0x66)
    OlResponseStatus getMeetingResponseStatus();
            
    /**
     * <p>id(0x3001)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3001)
    String getName();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Resolved", dispId = 0x64)
    Boolean getResolved();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "TrackingStatus", dispId = 0x76)
    OlTrackingStatus getTrackingStatus();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code OlTrackingStatus}
     */
    @ComProperty(name = "TrackingStatus", dispId = 0x76)
    void setTrackingStatus(OlTrackingStatus param0);
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "TrackingStatusTime", dispId = 0x77)
    java.util.Date getTrackingStatusTime();
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "TrackingStatusTime", dispId = 0x77)
    void setTrackingStatusTime(java.util.Date param0);
            
    /**
     * <p>id(0xc15)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Type", dispId = 0xc15)
    Integer getType();
            
    /**
     * <p>id(0xc15)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Type", dispId = 0xc15)
    void setType(Integer param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x6e)
    void Delete();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(29)</p>
     * @param Start [in] {@code java.util.Date}
     * @param MinPerChar [in] {@code Integer}
     * @param CompleteFormat [in, optional] {@code Object}
     */
    @ComMethod(name = "FreeBusy", dispId = 0x6f)
    String FreeBusy(java.util.Date Start,
            Integer MinPerChar,
            Object CompleteFormat);
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(30)</p>
     */
    @ComMethod(name = "Resolve", dispId = 0x71)
    Boolean Resolve();
            
    /**
     * <p>id(0xfafd)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "PropertyAccessor", dispId = 0xfafd)
    PropertyAccessor getPropertyAccessor();
            
    /**
     * <p>id(0xfc74)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Sendable", dispId = 0xfc74)
    Boolean getSendable();
            
    /**
     * <p>id(0xfc74)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Sendable", dispId = 0xfc74)
    void setSendable(Boolean param0);
            
    
}