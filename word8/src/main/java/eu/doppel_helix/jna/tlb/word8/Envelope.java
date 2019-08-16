
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020918-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020918-0000-0000-C000-000000000046}")
public interface Envelope extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Address", dispId = 0x1)
    Range getAddress();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "ReturnAddress", dispId = 0x2)
    Range getReturnAddress();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "DefaultPrintBarCode", dispId = 0x4)
    Boolean getDefaultPrintBarCode();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DefaultPrintBarCode", dispId = 0x4)
    void setDefaultPrintBarCode(Boolean param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "DefaultPrintFIMA", dispId = 0x5)
    Boolean getDefaultPrintFIMA();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DefaultPrintFIMA", dispId = 0x5)
    void setDefaultPrintFIMA(Boolean param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "DefaultHeight", dispId = 0x6)
    Float getDefaultHeight();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "DefaultHeight", dispId = 0x6)
    void setDefaultHeight(Float param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "DefaultWidth", dispId = 0x7)
    Float getDefaultWidth();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "DefaultWidth", dispId = 0x7)
    void setDefaultWidth(Float param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "DefaultSize", dispId = 0x0)
    String getDefaultSize();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DefaultSize", dispId = 0x0)
    void setDefaultSize(String param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "DefaultOmitReturnAddress", dispId = 0x9)
    Boolean getDefaultOmitReturnAddress();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DefaultOmitReturnAddress", dispId = 0x9)
    void setDefaultOmitReturnAddress(Boolean param0);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "FeedSource", dispId = 0xc)
    WdPaperTray getFeedSource();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code WdPaperTray}
     */
    @ComProperty(name = "FeedSource", dispId = 0xc)
    void setFeedSource(WdPaperTray param0);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "AddressFromLeft", dispId = 0xd)
    Float getAddressFromLeft();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "AddressFromLeft", dispId = 0xd)
    void setAddressFromLeft(Float param0);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "AddressFromTop", dispId = 0xe)
    Float getAddressFromTop();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "AddressFromTop", dispId = 0xe)
    void setAddressFromTop(Float param0);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "ReturnAddressFromLeft", dispId = 0xf)
    Float getReturnAddressFromLeft();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "ReturnAddressFromLeft", dispId = 0xf)
    void setReturnAddressFromLeft(Float param0);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "ReturnAddressFromTop", dispId = 0x10)
    Float getReturnAddressFromTop();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "ReturnAddressFromTop", dispId = 0x10)
    void setReturnAddressFromTop(Float param0);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "AddressStyle", dispId = 0x11)
    Style getAddressStyle();
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "ReturnAddressStyle", dispId = 0x12)
    Style getReturnAddressStyle();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "DefaultOrientation", dispId = 0x13)
    WdEnvelopeOrientation getDefaultOrientation();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code WdEnvelopeOrientation}
     */
    @ComProperty(name = "DefaultOrientation", dispId = 0x13)
    void setDefaultOrientation(WdEnvelopeOrientation param0);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "DefaultFaceUp", dispId = 0x14)
    Boolean getDefaultFaceUp();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DefaultFaceUp", dispId = 0x14)
    void setDefaultFaceUp(Boolean param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(40)</p>
     * @param ExtractAddress [in, optional] {@code Object}
     * @param Address [in, optional] {@code Object}
     * @param AutoText [in, optional] {@code Object}
     * @param OmitReturnAddress [in, optional] {@code Object}
     * @param ReturnAddress [in, optional] {@code Object}
     * @param ReturnAutoText [in, optional] {@code Object}
     * @param PrintBarCode [in, optional] {@code Object}
     * @param PrintFIMA [in, optional] {@code Object}
     * @param Size [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param FeedSource [in, optional] {@code Object}
     * @param AddressFromLeft [in, optional] {@code Object}
     * @param AddressFromTop [in, optional] {@code Object}
     * @param ReturnAddressFromLeft [in, optional] {@code Object}
     * @param ReturnAddressFromTop [in, optional] {@code Object}
     * @param DefaultFaceUp [in, optional] {@code Object}
     * @param DefaultOrientation [in, optional] {@code Object}
     */
    @ComMethod(name = "Insert2000", dispId = 0x65)
    void Insert2000(Object ExtractAddress,
            Object Address,
            Object AutoText,
            Object OmitReturnAddress,
            Object ReturnAddress,
            Object ReturnAutoText,
            Object PrintBarCode,
            Object PrintFIMA,
            Object Size,
            Object Height,
            Object Width,
            Object FeedSource,
            Object AddressFromLeft,
            Object AddressFromTop,
            Object ReturnAddressFromLeft,
            Object ReturnAddressFromTop,
            Object DefaultFaceUp,
            Object DefaultOrientation);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(41)</p>
     * @param ExtractAddress [in, optional] {@code Object}
     * @param Address [in, optional] {@code Object}
     * @param AutoText [in, optional] {@code Object}
     * @param OmitReturnAddress [in, optional] {@code Object}
     * @param ReturnAddress [in, optional] {@code Object}
     * @param ReturnAutoText [in, optional] {@code Object}
     * @param PrintBarCode [in, optional] {@code Object}
     * @param PrintFIMA [in, optional] {@code Object}
     * @param Size [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param FeedSource [in, optional] {@code Object}
     * @param AddressFromLeft [in, optional] {@code Object}
     * @param AddressFromTop [in, optional] {@code Object}
     * @param ReturnAddressFromLeft [in, optional] {@code Object}
     * @param ReturnAddressFromTop [in, optional] {@code Object}
     * @param DefaultFaceUp [in, optional] {@code Object}
     * @param DefaultOrientation [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintOut2000", dispId = 0x66)
    void PrintOut2000(Object ExtractAddress,
            Object Address,
            Object AutoText,
            Object OmitReturnAddress,
            Object ReturnAddress,
            Object ReturnAutoText,
            Object PrintBarCode,
            Object PrintFIMA,
            Object Size,
            Object Height,
            Object Width,
            Object FeedSource,
            Object AddressFromLeft,
            Object AddressFromTop,
            Object ReturnAddressFromLeft,
            Object ReturnAddressFromTop,
            Object DefaultFaceUp,
            Object DefaultOrientation);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(42)</p>
     */
    @ComMethod(name = "UpdateDocument", dispId = 0x67)
    void UpdateDocument();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(43)</p>
     */
    @ComMethod(name = "Options", dispId = 0x68)
    void Options();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "Vertical", dispId = 0x16)
    Boolean getVertical();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Vertical", dispId = 0x16)
    void setVertical(Boolean param0);
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "RecipientNamefromLeft", dispId = 0x17)
    Float getRecipientNamefromLeft();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "RecipientNamefromLeft", dispId = 0x17)
    void setRecipientNamefromLeft(Float param0);
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "RecipientNamefromTop", dispId = 0x18)
    Float getRecipientNamefromTop();
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "RecipientNamefromTop", dispId = 0x18)
    void setRecipientNamefromTop(Float param0);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "RecipientPostalfromLeft", dispId = 0x19)
    Float getRecipientPostalfromLeft();
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "RecipientPostalfromLeft", dispId = 0x19)
    void setRecipientPostalfromLeft(Float param0);
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "RecipientPostalfromTop", dispId = 0x1a)
    Float getRecipientPostalfromTop();
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "RecipientPostalfromTop", dispId = 0x1a)
    void setRecipientPostalfromTop(Float param0);
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "SenderNamefromLeft", dispId = 0x1b)
    Float getSenderNamefromLeft();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "SenderNamefromLeft", dispId = 0x1b)
    void setSenderNamefromLeft(Float param0);
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "SenderNamefromTop", dispId = 0x1c)
    Float getSenderNamefromTop();
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "SenderNamefromTop", dispId = 0x1c)
    void setSenderNamefromTop(Float param0);
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "SenderPostalfromLeft", dispId = 0x1d)
    Float getSenderPostalfromLeft();
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "SenderPostalfromLeft", dispId = 0x1d)
    void setSenderPostalfromLeft(Float param0);
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "SenderPostalfromTop", dispId = 0x1e)
    Float getSenderPostalfromTop();
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(61)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "SenderPostalfromTop", dispId = 0x1e)
    void setSenderPostalfromTop(Float param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(62)</p>
     * @param ExtractAddress [in, optional] {@code Object}
     * @param Address [in, optional] {@code Object}
     * @param AutoText [in, optional] {@code Object}
     * @param OmitReturnAddress [in, optional] {@code Object}
     * @param ReturnAddress [in, optional] {@code Object}
     * @param ReturnAutoText [in, optional] {@code Object}
     * @param PrintBarCode [in, optional] {@code Object}
     * @param PrintFIMA [in, optional] {@code Object}
     * @param Size [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param FeedSource [in, optional] {@code Object}
     * @param AddressFromLeft [in, optional] {@code Object}
     * @param AddressFromTop [in, optional] {@code Object}
     * @param ReturnAddressFromLeft [in, optional] {@code Object}
     * @param ReturnAddressFromTop [in, optional] {@code Object}
     * @param DefaultFaceUp [in, optional] {@code Object}
     * @param DefaultOrientation [in, optional] {@code Object}
     * @param PrintEPostage [in, optional] {@code Object}
     * @param Vertical [in, optional] {@code Object}
     * @param RecipientNamefromLeft [in, optional] {@code Object}
     * @param RecipientNamefromTop [in, optional] {@code Object}
     * @param RecipientPostalfromLeft [in, optional] {@code Object}
     * @param RecipientPostalfromTop [in, optional] {@code Object}
     * @param SenderNamefromLeft [in, optional] {@code Object}
     * @param SenderNamefromTop [in, optional] {@code Object}
     * @param SenderPostalfromLeft [in, optional] {@code Object}
     * @param SenderPostalfromTop [in, optional] {@code Object}
     */
    @ComMethod(name = "Insert", dispId = 0x69)
    void Insert(Object ExtractAddress,
            Object Address,
            Object AutoText,
            Object OmitReturnAddress,
            Object ReturnAddress,
            Object ReturnAutoText,
            Object PrintBarCode,
            Object PrintFIMA,
            Object Size,
            Object Height,
            Object Width,
            Object FeedSource,
            Object AddressFromLeft,
            Object AddressFromTop,
            Object ReturnAddressFromLeft,
            Object ReturnAddressFromTop,
            Object DefaultFaceUp,
            Object DefaultOrientation,
            Object PrintEPostage,
            Object Vertical,
            Object RecipientNamefromLeft,
            Object RecipientNamefromTop,
            Object RecipientPostalfromLeft,
            Object RecipientPostalfromTop,
            Object SenderNamefromLeft,
            Object SenderNamefromTop,
            Object SenderPostalfromLeft,
            Object SenderPostalfromTop);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(63)</p>
     * @param ExtractAddress [in, optional] {@code Object}
     * @param Address [in, optional] {@code Object}
     * @param AutoText [in, optional] {@code Object}
     * @param OmitReturnAddress [in, optional] {@code Object}
     * @param ReturnAddress [in, optional] {@code Object}
     * @param ReturnAutoText [in, optional] {@code Object}
     * @param PrintBarCode [in, optional] {@code Object}
     * @param PrintFIMA [in, optional] {@code Object}
     * @param Size [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param FeedSource [in, optional] {@code Object}
     * @param AddressFromLeft [in, optional] {@code Object}
     * @param AddressFromTop [in, optional] {@code Object}
     * @param ReturnAddressFromLeft [in, optional] {@code Object}
     * @param ReturnAddressFromTop [in, optional] {@code Object}
     * @param DefaultFaceUp [in, optional] {@code Object}
     * @param DefaultOrientation [in, optional] {@code Object}
     * @param PrintEPostage [in, optional] {@code Object}
     * @param Vertical [in, optional] {@code Object}
     * @param RecipientNamefromLeft [in, optional] {@code Object}
     * @param RecipientNamefromTop [in, optional] {@code Object}
     * @param RecipientPostalfromLeft [in, optional] {@code Object}
     * @param RecipientPostalfromTop [in, optional] {@code Object}
     * @param SenderNamefromLeft [in, optional] {@code Object}
     * @param SenderNamefromTop [in, optional] {@code Object}
     * @param SenderPostalfromLeft [in, optional] {@code Object}
     * @param SenderPostalfromTop [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintOut", dispId = 0x6a)
    void PrintOut(Object ExtractAddress,
            Object Address,
            Object AutoText,
            Object OmitReturnAddress,
            Object ReturnAddress,
            Object ReturnAutoText,
            Object PrintBarCode,
            Object PrintFIMA,
            Object Size,
            Object Height,
            Object Width,
            Object FeedSource,
            Object AddressFromLeft,
            Object AddressFromTop,
            Object ReturnAddressFromLeft,
            Object ReturnAddressFromTop,
            Object DefaultFaceUp,
            Object DefaultOrientation,
            Object PrintEPostage,
            Object Vertical,
            Object RecipientNamefromLeft,
            Object RecipientNamefromTop,
            Object RecipientPostalfromLeft,
            Object RecipientPostalfromTop,
            Object SenderNamefromLeft,
            Object SenderNamefromTop,
            Object SenderPostalfromLeft,
            Object SenderPostalfromTop);
            
    
}