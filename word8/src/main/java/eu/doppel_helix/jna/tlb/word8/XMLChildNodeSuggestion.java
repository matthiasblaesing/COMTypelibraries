
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({A87E00E9-3AC3-4B53-ABE3-7379653D0E82})</p>
 */
@ComInterface(iid="{A87E00E9-3AC3-4B53-ABE3-7379653D0E82}")
public interface XMLChildNodeSuggestion extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "BaseName", dispId = 0x0)
    String getBaseName();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "NamespaceURI", dispId = 0x3)
    String getNamespaceURI();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "XMLSchemaReference", dispId = 0x4)
    XMLSchemaReference getXMLSchemaReference();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Insert", dispId = 0x64)
    XMLNode Insert(Object Range);
            
    
}