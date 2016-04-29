
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0410-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0410-0000-0000-C000-000000000046}")
public interface SignatureSet {
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
     * <p>id(0x60030001)</p>
     */
    @ComProperty(name = "Count", dispId = 0x60030001)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    Signature getItem(Integer iSig);
            
    /**
     * <p>id(0x60030003)</p>
     */
    @ComMethod(name = "Add", dispId = 0x60030003)
    Signature Add();
            
    /**
     * <p>id(0x60030004)</p>
     */
    @ComMethod(name = "Commit", dispId = 0x60030004)
    void Commit();
            
    /**
     * <p>id(0x60030005)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60030005)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030006)</p>
     */
    @ComMethod(name = "AddNonVisibleSignature", dispId = 0x60030006)
    Signature AddNonVisibleSignature(Object varSigProv);
            
    /**
     * <p>id(0x60030007)</p>
     */
    @ComProperty(name = "CanAddSignatureLine", dispId = 0x60030007)
    Boolean getCanAddSignatureLine();
            
    /**
     * <p>id(0x60030008)</p>
     */
    @ComMethod(name = "AddSignatureLine", dispId = 0x60030008)
    Signature AddSignatureLine(Object varSigProv);
            
    /**
     * <p>id(0x60030009)</p>
     */
    @ComProperty(name = "Subset", dispId = 0x60030009)
    MsoSignatureSubset getSubset();
            
    /**
     * <p>id(0x60030009)</p>
     */
    @ComProperty(name = "Subset", dispId = 0x60030009)
    void setSubset(MsoSignatureSubset param0);
            
    /**
     * <p>id(0x6003000b)</p>
     */
    @ComProperty(name = "ShowSignaturesPane", dispId = 0x6003000b)
    void setShowSignaturesPane(Boolean param0);
            
    
}