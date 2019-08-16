
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0313-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0313-0000-0000-C000-000000000046}")
public interface ConnectorFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(10)</p>
     * @param ConnectedShape [in] {@code Shape}
     * @param ConnectionSite [in] {@code Integer}
     */
    @ComMethod(name = "BeginConnect", dispId = 0xa)
    void BeginConnect(Shape ConnectedShape,
            Integer ConnectionSite);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "BeginDisconnect", dispId = 0xb)
    void BeginDisconnect();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(12)</p>
     * @param ConnectedShape [in] {@code Shape}
     * @param ConnectionSite [in] {@code Integer}
     */
    @ComMethod(name = "EndConnect", dispId = 0xc)
    void EndConnect(Shape ConnectedShape,
            Integer ConnectionSite);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "EndDisconnect", dispId = 0xd)
    void EndDisconnect();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "BeginConnected", dispId = 0x64)
    MsoTriState getBeginConnected();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "BeginConnectedShape", dispId = 0x65)
    Shape getBeginConnectedShape();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "BeginConnectionSite", dispId = 0x66)
    Integer getBeginConnectionSite();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "EndConnected", dispId = 0x67)
    MsoTriState getEndConnected();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "EndConnectedShape", dispId = 0x68)
    Shape getEndConnectedShape();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "EndConnectionSite", dispId = 0x69)
    Integer getEndConnectionSite();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6a)
    MsoConnectorType getType();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code MsoConnectorType}
     */
    @ComProperty(name = "Type", dispId = 0x6a)
    void setType(MsoConnectorType param0);
            
    
}