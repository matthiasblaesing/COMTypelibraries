
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CDB02-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CDB02-0000-0000-C000-000000000046}")
public interface _CustomXMLSchemaCollection extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60030000)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x60030001)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0x0)
    CustomXMLSchema getItem(Object Index);
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "NamespaceURI", dispId = 0x60030003)
    String getNamespaceURI(Integer Index);
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(13)</p>
     * @param NamespaceURI [in, optional] {@code String}
     * @param Alias [in, optional] {@code String}
     * @param FileName [in, optional] {@code String}
     * @param InstallForAllUsers [in, optional] {@code Boolean}
     */
    @ComMethod(name = "Add", dispId = 0x60030004)
    CustomXMLSchema Add(String NamespaceURI,
            String Alias,
            String FileName,
            Boolean InstallForAllUsers);
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(14)</p>
     * @param SchemaCollection [in] {@code CustomXMLSchemaCollection}
     */
    @ComMethod(name = "AddCollection", dispId = 0x60030005)
    void AddCollection(CustomXMLSchemaCollection SchemaCollection);
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Validate", dispId = 0x60030006)
    Boolean Validate();
            
    
}