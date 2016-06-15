
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024465-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024465-0001-0000-C000-000000000046}")
public interface ISpellingOptions extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x8ac)</p>
     */
    @ComProperty(name = "DictLang", dispId = 0x8ac)
    com.sun.jna.platform.win32.WinNT.HRESULT getDictLang(VARIANT RHS);
            
    /**
     * <p>id(0x8ac)</p>
     */
    @ComProperty(name = "DictLang", dispId = 0x8ac)
    com.sun.jna.platform.win32.WinNT.HRESULT setDictLang(Integer RHS);
            
    /**
     * <p>id(0x8ad)</p>
     */
    @ComProperty(name = "UserDict", dispId = 0x8ad)
    com.sun.jna.platform.win32.WinNT.HRESULT getUserDict(VARIANT RHS);
            
    /**
     * <p>id(0x8ad)</p>
     */
    @ComProperty(name = "UserDict", dispId = 0x8ad)
    com.sun.jna.platform.win32.WinNT.HRESULT setUserDict(String RHS);
            
    /**
     * <p>id(0x8ae)</p>
     */
    @ComProperty(name = "IgnoreCaps", dispId = 0x8ae)
    com.sun.jna.platform.win32.WinNT.HRESULT getIgnoreCaps(VARIANT RHS);
            
    /**
     * <p>id(0x8ae)</p>
     */
    @ComProperty(name = "IgnoreCaps", dispId = 0x8ae)
    com.sun.jna.platform.win32.WinNT.HRESULT setIgnoreCaps(Boolean RHS);
            
    /**
     * <p>id(0x8af)</p>
     */
    @ComProperty(name = "SuggestMainOnly", dispId = 0x8af)
    com.sun.jna.platform.win32.WinNT.HRESULT getSuggestMainOnly(VARIANT RHS);
            
    /**
     * <p>id(0x8af)</p>
     */
    @ComProperty(name = "SuggestMainOnly", dispId = 0x8af)
    com.sun.jna.platform.win32.WinNT.HRESULT setSuggestMainOnly(Boolean RHS);
            
    /**
     * <p>id(0x8b0)</p>
     */
    @ComProperty(name = "IgnoreMixedDigits", dispId = 0x8b0)
    com.sun.jna.platform.win32.WinNT.HRESULT getIgnoreMixedDigits(VARIANT RHS);
            
    /**
     * <p>id(0x8b0)</p>
     */
    @ComProperty(name = "IgnoreMixedDigits", dispId = 0x8b0)
    com.sun.jna.platform.win32.WinNT.HRESULT setIgnoreMixedDigits(Boolean RHS);
            
    /**
     * <p>id(0x8b1)</p>
     */
    @ComProperty(name = "IgnoreFileNames", dispId = 0x8b1)
    com.sun.jna.platform.win32.WinNT.HRESULT getIgnoreFileNames(VARIANT RHS);
            
    /**
     * <p>id(0x8b1)</p>
     */
    @ComProperty(name = "IgnoreFileNames", dispId = 0x8b1)
    com.sun.jna.platform.win32.WinNT.HRESULT setIgnoreFileNames(Boolean RHS);
            
    /**
     * <p>id(0x8b2)</p>
     */
    @ComProperty(name = "GermanPostReform", dispId = 0x8b2)
    com.sun.jna.platform.win32.WinNT.HRESULT getGermanPostReform(VARIANT RHS);
            
    /**
     * <p>id(0x8b2)</p>
     */
    @ComProperty(name = "GermanPostReform", dispId = 0x8b2)
    com.sun.jna.platform.win32.WinNT.HRESULT setGermanPostReform(Boolean RHS);
            
    /**
     * <p>id(0x8b3)</p>
     */
    @ComProperty(name = "KoreanCombineAux", dispId = 0x8b3)
    com.sun.jna.platform.win32.WinNT.HRESULT getKoreanCombineAux(VARIANT RHS);
            
    /**
     * <p>id(0x8b3)</p>
     */
    @ComProperty(name = "KoreanCombineAux", dispId = 0x8b3)
    com.sun.jna.platform.win32.WinNT.HRESULT setKoreanCombineAux(Boolean RHS);
            
    /**
     * <p>id(0x8b4)</p>
     */
    @ComProperty(name = "KoreanUseAutoChangeList", dispId = 0x8b4)
    com.sun.jna.platform.win32.WinNT.HRESULT getKoreanUseAutoChangeList(VARIANT RHS);
            
    /**
     * <p>id(0x8b4)</p>
     */
    @ComProperty(name = "KoreanUseAutoChangeList", dispId = 0x8b4)
    com.sun.jna.platform.win32.WinNT.HRESULT setKoreanUseAutoChangeList(Boolean RHS);
            
    /**
     * <p>id(0x8b5)</p>
     */
    @ComProperty(name = "KoreanProcessCompound", dispId = 0x8b5)
    com.sun.jna.platform.win32.WinNT.HRESULT getKoreanProcessCompound(VARIANT RHS);
            
    /**
     * <p>id(0x8b5)</p>
     */
    @ComProperty(name = "KoreanProcessCompound", dispId = 0x8b5)
    com.sun.jna.platform.win32.WinNT.HRESULT setKoreanProcessCompound(Boolean RHS);
            
    /**
     * <p>id(0x8b6)</p>
     */
    @ComProperty(name = "HebrewModes", dispId = 0x8b6)
    com.sun.jna.platform.win32.WinNT.HRESULT getHebrewModes(VARIANT RHS);
            
    /**
     * <p>id(0x8b6)</p>
     */
    @ComProperty(name = "HebrewModes", dispId = 0x8b6)
    com.sun.jna.platform.win32.WinNT.HRESULT setHebrewModes(XlHebrewModes RHS);
            
    /**
     * <p>id(0x8b7)</p>
     */
    @ComProperty(name = "ArabicModes", dispId = 0x8b7)
    com.sun.jna.platform.win32.WinNT.HRESULT getArabicModes(VARIANT RHS);
            
    /**
     * <p>id(0x8b7)</p>
     */
    @ComProperty(name = "ArabicModes", dispId = 0x8b7)
    com.sun.jna.platform.win32.WinNT.HRESULT setArabicModes(XlArabicModes RHS);
            
    /**
     * <p>id(0xb74)</p>
     */
    @ComProperty(name = "ArabicStrictAlefHamza", dispId = 0xb74)
    com.sun.jna.platform.win32.WinNT.HRESULT getArabicStrictAlefHamza(VARIANT RHS);
            
    /**
     * <p>id(0xb74)</p>
     */
    @ComProperty(name = "ArabicStrictAlefHamza", dispId = 0xb74)
    com.sun.jna.platform.win32.WinNT.HRESULT setArabicStrictAlefHamza(Boolean RHS);
            
    /**
     * <p>id(0xb75)</p>
     */
    @ComProperty(name = "ArabicStrictFinalYaa", dispId = 0xb75)
    com.sun.jna.platform.win32.WinNT.HRESULT getArabicStrictFinalYaa(VARIANT RHS);
            
    /**
     * <p>id(0xb75)</p>
     */
    @ComProperty(name = "ArabicStrictFinalYaa", dispId = 0xb75)
    com.sun.jna.platform.win32.WinNT.HRESULT setArabicStrictFinalYaa(Boolean RHS);
            
    /**
     * <p>id(0xb76)</p>
     */
    @ComProperty(name = "ArabicStrictTaaMarboota", dispId = 0xb76)
    com.sun.jna.platform.win32.WinNT.HRESULT getArabicStrictTaaMarboota(VARIANT RHS);
            
    /**
     * <p>id(0xb76)</p>
     */
    @ComProperty(name = "ArabicStrictTaaMarboota", dispId = 0xb76)
    com.sun.jna.platform.win32.WinNT.HRESULT setArabicStrictTaaMarboota(Boolean RHS);
            
    /**
     * <p>id(0xb77)</p>
     */
    @ComProperty(name = "RussianStrictE", dispId = 0xb77)
    com.sun.jna.platform.win32.WinNT.HRESULT getRussianStrictE(VARIANT RHS);
            
    /**
     * <p>id(0xb77)</p>
     */
    @ComProperty(name = "RussianStrictE", dispId = 0xb77)
    com.sun.jna.platform.win32.WinNT.HRESULT setRussianStrictE(Boolean RHS);
            
    /**
     * <p>id(0xb78)</p>
     */
    @ComProperty(name = "SpanishModes", dispId = 0xb78)
    com.sun.jna.platform.win32.WinNT.HRESULT getSpanishModes(VARIANT RHS);
            
    /**
     * <p>id(0xb78)</p>
     */
    @ComProperty(name = "SpanishModes", dispId = 0xb78)
    com.sun.jna.platform.win32.WinNT.HRESULT setSpanishModes(XlSpanishModes RHS);
            
    /**
     * <p>id(0xb79)</p>
     */
    @ComProperty(name = "PortugalReform", dispId = 0xb79)
    com.sun.jna.platform.win32.WinNT.HRESULT getPortugalReform(VARIANT RHS);
            
    /**
     * <p>id(0xb79)</p>
     */
    @ComProperty(name = "PortugalReform", dispId = 0xb79)
    com.sun.jna.platform.win32.WinNT.HRESULT setPortugalReform(XlPortugueseReform RHS);
            
    /**
     * <p>id(0xb7a)</p>
     */
    @ComProperty(name = "BrazilReform", dispId = 0xb7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getBrazilReform(VARIANT RHS);
            
    /**
     * <p>id(0xb7a)</p>
     */
    @ComProperty(name = "BrazilReform", dispId = 0xb7a)
    com.sun.jna.platform.win32.WinNT.HRESULT setBrazilReform(XlPortugueseReform RHS);
            
    
}