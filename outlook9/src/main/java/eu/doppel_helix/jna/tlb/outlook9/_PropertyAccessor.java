
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006302D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006302D-0000-0000-C000-000000000046}")
public interface _PropertyAccessor extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xf001)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xfafb)</p>
     * <p>vtableId(11)</p>
     * @param SchemaName [in] {@code String}
     */
    @ComMethod(name = "GetProperty", dispId = 0xfafb)
    Object GetProperty(String SchemaName);
            
    /**
     * <p>id(0xfafc)</p>
     * <p>vtableId(12)</p>
     * @param SchemaName [in] {@code String}
     * @param Value [in] {@code Object}
     */
    @ComMethod(name = "SetProperty", dispId = 0xfafc)
    void SetProperty(String SchemaName,
            Object Value);
            
    /**
     * <p>id(0xfafe)</p>
     * <p>vtableId(13)</p>
     * @param SchemaNames [in] {@code Object}
     */
    @ComMethod(name = "GetProperties", dispId = 0xfafe)
    Object GetProperties(Object SchemaNames);
            
    /**
     * <p>id(0xfaff)</p>
     * <p>vtableId(14)</p>
     * @param SchemaNames [in] {@code Object}
     * @param Values [in] {@code Object}
     */
    @ComMethod(name = "SetProperties", dispId = 0xfaff)
    Object SetProperties(Object SchemaNames,
            Object Values);
            
    /**
     * <p>id(0xfb00)</p>
     * <p>vtableId(15)</p>
     * @param Value [in] {@code java.util.Date}
     */
    @ComMethod(name = "UTCToLocalTime", dispId = 0xfb00)
    java.util.Date UTCToLocalTime(java.util.Date Value);
            
    /**
     * <p>id(0xfb01)</p>
     * <p>vtableId(16)</p>
     * @param Value [in] {@code java.util.Date}
     */
    @ComMethod(name = "LocalTimeToUTC", dispId = 0xfb01)
    java.util.Date LocalTimeToUTC(java.util.Date Value);
            
    /**
     * <p>id(0xfb02)</p>
     * <p>vtableId(17)</p>
     * @param Value [in] {@code String}
     */
    @ComMethod(name = "StringToBinary", dispId = 0xfb02)
    Object StringToBinary(String Value);
            
    /**
     * <p>id(0xfb03)</p>
     * <p>vtableId(18)</p>
     * @param Value [in] {@code Object}
     */
    @ComMethod(name = "BinaryToString", dispId = 0xfb03)
    String BinaryToString(Object Value);
            
    /**
     * <p>id(0xfb91)</p>
     * <p>vtableId(19)</p>
     * @param SchemaName [in] {@code String}
     */
    @ComMethod(name = "DeleteProperty", dispId = 0xfb91)
    void DeleteProperty(String SchemaName);
            
    /**
     * <p>id(0xfb92)</p>
     * <p>vtableId(20)</p>
     * @param SchemaNames [in] {@code Object}
     */
    @ComMethod(name = "DeleteProperties", dispId = 0xfb92)
    Object DeleteProperties(Object SchemaNames);
            
    
}