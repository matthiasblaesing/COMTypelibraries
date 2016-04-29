
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({E6AAEC05-E543-4085-BA92-9BF7D2474F51})</p>
 */
@ComInterface(iid="{E6AAEC05-E543-4085-BA92-9BF7D2474F51}")
public interface Research {
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1f4)</p>
     */
    @ComMethod(name = "Query", dispId = 0x1f4)
    Object Query(String ServiceID,
            String QueryString,
            WdLanguageID QueryLanguage,
            Boolean UseSelection,
            Boolean LaunchQuery);
            
    /**
     * <p>id(0x1f5)</p>
     */
    @ComMethod(name = "SetLanguagePair", dispId = 0x1f5)
    Object SetLanguagePair(WdLanguageID LanguageFrom,
            WdLanguageID LanguageTo);
            
    /**
     * <p>id(0x1f6)</p>
     */
    @ComMethod(name = "IsResearchService", dispId = 0x1f6)
    Boolean IsResearchService(String ServiceID);
            
    /**
     * <p>id(0x3eb)</p>
     */
    @ComProperty(name = "FavoriteService", dispId = 0x3eb)
    String getFavoriteService();
            
    /**
     * <p>id(0x3eb)</p>
     */
    @ComProperty(name = "FavoriteService", dispId = 0x3eb)
    void setFavoriteService(String param0);
            
    
}