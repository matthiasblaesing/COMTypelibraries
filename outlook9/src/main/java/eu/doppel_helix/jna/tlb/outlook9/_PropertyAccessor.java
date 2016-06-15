
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
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0xf001)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xfafb)</p>
     */
    @ComMethod(name = "GetProperty", dispId = 0xfafb)
    Object GetProperty(String SchemaName);
            
    /**
     * <p>id(0xfafc)</p>
     */
    @ComMethod(name = "SetProperty", dispId = 0xfafc)
    void SetProperty(String SchemaName,
            Object Value);
            
    /**
     * <p>id(0xfafe)</p>
     */
    @ComMethod(name = "GetProperties", dispId = 0xfafe)
    Object GetProperties(Object SchemaNames);
            
    /**
     * <p>id(0xfaff)</p>
     */
    @ComMethod(name = "SetProperties", dispId = 0xfaff)
    Object SetProperties(Object SchemaNames,
            Object Values);
            
    /**
     * <p>id(0xfb00)</p>
     */
    @ComMethod(name = "UTCToLocalTime", dispId = 0xfb00)
    java.util.Date UTCToLocalTime(java.util.Date Value);
            
    /**
     * <p>id(0xfb01)</p>
     */
    @ComMethod(name = "LocalTimeToUTC", dispId = 0xfb01)
    java.util.Date LocalTimeToUTC(java.util.Date Value);
            
    /**
     * <p>id(0xfb02)</p>
     */
    @ComMethod(name = "StringToBinary", dispId = 0xfb02)
    Object StringToBinary(String Value);
            
    /**
     * <p>id(0xfb03)</p>
     */
    @ComMethod(name = "BinaryToString", dispId = 0xfb03)
    String BinaryToString(Object Value);
            
    /**
     * <p>id(0xfb91)</p>
     */
    @ComMethod(name = "DeleteProperty", dispId = 0xfb91)
    void DeleteProperty(String SchemaName);
            
    /**
     * <p>id(0xfb92)</p>
     */
    @ComMethod(name = "DeleteProperties", dispId = 0xfb92)
    Object DeleteProperties(Object SchemaNames);
            
    
}