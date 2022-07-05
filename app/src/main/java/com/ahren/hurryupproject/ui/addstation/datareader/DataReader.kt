package com.ahren.hurryupproject.ui.addstation.datareader

import com.ahren.hurryupproject.ui.addstation.bean.LineListBindingData
import com.ahren.hurryupproject.ui.addstation.bean.StationListBindingData
import com.ahren.hurryupproject.ui.addstation.helper.PatternHelper

object DataReader {

    fun getAllLineMapData(): Map<String, LineListBindingData> {
        return mapOf(
            "line1" to LineListBindingData("line1", "一号线", PatternHelper.getLineColor("line1")),
            "line2" to LineListBindingData("line2", "二号线", PatternHelper.getLineColor("line2")),
            "line3" to LineListBindingData("line3", "三号线", PatternHelper.getLineColor("line3")),
            "line4" to LineListBindingData("line4", "四号线", PatternHelper.getLineColor("line4")),
            "line5" to LineListBindingData("line5", "五号线", PatternHelper.getLineColor("line5")),
            "line6" to LineListBindingData("line6", "六号线", PatternHelper.getLineColor("line6")),
            "line7" to LineListBindingData("line7", "七号线", PatternHelper.getLineColor("line7")),
            "line8" to LineListBindingData("line8", "八号线", PatternHelper.getLineColor("line8")),
            "line9" to LineListBindingData("line9", "九号线", PatternHelper.getLineColor("line9")),
            "line10" to LineListBindingData("line10", "十号线", PatternHelper.getLineColor("line10")),
            "line11" to LineListBindingData("line11", "十一号线", PatternHelper.getLineColor("line11")),
            "line12" to LineListBindingData("line12", "十二号线", PatternHelper.getLineColor("line12")),
            "line16" to LineListBindingData("line16", "十六号线", PatternHelper.getLineColor("line16")),
        )

    }

