
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0410-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0410-0000-0000-C000-000000000046}")
public interface SignatureSet extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x60030001)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     * @param iSig [in] {@code Integer}
     */
    @ComProperty(name = "Item", dispId = 0x0)
    Signature getItem(Integer iSig);
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Add", dispId = 0x60030003)
    Signature Add();
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "Commit", dispId = 0x60030004)
    void Commit();
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60030005)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(15)</p>
     * @param varSigProv [in, optional] {@code Object}
     */
    @ComMethod(name = "AddNonVisibleSignature", dispId = 0x60030006)
    Signature AddNonVisibleSignature(Object varSigProv);
            
    /**
     * <p>id(0x60030007)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "CanAddSignatureLine", dispId = 0x60030007)
    Boolean getCanAddSignatureLine();
            
    /**
     * <p>id(0x60030008)</p>
     * <p>vtableId(17)</p>
     * @param varSigProv [in, optional] {@code Object}
     */
    @ComMethod(name = "AddSignatureLine", dispId = 0x60030008)
    Signature AddSignatureLine(Object varSigProv);
            
    /**
     * <p>id(0x60030009)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Subset", dispId = 0x60030009)
    MsoSignatureSubset getSubset();
            
    /**
     * <p>id(0x60030009)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code MsoSignatureSubset}
     */
    @ComProperty(name = "Subset", dispId = 0x60030009)
    void setSubset(MsoSignatureSubset param0);
            
    /**
     * <p>id(0x6003000b)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowSignaturesPane", dispId = 0x6003000b)
    void setShowSignaturesPane(Boolean param0);
            
    
}