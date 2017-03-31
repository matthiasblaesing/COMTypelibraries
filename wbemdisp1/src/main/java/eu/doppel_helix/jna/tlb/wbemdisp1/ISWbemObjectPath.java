
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * An Object path
 *
 * <p>uuid({5791BC27-CE9C-11D1-97BF-0000F81E849C})</p>
 */
@ComInterface(iid="{5791BC27-CE9C-11D1-97BF-0000F81E849C}")
public interface ISWbemObjectPath extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * The full path
     *
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Path", dispId = 0x0)
    String getPath();
            
    /**
     * The full path
     *
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Path", dispId = 0x0)
    void setPath(String param0);
            
    /**
     * The relative path
     *
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "RelPath", dispId = 0x1)
    String getRelPath();
            
    /**
     * The relative path
     *
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "RelPath", dispId = 0x1)
    void setRelPath(String param0);
            
    /**
     * The name of the Server
     *
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Server", dispId = 0x2)
    String getServer();
            
    /**
     * The name of the Server
     *
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Server", dispId = 0x2)
    void setServer(String param0);
            
    /**
     * The Namespace path
     *
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Namespace", dispId = 0x3)
    String getNamespace();
            
    /**
     * The Namespace path
     *
     * <p>id(0x3)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Namespace", dispId = 0x3)
    void setNamespace(String param0);
            
    /**
     * The parent Namespace path
     *
     * <p>id(0x4)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "ParentNamespace", dispId = 0x4)
    String getParentNamespace();
            
    /**
     * The Display Name for this path
     *
     * <p>id(0x5)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0x5)
    String getDisplayName();
            
    /**
     * The Display Name for this path
     *
     * <p>id(0x5)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DisplayName", dispId = 0x5)
    void setDisplayName(String param0);
            
    /**
     * The Class name
     *
     * <p>id(0x6)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Class", dispId = 0x6)
    String get_Class();
            
    /**
     * The Class name
     *
     * <p>id(0x6)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Class", dispId = 0x6)
    void set_Class(String param0);
            
    /**
     * Indicates whether this path addresses a Class
     *
     * <p>id(0x7)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "IsClass", dispId = 0x7)
    Boolean getIsClass();
            
    /**
     * Coerce this path to address a Class
     *
     * <p>id(0x8)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "SetAsClass", dispId = 0x8)
    void SetAsClass();
            
    /**
     * Indicates whether this path addresses a Singleton Instance
     *
     * <p>id(0x9)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "IsSingleton", dispId = 0x9)
    Boolean getIsSingleton();
            
    /**
     * Coerce this path to address a Singleton Instance
     *
     * <p>id(0xa)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "SetAsSingleton", dispId = 0xa)
    void SetAsSingleton();
            
    /**
     * The collection of Key value bindings for this path
     *
     * <p>id(0xb)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Keys", dispId = 0xb)
    ISWbemNamedValueSet getKeys();
            
    /**
     * Defines the security components of this path
     *
     * <p>id(0xc)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Security_", dispId = 0xc)
    ISWbemSecurity getSecurity_();
            
    /**
     * Defines locale component of this path
     *
     * <p>id(0xd)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Locale", dispId = 0xd)
    String getLocale();
            
    /**
     * Defines locale component of this path
     *
     * <p>id(0xd)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Locale", dispId = 0xd)
    void setLocale(String param0);
            
    /**
     * Defines authentication authority component of this path
     *
     * <p>id(0xe)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Authority", dispId = 0xe)
    String getAuthority();
            
    /**
     * Defines authentication authority component of this path
     *
     * <p>id(0xe)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Authority", dispId = 0xe)
    void setAuthority(String param0);
            
    
}