    fun getAllStationMapData(): Map<String, Map<String, StationListBindingData>> {

        return mapOf(
            "line1" to mapOf(
                "shenzhuang50" to StationListBindingData(
                    "shenzhuang50",
                    "莘庄",
                    "line1",
                    121.384999,
                    31.110924,
                    PatternHelper.getLineColor("line1")
                ),
                "waihuanlu70" to StationListBindingData(
                    "waihuanlu70",
                    "外环路",
                    "line1",
                    121.393221,
                    31.121183,
                    PatternHelper.getLineColor("line1")
                ),
                "lianhualu90" to StationListBindingData(
                    "lianhualu90",
                    "莲花路",
                    "line1",
                    121.402798,
                    31.13083,
                    PatternHelper.getLineColor("line1")
                ),
                "jinjiangleyuan110" to StationListBindingData(
                    "jinjiangleyuan110",
                    "锦江乐园",
                    "line1",
                    121.414203,
                    31.142223,
                    PatternHelper.getLineColor("line1")
                ),
                "shanghainanzhan130" to StationListBindingData(
                    "shanghainanzhan130",
                    "上海南站",
                    "line1",
                    121.430313,
                    31.154062,
                    PatternHelper.getLineColor("line1")
                ),
                "caobaolu150" to StationListBindingData(
                    "caobaolu150",
                    "漕宝路",
                    "line1",
                    121.435039,
                    31.168308,
                    PatternHelper.getLineColor("line1")
                ),
                "shanghaitiyuguan170" to StationListBindingData(
                    "shanghaitiyuguan170",
                    "上海体育馆",
                    "line1",
                    121.437,
                    31.182469,
                    PatternHelper.getLineColor("line1")
                ),
                "xujiahui190" to StationListBindingData(
                    "xujiahui190",
                    "徐家汇",
                    "line1",
                    121.436761,
                    31.194523,
                    PatternHelper.getLineColor("line1")
                ),
                "hengshanlu210" to StationListBindingData(
                    "hengshanlu210",
                    "衡山路",
                    "line1",
                    121.446745,
                    31.204982,
                    PatternHelper.getLineColor("line1")
                ),
                "changshulu230" to StationListBindingData(
                    "changshulu230",
                    "常熟路",
                    "line1",
                    121.450182,
                    31.213704,
                    PatternHelper.getLineColor("line1")
                ),
                "shanxinanlu250" to StationListBindingData(
                    "shanxinanlu250",
                    "陕西南路",
                    "line1",
                    121.458835,
                    31.215839,
                    PatternHelper.getLineColor("line1")
                ),
                "huangbeinanlu270" to StationListBindingData(
                    "huangbeinanlu270",
                    "黄陂南路",
                    "line1",
                    121.47326,
                    31.222842,
                    PatternHelper.getLineColor("line1")
                ),
                "renminguangchang290" to StationListBindingData(
                    "renminguangchang290",
                    "人民广场",
                    "line1",
                    121.474496,
                    31.232892,
                    PatternHelper.getLineColor("line1")
                ),
                "xinzhalu310" to StationListBindingData(
                    "xinzhalu310",
                    "新闸路",
                    "line1",
                    121.468316,
                    31.238599,
                    PatternHelper.getLineColor("line1")
                ),
                "hanzhonglu330" to StationListBindingData(
                    "hanzhonglu330",
                    "汉中路",
                    "line1",
                    121.458756,
                    31.241062,
                    PatternHelper.getLineColor("line1")
                ),
                "shanghaihuochezhan350" to StationListBindingData(
                    "shanghaihuochezhan350",
                    "上海火车站",
                    "line1",
                    121.457529,
                    31.248895,
                    PatternHelper.getLineColor("line1")
                ),
                "zhongshanbeilu370" to StationListBindingData(
                    "zhongshanbeilu370",
                    "中山北路",
                    "line1",
                    121.459153,
                    31.259183,
                    PatternHelper.getLineColor("line1")
                ),
                "yanchanglu390" to StationListBindingData(
                    "yanchanglu390",
                    "延长路",
                    "line1",
                    121.455478,
                    31.271806,
                    PatternHelper.getLineColor("line1")
                ),
                "shanghaimaxicheng410" to StationListBindingData(
                    "shanghaimaxicheng410",
                    "上海马戏城",
                    "line1",
                    121.452091,
                    31.279592,
                    PatternHelper.getLineColor("line1")
                ),
                "wenshuilu430" to StationListBindingData(
                    "wenshuilu430",
                    "汶水路",
                    "line1",
                    121.450145,
                    31.292563,
                    PatternHelper.getLineColor("line1")
                ),
                "pengpuxincun450" to StationListBindingData(
                    "pengpuxincun450",
                    "彭浦新村",
                    "line1",
                    121.448675,
                    31.30669,
                    PatternHelper.getLineColor("line1")
                ),
                "gongkanglu470" to StationListBindingData(
                    "gongkanglu470",
                    "共康路",
                    "line1",
                    121.447044,
                    31.319004,
                    PatternHelper.getLineColor("line1")
                ),
                "tonghexincun490" to StationListBindingData(
                    "tonghexincun490",
                    "通河新村",
                    "line1",
                    121.441394,
                    31.331446,
                    PatternHelper.getLineColor("line1")
                ),
                "hulanlu510" to StationListBindingData(
                    "hulanlu510",
                    "呼兰路",
                    "line1",
                    121.437755,
                    31.339638,
                    PatternHelper.getLineColor("line1")
                ),
                "gongfuxincun530" to StationListBindingData(
                    "gongfuxincun530",
                    "共富新村",
                    "line1",
                    121.434029,
                    31.355205,
                    PatternHelper.getLineColor("line1")
                ),
                "baoangonglu550" to StationListBindingData(
                    "baoangonglu550",
                    "宝安公路",
                    "line1",
                    121.430942,
                    31.369858,
                    PatternHelper.getLineColor("line1")
                ),
                "youyixilu570" to StationListBindingData(
                    "youyixilu570",
                    "友谊西路",
                    "line1",
                    121.427904,
                    31.381487,
                    PatternHelper.getLineColor("line1")
                ),
                "fujinlu590" to StationListBindingData(
                    "fujinlu590",
                    "富锦路",
                    "line1",
                    121.424605,
                    31.392434,
                    PatternHelper.getLineColor("line1")
                ),
            ), "line2" to mapOf(
                "panxianglu630" to StationListBindingData(
                    "panxianglu630",
                    "蟠祥路",
                    "line2",
                    121.287489,
                    31.181994,
                    PatternHelper.getLineColor("line2")
                ),
                "xujingdong650" to StationListBindingData(
                    "xujingdong650",
                    "徐泾东",
                    "line2",
                    121.301074,
                    31.189171,
                    PatternHelper.getLineColor("line2")
                ),
                "hongqiaohuochezhan670" to StationListBindingData(
                    "hongqiaohuochezhan670",
                    "虹桥火车站",
                    "line2",
                    121.321479,
                    31.193949,
                    PatternHelper.getLineColor("line2")
                ),
                "hongqiao2haohangzhanlou690" to StationListBindingData(
                    "hongqiao2haohangzhanlou690",
                    "虹桥2号航站楼",
                    "line2",
                    121.326846,
                    31.194193,
                    PatternHelper.getLineColor("line2")
                ),
                "songhonglu710" to StationListBindingData(
                    "songhonglu710",
                    "淞虹路",
                    "line2",
                    121.359199,
                    31.218234,
                    PatternHelper.getLineColor("line2")
                ),
                "beixinjing730" to StationListBindingData(
                    "beixinjing730",
                    "北新泾",
                    "line2",
                    121.374017,
                    31.216442,
                    PatternHelper.getLineColor("line2")
                ),
                "weininglu750" to StationListBindingData(
                    "weininglu750",
                    "威宁路",
                    "line2",
                    121.38705,
                    31.214825,
                    PatternHelper.getLineColor("line2")
                ),
                "loushanguanlu770" to StationListBindingData(
                    "loushanguanlu770",
                    "娄山关路",
                    "line2",
                    121.404266,
                    31.211049,
                    PatternHelper.getLineColor("line2")
                ),
                "zhongshangongyuan790" to StationListBindingData(
                    "zhongshangongyuan790",
                    "中山公园",
                    "line2",
                    121.416475,
                    31.218071,
                    PatternHelper.getLineColor("line2")
                ),
                "jiangsulu810" to StationListBindingData(
                    "jiangsulu810",
                    "江苏路",
                    "line2",
                    121.431286,
                    31.220193,
                    PatternHelper.getLineColor("line2")
                ),
                "jingansi830" to StationListBindingData(
                    "jingansi830",
                    "静安寺",
                    "line2",
                    121.447473,
                    31.223046,
                    PatternHelper.getLineColor("line2")
                ),
                "nanjingxilu850" to StationListBindingData(
                    "nanjingxilu850",
                    "南京西路",
                    "line2",
                    121.460734,
                    31.22887,
                    PatternHelper.getLineColor("line2")
                ),
                "renminguangchang870" to StationListBindingData(
                    "renminguangchang870",
                    "人民广场",
                    "line2",
                    121.474496,
                    31.232892,
                    PatternHelper.getLineColor("line2")
                ),
                "nanjingdonglu890" to StationListBindingData(
                    "nanjingdonglu890",
                    "南京东路",
                    "line2",
                    121.484278,
                    31.237993,
                    PatternHelper.getLineColor("line2")
                ),
                "lujiazui910" to StationListBindingData(
                    "lujiazui910",
                    "陆家嘴",
                    "line2",
                    121.50222,
                    31.237995,
                    PatternHelper.getLineColor("line2")
                ),
                "dongchanglu930" to StationListBindingData(
                    "dongchanglu930",
                    "东昌路",
                    "line2",
                    121.51542,
                    31.233351,
                    PatternHelper.getLineColor("line2")
                ),
                "shijidadao950" to StationListBindingData(
                    "shijidadao950",
                    "世纪大道",
                    "line2",
                    121.526895,
                    31.228963,
                    PatternHelper.getLineColor("line2")
                ),
                "shanghaikejiguan970" to StationListBindingData(
                    "shanghaikejiguan970",
                    "上海科技馆",
                    "line2",
                    121.544167,
                    31.21928,
                    PatternHelper.getLineColor("line2")
                ),
                "shijigongyuan990" to StationListBindingData(
                    "shijigongyuan990",
                    "世纪公园",
                    "line2",
                    121.550752,
                    31.209589,
                    PatternHelper.getLineColor("line2")
                ),
                "longyanglu1010" to StationListBindingData(
                    "longyanglu1010",
                    "龙阳路",
                    "line2",
                    121.557498,
                    31.202813,
                    PatternHelper.getLineColor("line2")
                ),
                "zhangjianggaoke1030" to StationListBindingData(
                    "zhangjianggaoke1030",
                    "张江高科",
                    "line2",
                    121.587576,
                    31.201769,
                    PatternHelper.getLineColor("line2")
                ),
                "jinkelu1050" to StationListBindingData(
                    "jinkelu1050",
                    "金科路",
                    "line2",
                    121.601977,
                    31.204176,
                    PatternHelper.getLineColor("line2")
                ),
                "guanglanlu1070" to StationListBindingData(
                    "guanglanlu1070",
                    "广兰路",
                    "line2",
                    121.620564,
                    31.211007,
                    PatternHelper.getLineColor("line2")
                ),
                "tangzhen1090" to StationListBindingData(
                    "tangzhen1090",
                    "唐镇",
                    "line2",
                    121.656115,
                    31.213732,
                    PatternHelper.getLineColor("line2")
                ),
                "chuangxinzhonglu1110" to StationListBindingData(
                    "chuangxinzhonglu1110",
                    "创新中路",
                    "line2",
                    121.67389,
                    31.213386,
                    PatternHelper.getLineColor("line2")
                ),
                "huaxiadonglu1130" to StationListBindingData(
                    "huaxiadonglu1130",
                    "华夏东路",
                    "line2",
                    121.680872,
                    31.1968,
                    PatternHelper.getLineColor("line2")
                ),
                "chuansha1150" to StationListBindingData(
                    "chuansha1150",
                    "川沙",
                    "line2",
                    121.698061,
                    31.18661,
                    PatternHelper.getLineColor("line2")
                ),
                "lingkonglu1170" to StationListBindingData(
                    "lingkonglu1170",
                    "凌空路",
                    "line2",
                    121.723733,
                    31.192839,
                    PatternHelper.getLineColor("line2")
                ),
                "yuandongdadao1190" to StationListBindingData(
                    "yuandongdadao1190",
                    "远东大道",
                    "line2",
                    121.755576,
                    31.19946,
                    PatternHelper.getLineColor("line2")
                ),
                "haitiansanlu1210" to StationListBindingData(
                    "haitiansanlu1210",
                    "海天三路",
                    "line2",
                    121.796832,
                    31.168609,
                    PatternHelper.getLineColor("line2")
                ),
                "pudongguojijichang1230" to StationListBindingData(
                    "pudongguojijichang1230",
                    "浦东国际机场",
                    "line2",
                    121.806564,
                    31.149329,
                    PatternHelper.getLineColor("line2")
                ),
            ), "line3" to mapOf(
                "shenzhuang1410" to StationListBindingData(
                    "shenzhuang1410",
                    "莘庄",
                    "line3",
                    121.384999,
                    31.110924,
                    PatternHelper.getLineColor("line3")
                ),
                "shanghainanzhan1430" to StationListBindingData(
                    "shanghainanzhan1430",
                    "上海南站",
                    "line3",
                    121.430313,
                    31.154062,
                    PatternHelper.getLineColor("line3")
                ),
                "shilonglu1450" to StationListBindingData(
                    "shilonglu1450",
                    "石龙路",
                    "line3",
                    121.443238,
                    31.157958,
                    PatternHelper.getLineColor("line3")
                ),
                "longcaolu1470" to StationListBindingData(
                    "longcaolu1470",
                    "龙漕路",
                    "line3",
                    121.444209,
                    31.169935,
                    PatternHelper.getLineColor("line3")
                ),
                "caoxilu1490" to StationListBindingData(
                    "caoxilu1490",
                    "漕溪路",
                    "line3",
                    121.438344,
                    31.176635,
                    PatternHelper.getLineColor("line3")
                ),
                "yishanlu1510" to StationListBindingData(
                    "yishanlu1510",
                    "宜山路",
                    "line3",
                    121.42737,
                    31.186335,
                    PatternHelper.getLineColor("line3")
                ),
                "hongqiaolu1530" to StationListBindingData(
                    "hongqiaolu1530",
                    "虹桥路",
                    "line3",
                    121.421594,
                    31.196919,
                    PatternHelper.getLineColor("line3")
                ),
                "yananxilu1550" to StationListBindingData(
                    "yananxilu1550",
                    "延安西路",
                    "line3",
                    121.417082,
                    31.209773,
                    PatternHelper.getLineColor("line3")
                ),
                "zhongshangongyuan1570" to StationListBindingData(
                    "zhongshangongyuan1570",
                    "中山公园",
                    "line3",
                    121.416475,
                    31.218071,
                    PatternHelper.getLineColor("line3")
                ),
                "jinshajianglu1590" to StationListBindingData(
                    "jinshajianglu1590",
                    "金沙江路",
                    "line3",
                    121.413002,
                    31.231898,
                    PatternHelper.getLineColor("line3")
                ),
                "caoyang1610" to StationListBindingData(
                    "caoyang1610",
                    "曹杨路",
                    "line3",
                    121.417678,
                    31.238746,
                    PatternHelper.getLineColor("line3")
                ),
                "zhenpinglu1630" to StationListBindingData(
                    "zhenpinglu1630",
                    "镇坪路",
                    "line3",
                    121.430381,
                    31.246649,
                    PatternHelper.getLineColor("line3")
                ),
                "zhongtanlu1650" to StationListBindingData(
                    "zhongtanlu1650",
                    "中潭路",
                    "line3",
                    121.441039,
                    31.254671,
                    PatternHelper.getLineColor("line3")
                ),
                "shanghaihuochezhan1670" to StationListBindingData(
                    "shanghaihuochezhan1670",
                    "上海火车站",
                    "line3",
                    121.457529,
                    31.248895,
                    PatternHelper.getLineColor("line3")
                ),
                "baoshanlu1690" to StationListBindingData(
                    "baoshanlu1690",
                    "宝山路",
                    "line3",
                    121.476514,
                    31.251559,
                    PatternHelper.getLineColor("line3")
                ),
                "dongbaoxinglu1710" to StationListBindingData(
                    "dongbaoxinglu1710",
                    "东宝兴路",
                    "line3",
                    121.480089,
                    31.260009,
                    PatternHelper.getLineColor("line3")
                ),
                "hongkouzuqiuchang1730" to StationListBindingData(
                    "hongkouzuqiuchang1730",
                    "虹口足球场",
                    "line3",
                    121.479263,
                    31.270898,
                    PatternHelper.getLineColor("line3")
                ),
                "chifenglu1750" to StationListBindingData(
                    "chifenglu1750",
                    "赤峰路",
                    "line3",
                    121.482449,
                    31.281305,
                    PatternHelper.getLineColor("line3")
                ),
                "dabaishu1770" to StationListBindingData(
                    "dabaishu1770",
                    "大柏树",
                    "line3",
                    121.483071,
                    31.289359,
                    PatternHelper.getLineColor("line3")
                ),
                "jiangwanzhen1790" to StationListBindingData(
                    "jiangwanzhen1790",
                    "江湾镇",
                    "line3",
                    121.485091,
                    31.305415,
                    PatternHelper.getLineColor("line3")
                ),
                "yingaoxilu1810" to StationListBindingData(
                    "yingaoxilu1810",
                    "殷高西路",
                    "line3",
                    121.484852,
                    31.319817,
                    PatternHelper.getLineColor("line3")
                ),
                "changjiangnanlu1830" to StationListBindingData(
                    "changjiangnanlu1830",
                    "长江南路",
                    "line3",
                    121.491588,
                    31.332023,
                    PatternHelper.getLineColor("line3")
                ),
                "songfalu1850" to StationListBindingData(
                    "songfalu1850",
                    "淞发路",
                    "line3",
                    121.500535,
                    31.345162,
                    PatternHelper.getLineColor("line3")
                ),
                "zhanghuabang1870" to StationListBindingData(
                    "zhanghuabang1870",
                    "张华浜",
                    "line3",
                    121.498802,
                    31.358022,
                    PatternHelper.getLineColor("line3")
                ),
                "songbinlu1890" to StationListBindingData(
                    "songbinlu1890",
                    "淞滨路",
                    "line3",
                    121.4928,
                    31.370922,
                    PatternHelper.getLineColor("line3")
                ),
                "shuichanlu1910" to StationListBindingData(
                    "shuichanlu1910",
                    "水产路",
                    "line3",
                    121.488168,
                    31.381365,
                    PatternHelper.getLineColor("line3")
                ),
                "baoyanglu1930" to StationListBindingData(
                    "baoyanglu1930",
                    "宝杨路",
                    "line3",
                    121.479583,
                    31.39555,
                    PatternHelper.getLineColor("line3")
                ),
                "youyilu1950" to StationListBindingData(
                    "youyilu1950",
                    "友谊路",
                    "line3",
                    121.476041,
                    31.404031,
                    PatternHelper.getLineColor("line3")
                ),
                "tielilu1970" to StationListBindingData(
                    "tielilu1970",
                    "铁力路",
                    "line3",
                    121.461397,
                    31.408172,
                    PatternHelper.getLineColor("line3")
                ),
                "jiangyangbeilu1990" to StationListBindingData(
                    "jiangyangbeilu1990",
                    "江杨北路",
                    "line3",
                    121.439828,
                    31.407873,
                    PatternHelper.getLineColor("line3")
                ),
            ), "line4" to mapOf(
                "damuqiaozhan2030" to StationListBindingData(
                    "damuqiaozhan2030",
                    "大木桥站",
                    "line4",
                    121.463399,
                    31.194022,
                    PatternHelper.getLineColor("line4")
                ),
                "donganlu2050" to StationListBindingData(
                    "donganlu2050",
                    "东安路",
                    "line4",
                    121.454727,
                    31.191049,
                    PatternHelper.getLineColor("line4")
                ),
                "shanghaitiyuchang2070" to StationListBindingData(
                    "shanghaitiyuchang2070",
                    "上海体育场",
                    "line4",
                    121.443848,
                    31.185832,
                    PatternHelper.getLineColor("line4")
                ),
                "shanghaitiyuguan2090" to StationListBindingData(
                    "shanghaitiyuguan2090",
                    "上海体育馆",
                    "line4",
                    121.437,
                    31.182469,
                    PatternHelper.getLineColor("line4")
                ),
                "yishanlu2110" to StationListBindingData(
                    "yishanlu2110",
                    "宜山路",
                    "line4",
                    121.42737,
                    31.186335,
                    PatternHelper.getLineColor("line4")
                ),
                "hongqiaolu2130" to StationListBindingData(
                    "hongqiaolu2130",
                    "虹桥路",
                    "line4",
                    121.421594,
                    31.196919,
                    PatternHelper.getLineColor("line4")
                ),
                "yananxilu2150" to StationListBindingData(
                    "yananxilu2150",
                    "延安西路",
                    "line4",
                    121.417082,
                    31.209773,
                    PatternHelper.getLineColor("line4")
                ),
                "zhongshangongyuan2170" to StationListBindingData(
                    "zhongshangongyuan2170",
                    "中山公园",
                    "line4",
                    121.416475,
                    31.218071,
                    PatternHelper.getLineColor("line4")
                ),
                "jinshajianglu2190" to StationListBindingData(
                    "jinshajianglu2190",
                    "金沙江路",
                    "line4",
                    121.413002,
                    31.231898,
                    PatternHelper.getLineColor("line4")
                ),
                "caoyang2210" to StationListBindingData(
                    "caoyang2210",
                    "曹杨路",
                    "line4",
                    121.417678,
                    31.238746,
                    PatternHelper.getLineColor("line4")
                ),
                "zhenpinglu2230" to StationListBindingData(
                    "zhenpinglu2230",
                    "镇坪路",
                    "line4",
                    121.430381,
                    31.246649,
                    PatternHelper.getLineColor("line4")
                ),
                "zhongtanlu2250" to StationListBindingData(
                    "zhongtanlu2250",
                    "中潭路",
                    "line4",
                    121.441039,
                    31.254671,
                    PatternHelper.getLineColor("line4")
                ),
                "shanghaihuochezhan2270" to StationListBindingData(
                    "shanghaihuochezhan2270",
                    "上海火车站",
                    "line4",
                    121.457529,
                    31.248895,
                    PatternHelper.getLineColor("line4")
                ),
                "baoshanlu2290" to StationListBindingData(
                    "baoshanlu2290",
                    "宝山路",
                    "line4",
                    121.476514,
                    31.251559,
                    PatternHelper.getLineColor("line4")
                ),
                "hailunlu2310" to StationListBindingData(
                    "hailunlu2310",
                    "海伦路",
                    "line4",
                    121.488858,
                    31.259009,
                    PatternHelper.getLineColor("line4")
                ),
                "linpinglu2330" to StationListBindingData(
                    "linpinglu2330",
                    "临平路",
                    "line4",
                    121.501028,
                    31.260946,
                    PatternHelper.getLineColor("line4")
                ),
                "dalianlu2350" to StationListBindingData(
                    "dalianlu2350",
                    "大连路",
                    "line4",
                    121.513012,
                    31.258,
                    PatternHelper.getLineColor("line4")
                ),
                "yangshupulu2370" to StationListBindingData(
                    "yangshupulu2370",
                    "杨树浦路",
                    "line4",
                    121.51738,
                    31.251958,
                    PatternHelper.getLineColor("line4")
                ),
                "pudongdadao2390" to StationListBindingData(
                    "pudongdadao2390",
                    "浦东大道",
                    "line4",
                    121.519479,
                    31.239907,
                    PatternHelper.getLineColor("line4")
                ),
                "shijidadao2410" to StationListBindingData(
                    "shijidadao2410",
                    "世纪大道",
                    "line4",
                    121.526895,
                    31.228963,
                    PatternHelper.getLineColor("line4")
                ),
                "pudianlu2430" to StationListBindingData(
                    "pudianlu2430",
                    "浦电路",
                    "line4",
                    121.532017,
                    31.222927,
                    PatternHelper.getLineColor("line4")
                ),
                "lancunlu2450" to StationListBindingData(
                    "lancunlu2450",
                    "蓝村路",
                    "line4",
                    121.527846,
                    31.211741,
                    PatternHelper.getLineColor("line4")
                ),
                "tangqiao2470" to StationListBindingData(
                    "tangqiao2470",
                    "塘桥",
                    "line4",
                    121.518818,
                    31.209521,
                    PatternHelper.getLineColor("line4")
                ),
                "nanpudaqiao2490" to StationListBindingData(
                    "nanpudaqiao2490",
                    "南浦大桥",
                    "line4",
                    121.499744,
                    31.20865,
                    PatternHelper.getLineColor("line4")
                ),
                "xizangnanlu2510" to StationListBindingData(
                    "xizangnanlu2510",
                    "西藏南路",
                    "line4",
                    121.489533,
                    31.202029,
                    PatternHelper.getLineColor("line4")
                ),
                "lubanlu2530" to StationListBindingData(
                    "lubanlu2530",
                    "鲁班路",
                    "line4",
                    121.474474,
                    31.199035,
                    PatternHelper.getLineColor("line4")
                ),
            ), "line5" to mapOf(
                "shenzhuang2570" to StationListBindingData(
                    "shenzhuang2570",
                    "莘庄",
                    "line5",
                    121.384999,
                    31.110924,
                    PatternHelper.getLineColor("line5")
                ),
                "chunshenlu2590" to StationListBindingData(
                    "chunshenlu2590",
                    "春申路",
                    "line5",
                    121.385711,
                    31.098298,
                    PatternHelper.getLineColor("line5")
                ),
                "yindoulu2610" to StationListBindingData(
                    "yindoulu2610",
                    "银都路",
                    "line5",
                    121.390277,
                    31.089334,
                    PatternHelper.getLineColor("line5")
                ),
                "zhuanqiao2630" to StationListBindingData(
                    "zhuanqiao2630",
                    "颛桥",
                    "line5",
                    121.401913,
                    31.066942,
                    PatternHelper.getLineColor("line5")
                ),
                "beiqiao2650" to StationListBindingData(
                    "beiqiao2650",
                    "北桥",
                    "line5",
                    121.410017,
                    31.045051,
                    PatternHelper.getLineColor("line5")
                ),
                "jianchuanlu2670" to StationListBindingData(
                    "jianchuanlu2670",
                    "剑川路",
                    "line5",
                    121.416495,
                    31.026483,
                    PatternHelper.getLineColor("line5")
                ),
                "dongchuanlu2690" to StationListBindingData(
                    "dongchuanlu2690",
                    "东川路",
                    "line5",
                    121.419883,
                    31.018214,
                    PatternHelper.getLineColor("line5")
                ),
            ), "line6" to mapOf(
                "dongfangtiyuzhongxin2890" to StationListBindingData(
                    "dongfangtiyuzhongxin2890",
                    "东方体育中心",
                    "line6",
                    121.480468,
                    31.153615,
                    PatternHelper.getLineColor("line6")
                ),
                "lingyannanlu2910" to StationListBindingData(
                    "lingyannanlu2910",
                    "灵岩南路",
                    "line6",
                    121.495107,
                    31.14873,
                    PatternHelper.getLineColor("line6")
                ),
                "shangnanlu2930" to StationListBindingData(
                    "shangnanlu2930",
                    "上南路",
                    "line6",
                    121.50638,
                    31.149154,
                    PatternHelper.getLineColor("line6")
                ),
                "huaxiaxilu2950" to StationListBindingData(
                    "huaxiaxilu2950",
                    "华夏西路",
                    "line6",
                    121.514597,
                    31.149851,
                    PatternHelper.getLineColor("line6")
                ),
                "gaoqinglu2970" to StationListBindingData(
                    "gaoqinglu2970",
                    "高青路",
                    "line6",
                    121.515725,
                    31.159528,
                    PatternHelper.getLineColor("line6")
                ),
                "dongminglu2990" to StationListBindingData(
                    "dongminglu2990",
                    "东明路",
                    "line6",
                    121.510946,
                    31.172531,
                    PatternHelper.getLineColor("line6")
                ),
                "gaokexilu3010" to StationListBindingData(
                    "gaokexilu3010",
                    "高科西路",
                    "line6",
                    121.509846,
                    31.185565,
                    PatternHelper.getLineColor("line6")
                ),
                "linyixincun3030" to StationListBindingData(
                    "linyixincun3030",
                    "临沂新村",
                    "line6",
                    121.51652,
                    31.193226,
                    PatternHelper.getLineColor("line6")
                ),
                "shanghaiertongyixuezhongxin3050" to StationListBindingData(
                    "shanghaiertongyixuezhongxin3050",
                    "上海儿童医学中心",
                    "line6",
                    121.523258,
                    31.203515,
                    PatternHelper.getLineColor("line6")
                ),
                "lancunlu3070" to StationListBindingData(
                    "lancunlu3070",
                    "蓝村路",
                    "line6",
                    121.527846,
                    31.211741,
                    PatternHelper.getLineColor("line6")
                ),
                "pudianlu3090" to StationListBindingData(
                    "pudianlu3090",
                    "浦电路",
                    "line6",
                    121.532017,
                    31.222927,
                    PatternHelper.getLineColor("line6")
                ),
                "shijidadao3110" to StationListBindingData(
                    "shijidadao3110",
                    "世纪大道",
                    "line6",
                    121.526895,
                    31.228963,
                    PatternHelper.getLineColor("line6")
                ),
                "yuanshentiyuzhongxin3130" to StationListBindingData(
                    "yuanshentiyuzhongxin3130",
                    "源深体育中心",
                    "line6",
                    121.534397,
                    31.232965,
                    PatternHelper.getLineColor("line6")
                ),
                "minshenglu3150" to StationListBindingData(
                    "minshenglu3150",
                    "民生路",
                    "line6",
                    121.543473,
                    31.235872,
                    PatternHelper.getLineColor("line6")
                ),
                "beiyangjinglu3170" to StationListBindingData(
                    "beiyangjinglu3170",
                    "北洋泾路",
                    "line6",
                    121.552807,
                    31.239241,
                    PatternHelper.getLineColor("line6")
                ),
                "depinglu3190" to StationListBindingData(
                    "depinglu3190",
                    "德平路",
                    "line6",
                    121.564155,
                    31.245305,
                    PatternHelper.getLineColor("line6")
                ),
                "yunshanlu3210" to StationListBindingData(
                    "yunshanlu3210",
                    "云山路",
                    "line6",
                    121.572879,
                    31.250391,
                    PatternHelper.getLineColor("line6")
                ),
                "jinqiaolu3230" to StationListBindingData(
                    "jinqiaolu3230",
                    "金桥路",
                    "line6",
                    121.581896,
                    31.257185,
                    PatternHelper.getLineColor("line6")
                ),
                "boxinglu3250" to StationListBindingData(
                    "boxinglu3250",
                    "博兴路",
                    "line6",
                    121.586945,
                    31.263954,
                    PatternHelper.getLineColor("line6")
                ),
                "wulianlu3270" to StationListBindingData(
                    "wulianlu3270",
                    "五莲路",
                    "line6",
                    121.588078,
                    31.271906,
                    PatternHelper.getLineColor("line6")
                ),
                "jufenglu3290" to StationListBindingData(
                    "jufenglu3290",
                    "巨峰路",
                    "line6",
                    121.589019,
                    31.280517,
                    PatternHelper.getLineColor("line6")
                ),
                "dongjinglu3310" to StationListBindingData(
                    "dongjinglu3310",
                    "东靖路",
                    "line6",
                    121.588814,
                    31.29089,
                    PatternHelper.getLineColor("line6")
                ),
                "wuzhoudadao3330" to StationListBindingData(
                    "wuzhoudadao3330",
                    "五洲大道",
                    "line6",
                    121.589332,
                    31.302705,
                    PatternHelper.getLineColor("line6")
                ),
                "zhouhailu3350" to StationListBindingData(
                    "zhouhailu3350",
                    "洲海路",
                    "line6",
                    121.589398,
                    31.312434,
                    PatternHelper.getLineColor("line6")
                ),
                "waigaoqiaobaoshuiqunan3370" to StationListBindingData(
                    "waigaoqiaobaoshuiqunan3370",
                    "外高桥保税区南",
                    "line6",
                    121.602083,
                    31.32147,
                    PatternHelper.getLineColor("line6")
                ),
                "hangjinlu3390" to StationListBindingData(
                    "hangjinlu3390",
                    "航津路",
                    "line6",
                    121.593995,
                    31.335382,
                    PatternHelper.getLineColor("line6")
                ),
                "waigaoqiaobaoshuiqubei3410" to StationListBindingData(
                    "waigaoqiaobaoshuiqubei3410",
                    "外高桥保税区北",
                    "line6",
                    121.586947,
                    31.347771,
                    PatternHelper.getLineColor("line6")
                ),
                "gangchenglu3430" to StationListBindingData(
                    "gangchenglu3430",
                    "港城路",
                    "line6",
                    121.574695,
                    31.353027,
                    PatternHelper.getLineColor("line6")
                ),
            ), "line7" to mapOf(
                "meilanhu3490" to StationListBindingData(
                    "meilanhu3490",
                    "美兰湖",
                    "line7",
                    121.349903,
                    31.401933,
                    PatternHelper.getLineColor("line7")
                ),
                "luonanxincun3510" to StationListBindingData(
                    "luonanxincun3510",
                    "罗南新村",
                    "line7",
                    121.357652,
                    31.38846,
                    PatternHelper.getLineColor("line7")
                ),
                "panguanglu3530" to StationListBindingData(
                    "panguanglu3530",
                    "潘广路",
                    "line7",
                    121.355743,
                    31.36427,
                    PatternHelper.getLineColor("line7")
                ),
                "liuhang3550" to StationListBindingData(
                    "liuhang3550",
                    "刘行",
                    "line7",
                    121.362287,
                    31.357664,
                    PatternHelper.getLineColor("line7")
                ),
                "gucungongyuan3570" to StationListBindingData(
                    "gucungongyuan3570",
                    "顾村公园",
                    "line7",
                    121.372685,
                    31.344913,
                    PatternHelper.getLineColor("line7")
                ),
                "qihualu3590" to StationListBindingData(
                    "qihualu3590",
                    "祁华路",
                    "line7",
                    121.373545,
                    31.322445,
                    PatternHelper.getLineColor("line7")
                ),
                "shanghaidaxue3610" to StationListBindingData(
                    "shanghaidaxue3610",
                    "上海大学",
                    "line7",
                    121.38871,
                    31.320513,
                    PatternHelper.getLineColor("line7")
                ),
                "nanchenlu3630" to StationListBindingData(
                    "nanchenlu3630",
                    "南陈路",
                    "line7",
                    121.398681,
                    31.321319,
                    PatternHelper.getLineColor("line7")
                ),
                "shangdalu3650" to StationListBindingData(
                    "shangdalu3650",
                    "上大路",
                    "line7",
                    121.408243,
                    31.315554,
                    PatternHelper.getLineColor("line7")
                ),
                "changzhonglu3670" to StationListBindingData(
                    "changzhonglu3670",
                    "场中路",
                    "line7",
                    121.41369,
                    31.303877,
                    PatternHelper.getLineColor("line7")
                ),
                "dachangzhen3690" to StationListBindingData(
                    "dachangzhen3690",
                    "大场镇",
                    "line7",
                    121.416477,
                    31.293625,
                    PatternHelper.getLineColor("line7")
                ),
                "hangzhilu3710" to StationListBindingData(
                    "hangzhilu3710",
                    "行知路",
                    "line7",
                    121.421636,
                    31.284976,
                    PatternHelper.getLineColor("line7")
                ),
                "dahuasanlu3730" to StationListBindingData(
                    "dahuasanlu3730",
                    "大华三路",
                    "line7",
                    121.423062,
                    31.273935,
                    PatternHelper.getLineColor("line7")
                ),
                "xincunlu3750" to StationListBindingData(
                    "xincunlu3750",
                    "新村路",
                    "line7",
                    121.4226,
                    31.263904,
                    PatternHelper.getLineColor("line7")
                ),
                "langaolu3770" to StationListBindingData(
                    "langaolu3770",
                    "岚皋路",
                    "line7",
                    121.421897,
                    31.256332,
                    PatternHelper.getLineColor("line7")
                ),
                "zhenpinglu3790" to StationListBindingData(
                    "zhenpinglu3790",
                    "镇坪路",
                    "line7",
                    121.430381,
                    31.246649,
                    PatternHelper.getLineColor("line7")
                ),
                "changshoulu3810" to StationListBindingData(
                    "changshoulu3810",
                    "长寿路",
                    "line7",
                    121.438338,
                    31.240367,
                    PatternHelper.getLineColor("line7")
                ),
                "changpinglu3830" to StationListBindingData(
                    "changpinglu3830",
                    "昌平路",
                    "line7",
                    121.442319,
                    31.23412,
                    PatternHelper.getLineColor("line7")
                ),
                "jingansi3850" to StationListBindingData(
                    "jingansi3850",
                    "静安寺",
                    "line7",
                    121.447473,
                    31.223046,
                    PatternHelper.getLineColor("line7")
                ),
                "changshulu3870" to StationListBindingData(
                    "changshulu3870",
                    "常熟路",
                    "line7",
                    121.450182,
                    31.213704,
                    PatternHelper.getLineColor("line7")
                ),
                "zhaojiabanglu3890" to StationListBindingData(
                    "zhaojiabanglu3890",
                    "肇嘉浜路",
                    "line7",
                    121.450025,
                    31.199134,
                    PatternHelper.getLineColor("line7")
                ),
                "donganlu3910" to StationListBindingData(
                    "donganlu3910",
                    "东安路",
                    "line7",
                    121.454727,
                    31.191049,
                    PatternHelper.getLineColor("line7")
                ),
                "longhuazhonglu3930" to StationListBindingData(
                    "longhuazhonglu3930",
                    "龙华中路",
                    "line7",
                    121.457183,
                    31.185069,
                    PatternHelper.getLineColor("line7")
                ),
                "houtan3950" to StationListBindingData(
                    "houtan3950",
                    "后滩",
                    "line7",
                    121.473533,
                    31.171983,
                    PatternHelper.getLineColor("line7")
                ),
                "changqinglu3970" to StationListBindingData(
                    "changqinglu3970",
                    "长清路",
                    "line7",
                    121.486102,
                    31.174594,
                    PatternHelper.getLineColor("line7")
                ),
                "yaohualu3990" to StationListBindingData(
                    "yaohualu3990",
                    "耀华路",
                    "line7",
                    121.494558,
                    31.178449,
                    PatternHelper.getLineColor("line7")
                ),
                "yuntailu4010" to StationListBindingData(
                    "yuntailu4010",
                    "云台路",
                    "line7",
                    121.500696,
                    31.182132,
                    PatternHelper.getLineColor("line7")
                ),
                "gaokexilu4030" to StationListBindingData(
                    "gaokexilu4030",
                    "高科西路",
                    "line7",
                    121.509846,
                    31.185565,
                    PatternHelper.getLineColor("line7")
                ),
                "yanggaonanlu4050" to StationListBindingData(
                    "yanggaonanlu4050",
                    "杨高南路",
                    "line7",
                    121.525141,
                    31.187574,
                    PatternHelper.getLineColor("line7")
                ),
                "jinxiulu4070" to StationListBindingData(
                    "jinxiulu4070",
                    "锦绣路",
                    "line7",
                    121.539978,
                    31.187531,
                    PatternHelper.getLineColor("line7")
                ),
                "fanghualu4090" to StationListBindingData(
                    "fanghualu4090",
                    "芳华路",
                    "line7",
                    121.550069,
                    31.193192,
                    PatternHelper.getLineColor("line7")
                ),
                "longyanglu4110" to StationListBindingData(
                    "longyanglu4110",
                    "龙阳路",
                    "line7",
                    121.557498,
                    31.202813,
                    PatternHelper.getLineColor("line7")
                ),
                "huamulu4130" to StationListBindingData(
                    "huamulu4130",
                    "花木路",
                    "line7",
                    121.562802,
                    31.211214,
                    PatternHelper.getLineColor("line7")
                ),
            ), "line8" to mapOf(
                "shiguanglu4170" to StationListBindingData(
                    "shiguanglu4170",
                    "市光路",
                    "line8",
                    121.532045,
                    31.322441,
                    PatternHelper.getLineColor("line8")
                ),
                "nenjianglu4190" to StationListBindingData(
                    "nenjianglu4190",
                    "嫩江路",
                    "line8",
                    121.532088,
                    31.31485,
                    PatternHelper.getLineColor("line8")
                ),
                "xiangyinlu4210" to StationListBindingData(
                    "xiangyinlu4210",
                    "翔殷路",
                    "line8",
                    121.532011,
                    31.304952,
                    PatternHelper.getLineColor("line8")
                ),
                "huangxinggongyuan4230" to StationListBindingData(
                    "huangxinggongyuan4230",
                    "黄兴公园",
                    "line8",
                    121.533218,
                    31.295867,
                    PatternHelper.getLineColor("line8")
                ),
                "yanjizhonglu4250" to StationListBindingData(
                    "yanjizhonglu4250",
                    "延吉中路",
                    "line8",
                    121.534948,
                    31.288657,
                    PatternHelper.getLineColor("line8")
                ),
                "huangxinglu4270" to StationListBindingData(
                    "huangxinglu4270",
                    "黄兴路",
                    "line8",
                    121.527937,
                    31.278692,
                    PatternHelper.getLineColor("line8")
                ),
                "jiangpulu4290" to StationListBindingData(
                    "jiangpulu4290",
                    "江浦路",
                    "line8",
                    121.518256,
                    31.2751,
                    PatternHelper.getLineColor("line8")
                ),
                "anshanxincun4310" to StationListBindingData(
                    "anshanxincun4310",
                    "鞍山新村",
                    "line8",
                    121.509518,
                    31.273205,
                    PatternHelper.getLineColor("line8")
                ),
                "sipinglu4330" to StationListBindingData(
                    "sipinglu4330",
                    "四平路",
                    "line8",
                    121.501601,
                    31.275148,
                    PatternHelper.getLineColor("line8")
                ),
                "quyanglu4350" to StationListBindingData(
                    "quyanglu4350",
                    "曲阳路",
                    "line8",
                    121.490473,
                    31.276488,
                    PatternHelper.getLineColor("line8")
                ),
                "hongkouzuqiuchang4370" to StationListBindingData(
                    "hongkouzuqiuchang4370",
                    "虹口足球场",
                    "line8",
                    121.479263,
                    31.270898,
                    PatternHelper.getLineColor("line8")
                ),
                "xizangbeilu4390" to StationListBindingData(
                    "xizangbeilu4390",
                    "西藏北路",
                    "line8",
                    121.468741,
                    31.263498,
                    PatternHelper.getLineColor("line8")
                ),
                "zhongxinglu4410" to StationListBindingData(
                    "zhongxinglu4410",
                    "中兴路",
                    "line8",
                    121.468893,
                    31.25313,
                    PatternHelper.getLineColor("line8")
                ),
                "qufulu4430" to StationListBindingData(
                    "qufulu4430",
                    "曲阜路",
                    "line8",
                    121.471485,
                    31.242395,
                    PatternHelper.getLineColor("line8")
                ),
                "renminguangchang4450" to StationListBindingData(
                    "renminguangchang4450",
                    "人民广场",
                    "line8",
                    121.474496,
                    31.232892,
                    PatternHelper.getLineColor("line8")
                ),
                "dashijie4470" to StationListBindingData(
                    "dashijie4470",
                    "大世界",
                    "line8",
                    121.479306,
                    31.227381,
                    PatternHelper.getLineColor("line8")
                ),
                "laoximen4490" to StationListBindingData(
                    "laoximen4490",
                    "老西门",
                    "line8",
                    121.48291,
                    31.218929,
                    PatternHelper.getLineColor("line8")
                ),
                "lujiabanglu4510" to StationListBindingData(
                    "lujiabanglu4510",
                    "陆家浜路",
                    "line8",
                    121.486141,
                    31.211668,
                    PatternHelper.getLineColor("line8")
                ),
                "xizangnanlu4530" to StationListBindingData(
                    "xizangnanlu4530",
                    "西藏南路",
                    "line8",
                    121.489533,
                    31.202029,
                    PatternHelper.getLineColor("line8")
                ),
                "zhonghuayishugong4550" to StationListBindingData(
                    "zhonghuayishugong4550",
                    "中华艺术宫",
                    "line8",
                    121.494176,
                    31.185702,
                    PatternHelper.getLineColor("line8")
                ),
                "yaohualu4570" to StationListBindingData(
                    "yaohualu4570",
                    "耀华路",
                    "line8",
                    121.494558,
                    31.178449,
                    PatternHelper.getLineColor("line8")
                ),
                "chengshanlu4590" to StationListBindingData(
                    "chengshanlu4590",
                    "成山路",
                    "line8",
                    121.496164,
                    31.170842,
                    PatternHelper.getLineColor("line8")
                ),
                "yangsi4610" to StationListBindingData(
                    "yangsi4610",
                    "杨思",
                    "line8",
                    121.493726,
                    31.161075,
                    PatternHelper.getLineColor("line8")
                ),
                "dongfangtiyuzhongxin4630" to StationListBindingData(
                    "dongfangtiyuzhongxin4630",
                    "东方体育中心",
                    "line8",
                    121.480468,
                    31.153615,
                    PatternHelper.getLineColor("line8")
                ),
                "lingzhaoxincun4650" to StationListBindingData(
                    "lingzhaoxincun4650",
                    "凌兆新村",
                    "line8",
                    121.489706,
                    31.141059,
                    PatternHelper.getLineColor("line8")
                ),
                "luhenglu4670" to StationListBindingData(
                    "luhenglu4670",
                    "芦恒路",
                    "line8",
                    121.497775,
                    31.11926,
                    PatternHelper.getLineColor("line8")
                ),
                "pujiangzhen4690" to StationListBindingData(
                    "pujiangzhen4690",
                    "浦江镇",
                    "line8",
                    121.50629,
                    31.09656,
                    PatternHelper.getLineColor("line8")
                ),
                "jiangyuelu4710" to StationListBindingData(
                    "jiangyuelu4710",
                    "江月路",
                    "line8",
                    121.508562,
                    31.084263,
                    PatternHelper.getLineColor("line8")
                ),
                "lianhanglu4730" to StationListBindingData(
                    "lianhanglu4730",
                    "联航路",
                    "line8",
                    121.51057,
                    31.073933,
                    PatternHelper.getLineColor("line8")
                ),
                "shendugonglu4750" to StationListBindingData(
                    "shendugonglu4750",
                    "沈杜公路",
                    "line8",
                    121.512253,
                    31.061341,
                    PatternHelper.getLineColor("line8")
                ),
            ), "line9" to mapOf(
                "songjiangnanzhan4790" to StationListBindingData(
                    "songjiangnanzhan4790",
                    "松江南站",
                    "line9",
                    121.231129,
                    30.985034,
                    PatternHelper.getLineColor("line9")
                ),
                "zuibaichi4810" to StationListBindingData(
                    "zuibaichi4810",
                    "醉白池",
                    "line9",
                    121.229287,
                    31.001071,
                    PatternHelper.getLineColor("line9")
                ),
                "songjiangtiyuzhongxin4830" to StationListBindingData(
                    "songjiangtiyuzhongxin4830",
                    "松江体育中心",
                    "line9",
                    121.230598,
                    31.016134,
                    PatternHelper.getLineColor("line9")
                ),
                "songjiangxincheng4850" to StationListBindingData(
                    "songjiangxincheng4850",
                    "松江新城",
                    "line9",
                    121.230747,
                    31.030297,
                    PatternHelper.getLineColor("line9")
                ),
                "songjiangdaxuecheng4870" to StationListBindingData(
                    "songjiangdaxuecheng4870",
                    "松江大学城",
                    "line9",
                    121.23269,
                    31.054132,
                    PatternHelper.getLineColor("line9")
                ),
                "dongjing4890" to StationListBindingData(
                    "dongjing4890",
                    "洞泾",
                    "line9",
                    121.23048,
                    31.084475,
                    PatternHelper.getLineColor("line9")
                ),
                "sheshan4910" to StationListBindingData(
                    "sheshan4910",
                    "佘山",
                    "line9",
                    121.22971,
                    31.104687,
                    PatternHelper.getLineColor("line9")
                ),
                "sijing4930" to StationListBindingData(
                    "sijing4930",
                    "泗泾",
                    "line9",
                    121.26064,
                    31.11832,
                    PatternHelper.getLineColor("line9")
                ),
                "jiuting4950" to StationListBindingData(
                    "jiuting4950",
                    "九亭",
                    "line9",
                    121.318946,
                    31.137478,
                    PatternHelper.getLineColor("line9")
                ),
                "zhongchunlu4970" to StationListBindingData(
                    "zhongchunlu4970",
                    "中春路",
                    "line9",
                    121.338306,
                    31.149682,
                    PatternHelper.getLineColor("line9")
                ),
                "qibao4990" to StationListBindingData(
                    "qibao4990",
                    "七宝",
                    "line9",
                    121.349523,
                    31.15547,
                    PatternHelper.getLineColor("line9")
                ),
                "xingzhonglu5010" to StationListBindingData(
                    "xingzhonglu5010",
                    "星中路",
                    "line9",
                    121.368979,
                    31.158204,
                    PatternHelper.getLineColor("line9")
                ),
                "hechuanlu5030" to StationListBindingData(
                    "hechuanlu5030",
                    "合川路",
                    "line9",
                    121.384582,
                    31.166576,
                    PatternHelper.getLineColor("line9")
                ),
                "caohejingkaifaqu5050" to StationListBindingData(
                    "caohejingkaifaqu5050",
                    "漕河泾开发区",
                    "line9",
                    121.397601,
                    31.17048,
                    PatternHelper.getLineColor("line9")
                ),
                "guilinlu5070" to StationListBindingData(
                    "guilinlu5070",
                    "桂林路",
                    "line9",
                    121.418512,
                    31.174918,
                    PatternHelper.getLineColor("line9")
                ),
                "yishanlu5090" to StationListBindingData(
                    "yishanlu5090",
                    "宜山路",
                    "line9",
                    121.42737,
                    31.186335,
                    PatternHelper.getLineColor("line9")
                ),
                "xujiahui5110" to StationListBindingData(
                    "xujiahui5110",
                    "徐家汇",
                    "line9",
                    121.436761,
                    31.194523,
                    PatternHelper.getLineColor("line9")
                ),
                "zhaojiabanglu5130" to StationListBindingData(
                    "zhaojiabanglu5130",
                    "肇嘉浜路",
                    "line9",
                    121.450025,
                    31.199134,
                    PatternHelper.getLineColor("line9")
                ),
                "jiashanlu5150" to StationListBindingData(
                    "jiashanlu5150",
                    "嘉善路",
                    "line9",
                    121.460783,
                    31.202906,
                    PatternHelper.getLineColor("line9")
                ),
                "dapuqiao5170" to StationListBindingData(
                    "dapuqiao5170",
                    "打浦桥",
                    "line9",
                    121.468877,
                    31.206165,
                    PatternHelper.getLineColor("line9")
                ),
                "madanglu5190" to StationListBindingData(
                    "madanglu5190",
                    "马当路",
                    "line9",
                    121.476777,
                    31.209447,
                    PatternHelper.getLineColor("line9")
                ),
                "lujiabanglu5210" to StationListBindingData(
                    "lujiabanglu5210",
                    "陆家浜路",
                    "line9",
                    121.486141,
                    31.211668,
                    PatternHelper.getLineColor("line9")
                ),
                "xiaonanmen5230" to StationListBindingData(
                    "xiaonanmen5230",
                    "小南门",
                    "line9",
                    121.498298,
                    31.217011,
                    PatternHelper.getLineColor("line9")
                ),
                "shangchenglu5250" to StationListBindingData(
                    "shangchenglu5250",
                    "商城路",
                    "line9",
                    121.516312,
                    31.230397,
                    PatternHelper.getLineColor("line9")
                ),
                "shijidadao5270" to StationListBindingData(
                    "shijidadao5270",
                    "世纪大道",
                    "line9",
                    121.526895,
                    31.228963,
                    PatternHelper.getLineColor("line9")
                ),
                "yanggaozhonglu5290" to StationListBindingData(
                    "yanggaozhonglu5290",
                    "杨高中路",
                    "line9",
                    121.548594,
                    31.227446,
                    PatternHelper.getLineColor("line9")
                ),
            ), "line10" to mapOf(
                "hongqiaohuochezhan5510" to StationListBindingData(
                    "hongqiaohuochezhan5510",
                    "虹桥火车站",
                    "line10",
                    121.321479,
                    31.193949,
                    PatternHelper.getLineColor("line10")
                ),
                "hongqiao2haohangzhanlou5530" to StationListBindingData(
                    "hongqiao2haohangzhanlou5530",
                    "虹桥2号航站楼",
                    "line10",
                    121.326846,
                    31.194193,
                    PatternHelper.getLineColor("line10")
                ),
                "hongqiao1haohangzhanlou5550" to StationListBindingData(
                    "hongqiao1haohangzhanlou5550",
                    "虹桥1号航站楼",
                    "line10",
                    121.34741,
                    31.191364,
                    PatternHelper.getLineColor("line10")
                ),
                "shanghaidongwuyuan5570" to StationListBindingData(
                    "shanghaidongwuyuan5570",
                    "上海动物园",
                    "line10",
                    121.367018,
                    31.190289,
                    PatternHelper.getLineColor("line10")
                ),
                "hangzhonglu5590" to StationListBindingData(
                    "hangzhonglu5590",
                    "航中路",
                    "line10",
                    121.354725,
                    31.165701,
                    PatternHelper.getLineColor("line10")
                ),
                "zitenglu5610" to StationListBindingData(
                    "zitenglu5610",
                    "紫藤路",
                    "line10",
                    121.364404,
                    31.169778,
                    PatternHelper.getLineColor("line10")
                ),
                "longbaixincun5630" to StationListBindingData(
                    "longbaixincun5630",
                    "龙柏新村",
                    "line10",
                    121.370404,
                    31.177233,
                    PatternHelper.getLineColor("line10")
                ),
                "longxilu5650" to StationListBindingData(
                    "longxilu5650",
                    "龙溪路",
                    "line10",
                    121.379866,
                    31.194223,
                    PatternHelper.getLineColor("line10")
                ),
                "shuichenglu5670" to StationListBindingData(
                    "shuichenglu5670",
                    "水城路",
                    "line10",
                    121.391858,
                    31.199326,
                    PatternHelper.getLineColor("line10")
                ),
                "yililu5690" to StationListBindingData(
                    "yililu5690",
                    "伊犁路",
                    "line10",
                    121.404139,
                    31.198729,
                    PatternHelper.getLineColor("line10")
                ),
                "songyuanlu5710" to StationListBindingData(
                    "songyuanlu5710",
                    "宋园路",
                    "line10",
                    121.411952,
                    31.196605,
                    PatternHelper.getLineColor("line10")
                ),
                "hongqiaolu5730" to StationListBindingData(
                    "hongqiaolu5730",
                    "虹桥路",
                    "line10",
                    121.421594,
                    31.196919,
                    PatternHelper.getLineColor("line10")
                ),
                "jiaotongdaxue5750" to StationListBindingData(
                    "jiaotongdaxue5750",
                    "交通大学",
                    "line10",
                    121.434554,
                    31.202204,
                    PatternHelper.getLineColor("line10")
                ),
                "shanghaitushuguan5770" to StationListBindingData(
                    "shanghaitushuguan5770",
                    "上海图书馆",
                    "line10",
                    121.444356,
                    31.208086,
                    PatternHelper.getLineColor("line10")
                ),
                "shanxinanlu5790" to StationListBindingData(
                    "shanxinanlu5790",
                    "陕西南路",
                    "line10",
                    121.458835,
                    31.215839,
                    PatternHelper.getLineColor("line10")
                ),
                "xintiandi5810" to StationListBindingData(
                    "xintiandi5810",
                    "新天地",
                    "line10",
                    121.475153,
                    31.216088,
                    PatternHelper.getLineColor("line10")
                ),
                "laoximen5830" to StationListBindingData(
                    "laoximen5830",
                    "老西门",
                    "line10",
                    121.48291,
                    31.218929,
                    PatternHelper.getLineColor("line10")
                ),
                "yuyuan5850" to StationListBindingData(
                    "yuyuan5850",
                    "豫园",
                    "line10",
                    121.487321,
                    31.228259,
                    PatternHelper.getLineColor("line10")
                ),
                "nanjingdonglu5870" to StationListBindingData(
                    "nanjingdonglu5870",
                    "南京东路",
                    "line10",
                    121.484278,
                    31.237993,
                    PatternHelper.getLineColor("line10")
                ),
                "tiantonglu5890" to StationListBindingData(
                    "tiantonglu5890",
                    "天潼路",
                    "line10",
                    121.482215,
                    31.244345,
                    PatternHelper.getLineColor("line10")
                ),
                "sichuanbeilu5910" to StationListBindingData(
                    "sichuanbeilu5910",
                    "四川北路",
                    "line10",
                    121.484214,
                    31.251992,
                    PatternHelper.getLineColor("line10")
                ),
                "hailunlu5930" to StationListBindingData(
                    "hailunlu5930",
                    "海伦路",
                    "line10",
                    121.488858,
                    31.259009,
                    PatternHelper.getLineColor("line10")
                ),
                "youdianxincun5950" to StationListBindingData(
                    "youdianxincun5950",
                    "邮电新村",
                    "line10",
                    121.494281,
                    31.26855,
                    PatternHelper.getLineColor("line10")
                ),
                "sipinglu5970" to StationListBindingData(
                    "sipinglu5970",
                    "四平路",
                    "line10",
                    121.501601,
                    31.275148,
                    PatternHelper.getLineColor("line10")
                ),
                "tongjidaxue5990" to StationListBindingData(
                    "tongjidaxue5990",
                    "同济大学",
                    "line10",
                    121.506484,
                    31.282584,
                    PatternHelper.getLineColor("line10")
                ),
                "guoquanlu6010" to StationListBindingData(
                    "guoquanlu6010",
                    "国权路",
                    "line10",
                    121.510201,
                    31.289631,
                    PatternHelper.getLineColor("line10")
                ),
                "wujiaochang6030" to StationListBindingData(
                    "wujiaochang6030",
                    "五角场",
                    "line10",
                    121.514649,
                    31.298084,
                    PatternHelper.getLineColor("line10")
                ),
                "jiangwantiyuchang6050" to StationListBindingData(
                    "jiangwantiyuchang6050",
                    "江湾体育场",
                    "line10",
                    121.514084,
                    31.303025,
                    PatternHelper.getLineColor("line10")
                ),
                "sanmenlu6070" to StationListBindingData(
                    "sanmenlu6070",
                    "三门路",
                    "line10",
                    121.50812,
                    31.312977,
                    PatternHelper.getLineColor("line10")
                ),
                "yingaodonglu6090" to StationListBindingData(
                    "yingaodonglu6090",
                    "殷高东路",
                    "line10",
                    121.506585,
                    31.322106,
                    PatternHelper.getLineColor("line10")
                ),
                "xinjiangwancheng6110" to StationListBindingData(
                    "xinjiangwancheng6110",
                    "新江湾城",
                    "line10",
                    121.506596,
                    31.328814,
                    PatternHelper.getLineColor("line10")
                ),
            ), "line11" to mapOf(
                "huaqiao6270" to StationListBindingData(
                    "huaqiao6270",
                    "花桥",
                    "line11",
                    121.10414,
                    31.298605,
                    PatternHelper.getLineColor("line11")
                ),
                "guangminglu6290" to StationListBindingData(
                    "guangminglu6290",
                    "光明路",
                    "line11",
                    121.11763,
                    31.295734,
                    PatternHelper.getLineColor("line11")
                ),
                "zhaofenglu6310" to StationListBindingData(
                    "zhaofenglu6310",
                    "兆丰路",
                    "line11",
                    121.150081,
                    31.28888,
                    PatternHelper.getLineColor("line11")
                ),
                "anting6330" to StationListBindingData(
                    "anting6330",
                    "安亭",
                    "line11",
                    121.162097,
                    31.288447,
                    PatternHelper.getLineColor("line11")
                ),
                "shanghaiqichecheng6350" to StationListBindingData(
                    "shanghaiqichecheng6350",
                    "上海汽车城",
                    "line11",
                    121.180833,
                    31.285341,
                    PatternHelper.getLineColor("line11")
                ),
                "changjidonglu6370" to StationListBindingData(
                    "changjidonglu6370",
                    "昌吉东路",
                    "line11",
                    121.200378,
                    31.293595,
                    PatternHelper.getLineColor("line11")
                ),
                "shanghaisaichechang6390" to StationListBindingData(
                    "shanghaisaichechang6390",
                    "上海赛车场",
                    "line11",
                    121.226133,
                    31.331839,
                    PatternHelper.getLineColor("line11")
                ),
                "jiadingbei6410" to StationListBindingData(
                    "jiadingbei6410",
                    "嘉定北",
                    "line11",
                    121.2375,
                    31.391496,
                    PatternHelper.getLineColor("line11")
                ),
                "jiadingxi6430" to StationListBindingData(
                    "jiadingxi6430",
                    "嘉定西",
                    "line11",
                    121.227923,
                    31.377132,
                    PatternHelper.getLineColor("line11")
                ),
                "baiyinlu6450" to StationListBindingData(
                    "baiyinlu6450",
                    "白银路",
                    "line11",
                    121.245212,
                    31.345616,
                    PatternHelper.getLineColor("line11")
                ),
                "jiadingxincheng6470" to StationListBindingData(
                    "jiadingxincheng6470",
                    "嘉定新城",
                    "line11",
                    121.254425,
                    31.330085,
                    PatternHelper.getLineColor("line11")
                ),
                "malu6490" to StationListBindingData(
                    "malu6490",
                    "马陆",
                    "line11",
                    121.276209,
                    31.319365,
                    PatternHelper.getLineColor("line11")
                ),
                "chenxianggonglu6510" to StationListBindingData(
                    "chenxianggonglu6510",
                    "陈翔公路",
                    "line11",
                    121.306942,
                    31.306538,
                    PatternHelper.getLineColor("line11")
                ),
                "nanxiang6530" to StationListBindingData(
                    "nanxiang6530",
                    "南翔",
                    "line11",
                    121.323338,
                    31.296998,
                    PatternHelper.getLineColor("line11")
                ),
                "taopuxincun6550" to StationListBindingData(
                    "taopuxincun6550",
                    "桃浦新村",
                    "line11",
                    121.349414,
                    31.281727,
                    PatternHelper.getLineColor("line11")
                ),
                "wuweilu6570" to StationListBindingData(
                    "wuweilu6570",
                    "武威路",
                    "line11",
                    121.364751,
                    31.277071,
                    PatternHelper.getLineColor("line11")
                ),
                "qilianshanlu6590" to StationListBindingData(
                    "qilianshanlu6590",
                    "祁连山路",
                    "line11",
                    121.375907,
                    31.271549,
                    PatternHelper.getLineColor("line11")
                ),
                "liziyuanlu6610" to StationListBindingData(
                    "liziyuanlu6610",
                    "李子园",
                    "line11",
                    121.389963,
                    31.268886,
                    PatternHelper.getLineColor("line11")
                ),
                "shanghaixizhan6630" to StationListBindingData(
                    "shanghaixizhan6630",
                    "上海西站",
                    "line11",
                    121.401413,
                    31.26264,
                    PatternHelper.getLineColor("line11")
                ),
                "zhenru6650" to StationListBindingData(
                    "zhenru6650",
                    "真如",
                    "line11",
                    121.407298,
                    31.250592,
                    PatternHelper.getLineColor("line11")
                ),
                "fengqiaolu6670" to StationListBindingData(
                    "fengqiaolu6670",
                    "枫桥路",
                    "line11",
                    121.411046,
                    31.241973,
                    PatternHelper.getLineColor("line11")
                ),
                "caoyang6690" to StationListBindingData(
                    "caoyang6690",
                    "曹杨路",
                    "line11",
                    121.417678,
                    31.238746,
                    PatternHelper.getLineColor("line11")
                ),
                "longdelu6710" to StationListBindingData(
                    "longdelu6710",
                    "隆德路",
                    "line11",
                    121.423519,
                    31.230462,
                    PatternHelper.getLineColor("line11")
                ),
                "jiangsulu6730" to StationListBindingData(
                    "jiangsulu6730",
                    "江苏路",
                    "line11",
                    121.431286,
                    31.220193,
                    PatternHelper.getLineColor("line11")
                ),
                "jiaotongdaxue6750" to StationListBindingData(
                    "jiaotongdaxue6750",
                    "交通大学",
                    "line11",
                    121.434554,
                    31.202204,
                    PatternHelper.getLineColor("line11")
                ),
                "xujiahui6770" to StationListBindingData(
                    "xujiahui6770",
                    "徐家汇",
                    "line11",
                    121.436761,
                    31.194523,
                    PatternHelper.getLineColor("line11")
                ),
                "shanghaiyouyongguan6790" to StationListBindingData(
                    "shanghaiyouyongguan6790",
                    "上海游泳馆",
                    "line11",
                    121.441626,
                    31.179017,
                    PatternHelper.getLineColor("line11")
                ),
                "longhua6810" to StationListBindingData(
                    "longhua6810",
                    "龙华",
                    "line11",
                    121.452814,
                    31.173008,
                    PatternHelper.getLineColor("line11")
                ),
                "yunjinlu6830" to StationListBindingData(
                    "yunjinlu6830",
                    "云锦路",
                    "line11",
                    121.458502,
                    31.1664,
                    PatternHelper.getLineColor("line11")
                ),
                "longyaolu6850" to StationListBindingData(
                    "longyaolu6850",
                    "龙耀路",
                    "line11",
                    121.459551,
                    31.160026,
                    PatternHelper.getLineColor("line11")
                ),
                "dongfangtiyuzhongxin6870" to StationListBindingData(
                    "dongfangtiyuzhongxin6870",
                    "东方体育中心",
                    "line11",
                    121.480468,
                    31.153615,
                    PatternHelper.getLineColor("line11")
                ),
                "sanlin6890" to StationListBindingData(
                    "sanlin6890",
                    "三林",
                    "line11",
                    121.511001,
                    31.142967,
                    PatternHelper.getLineColor("line11")
                ),
                "sanlindong6910" to StationListBindingData(
                    "sanlindong6910",
                    "三林东",
                    "line11",
                    121.523174,
                    31.14651,
                    PatternHelper.getLineColor("line11")
                ),
                "pusanlu6930" to StationListBindingData(
                    "pusanlu6930",
                    "浦三路",
                    "line11",
                    121.539121,
                    31.150914,
                    PatternHelper.getLineColor("line11")
                ),
                "yuqiao6970" to StationListBindingData(
                    "yuqiao6970",
                    "御桥",
                    "line11",
                    121.570945,
                    31.1584,
                    PatternHelper.getLineColor("line11")
                ),
                "luoshanlu6990" to StationListBindingData(
                    "luoshanlu6990",
                    "罗山路",
                    "line11",
                    121.593209,
                    31.153303,
                    PatternHelper.getLineColor("line11")
                ),
                "xiuyanlu7010" to StationListBindingData(
                    "xiuyanlu7010",
                    "秀沿路",
                    "line11",
                    121.598769,
                    31.137857,
                    PatternHelper.getLineColor("line11")
                ),
                "kangxingonglu7030" to StationListBindingData(
                    "kangxingonglu7030",
                    "康新公路",
                    "line11",
                    121.617228,
                    31.130378,
                    PatternHelper.getLineColor("line11")
                ),
                "dishini7050" to StationListBindingData(
                    "dishini7050",
                    "迪士尼",
                    "line11",
                    121.668306,
                    31.141409,
                    PatternHelper.getLineColor("line11")
                ),
            ), "line12" to mapOf(
                "qishenlu7090" to StationListBindingData(
                    "qishenlu7090",
                    "七莘路",
                    "line12",
                    121.363236,
                    31.132038,
                    PatternHelper.getLineColor("line12")
                ),
                "hongshenlu7110" to StationListBindingData(
                    "hongshenlu7110",
                    "虹莘路",
                    "line12",
                    121.379365,
                    31.137289,
                    PatternHelper.getLineColor("line12")
                ),
                "gudailu7130" to StationListBindingData(
                    "gudailu7130",
                    "顾戴路",
                    "line12",
                    121.392378,
                    31.140928,
                    PatternHelper.getLineColor("line12")
                ),
                "donglanlu7150" to StationListBindingData(
                    "donglanlu7150",
                    "东兰路",
                    "line12",
                    121.392169,
                    31.155168,
                    PatternHelper.getLineColor("line12")
                ),
                "hongmeilu7170" to StationListBindingData(
                    "hongmeilu7170",
                    "虹梅路",
                    "line12",
                    121.397435,
                    31.160221,
                    PatternHelper.getLineColor("line12")
                ),
                "hongcaolu7190" to StationListBindingData(
                    "hongcaolu7190",
                    "虹漕路",
                    "line12",
                    121.410502,
                    31.163979,
                    PatternHelper.getLineColor("line12")
                ),
                "guilingongyuan7210" to StationListBindingData(
                    "guilingongyuan7210",
                    "桂林公园",
                    "line12",
                    121.418669,
                    31.166792,
                    PatternHelper.getLineColor("line12")
                ),
                "caobaolu7230" to StationListBindingData(
                    "caobaolu7230",
                    "漕宝路",
                    "line12",
                    121.435039,
                    31.168308,
                    PatternHelper.getLineColor("line12")
                ),
                "longcaolu7250" to StationListBindingData(
                    "longcaolu7250",
                    "龙漕路",
                    "line12",
                    121.444209,
                    31.169935,
                    PatternHelper.getLineColor("line12")
                ),
                "longhua7270" to StationListBindingData(
                    "longhua7270",
                    "龙华",
                    "line12",
                    121.452814,
                    31.173008,
                    PatternHelper.getLineColor("line12")
                ),
                "longhuazhonglu7290" to StationListBindingData(
                    "longhuazhonglu7290",
                    "龙华中路",
                    "line12",
                    121.457183,
                    31.185069,
                    PatternHelper.getLineColor("line12")
                ),
                "damuqiaolu7310" to StationListBindingData(
                    "damuqiaolu7310",
                    "大木桥路",
                    "line12",
                    121.463634,
                    31.194274,
                    PatternHelper.getLineColor("line12")
                ),
                "jiashanlu7330" to StationListBindingData(
                    "jiashanlu7330",
                    "嘉善路",
                    "line12",
                    121.460783,
                    31.202906,
                    PatternHelper.getLineColor("line12")
                ),
                "shanxinanlu7350" to StationListBindingData(
                    "shanxinanlu7350",
                    "陕西南路",
                    "line12",
                    121.458835,
                    31.215839,
                    PatternHelper.getLineColor("line12")
                ),
                "nanjingxilu7370" to StationListBindingData(
                    "nanjingxilu7370",
                    "南京西路",
                    "line12",
                    121.460734,
                    31.22887,
                    PatternHelper.getLineColor("line12")
                ),
                "hanzhonglu7390" to StationListBindingData(
                    "hanzhonglu7390",
                    "汉中路",
                    "line12",
                    121.458756,
                    31.241062,
                    PatternHelper.getLineColor("line12")
                ),
                "xinzhalu7410" to StationListBindingData(
                    "xinzhalu7410",
                    "新闸路",
                    "line12",
                    121.468316,
                    31.238599,
                    PatternHelper.getLineColor("line12")
                ),
                "tiantonglu7430" to StationListBindingData(
                    "tiantonglu7430",
                    "天潼路",
                    "line12",
                    121.482215,
                    31.244345,
                    PatternHelper.getLineColor("line12")
                ),
                "guojikeyunzhongxin7450" to StationListBindingData(
                    "guojikeyunzhongxin7450",
                    "国际客运中心",
                    "line12",
                    121.498269,
                    31.250195,
                    PatternHelper.getLineColor("line12")
                ),
                "tilanqiao7470" to StationListBindingData(
                    "tilanqiao7470",
                    "提篮桥",
                    "line12",
                    121.506695,
                    31.253504,
                    PatternHelper.getLineColor("line12")
                ),
                "dalianlu7490" to StationListBindingData(
                    "dalianlu7490",
                    "大连路",
                    "line12",
                    121.513012,
                    31.258,
                    PatternHelper.getLineColor("line12")
                ),
                "jiangpugongyuan7510" to StationListBindingData(
                    "jiangpugongyuan7510",
                    "江浦公园",
                    "line12",
                    121.52377,
                    31.264624,
                    PatternHelper.getLineColor("line12")
                ),
                "ningguolu7530" to StationListBindingData(
                    "ningguolu7530",
                    "宁国路",
                    "line12",
                    121.532603,
                    31.268698,
                    PatternHelper.getLineColor("line12")
                ),
                "longchanglu7550" to StationListBindingData(
                    "longchanglu7550",
                    "隆昌路",
                    "line12",
                    121.544413,
                    31.27511,
                    PatternHelper.getLineColor("line12")
                ),
                "aiguolu7570" to StationListBindingData(
                    "aiguolu7570",
                    "爱国路",
                    "line12",
                    121.553038,
                    31.280014,
                    PatternHelper.getLineColor("line12")
                ),
                "fuxingdao7590" to StationListBindingData(
                    "fuxingdao7590",
                    "复兴岛",
                    "line12",
                    121.56144,
                    31.28087,
                    PatternHelper.getLineColor("line12")
                ),
                "donglulu7610" to StationListBindingData(
                    "donglulu7610",
                    "东陆路",
                    "line12",
                    121.578789,
                    31.282608,
                    PatternHelper.getLineColor("line12")
                ),
                "jufenglu7630" to StationListBindingData(
                    "jufenglu7630",
                    "巨峰路",
                    "line12",
                    121.589019,
                    31.280517,
                    PatternHelper.getLineColor("line12")
                ),
                "yanggaobeilu7650" to StationListBindingData(
                    "yanggaobeilu7650",
                    "杨高北路",
                    "line12",
                    121.602868,
                    31.280101,
                    PatternHelper.getLineColor("line12")
                ),
                "jinjinglu7670" to StationListBindingData(
                    "jinjinglu7670",
                    "金京路",
                    "line12",
                    121.615622,
                    31.27976,
                    PatternHelper.getLineColor("line12")
                ),
                "shenjianglu7690" to StationListBindingData(
                    "shenjianglu7690",
                    "申江路",
                    "line12",
                    121.627208,
                    31.280213,
                    PatternHelper.getLineColor("line12")
                ),
                "jinhailu7710" to StationListBindingData(
                    "jinhailu7710",
                    "金海路",
                    "line12",
                    121.638668,
                    31.263052,
                    PatternHelper.getLineColor("line12")
                ),
            ), "line13" to mapOf(
                "jinyunlu7850" to StationListBindingData(
                    "jinyunlu7850",
                    "金运路",
                    "line13",
                    121.319595,
                    31.240998,
                    PatternHelper.getLineColor("line13")
                ),
                "jinshajiangxilu7870" to StationListBindingData(
                    "jinshajiangxilu7870",
                    "金沙江西路",
                    "line13",
                    121.335225,
                    31.24112,
                    PatternHelper.getLineColor("line13")
                ),
                "fengzhuang7890" to StationListBindingData(
                    "fengzhuang7890",
                    "丰庄",
                    "line13",
                    121.355633,
                    31.242442,
                    PatternHelper.getLineColor("line13")
                ),
                "qilianshannanlu7910" to StationListBindingData(
                    "qilianshannanlu7910",
                    "祁连山南路",
                    "line13",
                    121.367541,
                    31.237405,
                    PatternHelper.getLineColor("line13")
                ),
                "zhenbeilu7930" to StationListBindingData(
                    "zhenbeilu7930",
                    "真北路",
                    "line13",
                    121.382262,
                    31.232202,
                    PatternHelper.getLineColor("line13")
                ),
                "daduhelu7950" to StationListBindingData(
                    "daduhelu7950",
                    "大渡河路",
                    "line13",
                    121.395108,
                    31.231786,
                    PatternHelper.getLineColor("line13")
                ),
                "jinshajianglu7970" to StationListBindingData(
                    "jinshajianglu7970",
                    "金沙江路",
                    "line13",
                    121.413002,
                    31.231898,
                    PatternHelper.getLineColor("line13")
                ),
                "longdelu7990" to StationListBindingData(
                    "longdelu7990",
                    "隆德路",
                    "line13",
                    121.423519,
                    31.230462,
                    PatternHelper.getLineColor("line13")
                ),
                "wuninglu8010" to StationListBindingData(
                    "wuninglu8010",
                    "武宁路",
                    "line13",
                    121.430245,
                    31.233939,
                    PatternHelper.getLineColor("line13")
                ),
                "changshoulu8030" to StationListBindingData(
                    "changshoulu8030",
                    "长寿路",
                    "line13",
                    121.438338,
                    31.240367,
                    PatternHelper.getLineColor("line13")
                ),
                "jiangninglu8050" to StationListBindingData(
                    "jiangninglu8050",
                    "江宁路",
                    "line13",
                    121.444146,
                    31.244199,
                    PatternHelper.getLineColor("line13")
                ),
                "hanzhonglu8070" to StationListBindingData(
                    "hanzhonglu8070",
                    "汉中路",
                    "line13",
                    121.458756,
                    31.241062,
                    PatternHelper.getLineColor("line13")
                ),
                "ziranbowuguan8090" to StationListBindingData(
                    "ziranbowuguan8090",
                    "自然博物馆",
                    "line13",
                    121.462793,
                    31.235817,
                    PatternHelper.getLineColor("line13")
                ),
                "nanjingxilu8110" to StationListBindingData(
                    "nanjingxilu8110",
                    "南京西路",
                    "line13",
                    121.460734,
                    31.22887,
                    PatternHelper.getLineColor("line13")
                ),
                "huaihaizhonglu8130" to StationListBindingData(
                    "huaihaizhonglu8130",
                    "淮海中路",
                    "line13",
                    121.46419,
                    31.220097,
                    PatternHelper.getLineColor("line13")
                ),
                "xintiandi8150" to StationListBindingData(
                    "xintiandi8150",
                    "新天地",
                    "line13",
                    121.475153,
                    31.216088,
                    PatternHelper.getLineColor("line13")
                ),
                "madanglu8170" to StationListBindingData(
                    "madanglu8170",
                    "马当路",
                    "line13",
                    121.476777,
                    31.209447,
                    PatternHelper.getLineColor("line13")
                ),
                "shibohuibowuguan8190" to StationListBindingData(
                    "shibohuibowuguan8190",
                    "世博会博物馆",
                    "line13",
                    121.481959,
                    31.196866,
                    PatternHelper.getLineColor("line13")
                ),
                "shibodadao8210" to StationListBindingData(
                    "shibodadao8210",
                    "世博大道",
                    "line13",
                    121.484392,
                    31.182492,
                    PatternHelper.getLineColor("line13")
                ),
                "changqinglu8230" to StationListBindingData(
                    "changqinglu8230",
                    "长清路",
                    "line13",
                    121.486102,
                    31.174594,
                    PatternHelper.getLineColor("line13")
                ),
                "chengshanlu8250" to StationListBindingData(
                    "chengshanlu8250",
                    "成山路",
                    "line13",
                    121.496164,
                    31.170842,
                    PatternHelper.getLineColor("line13")
                ),
                "dongminglu8270" to StationListBindingData(
                    "dongminglu8270",
                    "东明路",
                    "line13",
                    121.510946,
                    31.172531,
                    PatternHelper.getLineColor("line13")
                ),
            ), "line16" to mapOf(
                "longyanglu9730" to StationListBindingData(
                    "longyanglu9730",
                    "龙阳路",
                    "line16",
                    121.557498,
                    31.202813,
                    PatternHelper.getLineColor("line16")
                ),
                "huaxiazhonglu9750" to StationListBindingData(
                    "huaxiazhonglu9750",
                    "华夏中路",
                    "line16",
                    121.583416,
                    31.175047,
                    PatternHelper.getLineColor("line16")
                ),
                "luoshanlu9770" to StationListBindingData(
                    "luoshanlu9770",
                    "罗山路",
                    "line16",
                    121.593209,
                    31.153303,
                    PatternHelper.getLineColor("line16")
                ),
                "zhoupudong9790" to StationListBindingData(
                    "zhoupudong9790",
                    "周浦东",
                    "line16",
                    121.606945,
                    31.110039,
                    PatternHelper.getLineColor("line16")
                ),
                "heshahangcheng9810" to StationListBindingData(
                    "heshahangcheng9810",
                    "鹤沙航城",
                    "line16",
                    121.611194,
                    31.077747,
                    PatternHelper.getLineColor("line16")
                ),
                "hangtoudong9830" to StationListBindingData(
                    "hangtoudong9830",
                    "航头东",
                    "line16",
                    121.617469,
                    31.055038,
                    PatternHelper.getLineColor("line16")
                ),
                "xinchang9850" to StationListBindingData(
                    "xinchang9850",
                    "新场",
                    "line16",
                    121.648782,
                    31.045406,
                    PatternHelper.getLineColor("line16")
                ),
                "shanghaiyeshengdongwuyuan9870" to StationListBindingData(
                    "shanghaiyeshengdongwuyuan9870",
                    "野生动物园",
                    "line16",
                    121.699712,
                    31.050298,
                    PatternHelper.getLineColor("line16")
                ),
                "huinan9890" to StationListBindingData(
                    "huinan9890",
                    "惠南",
                    "line16",
                    121.761937,
                    31.05377,
                    PatternHelper.getLineColor("line16")
                ),
                "huinandong9910" to StationListBindingData(
                    "huinandong9910",
                    "惠南东",
                    "line16",
                    121.793308,
                    31.026418,
                    PatternHelper.getLineColor("line16")
                ),
                "shuyuan9930" to StationListBindingData(
                    "shuyuan9930",
                    "书院",
                    "line16",
                    121.850623,
                    30.959356,
                    PatternHelper.getLineColor("line16")
                ),
                "lingangdadao9950" to StationListBindingData(
                    "lingangdadao9950",
                    "临港大道",
                    "line16",
                    121.910344,
                    30.924006,
                    PatternHelper.getLineColor("line16")
                ),
                "dishuihu9970" to StationListBindingData(
                    "dishuihu9970",
                    "滴水湖",
                    "line16",
                    121.92955,
                    30.907127,
                    PatternHelper.getLineColor("line16")
                ),
            )
        )
    }
}