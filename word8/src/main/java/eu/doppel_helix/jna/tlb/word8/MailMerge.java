
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020920-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020920-0000-0000-C000-000000000046}")
public interface MailMerge extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "MainDocumentType", dispId = 0x1)
    WdMailMergeMainDocType getMainDocumentType();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "MainDocumentType", dispId = 0x1)
    void setMainDocumentType(WdMailMergeMainDocType param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "State", dispId = 0x2)
    WdMailMergeState getState();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Destination", dispId = 0x3)
    WdMailMergeDestination getDestination();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Destination", dispId = 0x3)
    void setDestination(WdMailMergeDestination param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "DataSource", dispId = 0x4)
    MailMergeDataSource getDataSource();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Fields", dispId = 0x5)
    MailMergeFields getFields();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "ViewMailMergeFieldCodes", dispId = 0x6)
    Integer getViewMailMergeFieldCodes();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "ViewMailMergeFieldCodes", dispId = 0x6)
    void setViewMailMergeFieldCodes(Integer param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "SuppressBlankLines", dispId = 0x7)
    Boolean getSuppressBlankLines();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "SuppressBlankLines", dispId = 0x7)
    void setSuppressBlankLines(Boolean param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "MailAsAttachment", dispId = 0x8)
    Boolean getMailAsAttachment();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "MailAsAttachment", dispId = 0x8)
    void setMailAsAttachment(Boolean param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "MailAddressFieldName", dispId = 0x9)
    String getMailAddressFieldName();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "MailAddressFieldName", dispId = 0x9)
    void setMailAddressFieldName(String param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "MailSubject", dispId = 0xa)
    String getMailSubject();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "MailSubject", dispId = 0xa)
    void setMailSubject(String param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "CreateDataSource", dispId = 0x65)
    void CreateDataSource(Object Name,
            Object PasswordDocument,
            Object WritePasswordDocument,
            Object HeaderRecord,
            Object MSQuery,
            Object SQLStatement,
            Object SQLStatement1,
            Object Connection,
            Object LinkToSource);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "CreateHeaderSource", dispId = 0x66)
    void CreateHeaderSource(String Name,
            Object PasswordDocument,
            Object WritePasswordDocument,
            Object HeaderRecord);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComMethod(name = "OpenDataSource2000", dispId = 0x67)
    void OpenDataSource2000(String Name,
            Object Format,
            Object ConfirmConversions,
            Object ReadOnly,
            Object LinkToSource,
            Object AddToRecentFiles,
            Object PasswordDocument,
            Object PasswordTemplate,
            Object Revert,
            Object WritePasswordDocument,
            Object WritePasswordTemplate,
            Object Connection,
            Object SQLStatement,
            Object SQLStatement1);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "OpenHeaderSource2000", dispId = 0x68)
    void OpenHeaderSource2000(String Name,
            Object Format,
            Object ConfirmConversions,
            Object ReadOnly,
            Object AddToRecentFiles,
            Object PasswordDocument,
            Object PasswordTemplate,
            Object Revert,
            Object WritePasswordDocument,
            Object WritePasswordTemplate);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComMethod(name = "Execute", dispId = 0x69)
    void Execute(Object Pause);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComMethod(name = "Check", dispId = 0x6a)
    void Check();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComMethod(name = "EditDataSource", dispId = 0x6b)
    void EditDataSource();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComMethod(name = "EditHeaderSource", dispId = 0x6c)
    void EditHeaderSource();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComMethod(name = "EditMainDocument", dispId = 0x6d)
    void EditMainDocument();
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComMethod(name = "UseAddressBook", dispId = 0x6f)
    void UseAddressBook(String Type);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "HighlightMergeFields", dispId = 0xb)
    Boolean getHighlightMergeFields();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "HighlightMergeFields", dispId = 0xb)
    void setHighlightMergeFields(Boolean param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "MailFormat", dispId = 0xc)
    WdMailMergeMailFormat getMailFormat();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "MailFormat", dispId = 0xc)
    void setMailFormat(WdMailMergeMailFormat param0);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "ShowSendToCustom", dispId = 0xd)
    String getShowSendToCustom();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "ShowSendToCustom", dispId = 0xd)
    void setShowSendToCustom(String param0);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "WizardState", dispId = 0xe)
    Integer getWizardState();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "WizardState", dispId = 0xe)
    void setWizardState(Integer param0);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComMethod(name = "OpenDataSource", dispId = 0x70)
    void OpenDataSource(String Name,
            Object Format,
            Object ConfirmConversions,
            Object ReadOnly,
            Object LinkToSource,
            Object AddToRecentFiles,
            Object PasswordDocument,
            Object PasswordTemplate,
            Object Revert,
            Object WritePasswordDocument,
            Object WritePasswordTemplate,
            Object Connection,
            Object SQLStatement,
            Object SQLStatement1,
            Object OpenExclusive,
            Object SubType);
            
    /**
     * <p>id(0x71)</p>
     */
    @ComMethod(name = "OpenHeaderSource", dispId = 0x71)
    void OpenHeaderSource(String Name,
            Object Format,
            Object ConfirmConversions,
            Object ReadOnly,
            Object AddToRecentFiles,
            Object PasswordDocument,
            Object PasswordTemplate,
            Object Revert,
            Object WritePasswordDocument,
            Object WritePasswordTemplate,
            Object OpenExclusive);
            
    /**
     * <p>id(0x72)</p>
     */
    @ComMethod(name = "ShowWizard", dispId = 0x72)
    void ShowWizard(Object InitialState,
            Object ShowDocumentStep,
            Object ShowTemplateStep,
            Object ShowDataStep,
            Object ShowWriteStep,
            Object ShowPreviewStep,
            Object ShowMergeStep);
            
    
}