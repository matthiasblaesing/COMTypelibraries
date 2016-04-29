
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03C4-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03C4-0000-0000-C000-000000000046}")
public interface IBlogExtensibility {
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "BlogProviderProperties", dispId = 0x1)
    void BlogProviderProperties(VARIANT BlogProvider,
            VARIANT FriendlyName,
            VARIANT CategorySupport,
            VARIANT Padding);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "SetupBlogAccount", dispId = 0x2)
    void SetupBlogAccount(String Account,
            Integer ParentWindow,
            com.sun.jna.platform.win32.COM.util.IDispatch Document,
            Boolean NewAccount,
            VARIANT ShowPictureUI);
            
    /**
     * <p>id(0x3)</p>
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
     */
    @ComMethod(name = "GetCategories", dispId = 0x8)
    void GetCategories(String Account,
            Integer ParentWindow,
            com.sun.jna.platform.win32.COM.util.IDispatch Document,
            VARIANT Categories);
            
    
}