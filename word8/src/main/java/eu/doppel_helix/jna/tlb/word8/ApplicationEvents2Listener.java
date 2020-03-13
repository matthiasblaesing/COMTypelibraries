
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209FE-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209FE-0000-0000-C000-000000000046}")
public interface ApplicationEvents2Listener {
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "Startup", dispId = 0x1)
    void Startup();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "Quit", dispId = 0x2)
    void Quit();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "DocumentChange", dispId = 0x3)
    void DocumentChange();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "DocumentOpen", dispId = 0x4)
    void DocumentOpen(Document Doc);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "DocumentBeforeClose", dispId = 0x6)
    void DocumentBeforeClose(Document Doc,
            Boolean Cancel);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComMethod(name = "DocumentBeforePrint", dispId = 0x7)
    void DocumentBeforePrint(Document Doc,
            Boolean Cancel);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComMethod(name = "DocumentBeforeSave", dispId = 0x8)
    void DocumentBeforeSave(Document Doc,
            Boolean SaveAsUI,
            Boolean Cancel);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComMethod(name = "NewDocument", dispId = 0x9)
    void NewDocument(Document Doc);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "WindowActivate", dispId = 0xa)
    void WindowActivate(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "WindowDeactivate", dispId = 0xb)
    void WindowDeactivate(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "WindowSelectionChange", dispId = 0xc)
    void WindowSelectionChange(Selection Sel);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "WindowBeforeRightClick", dispId = 0xd)
    void WindowBeforeRightClick(Selection Sel,
            Boolean Cancel);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComMethod(name = "WindowBeforeDoubleClick", dispId = 0xe)
    void WindowBeforeDoubleClick(Selection Sel,
            Boolean Cancel);
            
    
}