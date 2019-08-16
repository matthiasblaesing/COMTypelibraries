
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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xa9)</p>
     * <p>vtableId(10)</p>
     * @param Arg1 [in, optional] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(11)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(12)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "IsNA", dispId = 0x4002)
    Boolean IsNA(Object Arg1);
            
    /**
     * <p>id(0x4003)</p>
     * <p>vtableId(13)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "IsError", dispId = 0x4003)
    Boolean IsError(Object Arg1);
            
    /**
     * <p>id(0x4004)</p>
     * <p>vtableId(14)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(15)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(16)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(17)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(18)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(19)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(20)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Dollar", dispId = 0x400d)
    String Dollar(Double Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x400e)</p>
     * <p>vtableId(21)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "Fixed", dispId = 0x400e)
    String Fixed(Double Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x4013)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "Pi", dispId = 0x4013)
    Double Pi();
            
    /**
     * <p>id(0x4016)</p>
     * <p>vtableId(23)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Ln", dispId = 0x4016)
    Double Ln(Double Arg1);
            
    /**
     * <p>id(0x4017)</p>
     * <p>vtableId(24)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Log10", dispId = 0x4017)
    Double Log10(Double Arg1);
            
    /**
     * <p>id(0x401b)</p>
     * <p>vtableId(25)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Round", dispId = 0x401b)
    Double Round(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x401c)</p>
     * <p>vtableId(26)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "Lookup", dispId = 0x401c)
    Object Lookup(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x401d)</p>
     * <p>vtableId(27)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "Index", dispId = 0x401d)
    Object Index(Object Arg1,
            Double Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x401e)</p>
     * <p>vtableId(28)</p>
     * @param Arg1 [in] {@code String}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Rept", dispId = 0x401e)
    String Rept(String Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4024)</p>
     * <p>vtableId(29)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(30)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(31)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     */
    @ComMethod(name = "DCount", dispId = 0x4028)
    Double DCount(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x4029)</p>
     * <p>vtableId(32)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     */
    @ComMethod(name = "DSum", dispId = 0x4029)
    Double DSum(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x402a)</p>
     * <p>vtableId(33)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     */
    @ComMethod(name = "DAverage", dispId = 0x402a)
    Double DAverage(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x402b)</p>
     * <p>vtableId(34)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     */
    @ComMethod(name = "DMin", dispId = 0x402b)
    Double DMin(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x402c)</p>
     * <p>vtableId(35)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     */
    @ComMethod(name = "DMax", dispId = 0x402c)
    Double DMax(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x402d)</p>
     * <p>vtableId(36)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     */
    @ComMethod(name = "DStDev", dispId = 0x402d)
    Double DStDev(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x402e)</p>
     * <p>vtableId(37)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(38)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     */
    @ComMethod(name = "DVar", dispId = 0x402f)
    Double DVar(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x4030)</p>
     * <p>vtableId(39)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code String}
     */
    @ComMethod(name = "Text", dispId = 0x4030)
    String Text(Object Arg1,
            String Arg2);
            
    /**
     * <p>id(0x4031)</p>
     * <p>vtableId(40)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "LinEst", dispId = 0x4031)
    Object LinEst(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x4032)</p>
     * <p>vtableId(41)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "Trend", dispId = 0x4032)
    Object Trend(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x4033)</p>
     * <p>vtableId(42)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "LogEst", dispId = 0x4033)
    Object LogEst(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x4034)</p>
     * <p>vtableId(43)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "Growth", dispId = 0x4034)
    Object Growth(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x4038)</p>
     * <p>vtableId(44)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     */
    @ComMethod(name = "Pv", dispId = 0x4038)
    Double Pv(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x4039)</p>
     * <p>vtableId(45)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     */
    @ComMethod(name = "Fv", dispId = 0x4039)
    Double Fv(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x403a)</p>
     * <p>vtableId(46)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     */
    @ComMethod(name = "NPer", dispId = 0x403a)
    Double NPer(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x403b)</p>
     * <p>vtableId(47)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     */
    @ComMethod(name = "Pmt", dispId = 0x403b)
    Double Pmt(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x403c)</p>
     * <p>vtableId(48)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
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
     * <p>vtableId(49)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "MIrr", dispId = 0x403d)
    Double MIrr(Object Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x403e)</p>
     * <p>vtableId(50)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Irr", dispId = 0x403e)
    Double Irr(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4040)</p>
     * <p>vtableId(51)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "Match", dispId = 0x4040)
    Double Match(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x4046)</p>
     * <p>vtableId(52)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Weekday", dispId = 0x4046)
    Double Weekday(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4052)</p>
     * <p>vtableId(53)</p>
     * @param Arg1 [in] {@code String}
     * @param Arg2 [in] {@code String}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "Search", dispId = 0x4052)
    Double Search(String Arg1,
            String Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x4053)</p>
     * <p>vtableId(54)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "Transpose", dispId = 0x4053)
    Object Transpose(Object Arg1);
            
    /**
     * <p>id(0x4061)</p>
     * <p>vtableId(55)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Atan2", dispId = 0x4061)
    Double Atan2(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4062)</p>
     * <p>vtableId(56)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Asin", dispId = 0x4062)
    Double Asin(Double Arg1);
            
    /**
     * <p>id(0x4063)</p>
     * <p>vtableId(57)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Acos", dispId = 0x4063)
    Double Acos(Double Arg1);
            
    /**
     * <p>id(0x4064)</p>
     * <p>vtableId(58)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(59)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "HLookup", dispId = 0x4065)
    Object HLookup(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x4066)</p>
     * <p>vtableId(60)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "VLookup", dispId = 0x4066)
    Object VLookup(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x406d)</p>
     * <p>vtableId(61)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Log", dispId = 0x406d)
    Double Log(Double Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4072)</p>
     * <p>vtableId(62)</p>
     * @param Arg1 [in] {@code String}
     */
    @ComMethod(name = "Proper", dispId = 0x4072)
    String Proper(String Arg1);
            
    /**
     * <p>id(0x4076)</p>
     * <p>vtableId(63)</p>
     * @param Arg1 [in] {@code String}
     */
    @ComMethod(name = "Trim", dispId = 0x4076)
    String Trim(String Arg1);
            
    /**
     * <p>id(0x4077)</p>
     * <p>vtableId(64)</p>
     * @param Arg1 [in] {@code String}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code String}
     */
    @ComMethod(name = "Replace", dispId = 0x4077)
    String Replace(String Arg1,
            Double Arg2,
            Double Arg3,
            String Arg4);
            
    /**
     * <p>id(0x4078)</p>
     * <p>vtableId(65)</p>
     * @param Arg1 [in] {@code String}
     * @param Arg2 [in] {@code String}
     * @param Arg3 [in] {@code String}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "Substitute", dispId = 0x4078)
    String Substitute(String Arg1,
            String Arg2,
            String Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x407c)</p>
     * <p>vtableId(66)</p>
     * @param Arg1 [in] {@code String}
     * @param Arg2 [in] {@code String}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "Find", dispId = 0x407c)
    Double Find(String Arg1,
            String Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x407e)</p>
     * <p>vtableId(67)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "IsErr", dispId = 0x407e)
    Boolean IsErr(Object Arg1);
            
    /**
     * <p>id(0x407f)</p>
     * <p>vtableId(68)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "IsText", dispId = 0x407f)
    Boolean IsText(Object Arg1);
            
    /**
     * <p>id(0x4080)</p>
     * <p>vtableId(69)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "IsNumber", dispId = 0x4080)
    Boolean IsNumber(Object Arg1);
            
    /**
     * <p>id(0x408e)</p>
     * <p>vtableId(70)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "Sln", dispId = 0x408e)
    Double Sln(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x408f)</p>
     * <p>vtableId(71)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Double}
     */
    @ComMethod(name = "Syd", dispId = 0x408f)
    Double Syd(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4);
            
    /**
     * <p>id(0x4090)</p>
     * <p>vtableId(72)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Double}
     * @param Arg5 [in, optional] {@code Object}
     */
    @ComMethod(name = "Ddb", dispId = 0x4090)
    Double Ddb(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x40a2)</p>
     * <p>vtableId(73)</p>
     * @param Arg1 [in] {@code String}
     */
    @ComMethod(name = "Clean", dispId = 0x40a2)
    String Clean(String Arg1);
            
    /**
     * <p>id(0x40a3)</p>
     * <p>vtableId(74)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "MDeterm", dispId = 0x40a3)
    Double MDeterm(Object Arg1);
            
    /**
     * <p>id(0x40a4)</p>
     * <p>vtableId(75)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "MInverse", dispId = 0x40a4)
    Object MInverse(Object Arg1);
            
    /**
     * <p>id(0x40a5)</p>
     * <p>vtableId(76)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "MMult", dispId = 0x40a5)
    Object MMult(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x40a7)</p>
     * <p>vtableId(77)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Double}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
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
     * <p>vtableId(78)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Double}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
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
     * <p>vtableId(79)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(80)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(81)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Fact", dispId = 0x40b8)
    Double Fact(Double Arg1);
            
    /**
     * <p>id(0x40bd)</p>
     * <p>vtableId(82)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     */
    @ComMethod(name = "DProduct", dispId = 0x40bd)
    Double DProduct(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x40be)</p>
     * <p>vtableId(83)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "IsNonText", dispId = 0x40be)
    Boolean IsNonText(Object Arg1);
            
    /**
     * <p>id(0x40c1)</p>
     * <p>vtableId(84)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(85)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(86)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     */
    @ComMethod(name = "DStDevP", dispId = 0x40c3)
    Double DStDevP(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x40c4)</p>
     * <p>vtableId(87)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     */
    @ComMethod(name = "DVarP", dispId = 0x40c4)
    Double DVarP(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x40c6)</p>
     * <p>vtableId(88)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "IsLogical", dispId = 0x40c6)
    Boolean IsLogical(Object Arg1);
            
    /**
     * <p>id(0x40c7)</p>
     * <p>vtableId(89)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     */
    @ComMethod(name = "DCountA", dispId = 0x40c7)
    Double DCountA(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x40cc)</p>
     * <p>vtableId(90)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "USDollar", dispId = 0x40cc)
    String USDollar(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x40cd)</p>
     * <p>vtableId(91)</p>
     * @param Arg1 [in] {@code String}
     * @param Arg2 [in] {@code String}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "FindB", dispId = 0x40cd)
    Double FindB(String Arg1,
            String Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x40ce)</p>
     * <p>vtableId(92)</p>
     * @param Arg1 [in] {@code String}
     * @param Arg2 [in] {@code String}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "SearchB", dispId = 0x40ce)
    Double SearchB(String Arg1,
            String Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x40cf)</p>
     * <p>vtableId(93)</p>
     * @param Arg1 [in] {@code String}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code String}
     */
    @ComMethod(name = "ReplaceB", dispId = 0x40cf)
    String ReplaceB(String Arg1,
            Double Arg2,
            Double Arg3,
            String Arg4);
            
    /**
     * <p>id(0x40d4)</p>
     * <p>vtableId(94)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "RoundUp", dispId = 0x40d4)
    Double RoundUp(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x40d5)</p>
     * <p>vtableId(95)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "RoundDown", dispId = 0x40d5)
    Double RoundDown(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x40d8)</p>
     * <p>vtableId(96)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Range}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "Rank", dispId = 0x40d8)
    Double Rank(Double Arg1,
            Range Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x40dc)</p>
     * <p>vtableId(97)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "Days360", dispId = 0x40dc)
    Double Days360(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x40de)</p>
     * <p>vtableId(98)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Double}
     * @param Arg5 [in] {@code Double}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
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
     * <p>vtableId(99)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(100)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(101)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Sinh", dispId = 0x40e5)
    Double Sinh(Double Arg1);
            
    /**
     * <p>id(0x40e6)</p>
     * <p>vtableId(102)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Cosh", dispId = 0x40e6)
    Double Cosh(Double Arg1);
            
    /**
     * <p>id(0x40e7)</p>
     * <p>vtableId(103)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Tanh", dispId = 0x40e7)
    Double Tanh(Double Arg1);
            
    /**
     * <p>id(0x40e8)</p>
     * <p>vtableId(104)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Asinh", dispId = 0x40e8)
    Double Asinh(Double Arg1);
            
    /**
     * <p>id(0x40e9)</p>
     * <p>vtableId(105)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Acosh", dispId = 0x40e9)
    Double Acosh(Double Arg1);
            
    /**
     * <p>id(0x40ea)</p>
     * <p>vtableId(106)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Atanh", dispId = 0x40ea)
    Double Atanh(Double Arg1);
            
    /**
     * <p>id(0x40eb)</p>
     * <p>vtableId(107)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     */
    @ComMethod(name = "DGet", dispId = 0x40eb)
    Object DGet(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x40f7)</p>
     * <p>vtableId(108)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Double}
     * @param Arg5 [in, optional] {@code Object}
     */
    @ComMethod(name = "Db", dispId = 0x40f7)
    Double Db(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x40fc)</p>
     * <p>vtableId(109)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "Frequency", dispId = 0x40fc)
    Object Frequency(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x410d)</p>
     * <p>vtableId(110)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(111)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     */
    @ComMethod(name = "BetaDist", dispId = 0x410e)
    Double BetaDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x410f)</p>
     * <p>vtableId(112)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "GammaLn", dispId = 0x410f)
    Double GammaLn(Double Arg1);
            
    /**
     * <p>id(0x4110)</p>
     * <p>vtableId(113)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     */
    @ComMethod(name = "BetaInv", dispId = 0x4110)
    Double BetaInv(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x4111)</p>
     * <p>vtableId(114)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Boolean}
     */
    @ComMethod(name = "BinomDist", dispId = 0x4111)
    Double BinomDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x4112)</p>
     * <p>vtableId(115)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "ChiDist", dispId = 0x4112)
    Double ChiDist(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4113)</p>
     * <p>vtableId(116)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "ChiInv", dispId = 0x4113)
    Double ChiInv(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4114)</p>
     * <p>vtableId(117)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Combin", dispId = 0x4114)
    Double Combin(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4115)</p>
     * <p>vtableId(118)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "Confidence", dispId = 0x4115)
    Double Confidence(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4116)</p>
     * <p>vtableId(119)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "CritBinom", dispId = 0x4116)
    Double CritBinom(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4117)</p>
     * <p>vtableId(120)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Even", dispId = 0x4117)
    Double Even(Double Arg1);
            
    /**
     * <p>id(0x4118)</p>
     * <p>vtableId(121)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Boolean}
     */
    @ComMethod(name = "ExponDist", dispId = 0x4118)
    Double ExponDist(Double Arg1,
            Double Arg2,
            Boolean Arg3);
            
    /**
     * <p>id(0x4119)</p>
     * <p>vtableId(122)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "FDist", dispId = 0x4119)
    Double FDist(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x411a)</p>
     * <p>vtableId(123)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "FInv", dispId = 0x411a)
    Double FInv(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x411b)</p>
     * <p>vtableId(124)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Fisher", dispId = 0x411b)
    Double Fisher(Double Arg1);
            
    /**
     * <p>id(0x411c)</p>
     * <p>vtableId(125)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "FisherInv", dispId = 0x411c)
    Double FisherInv(Double Arg1);
            
    /**
     * <p>id(0x411d)</p>
     * <p>vtableId(126)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Floor", dispId = 0x411d)
    Double Floor(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x411e)</p>
     * <p>vtableId(127)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Boolean}
     */
    @ComMethod(name = "GammaDist", dispId = 0x411e)
    Double GammaDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x411f)</p>
     * <p>vtableId(128)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "GammaInv", dispId = 0x411f)
    Double GammaInv(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4120)</p>
     * <p>vtableId(129)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Ceiling", dispId = 0x4120)
    Double Ceiling(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4121)</p>
     * <p>vtableId(130)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Double}
     */
    @ComMethod(name = "HypGeomDist", dispId = 0x4121)
    Double HypGeomDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4);
            
    /**
     * <p>id(0x4122)</p>
     * <p>vtableId(131)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "LogNormDist", dispId = 0x4122)
    Double LogNormDist(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4123)</p>
     * <p>vtableId(132)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "LogInv", dispId = 0x4123)
    Double LogInv(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4124)</p>
     * <p>vtableId(133)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "NegBinomDist", dispId = 0x4124)
    Double NegBinomDist(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4125)</p>
     * <p>vtableId(134)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Boolean}
     */
    @ComMethod(name = "NormDist", dispId = 0x4125)
    Double NormDist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x4126)</p>
     * <p>vtableId(135)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "NormSDist", dispId = 0x4126)
    Double NormSDist(Double Arg1);
            
    /**
     * <p>id(0x4127)</p>
     * <p>vtableId(136)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "NormInv", dispId = 0x4127)
    Double NormInv(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4128)</p>
     * <p>vtableId(137)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "NormSInv", dispId = 0x4128)
    Double NormSInv(Double Arg1);
            
    /**
     * <p>id(0x4129)</p>
     * <p>vtableId(138)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "Standardize", dispId = 0x4129)
    Double Standardize(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x412a)</p>
     * <p>vtableId(139)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Odd", dispId = 0x412a)
    Double Odd(Double Arg1);
            
    /**
     * <p>id(0x412b)</p>
     * <p>vtableId(140)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Permut", dispId = 0x412b)
    Double Permut(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x412c)</p>
     * <p>vtableId(141)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Boolean}
     */
    @ComMethod(name = "Poisson", dispId = 0x412c)
    Double Poisson(Double Arg1,
            Double Arg2,
            Boolean Arg3);
            
    /**
     * <p>id(0x412d)</p>
     * <p>vtableId(142)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "TDist", dispId = 0x412d)
    Double TDist(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x412e)</p>
     * <p>vtableId(143)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Boolean}
     */
    @ComMethod(name = "Weibull", dispId = 0x412e)
    Double Weibull(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x412f)</p>
     * <p>vtableId(144)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "SumXMY2", dispId = 0x412f)
    Double SumXMY2(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4130)</p>
     * <p>vtableId(145)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "SumX2MY2", dispId = 0x4130)
    Double SumX2MY2(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4131)</p>
     * <p>vtableId(146)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "SumX2PY2", dispId = 0x4131)
    Double SumX2PY2(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4132)</p>
     * <p>vtableId(147)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "ChiTest", dispId = 0x4132)
    Double ChiTest(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4133)</p>
     * <p>vtableId(148)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "Correl", dispId = 0x4133)
    Double Correl(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4134)</p>
     * <p>vtableId(149)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "Covar", dispId = 0x4134)
    Double Covar(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4135)</p>
     * <p>vtableId(150)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     */
    @ComMethod(name = "Forecast", dispId = 0x4135)
    Double Forecast(Double Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x4136)</p>
     * <p>vtableId(151)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "FTest", dispId = 0x4136)
    Double FTest(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4137)</p>
     * <p>vtableId(152)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "Intercept", dispId = 0x4137)
    Double Intercept(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4138)</p>
     * <p>vtableId(153)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "Pearson", dispId = 0x4138)
    Double Pearson(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4139)</p>
     * <p>vtableId(154)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "RSq", dispId = 0x4139)
    Double RSq(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x413a)</p>
     * <p>vtableId(155)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "StEyx", dispId = 0x413a)
    Double StEyx(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x413b)</p>
     * <p>vtableId(156)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "Slope", dispId = 0x413b)
    Double Slope(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x413c)</p>
     * <p>vtableId(157)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Double}
     */
    @ComMethod(name = "TTest", dispId = 0x413c)
    Double TTest(Object Arg1,
            Object Arg2,
            Double Arg3,
            Double Arg4);
            
    /**
     * <p>id(0x413d)</p>
     * <p>vtableId(158)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "Prob", dispId = 0x413d)
    Double Prob(Object Arg1,
            Object Arg2,
            Double Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x413e)</p>
     * <p>vtableId(159)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(160)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(161)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(162)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(163)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(164)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(165)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "ZTest", dispId = 0x4144)
    Double ZTest(Object Arg1,
            Double Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x4145)</p>
     * <p>vtableId(166)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Large", dispId = 0x4145)
    Double Large(Object Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4146)</p>
     * <p>vtableId(167)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Small", dispId = 0x4146)
    Double Small(Object Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4147)</p>
     * <p>vtableId(168)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Quartile", dispId = 0x4147)
    Double Quartile(Object Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4148)</p>
     * <p>vtableId(169)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Percentile", dispId = 0x4148)
    Double Percentile(Object Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4149)</p>
     * <p>vtableId(170)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "PercentRank", dispId = 0x4149)
    Double PercentRank(Object Arg1,
            Double Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x414a)</p>
     * <p>vtableId(171)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(172)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "TrimMean", dispId = 0x414b)
    Double TrimMean(Object Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x414c)</p>
     * <p>vtableId(173)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "TInv", dispId = 0x414c)
    Double TInv(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4151)</p>
     * <p>vtableId(174)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Power", dispId = 0x4151)
    Double Power(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4156)</p>
     * <p>vtableId(175)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Radians", dispId = 0x4156)
    Double Radians(Double Arg1);
            
    /**
     * <p>id(0x4157)</p>
     * <p>vtableId(176)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Degrees", dispId = 0x4157)
    Double Degrees(Double Arg1);
            
    /**
     * <p>id(0x4158)</p>
     * <p>vtableId(177)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Range}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(178)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "SumIf", dispId = 0x4159)
    Double SumIf(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x415a)</p>
     * <p>vtableId(179)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "CountIf", dispId = 0x415a)
    Double CountIf(Range Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x415b)</p>
     * <p>vtableId(180)</p>
     * @param Arg1 [in] {@code Range}
     */
    @ComMethod(name = "CountBlank", dispId = 0x415b)
    Double CountBlank(Range Arg1);
            
    /**
     * <p>id(0x415e)</p>
     * <p>vtableId(181)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Double}
     */
    @ComMethod(name = "Ispmt", dispId = 0x415e)
    Double Ispmt(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4);
            
    /**
     * <p>id(0x4162)</p>
     * <p>vtableId(182)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Roman", dispId = 0x4162)
    String Roman(Double Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x40d6)</p>
     * <p>vtableId(183)</p>
     * @param Arg1 [in] {@code String}
     */
    @ComMethod(name = "Asc", dispId = 0x40d6)
    String Asc(String Arg1);
            
    /**
     * <p>id(0x40d7)</p>
     * <p>vtableId(184)</p>
     * @param Arg1 [in] {@code String}
     */
    @ComMethod(name = "Dbcs", dispId = 0x40d7)
    String Dbcs(String Arg1);
            
    /**
     * <p>id(0x4168)</p>
     * <p>vtableId(185)</p>
     * @param Arg1 [in] {@code Range}
     */
    @ComMethod(name = "Phonetic", dispId = 0x4168)
    String Phonetic(Range Arg1);
            
    /**
     * <p>id(0x4170)</p>
     * <p>vtableId(186)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "BahtText", dispId = 0x4170)
    String BahtText(Double Arg1);
            
    /**
     * <p>id(0x4171)</p>
     * <p>vtableId(187)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "ThaiDayOfWeek", dispId = 0x4171)
    String ThaiDayOfWeek(Double Arg1);
            
    /**
     * <p>id(0x4172)</p>
     * <p>vtableId(188)</p>
     * @param Arg1 [in] {@code String}
     */
    @ComMethod(name = "ThaiDigit", dispId = 0x4172)
    String ThaiDigit(String Arg1);
            
    /**
     * <p>id(0x4173)</p>
     * <p>vtableId(189)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "ThaiMonthOfYear", dispId = 0x4173)
    String ThaiMonthOfYear(Double Arg1);
            
    /**
     * <p>id(0x4174)</p>
     * <p>vtableId(190)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "ThaiNumSound", dispId = 0x4174)
    String ThaiNumSound(Double Arg1);
            
    /**
     * <p>id(0x4175)</p>
     * <p>vtableId(191)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "ThaiNumString", dispId = 0x4175)
    String ThaiNumString(Double Arg1);
            
    /**
     * <p>id(0x4176)</p>
     * <p>vtableId(192)</p>
     * @param Arg1 [in] {@code String}
     */
    @ComMethod(name = "ThaiStringLength", dispId = 0x4176)
    Double ThaiStringLength(String Arg1);
            
    /**
     * <p>id(0x4177)</p>
     * <p>vtableId(193)</p>
     * @param Arg1 [in] {@code String}
     */
    @ComMethod(name = "IsThaiDigit", dispId = 0x4177)
    Boolean IsThaiDigit(String Arg1);
            
    /**
     * <p>id(0x4178)</p>
     * <p>vtableId(194)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "RoundBahtDown", dispId = 0x4178)
    Double RoundBahtDown(Double Arg1);
            
    /**
     * <p>id(0x4179)</p>
     * <p>vtableId(195)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "RoundBahtUp", dispId = 0x4179)
    Double RoundBahtUp(Double Arg1);
            
    /**
     * <p>id(0x417a)</p>
     * <p>vtableId(196)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "ThaiYear", dispId = 0x417a)
    Double ThaiYear(Double Arg1);
            
    /**
     * <p>id(0x417b)</p>
     * <p>vtableId(197)</p>
     * @param progID [in] {@code Object}
     * @param server [in] {@code Object}
     * @param topic1 [in] {@code Object}
     * @param topic2 [in, optional] {@code Object}
     * @param topic3 [in, optional] {@code Object}
     * @param topic4 [in, optional] {@code Object}
     * @param topic5 [in, optional] {@code Object}
     * @param topic6 [in, optional] {@code Object}
     * @param topic7 [in, optional] {@code Object}
     * @param topic8 [in, optional] {@code Object}
     * @param topic9 [in, optional] {@code Object}
     * @param topic10 [in, optional] {@code Object}
     * @param topic11 [in, optional] {@code Object}
     * @param topic12 [in, optional] {@code Object}
     * @param topic13 [in, optional] {@code Object}
     * @param topic14 [in, optional] {@code Object}
     * @param topic15 [in, optional] {@code Object}
     * @param topic16 [in, optional] {@code Object}
     * @param topic17 [in, optional] {@code Object}
     * @param topic18 [in, optional] {@code Object}
     * @param topic19 [in, optional] {@code Object}
     * @param topic20 [in, optional] {@code Object}
     * @param topic21 [in, optional] {@code Object}
     * @param topic22 [in, optional] {@code Object}
     * @param topic23 [in, optional] {@code Object}
     * @param topic24 [in, optional] {@code Object}
     * @param topic25 [in, optional] {@code Object}
     * @param topic26 [in, optional] {@code Object}
     * @param topic27 [in, optional] {@code Object}
     * @param topic28 [in, optional] {@code Object}
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
     * <p>vtableId(198)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Hex2Bin", dispId = 0x4180)
    String Hex2Bin(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4181)</p>
     * <p>vtableId(199)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "Hex2Dec", dispId = 0x4181)
    String Hex2Dec(Object Arg1);
            
    /**
     * <p>id(0x4182)</p>
     * <p>vtableId(200)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Hex2Oct", dispId = 0x4182)
    String Hex2Oct(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4183)</p>
     * <p>vtableId(201)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Dec2Bin", dispId = 0x4183)
    String Dec2Bin(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4184)</p>
     * <p>vtableId(202)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Dec2Hex", dispId = 0x4184)
    String Dec2Hex(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4185)</p>
     * <p>vtableId(203)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Dec2Oct", dispId = 0x4185)
    String Dec2Oct(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4186)</p>
     * <p>vtableId(204)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Oct2Bin", dispId = 0x4186)
    String Oct2Bin(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4187)</p>
     * <p>vtableId(205)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Oct2Hex", dispId = 0x4187)
    String Oct2Hex(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4188)</p>
     * <p>vtableId(206)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "Oct2Dec", dispId = 0x4188)
    String Oct2Dec(Object Arg1);
            
    /**
     * <p>id(0x4189)</p>
     * <p>vtableId(207)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "Bin2Dec", dispId = 0x4189)
    String Bin2Dec(Object Arg1);
            
    /**
     * <p>id(0x418a)</p>
     * <p>vtableId(208)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Bin2Oct", dispId = 0x418a)
    String Bin2Oct(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x418b)</p>
     * <p>vtableId(209)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Bin2Hex", dispId = 0x418b)
    String Bin2Hex(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x418c)</p>
     * <p>vtableId(210)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "ImSub", dispId = 0x418c)
    String ImSub(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x418d)</p>
     * <p>vtableId(211)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "ImDiv", dispId = 0x418d)
    String ImDiv(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x418e)</p>
     * <p>vtableId(212)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "ImPower", dispId = 0x418e)
    String ImPower(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x418f)</p>
     * <p>vtableId(213)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImAbs", dispId = 0x418f)
    String ImAbs(Object Arg1);
            
    /**
     * <p>id(0x4190)</p>
     * <p>vtableId(214)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImSqrt", dispId = 0x4190)
    String ImSqrt(Object Arg1);
            
    /**
     * <p>id(0x4191)</p>
     * <p>vtableId(215)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImLn", dispId = 0x4191)
    String ImLn(Object Arg1);
            
    /**
     * <p>id(0x4192)</p>
     * <p>vtableId(216)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImLog2", dispId = 0x4192)
    String ImLog2(Object Arg1);
            
    /**
     * <p>id(0x4193)</p>
     * <p>vtableId(217)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImLog10", dispId = 0x4193)
    String ImLog10(Object Arg1);
            
    /**
     * <p>id(0x4194)</p>
     * <p>vtableId(218)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImSin", dispId = 0x4194)
    String ImSin(Object Arg1);
            
    /**
     * <p>id(0x4195)</p>
     * <p>vtableId(219)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImCos", dispId = 0x4195)
    String ImCos(Object Arg1);
            
    /**
     * <p>id(0x4196)</p>
     * <p>vtableId(220)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImExp", dispId = 0x4196)
    String ImExp(Object Arg1);
            
    /**
     * <p>id(0x4197)</p>
     * <p>vtableId(221)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImArgument", dispId = 0x4197)
    String ImArgument(Object Arg1);
            
    /**
     * <p>id(0x4198)</p>
     * <p>vtableId(222)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImConjugate", dispId = 0x4198)
    String ImConjugate(Object Arg1);
            
    /**
     * <p>id(0x4199)</p>
     * <p>vtableId(223)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "Imaginary", dispId = 0x4199)
    Double Imaginary(Object Arg1);
            
    /**
     * <p>id(0x419a)</p>
     * <p>vtableId(224)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImReal", dispId = 0x419a)
    Double ImReal(Object Arg1);
            
    /**
     * <p>id(0x419b)</p>
     * <p>vtableId(225)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "Complex", dispId = 0x419b)
    String Complex(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x419c)</p>
     * <p>vtableId(226)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(227)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(228)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     */
    @ComMethod(name = "SeriesSum", dispId = 0x419e)
    Double SeriesSum(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x419f)</p>
     * <p>vtableId(229)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "FactDouble", dispId = 0x419f)
    Double FactDouble(Object Arg1);
            
    /**
     * <p>id(0x41a0)</p>
     * <p>vtableId(230)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "SqrtPi", dispId = 0x41a0)
    Double SqrtPi(Object Arg1);
            
    /**
     * <p>id(0x41a1)</p>
     * <p>vtableId(231)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "Quotient", dispId = 0x41a1)
    Double Quotient(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41a2)</p>
     * <p>vtableId(232)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Delta", dispId = 0x41a2)
    Double Delta(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41a3)</p>
     * <p>vtableId(233)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "GeStep", dispId = 0x41a3)
    Double GeStep(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41a4)</p>
     * <p>vtableId(234)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "IsEven", dispId = 0x41a4)
    Boolean IsEven(Object Arg1);
            
    /**
     * <p>id(0x41a5)</p>
     * <p>vtableId(235)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "IsOdd", dispId = 0x41a5)
    Boolean IsOdd(Object Arg1);
            
    /**
     * <p>id(0x41a6)</p>
     * <p>vtableId(236)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "MRound", dispId = 0x41a6)
    Double MRound(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41a7)</p>
     * <p>vtableId(237)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Erf", dispId = 0x41a7)
    Double Erf(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41a8)</p>
     * <p>vtableId(238)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ErfC", dispId = 0x41a8)
    Double ErfC(Object Arg1);
            
    /**
     * <p>id(0x41a9)</p>
     * <p>vtableId(239)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "BesselJ", dispId = 0x41a9)
    Double BesselJ(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41aa)</p>
     * <p>vtableId(240)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "BesselK", dispId = 0x41aa)
    Double BesselK(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41ab)</p>
     * <p>vtableId(241)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "BesselY", dispId = 0x41ab)
    Double BesselY(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41ac)</p>
     * <p>vtableId(242)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "BesselI", dispId = 0x41ac)
    Double BesselI(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41ad)</p>
     * <p>vtableId(243)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "Xirr", dispId = 0x41ad)
    Double Xirr(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41ae)</p>
     * <p>vtableId(244)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "Xnpv", dispId = 0x41ae)
    Double Xnpv(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41af)</p>
     * <p>vtableId(245)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
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
     * <p>vtableId(246)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
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
     * <p>vtableId(247)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     */
    @ComMethod(name = "IntRate", dispId = 0x41b1)
    Double IntRate(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x41b2)</p>
     * <p>vtableId(248)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     */
    @ComMethod(name = "Received", dispId = 0x41b2)
    Double Received(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x41b3)</p>
     * <p>vtableId(249)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     */
    @ComMethod(name = "Disc", dispId = 0x41b3)
    Double Disc(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x41b4)</p>
     * <p>vtableId(250)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     */
    @ComMethod(name = "PriceDisc", dispId = 0x41b4)
    Double PriceDisc(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x41b5)</p>
     * <p>vtableId(251)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     */
    @ComMethod(name = "YieldDisc", dispId = 0x41b5)
    Double YieldDisc(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x41b6)</p>
     * <p>vtableId(252)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "TBillEq", dispId = 0x41b6)
    Double TBillEq(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41b7)</p>
     * <p>vtableId(253)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "TBillPrice", dispId = 0x41b7)
    Double TBillPrice(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41b8)</p>
     * <p>vtableId(254)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "TBillYield", dispId = 0x41b8)
    Double TBillYield(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41b9)</p>
     * <p>vtableId(255)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in] {@code Object}
     * @param Arg6 [in] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
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
     * <p>vtableId(256)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "DollarDe", dispId = 0x41bb)
    Double DollarDe(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41bc)</p>
     * <p>vtableId(257)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "DollarFr", dispId = 0x41bc)
    Double DollarFr(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41bd)</p>
     * <p>vtableId(258)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "Nominal", dispId = 0x41bd)
    Double Nominal(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41be)</p>
     * <p>vtableId(259)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "Effect", dispId = 0x41be)
    Double Effect(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41bf)</p>
     * <p>vtableId(260)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in] {@code Object}
     * @param Arg6 [in] {@code Object}
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
     * <p>vtableId(261)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in] {@code Object}
     * @param Arg6 [in] {@code Object}
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
     * <p>vtableId(262)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "EDate", dispId = 0x41c1)
    Double EDate(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41c2)</p>
     * <p>vtableId(263)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "EoMonth", dispId = 0x41c2)
    Double EoMonth(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41c3)</p>
     * <p>vtableId(264)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "YearFrac", dispId = 0x41c3)
    Double YearFrac(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41c4)</p>
     * <p>vtableId(265)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "CoupDayBs", dispId = 0x41c4)
    Double CoupDayBs(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x41c5)</p>
     * <p>vtableId(266)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "CoupDays", dispId = 0x41c5)
    Double CoupDays(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x41c6)</p>
     * <p>vtableId(267)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "CoupDaysNc", dispId = 0x41c6)
    Double CoupDaysNc(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x41c7)</p>
     * <p>vtableId(268)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "CoupNcd", dispId = 0x41c7)
    Double CoupNcd(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x41c8)</p>
     * <p>vtableId(269)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "CoupNum", dispId = 0x41c8)
    Double CoupNum(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x41c9)</p>
     * <p>vtableId(270)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "CoupPcd", dispId = 0x41c9)
    Double CoupPcd(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x41ca)</p>
     * <p>vtableId(271)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
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
     * <p>vtableId(272)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
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
     * <p>vtableId(273)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in] {@code Object}
     * @param Arg6 [in] {@code Object}
     * @param Arg7 [in] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
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
     * <p>vtableId(274)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in] {@code Object}
     * @param Arg6 [in] {@code Object}
     * @param Arg7 [in] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
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
     * <p>vtableId(275)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in] {@code Object}
     * @param Arg6 [in] {@code Object}
     * @param Arg7 [in] {@code Object}
     * @param Arg8 [in] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
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
     * <p>vtableId(276)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in] {@code Object}
     * @param Arg6 [in] {@code Object}
     * @param Arg7 [in] {@code Object}
     * @param Arg8 [in] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
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
     * <p>vtableId(277)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "RandBetween", dispId = 0x41d0)
    Double RandBetween(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41d1)</p>
     * <p>vtableId(278)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "WeekNum", dispId = 0x41d1)
    Double WeekNum(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41d2)</p>
     * <p>vtableId(279)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in] {@code Object}
     * @param Arg6 [in] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
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
     * <p>vtableId(280)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in] {@code Object}
     * @param Arg6 [in] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
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
     * <p>vtableId(281)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     */
    @ComMethod(name = "Convert", dispId = 0x41d4)
    Double Convert(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41d5)</p>
     * <p>vtableId(282)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in] {@code Object}
     * @param Arg6 [in] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
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
     * <p>vtableId(283)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     */
    @ComMethod(name = "AccrIntM", dispId = 0x41d6)
    Double AccrIntM(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x41d7)</p>
     * <p>vtableId(284)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "WorkDay", dispId = 0x41d7)
    Double WorkDay(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41d8)</p>
     * <p>vtableId(285)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "NetworkDays", dispId = 0x41d8)
    Double NetworkDays(Object Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41d9)</p>
     * <p>vtableId(286)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(287)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(288)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(289)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "FVSchedule", dispId = 0x41dc)
    Double FVSchedule(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41e2)</p>
     * <p>vtableId(290)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Range}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
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
     * <p>vtableId(291)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(292)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "AverageIf", dispId = 0x41e3)
    Double AverageIf(Range Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41e4)</p>
     * <p>vtableId(293)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Range}
     * @param Arg3 [in] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
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
     * <p>vtableId(294)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "IfError", dispId = 0x41e0)
    Object IfError(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41e5)</p>
     * <p>vtableId(295)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Range}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(296)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "Confidence_Norm", dispId = 0x41e8)
    Double Confidence_Norm(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x41e9)</p>
     * <p>vtableId(297)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "Confidence_T", dispId = 0x41e9)
    Double Confidence_T(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x41ea)</p>
     * <p>vtableId(298)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "ChiSq_Test", dispId = 0x41ea)
    Double ChiSq_Test(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41eb)</p>
     * <p>vtableId(299)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "F_Test", dispId = 0x41eb)
    Double F_Test(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41ec)</p>
     * <p>vtableId(300)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "Covariance_P", dispId = 0x41ec)
    Double Covariance_P(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41ed)</p>
     * <p>vtableId(301)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "Covariance_S", dispId = 0x41ed)
    Double Covariance_S(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x41ee)</p>
     * <p>vtableId(302)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Boolean}
     */
    @ComMethod(name = "Expon_Dist", dispId = 0x41ee)
    Double Expon_Dist(Double Arg1,
            Double Arg2,
            Boolean Arg3);
            
    /**
     * <p>id(0x41ef)</p>
     * <p>vtableId(303)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Boolean}
     */
    @ComMethod(name = "Gamma_Dist", dispId = 0x41ef)
    Double Gamma_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x41f0)</p>
     * <p>vtableId(304)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "Gamma_Inv", dispId = 0x41f0)
    Double Gamma_Inv(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x41f1)</p>
     * <p>vtableId(305)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(306)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(307)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Boolean}
     */
    @ComMethod(name = "Norm_Dist", dispId = 0x41f3)
    Double Norm_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x41f4)</p>
     * <p>vtableId(308)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "Norm_Inv", dispId = 0x41f4)
    Double Norm_Inv(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x41f5)</p>
     * <p>vtableId(309)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Percentile_Exc", dispId = 0x41f5)
    Double Percentile_Exc(Object Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x41f6)</p>
     * <p>vtableId(310)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Percentile_Inc", dispId = 0x41f6)
    Double Percentile_Inc(Object Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x41f7)</p>
     * <p>vtableId(311)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "PercentRank_Exc", dispId = 0x41f7)
    Double PercentRank_Exc(Object Arg1,
            Double Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41f8)</p>
     * <p>vtableId(312)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "PercentRank_Inc", dispId = 0x41f8)
    Double PercentRank_Inc(Object Arg1,
            Double Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41f9)</p>
     * <p>vtableId(313)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Boolean}
     */
    @ComMethod(name = "Poisson_Dist", dispId = 0x41f9)
    Double Poisson_Dist(Double Arg1,
            Double Arg2,
            Boolean Arg3);
            
    /**
     * <p>id(0x41fa)</p>
     * <p>vtableId(314)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Quartile_Exc", dispId = 0x41fa)
    Double Quartile_Exc(Object Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x41fb)</p>
     * <p>vtableId(315)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Quartile_Inc", dispId = 0x41fb)
    Double Quartile_Inc(Object Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x41fc)</p>
     * <p>vtableId(316)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Range}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "Rank_Avg", dispId = 0x41fc)
    Double Rank_Avg(Double Arg1,
            Range Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41fd)</p>
     * <p>vtableId(317)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Range}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "Rank_Eq", dispId = 0x41fd)
    Double Rank_Eq(Double Arg1,
            Range Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41fe)</p>
     * <p>vtableId(318)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(319)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(320)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Boolean}
     */
    @ComMethod(name = "T_Dist", dispId = 0x4200)
    Double T_Dist(Double Arg1,
            Double Arg2,
            Boolean Arg3);
            
    /**
     * <p>id(0x4201)</p>
     * <p>vtableId(321)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "T_Dist_2T", dispId = 0x4201)
    Double T_Dist_2T(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4202)</p>
     * <p>vtableId(322)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "T_Dist_RT", dispId = 0x4202)
    Double T_Dist_RT(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4203)</p>
     * <p>vtableId(323)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "T_Inv", dispId = 0x4203)
    Double T_Inv(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4204)</p>
     * <p>vtableId(324)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "T_Inv_2T", dispId = 0x4204)
    Double T_Inv_2T(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4205)</p>
     * <p>vtableId(325)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(326)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(327)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Boolean}
     */
    @ComMethod(name = "Weibull_Dist", dispId = 0x4207)
    Double Weibull_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x4208)</p>
     * <p>vtableId(328)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "NetworkDays_Intl", dispId = 0x4208)
    Double NetworkDays_Intl(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x4209)</p>
     * <p>vtableId(329)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "WorkDay_Intl", dispId = 0x4209)
    Double WorkDay_Intl(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x420b)</p>
     * <p>vtableId(330)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "ISO_Ceiling", dispId = 0x420b)
    Double ISO_Ceiling(Double Arg1,
            Object Arg2);
            
    /**
     * <p>id(0xb0a)</p>
     * <p>vtableId(331)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Dummy21", dispId = 0xb0a)
    Double Dummy21(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0xb0b)</p>
     * <p>vtableId(332)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(333)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Boolean}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
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
     * <p>vtableId(334)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     */
    @ComMethod(name = "Beta_Inv", dispId = 0x420e)
    Double Beta_Inv(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4,
            Object Arg5);
            
    /**
     * <p>id(0x420f)</p>
     * <p>vtableId(335)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Boolean}
     */
    @ComMethod(name = "ChiSq_Dist", dispId = 0x420f)
    Double ChiSq_Dist(Double Arg1,
            Double Arg2,
            Boolean Arg3);
            
    /**
     * <p>id(0x4210)</p>
     * <p>vtableId(336)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "ChiSq_Dist_RT", dispId = 0x4210)
    Double ChiSq_Dist_RT(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4211)</p>
     * <p>vtableId(337)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "ChiSq_Inv", dispId = 0x4211)
    Double ChiSq_Inv(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4212)</p>
     * <p>vtableId(338)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "ChiSq_Inv_RT", dispId = 0x4212)
    Double ChiSq_Inv_RT(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4213)</p>
     * <p>vtableId(339)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Boolean}
     */
    @ComMethod(name = "F_Dist", dispId = 0x4213)
    Double F_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x4214)</p>
     * <p>vtableId(340)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "F_Dist_RT", dispId = 0x4214)
    Double F_Dist_RT(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4215)</p>
     * <p>vtableId(341)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "F_Inv", dispId = 0x4215)
    Double F_Inv(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4216)</p>
     * <p>vtableId(342)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "F_Inv_RT", dispId = 0x4216)
    Double F_Inv_RT(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4217)</p>
     * <p>vtableId(343)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Double}
     * @param Arg5 [in] {@code Boolean}
     */
    @ComMethod(name = "HypGeom_Dist", dispId = 0x4217)
    Double HypGeom_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Double Arg4,
            Boolean Arg5);
            
    /**
     * <p>id(0x4218)</p>
     * <p>vtableId(344)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Boolean}
     */
    @ComMethod(name = "LogNorm_Dist", dispId = 0x4218)
    Double LogNorm_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x4219)</p>
     * <p>vtableId(345)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "LogNorm_Inv", dispId = 0x4219)
    Double LogNorm_Inv(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x421a)</p>
     * <p>vtableId(346)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Boolean}
     */
    @ComMethod(name = "NegBinom_Dist", dispId = 0x421a)
    Double NegBinom_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x421b)</p>
     * <p>vtableId(347)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Boolean}
     */
    @ComMethod(name = "Norm_S_Dist", dispId = 0x421b)
    Double Norm_S_Dist(Double Arg1,
            Boolean Arg2);
            
    /**
     * <p>id(0x421c)</p>
     * <p>vtableId(348)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Norm_S_Inv", dispId = 0x421c)
    Double Norm_S_Inv(Double Arg1);
            
    /**
     * <p>id(0x421d)</p>
     * <p>vtableId(349)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Double}
     */
    @ComMethod(name = "T_Test", dispId = 0x421d)
    Double T_Test(Object Arg1,
            Object Arg2,
            Double Arg3,
            Double Arg4);
            
    /**
     * <p>id(0x421e)</p>
     * <p>vtableId(350)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "Z_Test", dispId = 0x421e)
    Double Z_Test(Object Arg1,
            Double Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x41e6)</p>
     * <p>vtableId(351)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in] {@code Boolean}
     */
    @ComMethod(name = "Binom_Dist", dispId = 0x41e6)
    Double Binom_Dist(Double Arg1,
            Double Arg2,
            Double Arg3,
            Boolean Arg4);
            
    /**
     * <p>id(0x41e7)</p>
     * <p>vtableId(352)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "Binom_Inv", dispId = 0x41e7)
    Double Binom_Inv(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x421f)</p>
     * <p>vtableId(353)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "Erf_Precise", dispId = 0x421f)
    Double Erf_Precise(Object Arg1);
            
    /**
     * <p>id(0x4220)</p>
     * <p>vtableId(354)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ErfC_Precise", dispId = 0x4220)
    Double ErfC_Precise(Object Arg1);
            
    /**
     * <p>id(0x4221)</p>
     * <p>vtableId(355)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "GammaLn_Precise", dispId = 0x4221)
    Double GammaLn_Precise(Double Arg1);
            
    /**
     * <p>id(0x4222)</p>
     * <p>vtableId(356)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Ceiling_Precise", dispId = 0x4222)
    Double Ceiling_Precise(Double Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4223)</p>
     * <p>vtableId(357)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Floor_Precise", dispId = 0x4223)
    Double Floor_Precise(Double Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4224)</p>
     * <p>vtableId(358)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Acot", dispId = 0x4224)
    Double Acot(Double Arg1);
            
    /**
     * <p>id(0x4225)</p>
     * <p>vtableId(359)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Acoth", dispId = 0x4225)
    Double Acoth(Double Arg1);
            
    /**
     * <p>id(0x4226)</p>
     * <p>vtableId(360)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Cot", dispId = 0x4226)
    Double Cot(Double Arg1);
            
    /**
     * <p>id(0x4227)</p>
     * <p>vtableId(361)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Coth", dispId = 0x4227)
    Double Coth(Double Arg1);
            
    /**
     * <p>id(0x4228)</p>
     * <p>vtableId(362)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Csc", dispId = 0x4228)
    Double Csc(Double Arg1);
            
    /**
     * <p>id(0x4229)</p>
     * <p>vtableId(363)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Csch", dispId = 0x4229)
    Double Csch(Double Arg1);
            
    /**
     * <p>id(0x422a)</p>
     * <p>vtableId(364)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Sec", dispId = 0x422a)
    Double Sec(Double Arg1);
            
    /**
     * <p>id(0x422b)</p>
     * <p>vtableId(365)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Sech", dispId = 0x422b)
    Double Sech(Double Arg1);
            
    /**
     * <p>id(0x422d)</p>
     * <p>vtableId(366)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImCot", dispId = 0x422d)
    String ImCot(Object Arg1);
            
    /**
     * <p>id(0x422c)</p>
     * <p>vtableId(367)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImTan", dispId = 0x422c)
    String ImTan(Object Arg1);
            
    /**
     * <p>id(0x422e)</p>
     * <p>vtableId(368)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImCsc", dispId = 0x422e)
    String ImCsc(Object Arg1);
            
    /**
     * <p>id(0x422f)</p>
     * <p>vtableId(369)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImCsch", dispId = 0x422f)
    String ImCsch(Object Arg1);
            
    /**
     * <p>id(0x4230)</p>
     * <p>vtableId(370)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImSec", dispId = 0x4230)
    String ImSec(Object Arg1);
            
    /**
     * <p>id(0x4231)</p>
     * <p>vtableId(371)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImSech", dispId = 0x4231)
    String ImSech(Object Arg1);
            
    /**
     * <p>id(0x4232)</p>
     * <p>vtableId(372)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Bitand", dispId = 0x4232)
    Double Bitand(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4233)</p>
     * <p>vtableId(373)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Bitor", dispId = 0x4233)
    Double Bitor(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4234)</p>
     * <p>vtableId(374)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Bitxor", dispId = 0x4234)
    Double Bitxor(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4235)</p>
     * <p>vtableId(375)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Bitlshift", dispId = 0x4235)
    Double Bitlshift(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4236)</p>
     * <p>vtableId(376)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Bitrshift", dispId = 0x4236)
    Double Bitrshift(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4239)</p>
     * <p>vtableId(377)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(378)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Combina", dispId = 0x4238)
    Double Combina(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x4237)</p>
     * <p>vtableId(379)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Permutationa", dispId = 0x4237)
    Double Permutationa(Double Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x423a)</p>
     * <p>vtableId(380)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "PDuration", dispId = 0x423a)
    Double PDuration(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x423b)</p>
     * <p>vtableId(381)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "Base", dispId = 0x423b)
    String Base(Double Arg1,
            Double Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x423c)</p>
     * <p>vtableId(382)</p>
     * @param Arg1 [in] {@code String}
     * @param Arg2 [in] {@code Double}
     */
    @ComMethod(name = "Decimal", dispId = 0x423c)
    Double Decimal(String Arg1,
            Double Arg2);
            
    /**
     * <p>id(0x423d)</p>
     * <p>vtableId(383)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "Days", dispId = 0x423d)
    Double Days(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x423e)</p>
     * <p>vtableId(384)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "Binom_Dist_Range", dispId = 0x423e)
    Double Binom_Dist_Range(Double Arg1,
            Double Arg2,
            Double Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x423f)</p>
     * <p>vtableId(385)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Gamma", dispId = 0x423f)
    Double Gamma(Double Arg1);
            
    /**
     * <p>id(0x4241)</p>
     * <p>vtableId(386)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Gauss", dispId = 0x4241)
    Double Gauss(Double Arg1);
            
    /**
     * <p>id(0x4242)</p>
     * <p>vtableId(387)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Phi", dispId = 0x4242)
    Double Phi(Double Arg1);
            
    /**
     * <p>id(0x4240)</p>
     * <p>vtableId(388)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(389)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in] {@code Double}
     * @param Arg3 [in] {@code Double}
     */
    @ComMethod(name = "Rri", dispId = 0x4243)
    Double Rri(Double Arg1,
            Double Arg2,
            Double Arg3);
            
    /**
     * <p>id(0x4244)</p>
     * <p>vtableId(390)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Unichar", dispId = 0x4244)
    String Unichar(Double Arg1);
            
    /**
     * <p>id(0x4245)</p>
     * <p>vtableId(391)</p>
     * @param Arg1 [in] {@code String}
     */
    @ComMethod(name = "Unicode", dispId = 0x4245)
    Double Unicode(String Arg1);
            
    /**
     * <p>id(0x4246)</p>
     * <p>vtableId(392)</p>
     * @param Arg1 [in] {@code Double}
     */
    @ComMethod(name = "Munit", dispId = 0x4246)
    Object Munit(Double Arg1);
            
    /**
     * <p>id(0x4247)</p>
     * <p>vtableId(393)</p>
     * @param Arg1 [in] {@code String}
     */
    @ComMethod(name = "Arabic", dispId = 0x4247)
    Double Arabic(String Arg1);
            
    /**
     * <p>id(0x4248)</p>
     * <p>vtableId(394)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in, optional] {@code Object}
     */
    @ComMethod(name = "IsoWeekNum", dispId = 0x4248)
    Double IsoWeekNum(Double Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x4249)</p>
     * <p>vtableId(395)</p>
     * @param Arg1 [in] {@code String}
     * @param Arg2 [in] {@code String}
     * @param Arg3 [in] {@code String}
     */
    @ComMethod(name = "NumberValue", dispId = 0x4249)
    Double NumberValue(String Arg1,
            String Arg2,
            String Arg3);
            
    /**
     * <p>id(0x424d)</p>
     * <p>vtableId(396)</p>
     * @param Arg1 [in] {@code Range}
     */
    @ComMethod(name = "IsFormula", dispId = 0x424d)
    Boolean IsFormula(Range Arg1);
            
    /**
     * <p>id(0x424e)</p>
     * <p>vtableId(397)</p>
     * @param Arg1 [in] {@code Object}
     * @param Arg2 [in] {@code Object}
     */
    @ComMethod(name = "IfNa", dispId = 0x424e)
    Object IfNa(Object Arg1,
            Object Arg2);
            
    /**
     * <p>id(0x424f)</p>
     * <p>vtableId(398)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "Ceiling_Math", dispId = 0x424f)
    Double Ceiling_Math(Double Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x4250)</p>
     * <p>vtableId(399)</p>
     * @param Arg1 [in] {@code Double}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     */
    @ComMethod(name = "Floor_Math", dispId = 0x4250)
    Double Floor_Math(Double Arg1,
            Object Arg2,
            Object Arg3);
            
    /**
     * <p>id(0x4251)</p>
     * <p>vtableId(400)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImSinh", dispId = 0x4251)
    String ImSinh(Object Arg1);
            
    /**
     * <p>id(0x4252)</p>
     * <p>vtableId(401)</p>
     * @param Arg1 [in] {@code Object}
     */
    @ComMethod(name = "ImCosh", dispId = 0x4252)
    String ImCosh(Object Arg1);
            
    /**
     * <p>id(0x4253)</p>
     * <p>vtableId(402)</p>
     * @param Arg1 [in] {@code String}
     * @param Arg2 [in] {@code String}
     */
    @ComMethod(name = "FilterXML", dispId = 0x4253)
    Object FilterXML(String Arg1,
            String Arg2);
            
    /**
     * <p>id(0x4254)</p>
     * <p>vtableId(403)</p>
     * @param Arg1 [in] {@code String}
     */
    @ComMethod(name = "WebService", dispId = 0x4254)
    Object WebService(String Arg1);
            
    /**
     * <p>id(0x4255)</p>
     * <p>vtableId(404)</p>
     * @param Arg1 [in] {@code String}
     */
    @ComMethod(name = "EncodeURL", dispId = 0x4255)
    Object EncodeURL(String Arg1);
            
    
}