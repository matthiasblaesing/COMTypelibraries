
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002091F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002091F-0000-0000-C000-000000000046}")
public interface MailMergeFields extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    MailMergeField Item(Integer Index);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(13)</p>
     * @param Range [in] {@code Range}
     * @param Name [in] {@code String}
     */
    @ComMethod(name = "Add", dispId = 0x65)
    MailMergeField Add(Range Range,
            String Name);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(14)</p>
     * @param Range [in] {@code Range}
     * @param Name [in] {@code String}
     * @param Prompt [in, optional] {@code Object}
     * @param DefaultAskText [in, optional] {@code Object}
     * @param AskOnce [in, optional] {@code Object}
     */
    @ComMethod(name = "AddAsk", dispId = 0x66)
    MailMergeField AddAsk(Range Range,
            String Name,
            Object Prompt,
            Object DefaultAskText,
            Object AskOnce);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(15)</p>
     * @param Range [in] {@code Range}
     * @param Prompt [in, optional] {@code Object}
     * @param DefaultFillInText [in, optional] {@code Object}
     * @param AskOnce [in, optional] {@code Object}
     */
    @ComMethod(name = "AddFillIn", dispId = 0x67)
    MailMergeField AddFillIn(Range Range,
            Object Prompt,
            Object DefaultFillInText,
            Object AskOnce);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(16)</p>
     * @param Range [in] {@code Range}
     * @param MergeField [in] {@code String}
     * @param Comparison [in] {@code WdMailMergeComparison}
     * @param CompareTo [in, optional] {@code Object}
     * @param TrueAutoText [in, optional] {@code Object}
     * @param TrueText [in, optional] {@code Object}
     * @param FalseAutoText [in, optional] {@code Object}
     * @param FalseText [in, optional] {@code Object}
     */
    @ComMethod(name = "AddIf", dispId = 0x68)
    MailMergeField AddIf(Range Range,
            String MergeField,
            WdMailMergeComparison Comparison,
            Object CompareTo,
            Object TrueAutoText,
            Object TrueText,
            Object FalseAutoText,
            Object FalseText);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(17)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "AddMergeRec", dispId = 0x69)
    MailMergeField AddMergeRec(Range Range);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(18)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "AddMergeSeq", dispId = 0x6a)
    MailMergeField AddMergeSeq(Range Range);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(19)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "AddNext", dispId = 0x6b)
    MailMergeField AddNext(Range Range);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(20)</p>
     * @param Range [in] {@code Range}
     * @param MergeField [in] {@code String}
     * @param Comparison [in] {@code WdMailMergeComparison}
     * @param CompareTo [in, optional] {@code Object}
     */
    @ComMethod(name = "AddNextIf", dispId = 0x6c)
    MailMergeField AddNextIf(Range Range,
            String MergeField,
            WdMailMergeComparison Comparison,
            Object CompareTo);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(21)</p>
     * @param Range [in] {@code Range}
     * @param Name [in] {@code String}
     * @param ValueText [in, optional] {@code Object}
     * @param ValueAutoText [in, optional] {@code Object}
     */
    @ComMethod(name = "AddSet", dispId = 0x6d)
    MailMergeField AddSet(Range Range,
            String Name,
            Object ValueText,
            Object ValueAutoText);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(22)</p>
     * @param Range [in] {@code Range}
     * @param MergeField [in] {@code String}
     * @param Comparison [in] {@code WdMailMergeComparison}
     * @param CompareTo [in, optional] {@code Object}
     */
    @ComMethod(name = "AddSkipIf", dispId = 0x6e)
    MailMergeField AddSkipIf(Range Range,
            String MergeField,
            WdMailMergeComparison Comparison,
            Object CompareTo);
            
    
}