
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002099B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002099B-0000-0000-C000-000000000046}")
public interface SynonymInfo extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Word", dispId = 0x1)
    String getWord();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Found", dispId = 0x2)
    Boolean getFound();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "MeaningCount", dispId = 0x3)
    Integer getMeaningCount();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "MeaningList", dispId = 0x4)
    Object getMeaningList();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "PartOfSpeechList", dispId = 0x5)
    Object getPartOfSpeechList();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(15)</p>
     * @param Meaning [in] {@code Object}
     */
    @ComProperty(name = "SynonymList", dispId = 0x7)
    Object getSynonymList(Object Meaning);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "AntonymList", dispId = 0x8)
    Object getAntonymList();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "RelatedExpressionList", dispId = 0x9)
    Object getRelatedExpressionList();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "RelatedWordList", dispId = 0xa)
    Object getRelatedWordList();
            
    
}