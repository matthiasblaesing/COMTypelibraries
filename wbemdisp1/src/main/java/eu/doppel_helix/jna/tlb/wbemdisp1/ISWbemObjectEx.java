
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * A Class or Instance
 *
 * <p>uuid({269AD56A-8A67-4129-BC8C-0506DCFE9880})</p>
 */
@ComInterface(iid="{269AD56A-8A67-4129-BC8C-0506DCFE9880}")
public interface ISWbemObjectEx extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Save this Object
     *
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Put_", dispId = 0x1)
    ISWbemObjectPath Put_(Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Save this Object asynchronously
     *
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     * @param objWbemSink [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param objWbemAsyncContext [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "PutAsync_", dispId = 0x2)
    void PutAsync_(com.sun.jna.platform.win32.COM.util.IDispatch objWbemSink,
            Object iFlags,
            Object objWbemNamedValueSet,
            Object objWbemAsyncContext);
            
    /**
     * Delete this Object
     *
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Delete_", dispId = 0x3)
    void Delete_(Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Delete this Object asynchronously
     *
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     * @param objWbemSink [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param objWbemAsyncContext [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "DeleteAsync_", dispId = 0x4)
    void DeleteAsync_(com.sun.jna.platform.win32.COM.util.IDispatch objWbemSink,
            Object iFlags,
            Object objWbemNamedValueSet,
            Object objWbemAsyncContext);
            
    /**
     * Return all instances of this Class
     *
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Instances_", dispId = 0x5)
    ISWbemObjectSet Instances_(Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Return all instances of this Class asynchronously
     *
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     * @param objWbemSink [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param objWbemAsyncContext [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "InstancesAsync_", dispId = 0x6)
    void InstancesAsync_(com.sun.jna.platform.win32.COM.util.IDispatch objWbemSink,
            Object iFlags,
            Object objWbemNamedValueSet,
            Object objWbemAsyncContext);
            
    /**
     * Enumerate subclasses of this Class
     *
     * <p>id(0x7)</p>
     * <p>vtableId(13)</p>
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Subclasses_", dispId = 0x7)
    ISWbemObjectSet Subclasses_(Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Enumerate subclasses of this Class asynchronously
     *
     * <p>id(0x8)</p>
     * <p>vtableId(14)</p>
     * @param objWbemSink [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param objWbemAsyncContext [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "SubclassesAsync_", dispId = 0x8)
    void SubclassesAsync_(com.sun.jna.platform.win32.COM.util.IDispatch objWbemSink,
            Object iFlags,
            Object objWbemNamedValueSet,
            Object objWbemAsyncContext);
            
    /**
     * Get the Associators of this Object
     *
     * <p>id(0x9)</p>
     * <p>vtableId(15)</p>
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
    @ComMethod(name = "Associators_", dispId = 0x9)
    ISWbemObjectSet Associators_(Object strAssocClass,
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
     * Get the Associators of this Object asynchronously
     *
     * <p>id(0xa)</p>
     * <p>vtableId(16)</p>
     * @param objWbemSink [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
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
    @ComMethod(name = "AssociatorsAsync_", dispId = 0xa)
    void AssociatorsAsync_(com.sun.jna.platform.win32.COM.util.IDispatch objWbemSink,
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
     * Get the References to this Object
     *
     * <p>id(0xb)</p>
     * <p>vtableId(17)</p>
     * @param strResultClass [in, optional] {@code String}
     * @param strRole [in, optional] {@code String}
     * @param bClassesOnly [in, optional] {@code Boolean}
     * @param bSchemaOnly [in, optional] {@code Boolean}
     * @param strRequiredQualifier [in, optional] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "References_", dispId = 0xb)
    ISWbemObjectSet References_(Object strResultClass,
            Object strRole,
            Object bClassesOnly,
            Object bSchemaOnly,
            Object strRequiredQualifier,
            Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Get the References to this Object asynchronously
     *
     * <p>id(0xc)</p>
     * <p>vtableId(18)</p>
     * @param objWbemSink [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param strResultClass [in, optional] {@code String}
     * @param strRole [in, optional] {@code String}
     * @param bClassesOnly [in, optional] {@code Boolean}
     * @param bSchemaOnly [in, optional] {@code Boolean}
     * @param strRequiredQualifier [in, optional] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param objWbemAsyncContext [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "ReferencesAsync_", dispId = 0xc)
    void ReferencesAsync_(com.sun.jna.platform.win32.COM.util.IDispatch objWbemSink,
            Object strResultClass,
            Object strRole,
            Object bClassesOnly,
            Object bSchemaOnly,
            Object strRequiredQualifier,
            Object iFlags,
            Object objWbemNamedValueSet,
            Object objWbemAsyncContext);
            
    /**
     * Execute a Method of this Object
     *
     * <p>id(0xd)</p>
     * <p>vtableId(19)</p>
     * @param strMethodName [in] {@code String}
     * @param objWbemInParameters [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "ExecMethod_", dispId = 0xd)
    ISWbemObject ExecMethod_(String strMethodName,
            Object objWbemInParameters,
            Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Execute a Method of this Object asynchronously
     *
     * <p>id(0xe)</p>
     * <p>vtableId(20)</p>
     * @param objWbemSink [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param strMethodName [in] {@code String}
     * @param objWbemInParameters [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param objWbemAsyncContext [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "ExecMethodAsync_", dispId = 0xe)
    void ExecMethodAsync_(com.sun.jna.platform.win32.COM.util.IDispatch objWbemSink,
            String strMethodName,
            Object objWbemInParameters,
            Object iFlags,
            Object objWbemNamedValueSet,
            Object objWbemAsyncContext);
            
    /**
     * Clone this Object
     *
     * <p>id(0xf)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Clone_", dispId = 0xf)
    ISWbemObject Clone_();
            
    /**
     * Get the MOF text of this Object
     *
     * <p>id(0x10)</p>
     * <p>vtableId(22)</p>
     * @param iFlags [in, optional] {@code Integer}
     */
    @ComMethod(name = "GetObjectText_", dispId = 0x10)
    String GetObjectText_(Object iFlags);
            
    /**
     * Create a subclass of this Object
     *
     * <p>id(0x11)</p>
     * <p>vtableId(23)</p>
     * @param iFlags [in, optional] {@code Integer}
     */
    @ComMethod(name = "SpawnDerivedClass_", dispId = 0x11)
    ISWbemObject SpawnDerivedClass_(Object iFlags);
            
    /**
     * Create an Instance of this Object
     *
     * <p>id(0x12)</p>
     * <p>vtableId(24)</p>
     * @param iFlags [in, optional] {@code Integer}
     */
    @ComMethod(name = "SpawnInstance_", dispId = 0x12)
    ISWbemObject SpawnInstance_(Object iFlags);
            
    /**
     * Compare this Object with another
     *
     * <p>id(0x13)</p>
     * <p>vtableId(25)</p>
     * @param objWbemObject [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param iFlags [in, optional] {@code Integer}
     */
    @ComMethod(name = "CompareTo_", dispId = 0x13)
    Boolean CompareTo_(com.sun.jna.platform.win32.COM.util.IDispatch objWbemObject,
            Object iFlags);
            
    /**
     * The collection of Qualifiers of this Object
     *
     * <p>id(0x14)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Qualifiers_", dispId = 0x14)
    ISWbemQualifierSet getQualifiers_();
            
    /**
     * The collection of Properties of this Object
     *
     * <p>id(0x15)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Properties_", dispId = 0x15)
    ISWbemPropertySet getProperties_();
            
    /**
     * The collection of Methods of this Object
     *
     * <p>id(0x16)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Methods_", dispId = 0x16)
    ISWbemMethodSet getMethods_();
            
    /**
     * An array of strings describing the class derivation heirarchy, in most-derived-from order (the first element in the array defines the superclass and the last element defines the dynasty class).
     *
     * <p>id(0x17)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Derivation_", dispId = 0x17)
    Object getDerivation_();
            
    /**
     * The path of this Object
     *
     * <p>id(0x18)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Path_", dispId = 0x18)
    ISWbemObjectPath getPath_();
            
    /**
     * The Security Configurator for this Object
     *
     * <p>id(0x19)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Security_", dispId = 0x19)
    ISWbemSecurity getSecurity_();
            
    /**
     * Refresh this Object
     *
     * <p>id(0x1a)</p>
     * <p>vtableId(32)</p>
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Refresh_", dispId = 0x1a)
    void Refresh_(Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * The collection of System Properties of this Object
     *
     * <p>id(0x1b)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "SystemProperties_", dispId = 0x1b)
    ISWbemPropertySet getSystemProperties_();
            
    /**
     * Retrieve a textual representation of this Object
     *
     * <p>id(0x1c)</p>
     * <p>vtableId(34)</p>
     * @param iObjectTextFormat [in] {@code WbemObjectTextFormatEnum}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "GetText_", dispId = 0x1c)
    String GetText_(WbemObjectTextFormatEnum iObjectTextFormat,
            Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Set this Object using the supplied textual representation
     *
     * <p>id(0x1d)</p>
     * <p>vtableId(35)</p>
     * @param bsText [in] {@code String}
     * @param iObjectTextFormat [in] {@code WbemObjectTextFormatEnum}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "SetFromText_", dispId = 0x1d)
    void SetFromText_(String bsText,
            WbemObjectTextFormatEnum iObjectTextFormat,
            Object iFlags,
            Object objWbemNamedValueSet);
            
    
}