
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03F0-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03F0-0000-0000-C000-000000000046}")
public interface IMsoContactCard {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Address", dispId = 0x1)
    String getAddress();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "AddressType", dispId = 0x2)
    MsoContactCardAddressType getAddressType();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "CardType", dispId = 0x3)
    MsoContactCardType getCardType();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x4)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}