
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006304E-0000-0000-C000-000000000046})</p>
 */
public abstract class ApplicationEventsHandler extends AbstractComEventCallbackListener implements ApplicationEvents {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0xf002)</p>
     */
    @Override
    public void ItemSend(com.sun.jna.platform.win32.COM.util.IDispatch Item,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xf003)</p>
     */
    @Override
    public void NewMail(){
    }
            
    /**
     * <p>id(0xf004)</p>
     */
    @Override
    public void Reminder(com.sun.jna.platform.win32.COM.util.IDispatch Item){
    }
            
    /**
     * <p>id(0xf005)</p>
     */
    @Override
    public void OptionsPagesAdd(PropertyPages Pages){
    }
            
    /**
     * <p>id(0xf006)</p>
     */
    @Override
    public void Startup(){
    }
            
    /**
     * <p>id(0xf007)</p>
     */
    @Override
    public void Quit(){
    }
            
    
}