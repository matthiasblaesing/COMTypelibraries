
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
    @ComProperty(name = "Name", dispId = 0x1)
    String getName();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "HeaderSourceName", dispId = 0x2)
    String getHeaderSourceName();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Type", dispId = 0x3)
    WdMailMergeDataSource getType();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "HeaderSourceType", dispId = 0x4)
    WdMailMergeDataSource getHeaderSourceType();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "ConnectString", dispId = 0x5)
    String getConnectString();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "QueryString", dispId = 0x6)
    String getQueryString();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "QueryString", dispId = 0x6)
    void setQueryString(String param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "ActiveRecord", dispId = 0x7)
    WdMailMergeActiveRecord getActiveRecord();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "ActiveRecord", dispId = 0x7)
    void setActiveRecord(WdMailMergeActiveRecord param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "FirstRecord", dispId = 0x8)
    Integer getFirstRecord();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "FirstRecord", dispId = 0x8)
    void setFirstRecord(Integer param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "LastRecord", dispId = 0x9)
    Integer getLastRecord();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "LastRecord", dispId = 0x9)
    void setLastRecord(Integer param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "FieldNames", dispId = 0xa)
    MailMergeFieldNames getFieldNames();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "DataFields", dispId = 0xb)
    MailMergeDataFields getDataFields();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "FindRecord2000", dispId = 0x65)
    Boolean FindRecord2000(String FindText,
            String Field);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "RecordCount", dispId = 0xc)
    Integer getRecordCount();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "Included", dispId = 0xd)
    Boolean getIncluded();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "Included", dispId = 0xd)
    void setIncluded(Boolean param0);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "InvalidAddress", dispId = 0xe)
    Boolean getInvalidAddress();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "InvalidAddress", dispId = 0xe)
    void setInvalidAddress(Boolean param0);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "InvalidComments", dispId = 0xf)
    String getInvalidComments();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "InvalidComments", dispId = 0xf)
    void setInvalidComments(String param0);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "MappedDataFields", dispId = 0x10)
    MappedDataFields getMappedDataFields();
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "TableName", dispId = 0x11)
    String getTableName();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "FindRecord", dispId = 0x66)
    Boolean FindRecord(String FindText,
            Object Field);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComMethod(name = "SetAllIncludedFlags", dispId = 0x67)
    void SetAllIncludedFlags(Boolean Included);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComMethod(name = "SetAllErrorFlags", dispId = 0x68)
    void SetAllErrorFlags(Boolean Invalid,
            String InvalidComment);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComMethod(name = "Close", dispId = 0x69)
    void Close();
            
    
}