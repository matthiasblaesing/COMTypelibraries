
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
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
    @ComEventCallback(dispid = 0x1)
    void Startup();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComEventCallback(dispid = 0x2)
    void Quit();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComEventCallback(dispid = 0x3)
    void DocumentChange();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComEventCallback(dispid = 0x4)
    void DocumentOpen(Document Doc);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComEventCallback(dispid = 0x6)
    void DocumentBeforeClose(Document Doc,
            Boolean Cancel);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComEventCallback(dispid = 0x7)
    void DocumentBeforePrint(Document Doc,
            Boolean Cancel);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComEventCallback(dispid = 0x8)
    void DocumentBeforeSave(Document Doc,
            Boolean SaveAsUI,
            Boolean Cancel);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComEventCallback(dispid = 0x9)
    void NewDocument(Document Doc);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComEventCallback(dispid = 0xa)
    void WindowActivate(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComEventCallback(dispid = 0xb)
    void WindowDeactivate(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComEventCallback(dispid = 0xc)
    void WindowSelectionChange(Selection Sel);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComEventCallback(dispid = 0xd)
    void WindowBeforeRightClick(Selection Sel,
            Boolean Cancel);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComEventCallback(dispid = 0xe)
    void WindowBeforeDoubleClick(Selection Sel,
            Boolean Cancel);
            
    
}