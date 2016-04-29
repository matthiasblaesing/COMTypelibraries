
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209C7-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209C7-0000-0000-C000-000000000046}")
public interface ConnectorFormat {
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
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "BeginConnected", dispId = 0x64)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getBeginConnected();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "BeginConnectedShape", dispId = 0x65)
    Shape getBeginConnectedShape();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "BeginConnectionSite", dispId = 0x66)
    Integer getBeginConnectionSite();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "EndConnected", dispId = 0x67)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getEndConnected();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "EndConnectedShape", dispId = 0x68)
    Shape getEndConnectedShape();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "EndConnectionSite", dispId = 0x69)
    Integer getEndConnectionSite();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6a)
    eu.doppel_helix.jna.tlb.office2.MsoConnectorType getType();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6a)
    void setType(eu.doppel_helix.jna.tlb.office2.MsoConnectorType param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "BeginConnect", dispId = 0xa)
    void BeginConnect(VARIANT ConnectedShape,
            Integer ConnectionSite);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "BeginDisconnect", dispId = 0xb)
    void BeginDisconnect();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "EndConnect", dispId = 0xc)
    void EndConnect(VARIANT ConnectedShape,
            Integer ConnectionSite);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "EndDisconnect", dispId = 0xd)
    void EndDisconnect();
            
    
}