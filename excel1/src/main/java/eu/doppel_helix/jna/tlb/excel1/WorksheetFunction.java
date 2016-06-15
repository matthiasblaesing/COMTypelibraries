
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020845-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020845-0000-0000-C000-000000000046}")
public interface WorksheetFunction extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xa9)</p>
     */
    @ComMethod(name = "_WSFunction", dispId = 0xa9)
    Object _WSFunction(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4000)</p>
     */
    @ComMethod(name = "Count", dispId = 0x4000)
    Double Count(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4002)</p>
     */
    @ComMethod(name = "IsNA", dispId = 0x4002)
    Boolean IsNA(Object Arg1);
            
    /**
     * <p>id(0x4003)</p>
     */
    @ComMethod(name = "IsError", dispId = 0x4003)
    Boolean IsError(Object Arg1);
            
    /**
     * <p>id(0x4004)</p>
     */
    @ComMethod(name = "Sum", dispId = 0x4004)
    Double Sum(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4005)</p>
     */
    @ComMethod(name = "Average", dispId = 0x4005)
    Double Average(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4006)</p>
     */
    @ComMethod(name = "Min", dispId = 0x4006)
    Double Min(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4007)</p>
     */
    @ComMethod(name = "Max", dispId = 0x4007)
    Double Max(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x400b)</p>
     */
    @ComMethod(name = "Npv", dispId = 0x400b)
    Double Npv(Double Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x400c)</p>
     */
    @ComMethod(name = "StDev", dispId = 0x400c)
    Double StDev(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x400d)</p>
     */
    @ComMethod(name = "Dollar", dispId = 0x400d)
    String Dollar(Double Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x400e)</p>
     */
    @ComMethod(name = "Fixed", dispId = 0x400e)
    String Fixed(Double Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x4013)</p>
     */
    @ComMethod(name = "Pi", dispId = 0x4013)
    Double Pi();
            
    /**
     * <p>id(0x4016)</p>
     */
    @ComMethod(name = "Ln", dispId = 0x4016)
    Double Ln(Double Arg1);
            
    /**
     * <p>id(0x4017)</p>
     */
    @ComMethod(name = "Log10", dispId = 0x4017)
    Double Log10(Double Arg1);
            
    /**
     * <p>id(0x401b)</p>
     */
    @ComMethod(name = "Round", dispId = 0x401b)
    Double Round(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x401c)</p>
     */
    @ComMethod(name = "Lookup", dispId = 0x401c)
    Object Lookup(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x401d)</p>
     */
    @ComMethod(name = "Index", dispId = 0x401d)
    Object Index(Object Arg1,
            Double Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x401e)</p>
     */
    @ComMethod(name = "Rept", dispId = 0x401e)
    String Rept(String Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4024)</p>
     */
    @ComMethod(name = "And", dispId = 0x4024)
    Boolean And(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4025)</p>
     */
    @ComMethod(name = "Or", dispId = 0x4025)
    Boolean Or(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4028)</p>
     */
    @ComMethod(name = "DCount", dispId = 0x4028)
    Double DCount(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x4029)</p>
     */
    @ComMethod(name = "DSum", dispId = 0x4029)
    Double DSum(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x402a)</p>
     */
    @ComMethod(name = "DAverage", dispId = 0x402a)
    Double DAverage(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x402b)</p>
     */
    @ComMethod(name = "DMin", dispId = 0x402b)
    Double DMin(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x402c)</p>
     */
    @ComMethod(name = "DMax", dispId = 0x402c)
    Double DMax(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x402d)</p>
     */
    @ComMethod(name = "DStDev", dispId = 0x402d)
    Double DStDev(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x402e)</p>
     */
    @ComMethod(name = "Var", dispId = 0x402e)
    Double Var(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x402f)</p>
     */
    @ComMethod(name = "DVar", dispId = 0x402f)
    Double DVar(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x4030)</p>
     */
    @ComMethod(name = "Text", dispId = 0x4030)
    String Text(Object Arg1,
            String Arg2);
            
    /**
     * <p>id(0x4031)</p>
     */
    @ComMethod(name = "LinEst", dispId = 0x4031)
    Object LinEst(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x4032)</p>
     */
    @ComMethod(name = "Trend", dispId = 0x4032)
    Object Trend(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x4033)</p>
     */
    @ComMethod(name = "LogEst", dispId = 0x4033)
    Object LogEst(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x4034)</p>
     */
    @ComMethod(name = "Growth", dispId = 0x4034)
    Object Growth(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x4038)</p>
     */
    @ComMethod(name = "Pv", dispId = 0x4038)
    Double Pv(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x4039)</p>
     */
    @ComMethod(name = "Fv", dispId = 0x4039)
    Double Fv(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x403a)</p>
     */
    @ComMethod(name = "NPer", dispId = 0x403a)
    Double NPer(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x403b)</p>
     */
    @ComMethod(name = "Pmt", dispId = 0x403b)
    Double Pmt(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x403c)</p>
     */
    @ComMethod(name = "Rate", dispId = 0x403c)
    Double Rate(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6);
            
    /**
     * <p>id(0x403d)</p>
     */
    @ComMethod(name = "MIrr", dispId = 0x403d)
    Double MIrr(Object Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x403e)</p>
     */
    @ComMethod(name = "Irr", dispId = 0x403e)
    Double Irr(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4040)</p>
     */
    @ComMethod(name = "Match", dispId = 0x4040)
    Double Match(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x4046)</p>
     */
    @ComMethod(name = "Weekday", dispId = 0x4046)
    Double Weekday(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4052)</p>
     */
    @ComMethod(name = "Search", dispId = 0x4052)
    Double Search(String Arg1,
            String Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x4053)</p>
     */
    @ComMethod(name = "Transpose", dispId = 0x4053)
    Object Transpose(Object Arg1);
            
    /**
     * <p>id(0x4061)</p>
     */
    @ComMethod(name = "Atan2", dispId = 0x4061)
    Double Atan2(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4062)</p>
     */
    @ComMethod(name = "Asin", dispId = 0x4062)
    Double Asin(Double Arg1);
            
    /**
     * <p>id(0x4063)</p>
     */
    @ComMethod(name = "Acos", dispId = 0x4063)
    Double Acos(Double Arg1);
            
    /**
     * <p>id(0x4064)</p>
     */
    @ComMethod(name = "Choose", dispId = 0x4064)
    Object Choose(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4065)</p>
     */
    @ComMethod(name = "HLookup", dispId = 0x4065)
    Object HLookup(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x4066)</p>
     */
    @ComMethod(name = "VLookup", dispId = 0x4066)
    Object VLookup(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x406d)</p>
     */
    @ComMethod(name = "Log", dispId = 0x406d)
    Double Log(Double Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4072)</p>
     */
    @ComMethod(name = "Proper", dispId = 0x4072)
    String Proper(String Arg1);
            
    /**
     * <p>id(0x4076)</p>
     */
    @ComMethod(name = "Trim", dispId = 0x4076)
    String Trim(String Arg1);
            
    /**
     * <p>id(0x4077)</p>
     */
    @ComMethod(name = "Replace", dispId = 0x4077)
    String Replace(String Arg1,
            Double Arg2,
            Double Arg3,
            String Arg4);
            
    /**
     * <p>id(0x4078)</p>
     */
    @ComMethod(name = "Substitute", dispId = 0x4078)
    String Substitute(String Arg1,
            String Arg2,
            String Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x407c)</p>
     */
    @ComMethod(name = "Find", dispId = 0x407c)
    Double Find(String Arg1,
            String Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x407e)</p>
     */
    @ComMethod(name = "IsErr", dispId = 0x407e)
    Boolean IsErr(Object Arg1);
            
    /**
     * <p>id(0x407f)</p>
     */
    @ComMethod(name = "IsText", dispId = 0x407f)
    Boolean IsText(Object Arg1);
            
    /**
     * <p>id(0x4080)</p>
     */
    @ComMethod(name = "IsNumber", dispId = 0x4080)
    Boolean IsNumber(Object Arg1);
            
    /**
     * <p>id(0x408e)</p>
     */
    @ComMethod(name = "Sln", dispId = 0x408e)
    Double Sln(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x408f)</p>
     */
    @ComMethod(name = "Syd", dispId = 0x408f)
    Double Syd(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4);
            
    /**
     * <p>id(0x4090)</p>
     */
    @ComMethod(name = "Ddb", dispId = 0x4090)
    Double Ddb(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x40a2)</p>
     */
    @ComMethod(name = "Clean", dispId = 0x40a2)
    String Clean(String Arg1);
            
    /**
     * <p>id(0x40a3)</p>
     */
    @ComMethod(name = "MDeterm", dispId = 0x40a3)
    Double MDeterm(Object Arg1);
            
    /**
     * <p>id(0x40a4)</p>
     */
    @ComMethod(name = "MInverse", dispId = 0x40a4)
    Object MInverse(Object Arg1);
            
    /**
     * <p>id(0x40a5)</p>
     */
    @ComMethod(name = "MMult", dispId = 0x40a5)
    Object MMult(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x40a7)</p>
     */
    @ComMethod(name = "Ipmt", dispId = 0x40a7)
    Double Ipmt(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4,
            Object Arg5,
            Object Arg6);
            
    /**
     * <p>id(0x40a8)</p>
     */
    @ComMethod(name = "Ppmt", dispId = 0x40a8)
    Double Ppmt(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4,
            Object Arg5,
            Object Arg6);
            
    /**
     * <p>id(0x40a9)</p>
     */
    @ComMethod(name = "CountA", dispId = 0x40a9)
    Double CountA(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x40b7)</p>
     */
    @ComMethod(name = "Product", dispId = 0x40b7)
    Double Product(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x40b8)</p>
     */
    @ComMethod(name = "Fact", dispId = 0x40b8)
    Double Fact(Double Arg1);
            
    /**
     * <p>id(0x40bd)</p>
     */
    @ComMethod(name = "DProduct", dispId = 0x40bd)
    Double DProduct(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x40be)</p>
     */
    @ComMethod(name = "IsNonText", dispId = 0x40be)
    Boolean IsNonText(Object Arg1);
            
    /**
     * <p>id(0x40c1)</p>
     */
    @ComMethod(name = "StDevP", dispId = 0x40c1)
    Double StDevP(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x40c2)</p>
     */
    @ComMethod(name = "VarP", dispId = 0x40c2)
    Double VarP(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x40c3)</p>
     */
    @ComMethod(name = "DStDevP", dispId = 0x40c3)
    Double DStDevP(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x40c4)</p>
     */
    @ComMethod(name = "DVarP", dispId = 0x40c4)
    Double DVarP(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x40c6)</p>
     */
    @ComMethod(name = "IsLogical", dispId = 0x40c6)
    Boolean IsLogical(Object Arg1);
            
    /**
     * <p>id(0x40c7)</p>
     */
    @ComMethod(name = "DCountA", dispId = 0x40c7)
    Double DCountA(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x40cc)</p>
     */
    @ComMethod(name = "USDollar", dispId = 0x40cc)
    String USDollar(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x40cd)</p>
     */
    @ComMethod(name = "FindB", dispId = 0x40cd)
    Double FindB(String Arg1,
            String Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x40ce)</p>
     */
    @ComMethod(name = "SearchB", dispId = 0x40ce)
    Double SearchB(String Arg1,
            String Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x40cf)</p>
     */
    @ComMethod(name = "ReplaceB", dispId = 0x40cf)
    String ReplaceB(String Arg1,
            Double Arg2,
            Double Arg3,
            String Arg4);
            
    /**
     * <p>id(0x40d4)</p>
     */
    @ComMethod(name = "RoundUp", dispId = 0x40d4)
    Double RoundUp(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x40d5)</p>
     */
    @ComMethod(name = "RoundDown", dispId = 0x40d5)
    Double RoundDown(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x40d8)</p>
     */
    @ComMethod(name = "Rank", dispId = 0x40d8)
    Double Rank(Double Arg1,
            Range Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x40dc)</p>
     */
    @ComMethod(name = "Days360", dispId = 0x40dc)
    Double Days360(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x40de)</p>
     */
    @ComMethod(name = "Vdb", dispId = 0x40de)
    Double Vdb(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4,
            Double Arg5,
            Object Arg6,
            Object Arg7);
            
    /**
     * <p>id(0x40e3)</p>
     */
    @ComMethod(name = "Median", dispId = 0x40e3)
    Double Median(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x40e4)</p>
     */
    @ComMethod(name = "SumProduct", dispId = 0x40e4)
    Double SumProduct(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x40e5)</p>
     */
    @ComMethod(name = "Sinh", dispId = 0x40e5)
    Double Sinh(Double Arg1);
            
    /**
     * <p>id(0x40e6)</p>
     */
    @ComMethod(name = "Cosh", dispId = 0x40e6)
    Double Cosh(Double Arg1);
            
    /**
     * <p>id(0x40e7)</p>
     */
    @ComMethod(name = "Tanh", dispId = 0x40e7)
    Double Tanh(Double Arg1);
            
    /**
     * <p>id(0x40e8)</p>
     */
    @ComMethod(name = "Asinh", dispId = 0x40e8)
    Double Asinh(Double Arg1);
            
    /**
     * <p>id(0x40e9)</p>
     */
    @ComMethod(name = "Acosh", dispId = 0x40e9)
    Double Acosh(Double Arg1);
            
    /**
     * <p>id(0x40ea)</p>
     */
    @ComMethod(name = "Atanh", dispId = 0x40ea)
    Double Atanh(Double Arg1);
            
    /**
     * <p>id(0x40eb)</p>
     */
    @ComMethod(name = "DGet", dispId = 0x40eb)
    Object DGet(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x40f7)</p>
     */
    @ComMethod(name = "Db", dispId = 0x40f7)
    Double Db(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x40fc)</p>
     */
    @ComMethod(name = "Frequency", dispId = 0x40fc)
    Object Frequency(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x410d)</p>
     */
    @ComMethod(name = "AveDev", dispId = 0x410d)
    Double AveDev(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x410e)</p>
     */
    @ComMethod(name = "BetaDist", dispId = 0x410e)
    Double BetaDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x410f)</p>
     */
    @ComMethod(name = "GammaLn", dispId = 0x410f)
    Double GammaLn(Double Arg1);
            
    /**
     * <p>id(0x4110)</p>
     */
    @ComMethod(name = "BetaInv", dispId = 0x4110)
    Double BetaInv(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x4111)</p>
     */
    @ComMethod(name = "BinomDist", dispId = 0x4111)
    Double BinomDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x4112)</p>
     */
    @ComMethod(name = "ChiDist", dispId = 0x4112)
    Double ChiDist(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4113)</p>
     */
    @ComMethod(name = "ChiInv", dispId = 0x4113)
    Double ChiInv(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4114)</p>
     */
    @ComMethod(name = "Combin", dispId = 0x4114)
    Double Combin(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4115)</p>
     */
    @ComMethod(name = "Confidence", dispId = 0x4115)
    Double Confidence(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4116)</p>
     */
    @ComMethod(name = "CritBinom", dispId = 0x4116)
    Double CritBinom(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4117)</p>
     */
    @ComMethod(name = "Even", dispId = 0x4117)
    Double Even(Double Arg1);
            
    /**
     * <p>id(0x4118)</p>
     */
    @ComMethod(name = "ExponDist", dispId = 0x4118)
    Double ExponDist(Double Arg1,
            Double Arg2,
            Boolean Arg3);
            
    /**
     * <p>id(0x4119)</p>
     */
    @ComMethod(name = "FDist", dispId = 0x4119)
    Double FDist(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x411a)</p>
     */
    @ComMethod(name = "FInv", dispId = 0x411a)
    Double FInv(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x411b)</p>
     */
    @ComMethod(name = "Fisher", dispId = 0x411b)
    Double Fisher(Double Arg1);
            
    /**
     * <p>id(0x411c)</p>
     */
    @ComMethod(name = "FisherInv", dispId = 0x411c)
    Double FisherInv(Double Arg1);
            
    /**
     * <p>id(0x411d)</p>
     */
    @ComMethod(name = "Floor", dispId = 0x411d)
    Double Floor(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x411e)</p>
     */
    @ComMethod(name = "GammaDist", dispId = 0x411e)
    Double GammaDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x411f)</p>
     */
    @ComMethod(name = "GammaInv", dispId = 0x411f)
    Double GammaInv(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4120)</p>
     */
    @ComMethod(name = "Ceiling", dispId = 0x4120)
    Double Ceiling(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4121)</p>
     */
    @ComMethod(name = "HypGeomDist", dispId = 0x4121)
    Double HypGeomDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4);
            
    /**
     * <p>id(0x4122)</p>
     */
    @ComMethod(name = "LogNormDist", dispId = 0x4122)
    Double LogNormDist(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4123)</p>
     */
    @ComMethod(name = "LogInv", dispId = 0x4123)
    Double LogInv(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4124)</p>
     */
    @ComMethod(name = "NegBinomDist", dispId = 0x4124)
    Double NegBinomDist(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4125)</p>
     */
    @ComMethod(name = "NormDist", dispId = 0x4125)
    Double NormDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x4126)</p>
     */
    @ComMethod(name = "NormSDist", dispId = 0x4126)
    Double NormSDist(Double Arg1);
            
    /**
     * <p>id(0x4127)</p>
     */
    @ComMethod(name = "NormInv", dispId = 0x4127)
    Double NormInv(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4128)</p>
     */
    @ComMethod(name = "NormSInv", dispId = 0x4128)
    Double NormSInv(Double Arg1);
            
    /**
     * <p>id(0x4129)</p>
     */
    @ComMethod(name = "Standardize", dispId = 0x4129)
    Double Standardize(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x412a)</p>
     */
    @ComMethod(name = "Odd", dispId = 0x412a)
    Double Odd(Double Arg1);
            
    /**
     * <p>id(0x412b)</p>
     */
    @ComMethod(name = "Permut", dispId = 0x412b)
    Double Permut(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x412c)</p>
     */
    @ComMethod(name = "Poisson", dispId = 0x412c)
    Double Poisson(Double Arg1,
            Double Arg2,
            Boolean Arg3);
            
    /**
     * <p>id(0x412d)</p>
     */
    @ComMethod(name = "TDist", dispId = 0x412d)
    Double TDist(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x412e)</p>
     */
    @ComMethod(name = "Weibull", dispId = 0x412e)
    Double Weibull(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x412f)</p>
     */
    @ComMethod(name = "SumXMY2", dispId = 0x412f)
    Double SumXMY2(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4130)</p>
     */
    @ComMethod(name = "SumX2MY2", dispId = 0x4130)
    Double SumX2MY2(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4131)</p>
     */
    @ComMethod(name = "SumX2PY2", dispId = 0x4131)
    Double SumX2PY2(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4132)</p>
     */
    @ComMethod(name = "ChiTest", dispId = 0x4132)
    Double ChiTest(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4133)</p>
     */
    @ComMethod(name = "Correl", dispId = 0x4133)
    Double Correl(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4134)</p>
     */
    @ComMethod(name = "Covar", dispId = 0x4134)
    Double Covar(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4135)</p>
     */
    @ComMethod(name = "Forecast", dispId = 0x4135)
    Double Forecast(Double Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x4136)</p>
     */
    @ComMethod(name = "FTest", dispId = 0x4136)
    Double FTest(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4137)</p>
     */
    @ComMethod(name = "Intercept", dispId = 0x4137)
    Double Intercept(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4138)</p>
     */
    @ComMethod(name = "Pearson", dispId = 0x4138)
    Double Pearson(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4139)</p>
     */
    @ComMethod(name = "RSq", dispId = 0x4139)
    Double RSq(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x413a)</p>
     */
    @ComMethod(name = "StEyx", dispId = 0x413a)
    Double StEyx(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x413b)</p>
     */
    @ComMethod(name = "Slope", dispId = 0x413b)
    Double Slope(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x413c)</p>
     */
    @ComMethod(name = "TTest", dispId = 0x413c)
    Double TTest(Object Arg1,
            Object Arg2,
            Double Arg3,
            Double Arg4);
            
    /**
     * <p>id(0x413d)</p>
     */
    @ComMethod(name = "Prob", dispId = 0x413d)
    Double Prob(Object Arg1,
            Object Arg2,
            Double Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x413e)</p>
     */
    @ComMethod(name = "DevSq", dispId = 0x413e)
    Double DevSq(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x413f)</p>
     */
    @ComMethod(name = "GeoMean", dispId = 0x413f)
    Double GeoMean(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4140)</p>
     */
    @ComMethod(name = "HarMean", dispId = 0x4140)
    Double HarMean(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4141)</p>
     */
    @ComMethod(name = "SumSq", dispId = 0x4141)
    Double SumSq(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4142)</p>
     */
    @ComMethod(name = "Kurt", dispId = 0x4142)
    Double Kurt(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4143)</p>
     */
    @ComMethod(name = "Skew", dispId = 0x4143)
    Double Skew(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4144)</p>
     */
    @ComMethod(name = "ZTest", dispId = 0x4144)
    Double ZTest(Object Arg1,
            Double Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x4145)</p>
     */
    @ComMethod(name = "Large", dispId = 0x4145)
    Double Large(Object Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4146)</p>
     */
    @ComMethod(name = "Small", dispId = 0x4146)
    Double Small(Object Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4147)</p>
     */
    @ComMethod(name = "Quartile", dispId = 0x4147)
    Double Quartile(Object Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4148)</p>
     */
    @ComMethod(name = "Percentile", dispId = 0x4148)
    Double Percentile(Object Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4149)</p>
     */
    @ComMethod(name = "PercentRank", dispId = 0x4149)
    Double PercentRank(Object Arg1,
            Double Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x414a)</p>
     */
    @ComMethod(name = "Mode", dispId = 0x414a)
    Double Mode(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x414b)</p>
     */
    @ComMethod(name = "TrimMean", dispId = 0x414b)
    Double TrimMean(Object Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x414c)</p>
     */
    @ComMethod(name = "TInv", dispId = 0x414c)
    Double TInv(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4151)</p>
     */
    @ComMethod(name = "Power", dispId = 0x4151)
    Double Power(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4156)</p>
     */
    @ComMethod(name = "Radians", dispId = 0x4156)
    Double Radians(Double Arg1);
            
    /**
     * <p>id(0x4157)</p>
     */
    @ComMethod(name = "Degrees", dispId = 0x4157)
    Double Degrees(Double Arg1);
            
    /**
     * <p>id(0x4158)</p>
     */
    @ComMethod(name = "Subtotal", dispId = 0x4158)
    Double Subtotal(Double Arg1,
            Range Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4159)</p>
     */
    @ComMethod(name = "SumIf", dispId = 0x4159)
    Double SumIf(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x415a)</p>
     */
    @ComMethod(name = "CountIf", dispId = 0x415a)
    Double CountIf(Range Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x415b)</p>
     */
    @ComMethod(name = "CountBlank", dispId = 0x415b)
    Double CountBlank(Range Arg1);
            
    /**
     * <p>id(0x415e)</p>
     */
    @ComMethod(name = "Ispmt", dispId = 0x415e)
    Double Ispmt(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4);
            
    /**
     * <p>id(0x4162)</p>
     */
    @ComMethod(name = "Roman", dispId = 0x4162)
    String Roman(Double Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x40d6)</p>
     */
    @ComMethod(name = "Asc", dispId = 0x40d6)
    String Asc(String Arg1);
            
    /**
     * <p>id(0x40d7)</p>
     */
    @ComMethod(name = "Dbcs", dispId = 0x40d7)
    String Dbcs(String Arg1);
            
    /**
     * <p>id(0x4168)</p>
     */
    @ComMethod(name = "Phonetic", dispId = 0x4168)
    String Phonetic(Range Arg1);
            
    /**
     * <p>id(0x4170)</p>
     */
    @ComMethod(name = "BahtText", dispId = 0x4170)
    String BahtText(Double Arg1);
            
    /**
     * <p>id(0x4171)</p>
     */
    @ComMethod(name = "ThaiDayOfWeek", dispId = 0x4171)
    String ThaiDayOfWeek(Double Arg1);
            
    /**
     * <p>id(0x4172)</p>
     */
    @ComMethod(name = "ThaiDigit", dispId = 0x4172)
    String ThaiDigit(String Arg1);
            
    /**
     * <p>id(0x4173)</p>
     */
    @ComMethod(name = "ThaiMonthOfYear", dispId = 0x4173)
    String ThaiMonthOfYear(Double Arg1);
            
    /**
     * <p>id(0x4174)</p>
     */
    @ComMethod(name = "ThaiNumSound", dispId = 0x4174)
    String ThaiNumSound(Double Arg1);
            
    /**
     * <p>id(0x4175)</p>
     */
    @ComMethod(name = "ThaiNumString", dispId = 0x4175)
    String ThaiNumString(Double Arg1);
            
    /**
     * <p>id(0x4176)</p>
     */
    @ComMethod(name = "ThaiStringLength", dispId = 0x4176)
    Double ThaiStringLength(String Arg1);
            
    /**
     * <p>id(0x4177)</p>
     */
    @ComMethod(name = "IsThaiDigit", dispId = 0x4177)
    Boolean IsThaiDigit(String Arg1);
            
    /**
     * <p>id(0x4178)</p>
     */
    @ComMethod(name = "RoundBahtDown", dispId = 0x4178)
    Double RoundBahtDown(Double Arg1);
            
    /**
     * <p>id(0x4179)</p>
     */
    @ComMethod(name = "RoundBahtUp", dispId = 0x4179)
    Double RoundBahtUp(Double Arg1);
            
    /**
     * <p>id(0x417a)</p>
     */
    @ComMethod(name = "ThaiYear", dispId = 0x417a)
    Double ThaiYear(Double Arg1);
            
    /**
     * <p>id(0x417b)</p>
     */
    @ComMethod(name = "RTD", dispId = 0x417b)
    Object RTD(Object progID,
            Object server,
            Object topic1,
            Object topic2,
            Object topic3,
            Object topic4,
            Object topic5,
            Object topic6,
            Object topic7,
            Object topic8,
            Object topic9,
            Object topic10,
            Object topic11,
            Object topic12,
            Object topic13,
            Object topic14,
            Object topic15,
            Object topic16,
            Object topic17,
            Object topic18,
            Object topic19,
            Object topic20,
            Object topic21,
            Object topic22,
            Object topic23,
            Object topic24,
            Object topic25,
            Object topic26,
            Object topic27,
            Object topic28);
            
    /**
     * <p>id(0x4180)</p>
     */
    @ComMethod(name = "Hex2Bin", dispId = 0x4180)
    String Hex2Bin(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4181)</p>
     */
    @ComMethod(name = "Hex2Dec", dispId = 0x4181)
    String Hex2Dec(Object Arg1);
            
    /**
     * <p>id(0x4182)</p>
     */
    @ComMethod(name = "Hex2Oct", dispId = 0x4182)
    String Hex2Oct(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4183)</p>
     */
    @ComMethod(name = "Dec2Bin", dispId = 0x4183)
    String Dec2Bin(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4184)</p>
     */
    @ComMethod(name = "Dec2Hex", dispId = 0x4184)
    String Dec2Hex(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4185)</p>
     */
    @ComMethod(name = "Dec2Oct", dispId = 0x4185)
    String Dec2Oct(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4186)</p>
     */
    @ComMethod(name = "Oct2Bin", dispId = 0x4186)
    String Oct2Bin(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4187)</p>
     */
    @ComMethod(name = "Oct2Hex", dispId = 0x4187)
    String Oct2Hex(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4188)</p>
     */
    @ComMethod(name = "Oct2Dec", dispId = 0x4188)
    String Oct2Dec(Object Arg1);
            
    /**
     * <p>id(0x4189)</p>
     */
    @ComMethod(name = "Bin2Dec", dispId = 0x4189)
    String Bin2Dec(Object Arg1);
            
    /**
     * <p>id(0x418a)</p>
     */
    @ComMethod(name = "Bin2Oct", dispId = 0x418a)
    String Bin2Oct(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x418b)</p>
     */
    @ComMethod(name = "Bin2Hex", dispId = 0x418b)
    String Bin2Hex(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x418c)</p>
     */
    @ComMethod(name = "ImSub", dispId = 0x418c)
    String ImSub(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x418d)</p>
     */
    @ComMethod(name = "ImDiv", dispId = 0x418d)
    String ImDiv(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x418e)</p>
     */
    @ComMethod(name = "ImPower", dispId = 0x418e)
    String ImPower(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x418f)</p>
     */
    @ComMethod(name = "ImAbs", dispId = 0x418f)
    String ImAbs(Object Arg1);
            
    /**
     * <p>id(0x4190)</p>
     */
    @ComMethod(name = "ImSqrt", dispId = 0x4190)
    String ImSqrt(Object Arg1);
            
    /**
     * <p>id(0x4191)</p>
     */
    @ComMethod(name = "ImLn", dispId = 0x4191)
    String ImLn(Object Arg1);
            
    /**
     * <p>id(0x4192)</p>
     */
    @ComMethod(name = "ImLog2", dispId = 0x4192)
    String ImLog2(Object Arg1);
            
    /**
     * <p>id(0x4193)</p>
     */
    @ComMethod(name = "ImLog10", dispId = 0x4193)
    String ImLog10(Object Arg1);
            
    /**
     * <p>id(0x4194)</p>
     */
    @ComMethod(name = "ImSin", dispId = 0x4194)
    String ImSin(Object Arg1);
            
    /**
     * <p>id(0x4195)</p>
     */
    @ComMethod(name = "ImCos", dispId = 0x4195)
    String ImCos(Object Arg1);
            
    /**
     * <p>id(0x4196)</p>
     */
    @ComMethod(name = "ImExp", dispId = 0x4196)
    String ImExp(Object Arg1);
            
    /**
     * <p>id(0x4197)</p>
     */
    @ComMethod(name = "ImArgument", dispId = 0x4197)
    String ImArgument(Object Arg1);
            
    /**
     * <p>id(0x4198)</p>
     */
    @ComMethod(name = "ImConjugate", dispId = 0x4198)
    String ImConjugate(Object Arg1);
            
    /**
     * <p>id(0x4199)</p>
     */
    @ComMethod(name = "Imaginary", dispId = 0x4199)
    Double Imaginary(Object Arg1);
            
    /**
     * <p>id(0x419a)</p>
     */
    @ComMethod(name = "ImReal", dispId = 0x419a)
    Double ImReal(Object Arg1);
            
    /**
     * <p>id(0x419b)</p>
     */
    @ComMethod(name = "Complex", dispId = 0x419b)
    String Complex(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x419c)</p>
     */
    @ComMethod(name = "ImSum", dispId = 0x419c)
    String ImSum(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x419d)</p>
     */
    @ComMethod(name = "ImProduct", dispId = 0x419d)
    String ImProduct(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x419e)</p>
     */
    @ComMethod(name = "SeriesSum", dispId = 0x419e)
    Double SeriesSum(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x419f)</p>
     */
    @ComMethod(name = "FactDouble", dispId = 0x419f)
    Double FactDouble(Object Arg1);
            
    /**
     * <p>id(0x41a0)</p>
     */
    @ComMethod(name = "SqrtPi", dispId = 0x41a0)
    Double SqrtPi(Object Arg1);
            
    /**
     * <p>id(0x41a1)</p>
     */
    @ComMethod(name = "Quotient", dispId = 0x41a1)
    Double Quotient(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41a2)</p>
     */
    @ComMethod(name = "Delta", dispId = 0x41a2)
    Double Delta(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41a3)</p>
     */
    @ComMethod(name = "GeStep", dispId = 0x41a3)
    Double GeStep(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41a4)</p>
     */
    @ComMethod(name = "IsEven", dispId = 0x41a4)
    Boolean IsEven(Object Arg1);
            
    /**
     * <p>id(0x41a5)</p>
     */
    @ComMethod(name = "IsOdd", dispId = 0x41a5)
    Boolean IsOdd(Object Arg1);
            
    /**
     * <p>id(0x41a6)</p>
     */
    @ComMethod(name = "MRound", dispId = 0x41a6)
    Double MRound(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41a7)</p>
     */
    @ComMethod(name = "Erf", dispId = 0x41a7)
    Double Erf(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41a8)</p>
     */
    @ComMethod(name = "ErfC", dispId = 0x41a8)
    Double ErfC(Object Arg1);
            
    /**
     * <p>id(0x41a9)</p>
     */
    @ComMethod(name = "BesselJ", dispId = 0x41a9)
    Double BesselJ(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41aa)</p>
     */
    @ComMethod(name = "BesselK", dispId = 0x41aa)
    Double BesselK(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41ab)</p>
     */
    @ComMethod(name = "BesselY", dispId = 0x41ab)
    Double BesselY(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41ac)</p>
     */
    @ComMethod(name = "BesselI", dispId = 0x41ac)
    Double BesselI(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41ad)</p>
     */
    @ComMethod(name = "Xirr", dispId = 0x41ad)
    Double Xirr(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41ae)</p>
     */
    @ComMethod(name = "Xnpv", dispId = 0x41ae)
    Double Xnpv(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41af)</p>
     */
    @ComMethod(name = "PriceMat", dispId = 0x41af)
    Double PriceMat(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6);
            
    /**
     * <p>id(0x41b0)</p>
     */
    @ComMethod(name = "YieldMat", dispId = 0x41b0)
    Double YieldMat(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6);
            
    /**
     * <p>id(0x41b1)</p>
     */
    @ComMethod(name = "IntRate", dispId = 0x41b1)
    Double IntRate(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x41b2)</p>
     */
    @ComMethod(name = "Received", dispId = 0x41b2)
    Double Received(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x41b3)</p>
     */
    @ComMethod(name = "Disc", dispId = 0x41b3)
    Double Disc(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x41b4)</p>
     */
    @ComMethod(name = "PriceDisc", dispId = 0x41b4)
    Double PriceDisc(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x41b5)</p>
     */
    @ComMethod(name = "YieldDisc", dispId = 0x41b5)
    Double YieldDisc(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x41b6)</p>
     */
    @ComMethod(name = "TBillEq", dispId = 0x41b6)
    Double TBillEq(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41b7)</p>
     */
    @ComMethod(name = "TBillPrice", dispId = 0x41b7)
    Double TBillPrice(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41b8)</p>
     */
    @ComMethod(name = "TBillYield", dispId = 0x41b8)
    Double TBillYield(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41b9)</p>
     */
    @ComMethod(name = "Price", dispId = 0x41b9)
    Double Price(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7);
            
    /**
     * <p>id(0x41bb)</p>
     */
    @ComMethod(name = "DollarDe", dispId = 0x41bb)
    Double DollarDe(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41bc)</p>
     */
    @ComMethod(name = "DollarFr", dispId = 0x41bc)
    Double DollarFr(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41bd)</p>
     */
    @ComMethod(name = "Nominal", dispId = 0x41bd)
    Double Nominal(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41be)</p>
     */
    @ComMethod(name = "Effect", dispId = 0x41be)
    Double Effect(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41bf)</p>
     */
    @ComMethod(name = "CumPrinc", dispId = 0x41bf)
    Double CumPrinc(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6);
            
    /**
     * <p>id(0x41c0)</p>
     */
    @ComMethod(name = "CumIPmt", dispId = 0x41c0)
    Double CumIPmt(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6);
            
    /**
     * <p>id(0x41c1)</p>
     */
    @ComMethod(name = "EDate", dispId = 0x41c1)
    Double EDate(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41c2)</p>
     */
    @ComMethod(name = "EoMonth", dispId = 0x41c2)
    Double EoMonth(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41c3)</p>
     */
    @ComMethod(name = "YearFrac", dispId = 0x41c3)
    Double YearFrac(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41c4)</p>
     */
    @ComMethod(name = "CoupDayBs", dispId = 0x41c4)
    Double CoupDayBs(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x41c5)</p>
     */
    @ComMethod(name = "CoupDays", dispId = 0x41c5)
    Double CoupDays(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x41c6)</p>
     */
    @ComMethod(name = "CoupDaysNc", dispId = 0x41c6)
    Double CoupDaysNc(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x41c7)</p>
     */
    @ComMethod(name = "CoupNcd", dispId = 0x41c7)
    Double CoupNcd(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x41c8)</p>
     */
    @ComMethod(name = "CoupNum", dispId = 0x41c8)
    Double CoupNum(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x41c9)</p>
     */
    @ComMethod(name = "CoupPcd", dispId = 0x41c9)
    Double CoupPcd(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x41ca)</p>
     */
    @ComMethod(name = "Duration", dispId = 0x41ca)
    Double Duration(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6);
            
    /**
     * <p>id(0x41cb)</p>
     */
    @ComMethod(name = "MDuration", dispId = 0x41cb)
    Double MDuration(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6);
            
    /**
     * <p>id(0x41cc)</p>
     */
    @ComMethod(name = "OddLPrice", dispId = 0x41cc)
    Double OddLPrice(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8);
            
    /**
     * <p>id(0x41cd)</p>
     */
    @ComMethod(name = "OddLYield", dispId = 0x41cd)
    Double OddLYield(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8);
            
    /**
     * <p>id(0x41ce)</p>
     */
    @ComMethod(name = "OddFPrice", dispId = 0x41ce)
    Double OddFPrice(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9);
            
    /**
     * <p>id(0x41cf)</p>
     */
    @ComMethod(name = "OddFYield", dispId = 0x41cf)
    Double OddFYield(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9);
            
    /**
     * <p>id(0x41d0)</p>
     */
    @ComMethod(name = "RandBetween", dispId = 0x41d0)
    Double RandBetween(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41d1)</p>
     */
    @ComMethod(name = "WeekNum", dispId = 0x41d1)
    Double WeekNum(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41d2)</p>
     */
    @ComMethod(name = "AmorDegrc", dispId = 0x41d2)
    Double AmorDegrc(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7);
            
    /**
     * <p>id(0x41d3)</p>
     */
    @ComMethod(name = "AmorLinc", dispId = 0x41d3)
    Double AmorLinc(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7);
            
    /**
     * <p>id(0x41d4)</p>
     */
    @ComMethod(name = "Convert", dispId = 0x41d4)
    Double Convert(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41d5)</p>
     */
    @ComMethod(name = "AccrInt", dispId = 0x41d5)
    Double AccrInt(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7);
            
    /**
     * <p>id(0x41d6)</p>
     */
    @ComMethod(name = "AccrIntM", dispId = 0x41d6)
    Double AccrIntM(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x41d7)</p>
     */
    @ComMethod(name = "WorkDay", dispId = 0x41d7)
    Double WorkDay(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41d8)</p>
     */
    @ComMethod(name = "NetworkDays", dispId = 0x41d8)
    Double NetworkDays(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41d9)</p>
     */
    @ComMethod(name = "Gcd", dispId = 0x41d9)
    Double Gcd(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x41da)</p>
     */
    @ComMethod(name = "MultiNomial", dispId = 0x41da)
    Double MultiNomial(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x41db)</p>
     */
    @ComMethod(name = "Lcm", dispId = 0x41db)
    Double Lcm(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x41dc)</p>
     */
    @ComMethod(name = "FVSchedule", dispId = 0x41dc)
    Double FVSchedule(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41e2)</p>
     */
    @ComMethod(name = "SumIfs", dispId = 0x41e2)
    Double SumIfs(Range Arg1,
            Range Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29);
            
    /**
     * <p>id(0x41e1)</p>
     */
    @ComMethod(name = "CountIfs", dispId = 0x41e1)
    Double CountIfs(Range Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x41e3)</p>
     */
    @ComMethod(name = "AverageIf", dispId = 0x41e3)
    Double AverageIf(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41e4)</p>
     */
    @ComMethod(name = "AverageIfs", dispId = 0x41e4)
    Double AverageIfs(Range Arg1,
            Range Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29);
            
    /**
     * <p>id(0x41e0)</p>
     */
    @ComMethod(name = "IfError", dispId = 0x41e0)
    Object IfError(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41e5)</p>
     */
    @ComMethod(name = "Aggregate", dispId = 0x41e5)
    Double Aggregate(Double Arg1,
            Double Arg2,
            Range Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x41e8)</p>
     */
    @ComMethod(name = "Confidence_Norm", dispId = 0x41e8)
    Double Confidence_Norm(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x41e9)</p>
     */
    @ComMethod(name = "Confidence_T", dispId = 0x41e9)
    Double Confidence_T(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x41ea)</p>
     */
    @ComMethod(name = "ChiSq_Test", dispId = 0x41ea)
    Double ChiSq_Test(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41eb)</p>
     */
    @ComMethod(name = "F_Test", dispId = 0x41eb)
    Double F_Test(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41ec)</p>
     */
    @ComMethod(name = "Covariance_P", dispId = 0x41ec)
    Double Covariance_P(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41ed)</p>
     */
    @ComMethod(name = "Covariance_S", dispId = 0x41ed)
    Double Covariance_S(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41ee)</p>
     */
    @ComMethod(name = "Expon_Dist", dispId = 0x41ee)
    Double Expon_Dist(Double Arg1,
            Double Arg2,
            Boolean Arg3);
            
    /**
     * <p>id(0x41ef)</p>
     */
    @ComMethod(name = "Gamma_Dist", dispId = 0x41ef)
    Double Gamma_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x41f0)</p>
     */
    @ComMethod(name = "Gamma_Inv", dispId = 0x41f0)
    Double Gamma_Inv(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x41f1)</p>
     */
    @ComMethod(name = "Mode_Mult", dispId = 0x41f1)
    Object Mode_Mult(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x41f2)</p>
     */
    @ComMethod(name = "Mode_Sngl", dispId = 0x41f2)
    Double Mode_Sngl(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x41f3)</p>
     */
    @ComMethod(name = "Norm_Dist", dispId = 0x41f3)
    Double Norm_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x41f4)</p>
     */
    @ComMethod(name = "Norm_Inv", dispId = 0x41f4)
    Double Norm_Inv(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x41f5)</p>
     */
    @ComMethod(name = "Percentile_Exc", dispId = 0x41f5)
    Double Percentile_Exc(Object Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x41f6)</p>
     */
    @ComMethod(name = "Percentile_Inc", dispId = 0x41f6)
    Double Percentile_Inc(Object Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x41f7)</p>
     */
    @ComMethod(name = "PercentRank_Exc", dispId = 0x41f7)
    Double PercentRank_Exc(Object Arg1,
            Double Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41f8)</p>
     */
    @ComMethod(name = "PercentRank_Inc", dispId = 0x41f8)
    Double PercentRank_Inc(Object Arg1,
            Double Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41f9)</p>
     */
    @ComMethod(name = "Poisson_Dist", dispId = 0x41f9)
    Double Poisson_Dist(Double Arg1,
            Double Arg2,
            Boolean Arg3);
            
    /**
     * <p>id(0x41fa)</p>
     */
    @ComMethod(name = "Quartile_Exc", dispId = 0x41fa)
    Double Quartile_Exc(Object Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x41fb)</p>
     */
    @ComMethod(name = "Quartile_Inc", dispId = 0x41fb)
    Double Quartile_Inc(Object Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x41fc)</p>
     */
    @ComMethod(name = "Rank_Avg", dispId = 0x41fc)
    Double Rank_Avg(Double Arg1,
            Range Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41fd)</p>
     */
    @ComMethod(name = "Rank_Eq", dispId = 0x41fd)
    Double Rank_Eq(Double Arg1,
            Range Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41fe)</p>
     */
    @ComMethod(name = "StDev_S", dispId = 0x41fe)
    Double StDev_S(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x41ff)</p>
     */
    @ComMethod(name = "StDev_P", dispId = 0x41ff)
    Double StDev_P(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4200)</p>
     */
    @ComMethod(name = "T_Dist", dispId = 0x4200)
    Double T_Dist(Double Arg1,
            Double Arg2,
            Boolean Arg3);
            
    /**
     * <p>id(0x4201)</p>
     */
    @ComMethod(name = "T_Dist_2T", dispId = 0x4201)
    Double T_Dist_2T(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4202)</p>
     */
    @ComMethod(name = "T_Dist_RT", dispId = 0x4202)
    Double T_Dist_RT(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4203)</p>
     */
    @ComMethod(name = "T_Inv", dispId = 0x4203)
    Double T_Inv(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4204)</p>
     */
    @ComMethod(name = "T_Inv_2T", dispId = 0x4204)
    Double T_Inv_2T(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4205)</p>
     */
    @ComMethod(name = "Var_S", dispId = 0x4205)
    Double Var_S(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4206)</p>
     */
    @ComMethod(name = "Var_P", dispId = 0x4206)
    Double Var_P(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4207)</p>
     */
    @ComMethod(name = "Weibull_Dist", dispId = 0x4207)
    Double Weibull_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x4208)</p>
     */
    @ComMethod(name = "NetworkDays_Intl", dispId = 0x4208)
    Double NetworkDays_Intl(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x4209)</p>
     */
    @ComMethod(name = "WorkDay_Intl", dispId = 0x4209)
    Double WorkDay_Intl(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x420b)</p>
     */
    @ComMethod(name = "ISO_Ceiling", dispId = 0x420b)
    Double ISO_Ceiling(Double Arg1,
            Object Arg2);
            
    /**
     * <p>id(0xb0a)</p>
     */
    @ComMethod(name = "Dummy21", dispId = 0xb0a)
    Double Dummy21(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0xb0b)</p>
     */
    @ComMethod(name = "Dummy19", dispId = 0xb0b)
    Object Dummy19(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x420d)</p>
     */
    @ComMethod(name = "Beta_Dist", dispId = 0x420d)
    Double Beta_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4,
            Object Arg5,
            Object Arg6);
            
    /**
     * <p>id(0x420e)</p>
     */
    @ComMethod(name = "Beta_Inv", dispId = 0x420e)
    Double Beta_Inv(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x420f)</p>
     */
    @ComMethod(name = "ChiSq_Dist", dispId = 0x420f)
    Double ChiSq_Dist(Double Arg1,
            Double Arg2,
            Boolean Arg3);
            
    /**
     * <p>id(0x4210)</p>
     */
    @ComMethod(name = "ChiSq_Dist_RT", dispId = 0x4210)
    Double ChiSq_Dist_RT(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4211)</p>
     */
    @ComMethod(name = "ChiSq_Inv", dispId = 0x4211)
    Double ChiSq_Inv(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4212)</p>
     */
    @ComMethod(name = "ChiSq_Inv_RT", dispId = 0x4212)
    Double ChiSq_Inv_RT(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4213)</p>
     */
    @ComMethod(name = "F_Dist", dispId = 0x4213)
    Double F_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x4214)</p>
     */
    @ComMethod(name = "F_Dist_RT", dispId = 0x4214)
    Double F_Dist_RT(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4215)</p>
     */
    @ComMethod(name = "F_Inv", dispId = 0x4215)
    Double F_Inv(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4216)</p>
     */
    @ComMethod(name = "F_Inv_RT", dispId = 0x4216)
    Double F_Inv_RT(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4217)</p>
     */
    @ComMethod(name = "HypGeom_Dist", dispId = 0x4217)
    Double HypGeom_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4,
            Boolean Arg5);
            
    /**
     * <p>id(0x4218)</p>
     */
    @ComMethod(name = "LogNorm_Dist", dispId = 0x4218)
    Double LogNorm_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x4219)</p>
     */
    @ComMethod(name = "LogNorm_Inv", dispId = 0x4219)
    Double LogNorm_Inv(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x421a)</p>
     */
    @ComMethod(name = "NegBinom_Dist", dispId = 0x421a)
    Double NegBinom_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x421b)</p>
     */
    @ComMethod(name = "Norm_S_Dist", dispId = 0x421b)
    Double Norm_S_Dist(Double Arg1,
            Boolean Arg2);
            
    /**
     * <p>id(0x421c)</p>
     */
    @ComMethod(name = "Norm_S_Inv", dispId = 0x421c)
    Double Norm_S_Inv(Double Arg1);
            
    /**
     * <p>id(0x421d)</p>
     */
    @ComMethod(name = "T_Test", dispId = 0x421d)
    Double T_Test(Object Arg1,
            Object Arg2,
            Double Arg3,
            Double Arg4);
            
    /**
     * <p>id(0x421e)</p>
     */
    @ComMethod(name = "Z_Test", dispId = 0x421e)
    Double Z_Test(Object Arg1,
            Double Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41e6)</p>
     */
    @ComMethod(name = "Binom_Dist", dispId = 0x41e6)
    Double Binom_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x41e7)</p>
     */
    @ComMethod(name = "Binom_Inv", dispId = 0x41e7)
    Double Binom_Inv(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x421f)</p>
     */
    @ComMethod(name = "Erf_Precise", dispId = 0x421f)
    Double Erf_Precise(Object Arg1);
            
    /**
     * <p>id(0x4220)</p>
     */
    @ComMethod(name = "ErfC_Precise", dispId = 0x4220)
    Double ErfC_Precise(Object Arg1);
            
    /**
     * <p>id(0x4221)</p>
     */
    @ComMethod(name = "GammaLn_Precise", dispId = 0x4221)
    Double GammaLn_Precise(Double Arg1);
            
    /**
     * <p>id(0x4222)</p>
     */
    @ComMethod(name = "Ceiling_Precise", dispId = 0x4222)
    Double Ceiling_Precise(Double Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4223)</p>
     */
    @ComMethod(name = "Floor_Precise", dispId = 0x4223)
    Double Floor_Precise(Double Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4224)</p>
     */
    @ComMethod(name = "Acot", dispId = 0x4224)
    Double Acot(Double Arg1);
            
    /**
     * <p>id(0x4225)</p>
     */
    @ComMethod(name = "Acoth", dispId = 0x4225)
    Double Acoth(Double Arg1);
            
    /**
     * <p>id(0x4226)</p>
     */
    @ComMethod(name = "Cot", dispId = 0x4226)
    Double Cot(Double Arg1);
            
    /**
     * <p>id(0x4227)</p>
     */
    @ComMethod(name = "Coth", dispId = 0x4227)
    Double Coth(Double Arg1);
            
    /**
     * <p>id(0x4228)</p>
     */
    @ComMethod(name = "Csc", dispId = 0x4228)
    Double Csc(Double Arg1);
            
    /**
     * <p>id(0x4229)</p>
     */
    @ComMethod(name = "Csch", dispId = 0x4229)
    Double Csch(Double Arg1);
            
    /**
     * <p>id(0x422a)</p>
     */
    @ComMethod(name = "Sec", dispId = 0x422a)
    Double Sec(Double Arg1);
            
    /**
     * <p>id(0x422b)</p>
     */
    @ComMethod(name = "Sech", dispId = 0x422b)
    Double Sech(Double Arg1);
            
    /**
     * <p>id(0x422d)</p>
     */
    @ComMethod(name = "ImCot", dispId = 0x422d)
    String ImCot(Object Arg1);
            
    /**
     * <p>id(0x422c)</p>
     */
    @ComMethod(name = "ImTan", dispId = 0x422c)
    String ImTan(Object Arg1);
            
    /**
     * <p>id(0x422e)</p>
     */
    @ComMethod(name = "ImCsc", dispId = 0x422e)
    String ImCsc(Object Arg1);
            
    /**
     * <p>id(0x422f)</p>
     */
    @ComMethod(name = "ImCsch", dispId = 0x422f)
    String ImCsch(Object Arg1);
            
    /**
     * <p>id(0x4230)</p>
     */
    @ComMethod(name = "ImSec", dispId = 0x4230)
    String ImSec(Object Arg1);
            
    /**
     * <p>id(0x4231)</p>
     */
    @ComMethod(name = "ImSech", dispId = 0x4231)
    String ImSech(Object Arg1);
            
    /**
     * <p>id(0x4232)</p>
     */
    @ComMethod(name = "Bitand", dispId = 0x4232)
    Double Bitand(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4233)</p>
     */
    @ComMethod(name = "Bitor", dispId = 0x4233)
    Double Bitor(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4234)</p>
     */
    @ComMethod(name = "Bitxor", dispId = 0x4234)
    Double Bitxor(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4235)</p>
     */
    @ComMethod(name = "Bitlshift", dispId = 0x4235)
    Double Bitlshift(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4236)</p>
     */
    @ComMethod(name = "Bitrshift", dispId = 0x4236)
    Double Bitrshift(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4239)</p>
     */
    @ComMethod(name = "Xor", dispId = 0x4239)
    Boolean Xor(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4238)</p>
     */
    @ComMethod(name = "Combina", dispId = 0x4238)
    Double Combina(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4237)</p>
     */
    @ComMethod(name = "Permutationa", dispId = 0x4237)
    Double Permutationa(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x423a)</p>
     */
    @ComMethod(name = "PDuration", dispId = 0x423a)
    Double PDuration(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x423b)</p>
     */
    @ComMethod(name = "Base", dispId = 0x423b)
    String Base(Double Arg1,
            Double Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x423c)</p>
     */
    @ComMethod(name = "Decimal", dispId = 0x423c)
    Double Decimal(String Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x423d)</p>
     */
    @ComMethod(name = "Days", dispId = 0x423d)
    Double Days(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x423e)</p>
     */
    @ComMethod(name = "Binom_Dist_Range", dispId = 0x423e)
    Double Binom_Dist_Range(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x423f)</p>
     */
    @ComMethod(name = "Gamma", dispId = 0x423f)
    Double Gamma(Double Arg1);
            
    /**
     * <p>id(0x4241)</p>
     */
    @ComMethod(name = "Gauss", dispId = 0x4241)
    Double Gauss(Double Arg1);
            
    /**
     * <p>id(0x4242)</p>
     */
    @ComMethod(name = "Phi", dispId = 0x4242)
    Double Phi(Double Arg1);
            
    /**
     * <p>id(0x4240)</p>
     */
    @ComMethod(name = "Skew_p", dispId = 0x4240)
    Double Skew_p(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x4243)</p>
     */
    @ComMethod(name = "Rri", dispId = 0x4243)
    Double Rri(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4244)</p>
     */
    @ComMethod(name = "Unichar", dispId = 0x4244)
    String Unichar(Double Arg1);
            
    /**
     * <p>id(0x4245)</p>
     */
    @ComMethod(name = "Unicode", dispId = 0x4245)
    Double Unicode(String Arg1);
            
    /**
     * <p>id(0x4246)</p>
     */
    @ComMethod(name = "Munit", dispId = 0x4246)
    Object Munit(Double Arg1);
            
    /**
     * <p>id(0x4247)</p>
     */
    @ComMethod(name = "Arabic", dispId = 0x4247)
    Double Arabic(String Arg1);
            
    /**
     * <p>id(0x4248)</p>
     */
    @ComMethod(name = "IsoWeekNum", dispId = 0x4248)
    Double IsoWeekNum(Double Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4249)</p>
     */
    @ComMethod(name = "NumberValue", dispId = 0x4249)
    Double NumberValue(String Arg1,
            String Arg2,
            String Arg3);
            
    /**
     * <p>id(0x424d)</p>
     */
    @ComMethod(name = "IsFormula", dispId = 0x424d)
    Boolean IsFormula(Range Arg1);
            
    /**
     * <p>id(0x424e)</p>
     */
    @ComMethod(name = "IfNa", dispId = 0x424e)
    Object IfNa(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x424f)</p>
     */
    @ComMethod(name = "Ceiling_Math", dispId = 0x424f)
    Double Ceiling_Math(Double Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x4250)</p>
     */
    @ComMethod(name = "Floor_Math", dispId = 0x4250)
    Double Floor_Math(Double Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x4251)</p>
     */
    @ComMethod(name = "ImSinh", dispId = 0x4251)
    String ImSinh(Object Arg1);
            
    /**
     * <p>id(0x4252)</p>
     */
    @ComMethod(name = "ImCosh", dispId = 0x4252)
    String ImCosh(Object Arg1);
            
    /**
     * <p>id(0x4253)</p>
     */
    @ComMethod(name = "FilterXML", dispId = 0x4253)
    Object FilterXML(String Arg1,
            String Arg2);
            
    /**
     * <p>id(0x4254)</p>
     */
    @ComMethod(name = "WebService", dispId = 0x4254)
    Object WebService(String Arg1);
            
    /**
     * <p>id(0x4255)</p>
     */
    @ComMethod(name = "EncodeURL", dispId = 0x4255)
    Object EncodeURL(String Arg1);
            
    
}