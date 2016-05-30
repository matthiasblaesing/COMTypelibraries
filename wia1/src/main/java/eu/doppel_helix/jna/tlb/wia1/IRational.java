
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({3BF1B24A-01A5-4AA3-91F9-25A60B50E49B})</p>
 */
@ComInterface(iid="{3BF1B24A-01A5-4AA3-91F9-25A60B50E49B}")
public interface IRational {
    /**
     * Returns the Rational Value as a Double
     *
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Double getValue();
            
    /**
     * Returns/Sets the Rational Value Numerator
     *
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Numerator", dispId = 0x1)
    Integer getNumerator();
            
    /**
     * Returns/Sets the Rational Value Numerator
     *
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Numerator", dispId = 0x1)
    void setNumerator(Integer param0);
            
    /**
     * Returns/Sets the Rational Value Denominator
     *
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Denominator", dispId = 0x2)
    Integer getDenominator();
            
    /**
     * Returns/Sets the Rational Value Denominator
     *
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Denominator", dispId = 0x2)
    void setDenominator(Integer param0);
            
    
}