
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002096D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002096D-0000-0000-C000-000000000046}")
public interface Language extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xa)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "ID", dispId = 0xa)
    WdLanguageID getID();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "NameLocal", dispId = 0x0)
    String getNameLocal();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Name", dispId = 0xc)
    String getName();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "ActiveGrammarDictionary", dispId = 0xd)
    Dictionary getActiveGrammarDictionary();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "ActiveHyphenationDictionary", dispId = 0xe)
    Dictionary getActiveHyphenationDictionary();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "ActiveSpellingDictionary", dispId = 0xf)
    Dictionary getActiveSpellingDictionary();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "ActiveThesaurusDictionary", dispId = 0x10)
    Dictionary getActiveThesaurusDictionary();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "DefaultWritingStyle", dispId = 0x11)
    String getDefaultWritingStyle();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DefaultWritingStyle", dispId = 0x11)
    void setDefaultWritingStyle(String param0);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "WritingStyleList", dispId = 0x12)
    Object getWritingStyleList();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "SpellingDictionaryType", dispId = 0x13)
    WdDictionaryType getSpellingDictionaryType();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code WdDictionaryType}
     */
    @ComProperty(name = "SpellingDictionaryType", dispId = 0x13)
    void setSpellingDictionaryType(WdDictionaryType param0);
            
    
}