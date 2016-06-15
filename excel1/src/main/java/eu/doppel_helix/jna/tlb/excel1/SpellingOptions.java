
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024465-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024465-0000-0000-C000-000000000046}")
public interface SpellingOptions extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x8ac)</p>
     */
    @ComProperty(name = "DictLang", dispId = 0x8ac)
    Integer getDictLang();
            
    /**
     * <p>id(0x8ac)</p>
     */
    @ComProperty(name = "DictLang", dispId = 0x8ac)
    void setDictLang(Integer param0);
            
    /**
     * <p>id(0x8ad)</p>
     */
    @ComProperty(name = "UserDict", dispId = 0x8ad)
    String getUserDict();
            
    /**
     * <p>id(0x8ad)</p>
     */
    @ComProperty(name = "UserDict", dispId = 0x8ad)
    void setUserDict(String param0);
            
    /**
     * <p>id(0x8ae)</p>
     */
    @ComProperty(name = "IgnoreCaps", dispId = 0x8ae)
    Boolean getIgnoreCaps();
            
    /**
     * <p>id(0x8ae)</p>
     */
    @ComProperty(name = "IgnoreCaps", dispId = 0x8ae)
    void setIgnoreCaps(Boolean param0);
            
    /**
     * <p>id(0x8af)</p>
     */
    @ComProperty(name = "SuggestMainOnly", dispId = 0x8af)
    Boolean getSuggestMainOnly();
            
    /**
     * <p>id(0x8af)</p>
     */
    @ComProperty(name = "SuggestMainOnly", dispId = 0x8af)
    void setSuggestMainOnly(Boolean param0);
            
    /**
     * <p>id(0x8b0)</p>
     */
    @ComProperty(name = "IgnoreMixedDigits", dispId = 0x8b0)
    Boolean getIgnoreMixedDigits();
            
    /**
     * <p>id(0x8b0)</p>
     */
    @ComProperty(name = "IgnoreMixedDigits", dispId = 0x8b0)
    void setIgnoreMixedDigits(Boolean param0);
            
    /**
     * <p>id(0x8b1)</p>
     */
    @ComProperty(name = "IgnoreFileNames", dispId = 0x8b1)
    Boolean getIgnoreFileNames();
            
    /**
     * <p>id(0x8b1)</p>
     */
    @ComProperty(name = "IgnoreFileNames", dispId = 0x8b1)
    void setIgnoreFileNames(Boolean param0);
            
    /**
     * <p>id(0x8b2)</p>
     */
    @ComProperty(name = "GermanPostReform", dispId = 0x8b2)
    Boolean getGermanPostReform();
            
    /**
     * <p>id(0x8b2)</p>
     */
    @ComProperty(name = "GermanPostReform", dispId = 0x8b2)
    void setGermanPostReform(Boolean param0);
            
    /**
     * <p>id(0x8b3)</p>
     */
    @ComProperty(name = "KoreanCombineAux", dispId = 0x8b3)
    Boolean getKoreanCombineAux();
            
    /**
     * <p>id(0x8b3)</p>
     */
    @ComProperty(name = "KoreanCombineAux", dispId = 0x8b3)
    void setKoreanCombineAux(Boolean param0);
            
    /**
     * <p>id(0x8b4)</p>
     */
    @ComProperty(name = "KoreanUseAutoChangeList", dispId = 0x8b4)
    Boolean getKoreanUseAutoChangeList();
            
    /**
     * <p>id(0x8b4)</p>
     */
    @ComProperty(name = "KoreanUseAutoChangeList", dispId = 0x8b4)
    void setKoreanUseAutoChangeList(Boolean param0);
            
    /**
     * <p>id(0x8b5)</p>
     */
    @ComProperty(name = "KoreanProcessCompound", dispId = 0x8b5)
    Boolean getKoreanProcessCompound();
            
    /**
     * <p>id(0x8b5)</p>
     */
    @ComProperty(name = "KoreanProcessCompound", dispId = 0x8b5)
    void setKoreanProcessCompound(Boolean param0);
            
    /**
     * <p>id(0x8b6)</p>
     */
    @ComProperty(name = "HebrewModes", dispId = 0x8b6)
    XlHebrewModes getHebrewModes();
            
    /**
     * <p>id(0x8b6)</p>
     */
    @ComProperty(name = "HebrewModes", dispId = 0x8b6)
    void setHebrewModes(XlHebrewModes param0);
            
    /**
     * <p>id(0x8b7)</p>
     */
    @ComProperty(name = "ArabicModes", dispId = 0x8b7)
    XlArabicModes getArabicModes();
            
    /**
     * <p>id(0x8b7)</p>
     */
    @ComProperty(name = "ArabicModes", dispId = 0x8b7)
    void setArabicModes(XlArabicModes param0);
            
    /**
     * <p>id(0xb74)</p>
     */
    @ComProperty(name = "ArabicStrictAlefHamza", dispId = 0xb74)
    Boolean getArabicStrictAlefHamza();
            
    /**
     * <p>id(0xb74)</p>
     */
    @ComProperty(name = "ArabicStrictAlefHamza", dispId = 0xb74)
    void setArabicStrictAlefHamza(Boolean param0);
            
    /**
     * <p>id(0xb75)</p>
     */
    @ComProperty(name = "ArabicStrictFinalYaa", dispId = 0xb75)
    Boolean getArabicStrictFinalYaa();
            
    /**
     * <p>id(0xb75)</p>
     */
    @ComProperty(name = "ArabicStrictFinalYaa", dispId = 0xb75)
    void setArabicStrictFinalYaa(Boolean param0);
            
    /**
     * <p>id(0xb76)</p>
     */
    @ComProperty(name = "ArabicStrictTaaMarboota", dispId = 0xb76)
    Boolean getArabicStrictTaaMarboota();
            
    /**
     * <p>id(0xb76)</p>
     */
    @ComProperty(name = "ArabicStrictTaaMarboota", dispId = 0xb76)
    void setArabicStrictTaaMarboota(Boolean param0);
            
    /**
     * <p>id(0xb77)</p>
     */
    @ComProperty(name = "RussianStrictE", dispId = 0xb77)
    Boolean getRussianStrictE();
            
    /**
     * <p>id(0xb77)</p>
     */
    @ComProperty(name = "RussianStrictE", dispId = 0xb77)
    void setRussianStrictE(Boolean param0);
            
    /**
     * <p>id(0xb78)</p>
     */
    @ComProperty(name = "SpanishModes", dispId = 0xb78)
    XlSpanishModes getSpanishModes();
            
    /**
     * <p>id(0xb78)</p>
     */
    @ComProperty(name = "SpanishModes", dispId = 0xb78)
    void setSpanishModes(XlSpanishModes param0);
            
    /**
     * <p>id(0xb79)</p>
     */
    @ComProperty(name = "PortugalReform", dispId = 0xb79)
    XlPortugueseReform getPortugalReform();
            
    /**
     * <p>id(0xb79)</p>
     */
    @ComProperty(name = "PortugalReform", dispId = 0xb79)
    void setPortugalReform(XlPortugueseReform param0);
            
    /**
     * <p>id(0xb7a)</p>
     */
    @ComProperty(name = "BrazilReform", dispId = 0xb7a)
    XlPortugueseReform getBrazilReform();
            
    /**
     * <p>id(0xb7a)</p>
     */
    @ComProperty(name = "BrazilReform", dispId = 0xb7a)
    void setBrazilReform(XlPortugueseReform param0);
            
    
}