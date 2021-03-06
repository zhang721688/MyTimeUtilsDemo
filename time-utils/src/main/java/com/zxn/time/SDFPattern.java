package com.zxn.time;

/**
 * 格式采用后缀的方式.
 * 24小时制时间格式,SDFPattern(SDFPattern12)
 * Created by zxn on 2019/2/28.
 */
public interface SDFPattern {

    //SDF_(SP(sprit)-->"/"),(R(rod)-->"-"),(C(colon)-->":"),(Y(year)-->"年"),(M(month)-->"月"),(D(day)-->"日"),(P(point)-->".")

    /**
     * 20190403105532000
     * 类型为24小时制日期格式:yyyyMMddHHmmssSSS.
     */
    String yyyyMMddHHmmssSSS_SDF = "yyyyMMddHHmmssSSS";

    /**
     * 年份保留后两位.
     * 190614154817735
     * 类型为24小时制日期格式:yyMMddHHmmssSSS.
     */
    String yyMMddHHmmssSSS_SDF = "yyMMddHHmmssSSS";

    /**
     * 20190403105532
     * 类型为24小时制日期格式:yyyyMMddHHmmss.
     */
    String yyyyMMddHHmmss_SDF = "yyyyMMddHHmmss";

    /**
     * 类型为24小时制日期格式:yyyyMMddHHmm.
     */
    String yyyyMMddHHmm_SDF = "yyyyMMddHHmm";

    /**
     * 20190523.
     * 类型为24小时制日期格式:yyyyMMdd.
     */
    String yyyyMMdd_SDF = "yyyyMMdd";

    /**
     * 194800
     * 类型为24小时制日期格式:HHmmss.
     */
    String HHmmss_SDF = "HHmmss";

    /**
     * 1948
     * 类型为24小时制日期格式:HHmm.
     */
    String HHmm_SDF = "HHmm";

    /**
     * 2019/04/03
     * 类型为24小时制日期格式:yyyy/MM/dd.
     */
    String yyyyMMdd_SDF_SPSP = "yyyy/MM/dd";

    /**
     * 类型为24小时制日期格式:yyyy/MM/dd HH:mm:ss.
     */
    String yyyyMMddHHmmSS_SDF_SPSPCC = "yyyy/MM/dd HH:mm:ss";

    /**
     * 类型为24小时制日期格式:yyyy-MM-dd HH:mm:ss.
     */
    String yyyyMMddHHmmSS_SDF_RRCC = "yyyy-MM-dd HH:mm:ss";

    /**
     * 类型为24小时制日期格式:yyyy-MM-dd HH:mm.
     */
    String yyyyMMddHHmm_SDF_RRC = "yyyy-MM-dd HH:mm";

    /**
     * 类型为24小时制日期格式:yyyy-MM-dd HH.
     */
    String yyyyMMddHH_SDF_RR = "yyyy-MM-dd HH";


    /**
     * 类型为24小时制日期格式:yyyy-MM-dd.
     */
    String yyyyMMdd_SDF_RR = "yyyy-MM-dd";

    /**
     * 类型为24小时制日期格式:yyyy-MM.
     */
    String yyyyMM_SDF_R = "yyyy-MM";


    /**
     * 类型为24小时制日期格式:
     */
    String MMddHHmmSS_SDF_RCC = "MM-dd HH:mm:ss";

    /**
     * 类型为24小时制日期格式:MM-dd HH:mm.
     */
    String MMddHHmm_SDF_RC = "MM-dd HH:mm";

    /**
     * 类型为24小时制日期格式:MM-dd.
     */
    String MMdd_SDF_R = "MM-dd";


    /**
     * 类型为24小时制日期格式:HH:mm:ss.
     */
    String HHmmSS_SDF_CC = "HH:mm:ss";

    /**
     * 类型为24小时制日期格式:MM.dd.
     */
    String MMdd_SDF_P = "MM.dd";

    /**
     * 类型为24小时制日期格式:M.d.
     */
    String Md_SDF_P = "M.d";

    /**
     * 类型为24小时制日期格式:yyyy.MM.dd.
     */
    String yyyyMMdd_SDF_PP = "yyyy.MM.dd";

    /**
     * 类型为24小时制日期格式:yyyy.MM.dd HH:mm.
     */
    String yyyyMMddHHmm_SDF_PPC = "yyyy.MM.dd HH:mm";

    /**
     * 类型为24小时制日期格式:yyyy.MM.dd HH:mm:ss.
     */
    String yyyyMMddHHCmmCss_SDF_PPCC= "yyyy.MM.dd HH:mm:ss";


    /**
     * 类型为24小时制日期格式:HH:mm.
     */
    String HHmm_SDF_C = "HH:mm";


    /**
     * 类型为24小时制日期格式:yyyy年MM月dd日 HH:mm:ss.
     */
    String yyyyMMddHHmmSS_SDF_YMDCC = "yyyy年MM月dd日 HH:mm:ss";


    /**
     * 类型为24小时制日期格式:yyyy年M月d日 HH:mm:ss
     */
    String yyyyMdHHmmSS_SDF_YMDCC = "yyyy年M月d日 HH:mm:ss";


    /**
     * 类型为24小时制日期格式:yyyy年M月d日 HH:mm
     */
    String yyyyMdHHmm_SDF_YMDC = "yyyy年M月d日 HH:mm";


    /**
     * 类型为24小时制日期格式:yyyy年MM月dd日
     */
    String yyyyMMdd_SDF_YMD = "yyyy年MM月dd日";


    /**
     * 类型为24小时制日期格式:yyyy年M月d日
     */
    String yyyyMd_SDF_YMD = "yyyy年M月d日";

    /**
     * 类型为24小时制日期格式:yyyy年M月
     */
    String yyyyM_SDF_YM = "yyyy年M月";

    /**
     * 类型为24小时制日期格式:yyyy年
     */
    String yyyy_SDF_Y = "yyyy年";

    /**
     * 类型为24小时制日期格式:MM月dd日
     */
    String MMdd_SDF_MD = "MM月dd日";

    /**
     * 类型为24小时制日期格式:M月d日
     */
    String Md_SDF_MD = "M月d日";

    /**
     * 类型为24小时制日期格式:M月
     */
    String M_SDF_M = "M月";


    /**
     * 类型为24小时制日期格式:yyyy年MM月dd日 HH:mm:ss.---C(:)
     */
    String MMddHHmmSS_SDF_MDCC = "MM月dd日 HH:mm:ss";


    /**
     * 类型为24小时制日期格式:M月d日 HH:mm:ss
     */
    String MdHHmmSS_SDF_MDCC = "M月d日 HH:mm:ss";


    /**
     * 类型为24小时制日期格式:M月d日 HH:mm
     */
    String MdHHmm_SDF_MDC = "M月d日 HH:mm";

}
