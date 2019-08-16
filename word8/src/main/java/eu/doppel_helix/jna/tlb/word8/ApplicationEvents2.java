
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209FE-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209FE-0000-0000-C000-000000000046}")
public interface ApplicationEvents2 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComMethod(name = "Startup", dispId = 0x1)
    void Startup();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "Quit", dispId = 0x2)
    void Quit();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "DocumentChange", dispId = 0x3)
    void DocumentChange();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     * @param Doc [in] {@code Document}
     */
    @ComMethod(name = "DocumentOpen", dispId = 0x4)
    void DocumentOpen(Document Doc);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(11)</p>
     * @param Doc [in] {@code Document}
     * @param Cancel [in] {@code Boolean}
     */
    @ComMethod(name = "DocumentBeforeClose", dispId = 0x6)
    void DocumentBeforeClose(Document Doc,
            Boolean Cancel);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(12)</p>
     * @param Doc [in] {@code Document}
     * @param Cancel [in] {@code Boolean}
     */
    @ComMethod(name = "DocumentBeforePrint", dispId = 0x7)
    void DocumentBeforePrint(Document Doc,
            Boolean Cancel);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(13)</p>
     * @param Doc [in] {@code Document}
     * @param SaveAsUI [in] {@code Boolean}
     * @param Cancel [in] {@code Boolean}
     */
    @ComMethod(name = "DocumentBeforeSave", dispId = 0x8)
    void DocumentBeforeSave(Document Doc,
            Boolean SaveAsUI,
            Boolean Cancel);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(14)</p>
     * @param Doc [in] {@code Document}
     */
    @ComMethod(name = "NewDocument", dispId = 0x9)
    void NewDocument(Document Doc);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(15)</p>
     * @param Doc [in] {@code Document}
     * @param Wn [in] {@code Window}
     */
    @ComMethod(name = "WindowActivate", dispId = 0xa)
    void WindowActivate(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(16)</p>
     * @param Doc [in] {@code Document}
     * @param Wn [in] {@code Window}
     */
    @ComMethod(name = "WindowDeactivate", dispId = 0xb)
    void WindowDeactivate(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(17)</p>
     * @param Sel [in] {@code Selection}
     */
    @ComMethod(name = "WindowSelectionChange", dispId = 0xc)
    void WindowSelectionChange(Selection Sel);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(18)</p>
     * @param Sel [in] {@code Selection}
     * @param Cancel [in] {@code Boolean}
     */
    @ComMethod(name = "WindowBeforeRightClick", dispId = 0xd)
    void WindowBeforeRightClick(Selection Sel,
            Boolean Cancel);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(19)</p>
     * @param Sel [in] {@code Selection}
     * @param Cancel [in] {@code Boolean}
     */
    @ComMethod(name = "WindowBeforeDoubleClick", dispId = 0xe)
    void WindowBeforeDoubleClick(Selection Sel,
            Boolean Cancel);
            
    
}