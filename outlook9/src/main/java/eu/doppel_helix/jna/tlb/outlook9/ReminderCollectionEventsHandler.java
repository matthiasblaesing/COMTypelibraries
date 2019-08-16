
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630B2-0000-0000-C000-000000000046})</p>
 */
public abstract class ReminderCollectionEventsHandler extends AbstractComEventCallbackListener implements ReminderCollectionEvents {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0xfa93)</p>
     */
    @Override
    public void BeforeReminderShow(VARIANT Cancel){
    }
            
    /**
     * <p>id(0xfa94)</p>
     */
    @Override
    public void ReminderAdd(_Reminder ReminderObject){
    }
            
    /**
     * <p>id(0xfa95)</p>
     */
    @Override
    public void ReminderChange(_Reminder ReminderObject){
    }
            
    /**
     * <p>id(0xfa96)</p>
     */
    @Override
    public void ReminderFire(_Reminder ReminderObject){
    }
            
    /**
     * <p>id(0xfa97)</p>
     */
    @Override
    public void ReminderRemove(){
    }
            
    /**
     * <p>id(0xfa98)</p>
     */
    @Override
    public void Snooze(_Reminder ReminderObject){
    }
            
    
}