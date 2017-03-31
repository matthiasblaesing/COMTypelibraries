
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * A connection to a Namespace
 *
 * <p>uuid({D2F68443-85DC-427E-91D8-366554CC754C})</p>
 */
@ComInterface(iid="{D2F68443-85DC-427E-91D8-366554CC754C}")
public interface ISWbemServicesEx extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Get a single Class or Instance
     *
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     * @param strObjectPath [in, optional] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Get", dispId = 0x1)
    ISWbemObject Get(Object strObjectPath,
            Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Get a single Class or Instance asynchronously
     *
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     * @param objWbemSink [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param strObjectPath [in, optional] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param objWbemAsyncContext [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "GetAsync", dispId = 0x2)
    void GetAsync(com.sun.jna.platform.win32.COM.util.IDispatch objWbemSink,
            Object strObjectPath,
            Object iFlags,
            Object objWbemNamedValueSet,
            Object objWbemAsyncContext);
            
    /**
     * Delete a Class or Instance
     *
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     * @param strObjectPath [in] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Delete", dispId = 0x3)
    void Delete(String strObjectPath,
            Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Delete a Class or Instance asynchronously
     *
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     * @param objWbemSink [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param strObjectPath [in] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param objWbemAsyncContext [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "DeleteAsync", dispId = 0x4)
    void DeleteAsync(com.sun.jna.platform.win32.COM.util.IDispatch objWbemSink,
            String strObjectPath,
            Object iFlags,
            Object objWbemNamedValueSet,
            Object objWbemAsyncContext);
            
    /**
     * Enumerate the Instances of a Class
     *
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     * @param strClass [in] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "InstancesOf", dispId = 0x5)
    ISWbemObjectSet InstancesOf(String strClass,
            Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Enumerate the Instances of a Class asynchronously
     *
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     * @param objWbemSink [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param strClass [in] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param objWbemAsyncContext [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "InstancesOfAsync", dispId = 0x6)
    void InstancesOfAsync(com.sun.jna.platform.win32.COM.util.IDispatch objWbemSink,
            String strClass,
            Object iFlags,
            Object objWbemNamedValueSet,
            Object objWbemAsyncContext);
            
    /**
     * Enumerate the subclasses of a Class
     *
     * <p>id(0x7)</p>
     * <p>vtableId(13)</p>
     * @param strSuperclass [in, optional] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "SubclassesOf", dispId = 0x7)
    ISWbemObjectSet SubclassesOf(Object strSuperclass,
            Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Enumerate the subclasses of a Class asynchronously 
     *
     * <p>id(0x8)</p>
     * <p>vtableId(14)</p>
     * @param objWbemSink [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param strSuperclass [in, optional] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param objWbemAsyncContext [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "SubclassesOfAsync", dispId = 0x8)
    void SubclassesOfAsync(com.sun.jna.platform.win32.COM.util.IDispatch objWbemSink,
            Object strSuperclass,
            Object iFlags,
            Object objWbemNamedValueSet,
            Object objWbemAsyncContext);
            
    /**
     * Execute a Query
     *
     * <p>id(0x9)</p>
     * <p>vtableId(15)</p>
     * @param strQuery [in] {@code String}
     * @param strQueryLanguage [in, optional] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "ExecQuery", dispId = 0x9)
    ISWbemObjectSet ExecQuery(String strQuery,
            Object strQueryLanguage,
            Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Execute an asynchronous Query
     *
     * <p>id(0xa)</p>
     * <p>vtableId(16)</p>
     * @param objWbemSink [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param strQuery [in] {@code String}
     * @param strQueryLanguage [in, optional] {@code String}
     * @param lFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param objWbemAsyncContext [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "ExecQueryAsync", dispId = 0xa)
    void ExecQueryAsync(com.sun.jna.platform.win32.COM.util.IDispatch objWbemSink,
            String strQuery,
            Object strQueryLanguage,
            Object lFlags,
            Object objWbemNamedValueSet,
            Object objWbemAsyncContext);
            
    /**
     * Get the Associators of a class or instance
     *
     * <p>id(0xb)</p>
     * <p>vtableId(17)</p>
     * @param strObjectPath [in] {@code String}
     * @param strAssocClass [in, optional] {@code String}
     * @param strResultClass [in, optional] {@code String}
     * @param strResultRole [in, optional] {@code String}
     * @param strRole [in, optional] {@code String}
     * @param bClassesOnly [in, optional] {@code Boolean}
     * @param bSchemaOnly [in, optional] {@code Boolean}
     * @param strRequiredAssocQualifier [in, optional] {@code String}
     * @param strRequiredQualifier [in, optional] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "AssociatorsOf", dispId = 0xb)
    ISWbemObjectSet AssociatorsOf(String strObjectPath,
            Object strAssocClass,
            Object strResultClass,
            Object strResultRole,
            Object strRole,
            Object bClassesOnly,
            Object bSchemaOnly,
            Object strRequiredAssocQualifier,
            Object strRequiredQualifier,
            Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Get the Associators of a class or instance asynchronously
     *
     * <p>id(0xc)</p>
     * <p>vtableId(18)</p>
     * @param objWbemSink [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param strObjectPath [in] {@code String}
     * @param strAssocClass [in, optional] {@code String}
     * @param strResultClass [in, optional] {@code String}
     * @param strResultRole [in, optional] {@code String}
     * @param strRole [in, optional] {@code String}
     * @param bClassesOnly [in, optional] {@code Boolean}
     * @param bSchemaOnly [in, optional] {@code Boolean}
     * @param strRequiredAssocQualifier [in, optional] {@code String}
     * @param strRequiredQualifier [in, optional] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param objWbemAsyncContext [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "AssociatorsOfAsync", dispId = 0xc)
    void AssociatorsOfAsync(com.sun.jna.platform.win32.COM.util.IDispatch objWbemSink,
            String strObjectPath,
            Object strAssocClass,
            Object strResultClass,
            Object strResultRole,
            Object strRole,
            Object bClassesOnly,
            Object bSchemaOnly,
            Object strRequiredAssocQualifier,
            Object strRequiredQualifier,
            Object iFlags,
            Object objWbemNamedValueSet,
            Object objWbemAsyncContext);
            
    /**
     * Get the References to a class or instance
     *
     * <p>id(0xd)</p>
     * <p>vtableId(19)</p>
     * @param strObjectPath [in] {@code String}
     * @param strResultClass [in, optional] {@code String}
     * @param strRole [in, optional] {@code String}
     * @param bClassesOnly [in, optional] {@code Boolean}
     * @param bSchemaOnly [in, optional] {@code Boolean}
     * @param strRequiredQualifier [in, optional] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "ReferencesTo", dispId = 0xd)
    ISWbemObjectSet ReferencesTo(String strObjectPath,
            Object strResultClass,
            Object strRole,
            Object bClassesOnly,
            Object bSchemaOnly,
            Object strRequiredQualifier,
            Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Get the References to a class or instance asynchronously
     *
     * <p>id(0xe)</p>
     * <p>vtableId(20)</p>
     * @param objWbemSink [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param strObjectPath [in] {@code String}
     * @param strResultClass [in, optional] {@code String}
     * @param strRole [in, optional] {@code String}
     * @param bClassesOnly [in, optional] {@code Boolean}
     * @param bSchemaOnly [in, optional] {@code Boolean}
     * @param strRequiredQualifier [in, optional] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param objWbemAsyncContext [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "ReferencesToAsync", dispId = 0xe)
    void ReferencesToAsync(com.sun.jna.platform.win32.COM.util.IDispatch objWbemSink,
            String strObjectPath,
            Object strResultClass,
            Object strRole,
            Object bClassesOnly,
            Object bSchemaOnly,
            Object strRequiredQualifier,
            Object iFlags,
            Object objWbemNamedValueSet,
            Object objWbemAsyncContext);
            
    /**
     * Execute a Query to receive Notifications
     *
     * <p>id(0xf)</p>
     * <p>vtableId(21)</p>
     * @param strQuery [in] {@code String}
     * @param strQueryLanguage [in, optional] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "ExecNotificationQuery", dispId = 0xf)
    ISWbemEventSource ExecNotificationQuery(String strQuery,
            Object strQueryLanguage,
            Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Execute an asynchronous Query to receive Notifications
     *
     * <p>id(0x10)</p>
     * <p>vtableId(22)</p>
     * @param objWbemSink [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param strQuery [in] {@code String}
     * @param strQueryLanguage [in, optional] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param objWbemAsyncContext [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "ExecNotificationQueryAsync", dispId = 0x10)
    void ExecNotificationQueryAsync(com.sun.jna.platform.win32.COM.util.IDispatch objWbemSink,
            String strQuery,
            Object strQueryLanguage,
            Object iFlags,
            Object objWbemNamedValueSet,
            Object objWbemAsyncContext);
            
    /**
     * Execute a Method
     *
     * <p>id(0x11)</p>
     * <p>vtableId(23)</p>
     * @param strObjectPath [in] {@code String}
     * @param strMethodName [in] {@code String}
     * @param objWbemInParameters [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "ExecMethod", dispId = 0x11)
    ISWbemObject ExecMethod(String strObjectPath,
            String strMethodName,
            Object objWbemInParameters,
            Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Execute a Method asynchronously
     *
     * <p>id(0x12)</p>
     * <p>vtableId(24)</p>
     * @param objWbemSink [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param strObjectPath [in] {@code String}
     * @param strMethodName [in] {@code String}
     * @param objWbemInParameters [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param objWbemAsyncContext [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "ExecMethodAsync", dispId = 0x12)
    void ExecMethodAsync(com.sun.jna.platform.win32.COM.util.IDispatch objWbemSink,
            String strObjectPath,
            String strMethodName,
            Object objWbemInParameters,
            Object iFlags,
            Object objWbemNamedValueSet,
            Object objWbemAsyncContext);
            
    /**
     * The Security Configurator for this Object
     *
     * <p>id(0x13)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Security_", dispId = 0x13)
    ISWbemSecurity getSecurity_();
            
    /**
     * Save the Object to this Namespace
     *
     * <p>id(0x14)</p>
     * <p>vtableId(26)</p>
     * @param objWbemObject [in] {@code ISWbemObjectEx}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Put", dispId = 0x14)
    ISWbemObjectPath Put(ISWbemObjectEx objWbemObject,
            Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Save the Object to this Namespace asynchronously
     *
     * <p>id(0x15)</p>
     * <p>vtableId(27)</p>
     * @param objWbemSink [in] {@code ISWbemSink}
     * @param objWbemObject [in] {@code ISWbemObjectEx}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param objWbemAsyncContext [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "PutAsync", dispId = 0x15)
    void PutAsync(ISWbemSink objWbemSink,
            ISWbemObjectEx objWbemObject,
            Object iFlags,
            Object objWbemNamedValueSet,
            Object objWbemAsyncContext);
            
    
}