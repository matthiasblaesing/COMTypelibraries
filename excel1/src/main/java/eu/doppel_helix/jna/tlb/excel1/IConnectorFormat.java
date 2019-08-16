
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002443E-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002443E-0001-0000-C000-000000000046}")
public interface IConnectorFormat extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x6d6)</p>
     * <p>vtableId(10)</p>
     * @param ConnectedShape [in] {@code Shape}
     * @param ConnectionSite [in] {@code Integer}
     */
    @ComMethod(name = "BeginConnect", dispId = 0x6d6)
    com.sun.jna.platform.win32.WinNT.HRESULT BeginConnect(Shape ConnectedShape,
            Integer ConnectionSite);
            
    /**
     * <p>id(0x6d9)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "BeginDisconnect", dispId = 0x6d9)
    com.sun.jna.platform.win32.WinNT.HRESULT BeginDisconnect();
            
    /**
     * <p>id(0x6da)</p>
     * <p>vtableId(12)</p>
     * @param ConnectedShape [in] {@code Shape}
     * @param ConnectionSite [in] {@code Integer}
     */
    @ComMethod(name = "EndConnect", dispId = 0x6da)
    com.sun.jna.platform.win32.WinNT.HRESULT EndConnect(Shape ConnectedShape,
            Integer ConnectionSite);
            
    /**
     * <p>id(0x6db)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "EndDisconnect", dispId = 0x6db)
    com.sun.jna.platform.win32.WinNT.HRESULT EndDisconnect();
            
    /**
     * <p>id(0x6dc)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "BeginConnected", dispId = 0x6dc)
    com.sun.jna.platform.win32.WinNT.HRESULT getBeginConnected(VARIANT RHS);
            
    /**
     * <p>id(0x6dd)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Shape}
     */
    @ComProperty(name = "BeginConnectedShape", dispId = 0x6dd)
    com.sun.jna.platform.win32.WinNT.HRESULT getBeginConnectedShape(VARIANT RHS);
            
    /**
     * <p>id(0x6de)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "BeginConnectionSite", dispId = 0x6de)
    com.sun.jna.platform.win32.WinNT.HRESULT getBeginConnectionSite(VARIANT RHS);
            
    /**
     * <p>id(0x6df)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "EndConnected", dispId = 0x6df)
    com.sun.jna.platform.win32.WinNT.HRESULT getEndConnected(VARIANT RHS);
            
    /**
     * <p>id(0x6e0)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Shape}
     */
    @ComProperty(name = "EndConnectedShape", dispId = 0x6e0)
    com.sun.jna.platform.win32.WinNT.HRESULT getEndConnectedShape(VARIANT RHS);
            
    /**
     * <p>id(0x6e1)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "EndConnectionSite", dispId = 0x6e1)
    com.sun.jna.platform.win32.WinNT.HRESULT getEndConnectionSite(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoConnectorType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code eu.doppel_helix.jna.tlb.office2.MsoConnectorType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT setType(eu.doppel_helix.jna.tlb.office2.MsoConnectorType RHS);
            
    
}