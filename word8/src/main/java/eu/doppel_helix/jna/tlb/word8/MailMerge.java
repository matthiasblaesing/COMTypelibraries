
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
    @ComProperty(name = "MainDocumentType", dispId = 0x1)
    WdMailMergeMainDocType getMainDocumentType();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code WdMailMergeMainDocType}
     */
    @ComProperty(name = "MainDocumentType", dispId = 0x1)
    void setMainDocumentType(WdMailMergeMainDocType param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "State", dispId = 0x2)
    WdMailMergeState getState();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Destination", dispId = 0x3)
    WdMailMergeDestination getDestination();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code WdMailMergeDestination}
     */
    @ComProperty(name = "Destination", dispId = 0x3)
    void setDestination(WdMailMergeDestination param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "DataSource", dispId = 0x4)
    MailMergeDataSource getDataSource();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Fields", dispId = 0x5)
    MailMergeFields getFields();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "ViewMailMergeFieldCodes", dispId = 0x6)
    Integer getViewMailMergeFieldCodes();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ViewMailMergeFieldCodes", dispId = 0x6)
    void setViewMailMergeFieldCodes(Integer param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "SuppressBlankLines", dispId = 0x7)
    Boolean getSuppressBlankLines();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SuppressBlankLines", dispId = 0x7)
    void setSuppressBlankLines(Boolean param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "MailAsAttachment", dispId = 0x8)
    Boolean getMailAsAttachment();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MailAsAttachment", dispId = 0x8)
    void setMailAsAttachment(Boolean param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "MailAddressFieldName", dispId = 0x9)
    String getMailAddressFieldName();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MailAddressFieldName", dispId = 0x9)
    void setMailAddressFieldName(String param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "MailSubject", dispId = 0xa)
    String getMailSubject();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MailSubject", dispId = 0xa)
    void setMailSubject(String param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(27)</p>
     * @param Name [in, optional] {@code Object}
     * @param PasswordDocument [in, optional] {@code Object}
     * @param WritePasswordDocument [in, optional] {@code Object}
     * @param HeaderRecord [in, optional] {@code Object}
     * @param MSQuery [in, optional] {@code Object}
     * @param SQLStatement [in, optional] {@code Object}
     * @param SQLStatement1 [in, optional] {@code Object}
     * @param Connection [in, optional] {@code Object}
     * @param LinkToSource [in, optional] {@code Object}
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
     * <p>vtableId(28)</p>
     * @param Name [in] {@code String}
     * @param PasswordDocument [in, optional] {@code Object}
     * @param WritePasswordDocument [in, optional] {@code Object}
     * @param HeaderRecord [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateHeaderSource", dispId = 0x66)
    void CreateHeaderSource(String Name,
            Object PasswordDocument,
            Object WritePasswordDocument,
            Object HeaderRecord);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(29)</p>
     * @param Name [in] {@code String}
     * @param Format [in, optional] {@code Object}
     * @param ConfirmConversions [in, optional] {@code Object}
     * @param ReadOnly [in, optional] {@code Object}
     * @param LinkToSource [in, optional] {@code Object}
     * @param AddToRecentFiles [in, optional] {@code Object}
     * @param PasswordDocument [in, optional] {@code Object}
     * @param PasswordTemplate [in, optional] {@code Object}
     * @param Revert [in, optional] {@code Object}
     * @param WritePasswordDocument [in, optional] {@code Object}
     * @param WritePasswordTemplate [in, optional] {@code Object}
     * @param Connection [in, optional] {@code Object}
     * @param SQLStatement [in, optional] {@code Object}
     * @param SQLStatement1 [in, optional] {@code Object}
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
     * <p>vtableId(30)</p>
     * @param Name [in] {@code String}
     * @param Format [in, optional] {@code Object}
     * @param ConfirmConversions [in, optional] {@code Object}
     * @param ReadOnly [in, optional] {@code Object}
     * @param AddToRecentFiles [in, optional] {@code Object}
     * @param PasswordDocument [in, optional] {@code Object}
     * @param PasswordTemplate [in, optional] {@code Object}
     * @param Revert [in, optional] {@code Object}
     * @param WritePasswordDocument [in, optional] {@code Object}
     * @param WritePasswordTemplate [in, optional] {@code Object}
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
     * <p>vtableId(31)</p>
     * @param Pause [in, optional] {@code Object}
     */
    @ComMethod(name = "Execute", dispId = 0x69)
    void Execute(Object Pause);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "Check", dispId = 0x6a)
    void Check();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "EditDataSource", dispId = 0x6b)
    void EditDataSource();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "EditHeaderSource", dispId = 0x6c)
    void EditHeaderSource();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "EditMainDocument", dispId = 0x6d)
    void EditMainDocument();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(36)</p>
     * @param Type [in] {@code String}
     */
    @ComMethod(name = "UseAddressBook", dispId = 0x6f)
    void UseAddressBook(String Type);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "HighlightMergeFields", dispId = 0xb)
    Boolean getHighlightMergeFields();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HighlightMergeFields", dispId = 0xb)
    void setHighlightMergeFields(Boolean param0);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "MailFormat", dispId = 0xc)
    WdMailMergeMailFormat getMailFormat();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code WdMailMergeMailFormat}
     */
    @ComProperty(name = "MailFormat", dispId = 0xc)
    void setMailFormat(WdMailMergeMailFormat param0);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "ShowSendToCustom", dispId = 0xd)
    String getShowSendToCustom();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ShowSendToCustom", dispId = 0xd)
    void setShowSendToCustom(String param0);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "WizardState", dispId = 0xe)
    Integer getWizardState();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "WizardState", dispId = 0xe)
    void setWizardState(Integer param0);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(45)</p>
     * @param Name [in] {@code String}
     * @param Format [in, optional] {@code Object}
     * @param ConfirmConversions [in, optional] {@code Object}
     * @param ReadOnly [in, optional] {@code Object}
     * @param LinkToSource [in, optional] {@code Object}
     * @param AddToRecentFiles [in, optional] {@code Object}
     * @param PasswordDocument [in, optional] {@code Object}
     * @param PasswordTemplate [in, optional] {@code Object}
     * @param Revert [in, optional] {@code Object}
     * @param WritePasswordDocument [in, optional] {@code Object}
     * @param WritePasswordTemplate [in, optional] {@code Object}
     * @param Connection [in, optional] {@code Object}
     * @param SQLStatement [in, optional] {@code Object}
     * @param SQLStatement1 [in, optional] {@code Object}
     * @param OpenExclusive [in, optional] {@code Object}
     * @param SubType [in, optional] {@code Object}
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
     * <p>vtableId(46)</p>
     * @param Name [in] {@code String}
     * @param Format [in, optional] {@code Object}
     * @param ConfirmConversions [in, optional] {@code Object}
     * @param ReadOnly [in, optional] {@code Object}
     * @param AddToRecentFiles [in, optional] {@code Object}
     * @param PasswordDocument [in, optional] {@code Object}
     * @param PasswordTemplate [in, optional] {@code Object}
     * @param Revert [in, optional] {@code Object}
     * @param WritePasswordDocument [in, optional] {@code Object}
     * @param WritePasswordTemplate [in, optional] {@code Object}
     * @param OpenExclusive [in, optional] {@code Object}
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
     * <p>vtableId(47)</p>
     * @param InitialState [in] {@code Object}
     * @param ShowDocumentStep [in, optional] {@code Object}
     * @param ShowTemplateStep [in, optional] {@code Object}
     * @param ShowDataStep [in, optional] {@code Object}
     * @param ShowWriteStep [in, optional] {@code Object}
     * @param ShowPreviewStep [in, optional] {@code Object}
     * @param ShowMergeStep [in, optional] {@code Object}
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