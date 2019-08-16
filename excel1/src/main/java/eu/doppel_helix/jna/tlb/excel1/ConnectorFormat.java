
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002443E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002443E-0000-0000-C000-000000000046}")
public interface ConnectorFormat extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6d6)</p>
     * <p>vtableId(10)</p>
     * @param ConnectedShape [in] {@code Shape}
     * @param ConnectionSite [in] {@code Integer}
     */
    @ComMethod(name = "BeginConnect", dispId = 0x6d6)
    void BeginConnect(Shape ConnectedShape,
            Integer ConnectionSite);
            
    /**
     * <p>id(0x6d9)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "BeginDisconnect", dispId = 0x6d9)
    void BeginDisconnect();
            
    /**
     * <p>id(0x6da)</p>
     * <p>vtableId(12)</p>
     * @param ConnectedShape [in] {@code Shape}
     * @param ConnectionSite [in] {@code Integer}
     */
    @ComMethod(name = "EndConnect", dispId = 0x6da)
    void EndConnect(Shape ConnectedShape,
            Integer ConnectionSite);
            
    /**
     * <p>id(0x6db)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "EndDisconnect", dispId = 0x6db)
    void EndDisconnect();
            
    /**
     * <p>id(0x6dc)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "BeginConnected", dispId = 0x6dc)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getBeginConnected();
            
    /**
     * <p>id(0x6dd)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "BeginConnectedShape", dispId = 0x6dd)
    Shape getBeginConnectedShape();
            
    /**
     * <p>id(0x6de)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "BeginConnectionSite", dispId = 0x6de)
    Integer getBeginConnectionSite();
            
    /**
     * <p>id(0x6df)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "EndConnected", dispId = 0x6df)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getEndConnected();
            
    /**
     * <p>id(0x6e0)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "EndConnectedShape", dispId = 0x6e0)
    Shape getEndConnectedShape();
            
    /**
     * <p>id(0x6e1)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "EndConnectionSite", dispId = 0x6e1)
    Integer getEndConnectionSite();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    eu.doppel_helix.jna.tlb.office2.MsoConnectorType getType();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoConnectorType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    void setType(eu.doppel_helix.jna.tlb.office2.MsoConnectorType param0);
            
    
}