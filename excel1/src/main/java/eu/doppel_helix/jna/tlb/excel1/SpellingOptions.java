
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "DictLang", dispId = 0x8ac)
    Integer getDictLang();
            
    /**
     * <p>id(0x8ac)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DictLang", dispId = 0x8ac)
    void setDictLang(Integer param0);
            
    /**
     * <p>id(0x8ad)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "UserDict", dispId = 0x8ad)
    String getUserDict();
            
    /**
     * <p>id(0x8ad)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "UserDict", dispId = 0x8ad)
    void setUserDict(String param0);
            
    /**
     * <p>id(0x8ae)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "IgnoreCaps", dispId = 0x8ae)
    Boolean getIgnoreCaps();
            
    /**
     * <p>id(0x8ae)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IgnoreCaps", dispId = 0x8ae)
    void setIgnoreCaps(Boolean param0);
            
    /**
     * <p>id(0x8af)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "SuggestMainOnly", dispId = 0x8af)
    Boolean getSuggestMainOnly();
            
    /**
     * <p>id(0x8af)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SuggestMainOnly", dispId = 0x8af)
    void setSuggestMainOnly(Boolean param0);
            
    /**
     * <p>id(0x8b0)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "IgnoreMixedDigits", dispId = 0x8b0)
    Boolean getIgnoreMixedDigits();
            
    /**
     * <p>id(0x8b0)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IgnoreMixedDigits", dispId = 0x8b0)
    void setIgnoreMixedDigits(Boolean param0);
            
    /**
     * <p>id(0x8b1)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "IgnoreFileNames", dispId = 0x8b1)
    Boolean getIgnoreFileNames();
            
    /**
     * <p>id(0x8b1)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IgnoreFileNames", dispId = 0x8b1)
    void setIgnoreFileNames(Boolean param0);
            
    /**
     * <p>id(0x8b2)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "GermanPostReform", dispId = 0x8b2)
    Boolean getGermanPostReform();
            
    /**
     * <p>id(0x8b2)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "GermanPostReform", dispId = 0x8b2)
    void setGermanPostReform(Boolean param0);
            
    /**
     * <p>id(0x8b3)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "KoreanCombineAux", dispId = 0x8b3)
    Boolean getKoreanCombineAux();
            
    /**
     * <p>id(0x8b3)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "KoreanCombineAux", dispId = 0x8b3)
    void setKoreanCombineAux(Boolean param0);
            
    /**
     * <p>id(0x8b4)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "KoreanUseAutoChangeList", dispId = 0x8b4)
    Boolean getKoreanUseAutoChangeList();
            
    /**
     * <p>id(0x8b4)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "KoreanUseAutoChangeList", dispId = 0x8b4)
    void setKoreanUseAutoChangeList(Boolean param0);
            
    /**
     * <p>id(0x8b5)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "KoreanProcessCompound", dispId = 0x8b5)
    Boolean getKoreanProcessCompound();
            
    /**
     * <p>id(0x8b5)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "KoreanProcessCompound", dispId = 0x8b5)
    void setKoreanProcessCompound(Boolean param0);
            
    /**
     * <p>id(0x8b6)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "HebrewModes", dispId = 0x8b6)
    XlHebrewModes getHebrewModes();
            
    /**
     * <p>id(0x8b6)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code XlHebrewModes}
     */
    @ComProperty(name = "HebrewModes", dispId = 0x8b6)
    void setHebrewModes(XlHebrewModes param0);
            
    /**
     * <p>id(0x8b7)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "ArabicModes", dispId = 0x8b7)
    XlArabicModes getArabicModes();
            
    /**
     * <p>id(0x8b7)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code XlArabicModes}
     */
    @ComProperty(name = "ArabicModes", dispId = 0x8b7)
    void setArabicModes(XlArabicModes param0);
            
    /**
     * <p>id(0xb74)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "ArabicStrictAlefHamza", dispId = 0xb74)
    Boolean getArabicStrictAlefHamza();
            
    /**
     * <p>id(0xb74)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ArabicStrictAlefHamza", dispId = 0xb74)
    void setArabicStrictAlefHamza(Boolean param0);
            
    /**
     * <p>id(0xb75)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "ArabicStrictFinalYaa", dispId = 0xb75)
    Boolean getArabicStrictFinalYaa();
            
    /**
     * <p>id(0xb75)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ArabicStrictFinalYaa", dispId = 0xb75)
    void setArabicStrictFinalYaa(Boolean param0);
            
    /**
     * <p>id(0xb76)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "ArabicStrictTaaMarboota", dispId = 0xb76)
    Boolean getArabicStrictTaaMarboota();
            
    /**
     * <p>id(0xb76)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ArabicStrictTaaMarboota", dispId = 0xb76)
    void setArabicStrictTaaMarboota(Boolean param0);
            
    /**
     * <p>id(0xb77)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "RussianStrictE", dispId = 0xb77)
    Boolean getRussianStrictE();
            
    /**
     * <p>id(0xb77)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RussianStrictE", dispId = 0xb77)
    void setRussianStrictE(Boolean param0);
            
    /**
     * <p>id(0xb78)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "SpanishModes", dispId = 0xb78)
    XlSpanishModes getSpanishModes();
            
    /**
     * <p>id(0xb78)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code XlSpanishModes}
     */
    @ComProperty(name = "SpanishModes", dispId = 0xb78)
    void setSpanishModes(XlSpanishModes param0);
            
    /**
     * <p>id(0xb79)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "PortugalReform", dispId = 0xb79)
    XlPortugueseReform getPortugalReform();
            
    /**
     * <p>id(0xb79)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code XlPortugueseReform}
     */
    @ComProperty(name = "PortugalReform", dispId = 0xb79)
    void setPortugalReform(XlPortugueseReform param0);
            
    /**
     * <p>id(0xb7a)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "BrazilReform", dispId = 0xb7a)
    XlPortugueseReform getBrazilReform();
            
    /**
     * <p>id(0xb7a)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code XlPortugueseReform}
     */
    @ComProperty(name = "BrazilReform", dispId = 0xb7a)
    void setBrazilReform(XlPortugueseReform param0);
            
    
}