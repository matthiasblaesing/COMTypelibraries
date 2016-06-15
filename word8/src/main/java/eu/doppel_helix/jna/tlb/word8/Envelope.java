
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
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Address", dispId = 0x1)
    Range getAddress();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "ReturnAddress", dispId = 0x2)
    Range getReturnAddress();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "DefaultPrintBarCode", dispId = 0x4)
    Boolean getDefaultPrintBarCode();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "DefaultPrintBarCode", dispId = 0x4)
    void setDefaultPrintBarCode(Boolean param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "DefaultPrintFIMA", dispId = 0x5)
    Boolean getDefaultPrintFIMA();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "DefaultPrintFIMA", dispId = 0x5)
    void setDefaultPrintFIMA(Boolean param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "DefaultHeight", dispId = 0x6)
    Float getDefaultHeight();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "DefaultHeight", dispId = 0x6)
    void setDefaultHeight(Float param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "DefaultWidth", dispId = 0x7)
    Float getDefaultWidth();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "DefaultWidth", dispId = 0x7)
    void setDefaultWidth(Float param0);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "DefaultSize", dispId = 0x0)
    String getDefaultSize();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "DefaultSize", dispId = 0x0)
    void setDefaultSize(String param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "DefaultOmitReturnAddress", dispId = 0x9)
    Boolean getDefaultOmitReturnAddress();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "DefaultOmitReturnAddress", dispId = 0x9)
    void setDefaultOmitReturnAddress(Boolean param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "FeedSource", dispId = 0xc)
    WdPaperTray getFeedSource();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "FeedSource", dispId = 0xc)
    void setFeedSource(WdPaperTray param0);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "AddressFromLeft", dispId = 0xd)
    Float getAddressFromLeft();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "AddressFromLeft", dispId = 0xd)
    void setAddressFromLeft(Float param0);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "AddressFromTop", dispId = 0xe)
    Float getAddressFromTop();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "AddressFromTop", dispId = 0xe)
    void setAddressFromTop(Float param0);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "ReturnAddressFromLeft", dispId = 0xf)
    Float getReturnAddressFromLeft();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "ReturnAddressFromLeft", dispId = 0xf)
    void setReturnAddressFromLeft(Float param0);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "ReturnAddressFromTop", dispId = 0x10)
    Float getReturnAddressFromTop();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "ReturnAddressFromTop", dispId = 0x10)
    void setReturnAddressFromTop(Float param0);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "AddressStyle", dispId = 0x11)
    Style getAddressStyle();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "ReturnAddressStyle", dispId = 0x12)
    Style getReturnAddressStyle();
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "DefaultOrientation", dispId = 0x13)
    WdEnvelopeOrientation getDefaultOrientation();
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "DefaultOrientation", dispId = 0x13)
    void setDefaultOrientation(WdEnvelopeOrientation param0);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "DefaultFaceUp", dispId = 0x14)
    Boolean getDefaultFaceUp();
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "DefaultFaceUp", dispId = 0x14)
    void setDefaultFaceUp(Boolean param0);
            
    /**
     * <p>id(0x65)</p>
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
     */
    @ComMethod(name = "UpdateDocument", dispId = 0x67)
    void UpdateDocument();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "Options", dispId = 0x68)
    void Options();
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "Vertical", dispId = 0x16)
    Boolean getVertical();
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "Vertical", dispId = 0x16)
    void setVertical(Boolean param0);
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "RecipientNamefromLeft", dispId = 0x17)
    Float getRecipientNamefromLeft();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "RecipientNamefromLeft", dispId = 0x17)
    void setRecipientNamefromLeft(Float param0);
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "RecipientNamefromTop", dispId = 0x18)
    Float getRecipientNamefromTop();
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "RecipientNamefromTop", dispId = 0x18)
    void setRecipientNamefromTop(Float param0);
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "RecipientPostalfromLeft", dispId = 0x19)
    Float getRecipientPostalfromLeft();
            
    /**
     * <p>id(0x19)</p>
     */
    @ComProperty(name = "RecipientPostalfromLeft", dispId = 0x19)
    void setRecipientPostalfromLeft(Float param0);
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "RecipientPostalfromTop", dispId = 0x1a)
    Float getRecipientPostalfromTop();
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "RecipientPostalfromTop", dispId = 0x1a)
    void setRecipientPostalfromTop(Float param0);
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "SenderNamefromLeft", dispId = 0x1b)
    Float getSenderNamefromLeft();
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "SenderNamefromLeft", dispId = 0x1b)
    void setSenderNamefromLeft(Float param0);
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "SenderNamefromTop", dispId = 0x1c)
    Float getSenderNamefromTop();
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "SenderNamefromTop", dispId = 0x1c)
    void setSenderNamefromTop(Float param0);
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComProperty(name = "SenderPostalfromLeft", dispId = 0x1d)
    Float getSenderPostalfromLeft();
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComProperty(name = "SenderPostalfromLeft", dispId = 0x1d)
    void setSenderPostalfromLeft(Float param0);
            
    /**
     * <p>id(0x1e)</p>
     */
    @ComProperty(name = "SenderPostalfromTop", dispId = 0x1e)
    Float getSenderPostalfromTop();
            
    /**
     * <p>id(0x1e)</p>
     */
    @ComProperty(name = "SenderPostalfromTop", dispId = 0x1e)
    void setSenderPostalfromTop(Float param0);
            
    /**
     * <p>id(0x69)</p>
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