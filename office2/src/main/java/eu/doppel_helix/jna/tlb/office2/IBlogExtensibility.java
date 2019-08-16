
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03C4-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03C4-0000-0000-C000-000000000046}")
public interface IBlogExtensibility extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     * @param BlogProvider [out] {@code String}
     * @param FriendlyName [out] {@code String}
     * @param CategorySupport [out] {@code MsoBlogCategorySupport}
     * @param Padding [out] {@code Boolean}
     */
    @ComMethod(name = "BlogProviderProperties", dispId = 0x1)
    void BlogProviderProperties(VARIANT BlogProvider,
            VARIANT FriendlyName,
            VARIANT CategorySupport,
            VARIANT Padding);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     * @param Account [in] {@code String}
     * @param ParentWindow [in] {@code Integer}
     * @param Document [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param NewAccount [in] {@code Boolean}
     * @param ShowPictureUI [out] {@code Boolean}
     */
    @ComMethod(name = "SetupBlogAccount", dispId = 0x2)
    void SetupBlogAccount(String Account,
            Integer ParentWindow,
            com.sun.jna.platform.win32.COM.util.IDispatch Document,
            Boolean NewAccount,
            VARIANT ShowPictureUI);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     * @param Account [in] {@code String}
     * @param ParentWindow [in] {@code Integer}
     * @param Document [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param BlogNames [out] {@code String}
     * @param BlogIDs [out] {@code String}
     * @param BlogURLs [out] {@code String}
     */
    @ComMethod(name = "GetUserBlogs", dispId = 0x3)
    void GetUserBlogs(String Account,
            Integer ParentWindow,
            com.sun.jna.platform.win32.COM.util.IDispatch Document,
            VARIANT BlogNames,
            VARIANT BlogIDs,
            VARIANT BlogURLs);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     * @param Account [in] {@code String}
     * @param ParentWindow [in] {@code Integer}
     * @param Document [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param PostTitles [out] {@code String}
     * @param PostDates [out] {@code String}
     * @param PostIDs [out] {@code String}
     */
    @ComMethod(name = "GetRecentPosts", dispId = 0x4)
    void GetRecentPosts(String Account,
            Integer ParentWindow,
            com.sun.jna.platform.win32.COM.util.IDispatch Document,
            VARIANT PostTitles,
            VARIANT PostDates,
            VARIANT PostIDs);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     * @param Account [in] {@code String}
     * @param PostID [in] {@code String}
     * @param ParentWindow [in] {@code Integer}
     * @param xHTML [out] {@code String}
     * @param Title [out] {@code String}
     * @param DatePosted [out] {@code String}
     * @param Categories [out] {@code String}
     */
    @ComMethod(name = "Open", dispId = 0x5)
    void Open(String Account,
            String PostID,
            Integer ParentWindow,
            VARIANT xHTML,
            VARIANT Title,
            VARIANT DatePosted,
            VARIANT Categories);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     * @param Account [in] {@code String}
     * @param ParentWindow [in] {@code Integer}
     * @param Document [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param xHTML [in] {@code String}
     * @param Title [in] {@code String}
     * @param DateTime [in] {@code String}
     * @param Categories [in] {@code String}
     * @param Draft [in] {@code Boolean}
     * @param PostID [out] {@code String}
     * @param PublishMessage [out] {@code String}
     */
    @ComMethod(name = "PublishPost", dispId = 0x6)
    void PublishPost(String Account,
            Integer ParentWindow,
            com.sun.jna.platform.win32.COM.util.IDispatch Document,
            String xHTML,
            String Title,
            String DateTime,
            String Categories,
            Boolean Draft,
            VARIANT PostID,
            VARIANT PublishMessage);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(13)</p>
     * @param Account [in] {@code String}
     * @param ParentWindow [in] {@code Integer}
     * @param Document [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param PostID [in] {@code String}
     * @param xHTML [in] {@code String}
     * @param Title [in] {@code String}
     * @param DateTime [in] {@code String}
     * @param Categories [in] {@code String}
     * @param Draft [in] {@code Boolean}
     * @param PublishMessage [out] {@code String}
     */
    @ComMethod(name = "RepublishPost", dispId = 0x7)
    void RepublishPost(String Account,
            Integer ParentWindow,
            com.sun.jna.platform.win32.COM.util.IDispatch Document,
            String PostID,
            String xHTML,
            String Title,
            String DateTime,
            String Categories,
            Boolean Draft,
            VARIANT PublishMessage);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(14)</p>
     * @param Account [in] {@code String}
     * @param ParentWindow [in] {@code Integer}
     * @param Document [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Categories [out] {@code String}
     */
    @ComMethod(name = "GetCategories", dispId = 0x8)
    void GetCategories(String Account,
            Integer ParentWindow,
            com.sun.jna.platform.win32.COM.util.IDispatch Document,
            VARIANT Categories);
            
    
}