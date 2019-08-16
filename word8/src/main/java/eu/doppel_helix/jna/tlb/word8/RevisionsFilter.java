
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({D523C26B-7278-4FA9-AA0B-0827DC8B41CE})</p>
 */
@ComInterface(iid="{D523C26B-7278-4FA9-AA0B-0827DC8B41CE}")
public interface RevisionsFilter extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "View", dispId = 0x1)
    WdRevisionsView getView();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code WdRevisionsView}
     */
    @ComProperty(name = "View", dispId = 0x1)
    void setView(WdRevisionsView param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Markup", dispId = 0x2)
    WdRevisionsMarkup getMarkup();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code WdRevisionsMarkup}
     */
    @ComProperty(name = "Markup", dispId = 0x2)
    void setMarkup(WdRevisionsMarkup param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Reviewers", dispId = 0x3)
    Reviewers getReviewers();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "ToggleShowAllReviewers", dispId = 0x65)
    void ToggleShowAllReviewers();
            
    
}