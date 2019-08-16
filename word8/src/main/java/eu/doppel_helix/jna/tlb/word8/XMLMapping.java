
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0C1FABE7-F737-406F-9CA3-B07661F9D1A2})</p>
 */
@ComInterface(iid="{0C1FABE7-F737-406F-9CA3-B07661F9D1A2}")
public interface XMLMapping extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "IsMapped", dispId = 0x0)
    Boolean getIsMapped();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "CustomXMLPart", dispId = 0x1)
    eu.doppel_helix.jna.tlb.office2.CustomXMLPart getCustomXMLPart();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "CustomXMLNode", dispId = 0x2)
    eu.doppel_helix.jna.tlb.office2.CustomXMLNode getCustomXMLNode();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     * @param XPath [in] {@code String}
     * @param PrefixMapping [in, optional] {@code String}
     * @param Source [in, optional] {@code eu.doppel_helix.jna.tlb.office2.CustomXMLPart}
     */
    @ComMethod(name = "SetMapping", dispId = 0x3)
    Boolean SetMapping(String XPath,
            String PrefixMapping,
            eu.doppel_helix.jna.tlb.office2.CustomXMLPart Source);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x4)
    void Delete();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     * @param Node [in] {@code eu.doppel_helix.jna.tlb.office2.CustomXMLNode}
     */
    @ComMethod(name = "SetMappingByNode", dispId = 0x5)
    Boolean SetMappingByNode(eu.doppel_helix.jna.tlb.office2.CustomXMLNode Node);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "XPath", dispId = 0x6)
    String getXPath();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "PrefixMappings", dispId = 0x7)
    String getPrefixMappings();
            
    
}