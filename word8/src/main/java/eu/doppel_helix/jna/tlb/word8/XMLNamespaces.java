
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({656BBED7-E82D-4B0A-8F97-EC742BA11FFA})</p>
 */
@ComInterface(iid="{656BBED7-E82D-4B0A-8F97-EC742BA11FFA}")
public interface XMLNamespaces extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    XMLNamespace Item(Object Index);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(13)</p>
     * @param Path [in] {@code String}
     * @param NamespaceURI [in, optional] {@code Object}
     * @param Alias [in, optional] {@code Object}
     * @param InstallForAllUsers [in, optional] {@code Boolean}
     */
    @ComMethod(name = "Add", dispId = 0x65)
    XMLNamespace Add(String Path,
            Object NamespaceURI,
            Object Alias,
            Boolean InstallForAllUsers);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(14)</p>
     * @param Path [in] {@code String}
     * @param InstallForAllUsers [in, optional] {@code Boolean}
     */
    @ComMethod(name = "InstallManifest", dispId = 0x66)
    void InstallManifest(String Path,
            Boolean InstallForAllUsers);
            
    
}