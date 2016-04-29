
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209A1-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209A1-0000-0000-C000-000000000046}")
public interface _LetterContent {
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
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Duplicate", dispId = 0xa)
    LetterContent getDuplicate();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "DateFormat", dispId = 0x65)
    String getDateFormat();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "DateFormat", dispId = 0x65)
    void setDateFormat(String param0);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "IncludeHeaderFooter", dispId = 0x66)
    Boolean getIncludeHeaderFooter();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "IncludeHeaderFooter", dispId = 0x66)
    void setIncludeHeaderFooter(Boolean param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "PageDesign", dispId = 0x67)
    String getPageDesign();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "PageDesign", dispId = 0x67)
    void setPageDesign(String param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "LetterStyle", dispId = 0x68)
    WdLetterStyle getLetterStyle();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "LetterStyle", dispId = 0x68)
    void setLetterStyle(WdLetterStyle param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "Letterhead", dispId = 0x69)
    Boolean getLetterhead();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "Letterhead", dispId = 0x69)
    void setLetterhead(Boolean param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "LetterheadLocation", dispId = 0x6a)
    WdLetterheadLocation getLetterheadLocation();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "LetterheadLocation", dispId = 0x6a)
    void setLetterheadLocation(WdLetterheadLocation param0);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "LetterheadSize", dispId = 0x6b)
    Float getLetterheadSize();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "LetterheadSize", dispId = 0x6b)
    void setLetterheadSize(Float param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "RecipientName", dispId = 0x6c)
    String getRecipientName();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "RecipientName", dispId = 0x6c)
    void setRecipientName(String param0);
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "RecipientAddress", dispId = 0x6d)
    String getRecipientAddress();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "RecipientAddress", dispId = 0x6d)
    void setRecipientAddress(String param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Salutation", dispId = 0x6e)
    String getSalutation();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Salutation", dispId = 0x6e)
    void setSalutation(String param0);
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "SalutationType", dispId = 0x6f)
    WdSalutationType getSalutationType();
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "SalutationType", dispId = 0x6f)
    void setSalutationType(WdSalutationType param0);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "RecipientReference", dispId = 0x70)
    String getRecipientReference();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "RecipientReference", dispId = 0x70)
    void setRecipientReference(String param0);
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "MailingInstructions", dispId = 0x72)
    String getMailingInstructions();
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "MailingInstructions", dispId = 0x72)
    void setMailingInstructions(String param0);
            
    /**
     * <p>id(0x73)</p>
     */
    @ComProperty(name = "AttentionLine", dispId = 0x73)
    String getAttentionLine();
            
    /**
     * <p>id(0x73)</p>
     */
    @ComProperty(name = "AttentionLine", dispId = 0x73)
    void setAttentionLine(String param0);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x74)
    String getSubject();
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x74)
    void setSubject(String param0);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComProperty(name = "EnclosureNumber", dispId = 0x75)
    Integer getEnclosureNumber();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComProperty(name = "EnclosureNumber", dispId = 0x75)
    void setEnclosureNumber(Integer param0);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "CCList", dispId = 0x76)
    String getCCList();
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "CCList", dispId = 0x76)
    void setCCList(String param0);
            
    /**
     * <p>id(0x77)</p>
     */
    @ComProperty(name = "ReturnAddress", dispId = 0x77)
    String getReturnAddress();
            
    /**
     * <p>id(0x77)</p>
     */
    @ComProperty(name = "ReturnAddress", dispId = 0x77)
    void setReturnAddress(String param0);
            
    /**
     * <p>id(0x78)</p>
     */
    @ComProperty(name = "SenderName", dispId = 0x78)
    String getSenderName();
            
    /**
     * <p>id(0x78)</p>
     */
    @ComProperty(name = "SenderName", dispId = 0x78)
    void setSenderName(String param0);
            
    /**
     * <p>id(0x79)</p>
     */
    @ComProperty(name = "Closing", dispId = 0x79)
    String getClosing();
            
    /**
     * <p>id(0x79)</p>
     */
    @ComProperty(name = "Closing", dispId = 0x79)
    void setClosing(String param0);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "SenderCompany", dispId = 0x7a)
    String getSenderCompany();
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "SenderCompany", dispId = 0x7a)
    void setSenderCompany(String param0);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "SenderJobTitle", dispId = 0x7b)
    String getSenderJobTitle();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "SenderJobTitle", dispId = 0x7b)
    void setSenderJobTitle(String param0);
            
    /**
     * <p>id(0x7c)</p>
     */
    @ComProperty(name = "SenderInitials", dispId = 0x7c)
    String getSenderInitials();
            
    /**
     * <p>id(0x7c)</p>
     */
    @ComProperty(name = "SenderInitials", dispId = 0x7c)
    void setSenderInitials(String param0);
            
    /**
     * <p>id(0x7d)</p>
     */
    @ComProperty(name = "InfoBlock", dispId = 0x7d)
    Boolean getInfoBlock();
            
    /**
     * <p>id(0x7d)</p>
     */
    @ComProperty(name = "InfoBlock", dispId = 0x7d)
    void setInfoBlock(Boolean param0);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "RecipientCode", dispId = 0x7e)
    String getRecipientCode();
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "RecipientCode", dispId = 0x7e)
    void setRecipientCode(String param0);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "RecipientGender", dispId = 0x7f)
    WdSalutationGender getRecipientGender();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "RecipientGender", dispId = 0x7f)
    void setRecipientGender(WdSalutationGender param0);
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "ReturnAddressShortForm", dispId = 0x80)
    String getReturnAddressShortForm();
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "ReturnAddressShortForm", dispId = 0x80)
    void setReturnAddressShortForm(String param0);
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "SenderCity", dispId = 0x81)
    String getSenderCity();
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "SenderCity", dispId = 0x81)
    void setSenderCity(String param0);
            
    /**
     * <p>id(0x82)</p>
     */
    @ComProperty(name = "SenderCode", dispId = 0x82)
    String getSenderCode();
            
    /**
     * <p>id(0x82)</p>
     */
    @ComProperty(name = "SenderCode", dispId = 0x82)
    void setSenderCode(String param0);
            
    /**
     * <p>id(0x83)</p>
     */
    @ComProperty(name = "SenderGender", dispId = 0x83)
    WdSalutationGender getSenderGender();
            
    /**
     * <p>id(0x83)</p>
     */
    @ComProperty(name = "SenderGender", dispId = 0x83)
    void setSenderGender(WdSalutationGender param0);
            
    /**
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "SenderReference", dispId = 0x84)
    String getSenderReference();
            
    /**
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "SenderReference", dispId = 0x84)
    void setSenderReference(String param0);
            
    
}