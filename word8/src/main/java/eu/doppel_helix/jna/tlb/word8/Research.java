
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({E6AAEC05-E543-4085-BA92-9BF7D2474F51})</p>
 */
@ComInterface(iid="{E6AAEC05-E543-4085-BA92-9BF7D2474F51}")
public interface Research extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1f4)</p>
     * <p>vtableId(10)</p>
     * @param ServiceID [in] {@code String}
     * @param QueryString [in, optional] {@code String}
     * @param QueryLanguage [in, optional] {@code WdLanguageID}
     * @param UseSelection [in, optional] {@code Boolean}
     * @param LaunchQuery [in, optional] {@code Boolean}
     */
    @ComMethod(name = "Query", dispId = 0x1f4)
    Object Query(String ServiceID,
            String QueryString,
            WdLanguageID QueryLanguage,
            Boolean UseSelection,
            Boolean LaunchQuery);
            
    /**
     * <p>id(0x1f5)</p>
     * <p>vtableId(11)</p>
     * @param LanguageFrom [in] {@code WdLanguageID}
     * @param LanguageTo [in] {@code WdLanguageID}
     */
    @ComMethod(name = "SetLanguagePair", dispId = 0x1f5)
    Object SetLanguagePair(WdLanguageID LanguageFrom,
            WdLanguageID LanguageTo);
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(12)</p>
     * @param ServiceID [in] {@code String}
     */
    @ComMethod(name = "IsResearchService", dispId = 0x1f6)
    Boolean IsResearchService(String ServiceID);
            
    /**
     * <p>id(0x3eb)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "FavoriteService", dispId = 0x3eb)
    String getFavoriteService();
            
    /**
     * <p>id(0x3eb)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FavoriteService", dispId = 0x3eb)
    void setFavoriteService(String param0);
            
    
}