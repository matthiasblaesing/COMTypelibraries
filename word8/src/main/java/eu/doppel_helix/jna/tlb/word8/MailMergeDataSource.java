
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002091D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002091D-0000-0000-C000-000000000046}")
public interface MailMergeDataSource extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Name", dispId = 0x1)
    String getName();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "HeaderSourceName", dispId = 0x2)
    String getHeaderSourceName();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Type", dispId = 0x3)
    WdMailMergeDataSource getType();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "HeaderSourceType", dispId = 0x4)
    WdMailMergeDataSource getHeaderSourceType();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "ConnectString", dispId = 0x5)
    String getConnectString();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "QueryString", dispId = 0x6)
    String getQueryString();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "QueryString", dispId = 0x6)
    void setQueryString(String param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "ActiveRecord", dispId = 0x7)
    WdMailMergeActiveRecord getActiveRecord();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code WdMailMergeActiveRecord}
     */
    @ComProperty(name = "ActiveRecord", dispId = 0x7)
    void setActiveRecord(WdMailMergeActiveRecord param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "FirstRecord", dispId = 0x8)
    Integer getFirstRecord();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "FirstRecord", dispId = 0x8)
    void setFirstRecord(Integer param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "LastRecord", dispId = 0x9)
    Integer getLastRecord();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "LastRecord", dispId = 0x9)
    void setLastRecord(Integer param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "FieldNames", dispId = 0xa)
    MailMergeFieldNames getFieldNames();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "DataFields", dispId = 0xb)
    MailMergeDataFields getDataFields();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(25)</p>
     * @param FindText [in] {@code String}
     * @param Field [in] {@code String}
     */
    @ComMethod(name = "FindRecord2000", dispId = 0x65)
    Boolean FindRecord2000(String FindText,
            String Field);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "RecordCount", dispId = 0xc)
    Integer getRecordCount();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Included", dispId = 0xd)
    Boolean getIncluded();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Included", dispId = 0xd)
    void setIncluded(Boolean param0);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "InvalidAddress", dispId = 0xe)
    Boolean getInvalidAddress();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "InvalidAddress", dispId = 0xe)
    void setInvalidAddress(Boolean param0);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "InvalidComments", dispId = 0xf)
    String getInvalidComments();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "InvalidComments", dispId = 0xf)
    void setInvalidComments(String param0);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "MappedDataFields", dispId = 0x10)
    MappedDataFields getMappedDataFields();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "TableName", dispId = 0x11)
    String getTableName();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(35)</p>
     * @param FindText [in] {@code String}
     * @param Field [in, optional] {@code Object}
     */
    @ComMethod(name = "FindRecord", dispId = 0x66)
    Boolean FindRecord(String FindText,
            Object Field);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(36)</p>
     * @param Included [in] {@code Boolean}
     */
    @ComMethod(name = "SetAllIncludedFlags", dispId = 0x67)
    void SetAllIncludedFlags(Boolean Included);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(37)</p>
     * @param Invalid [in] {@code Boolean}
     * @param InvalidComment [in] {@code String}
     */
    @ComMethod(name = "SetAllErrorFlags", dispId = 0x68)
    void SetAllErrorFlags(Boolean Invalid,
            String InvalidComment);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(38)</p>
     */
    @ComMethod(name = "Close", dispId = 0x69)
    void Close();
            
    
}