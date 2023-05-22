package com.ujbj.test.regex;

public class Test2 {
    /**
     * 需求
     * 1. 请编写正则表达式验证用户名是否满足要求。
     * 要求: 大小写字母，数字，下划线一共4-16位
     * 2. 请编写正则表达式验证身份证号码是否满足要求。
     * 2.1 简单要求: 18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
     * 2.2 复杂要求: 按照身份证号码的格式严格要求。
     * @param args
     */
    public static void main(String[] args) {
        // 1. 大小写字母，数字，下划线一共4-16位大小写字母，数字，下划线一共4-16位
        String regex1 = "\\w{4,16}";
        System.out.println("abcABC123_".matches(regex1));
        // 2. 正则表达式验证身份证号码
        // 2.1 18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
        String regex2 = "\\d{17}[xX0\\d]";
        System.out.println("12345678901234567X".matches(regex2));
        // 2.2 复杂要求: 按照身份证号码的格式严格要求。
        // 410801 1993 02 28 457x
        // 1. 前面6位: 省份，市区，派出所等信息 第一位不能是0，后面5位是任意数字
        // 2. 2位: 年的前面半段: 18 19 20
        // 3. 2位: 年的后半段: 任意数字出现两次
        // 4. 2位: 月份: 01~09 10 11 12
        // 5. 2位: 日期: 01~31
        // 6. 后面四位: 任意数字出现3次 最后一位可以是数字也可以是大写的或者小写x
        System.out.println("----- 身份证 -----");
        String regex3 = "[\\d&&[^0]]\\d{5}(18|19|20)\\d{2}((0[1-9])|(1[0-2]))((0[1-9])|([12][0-9])|(3[01]))\\d{3}[xX\\d]";
        System.out.println("41080119930228457x".matches(regex3));

        String str = new String("嵇开梦 44090119760311922X嵇开梦 360730199110167653杨儒熙 140501198111035371陆堂诞 450481197804234431邱谷兰 360830197604012922高先伊 621022199002015237皮悦欣 411525198805116966阮琪霏 610582197504156576贺剑佛 410611198308045737姚文冲 410327198006137139郎康焕 522601199210248092裘诗翠 53042219880104926X元羿谆 451023199010043419宣芷珊 530926198611154467危志承 420104198912285551祁落兴 410927199112015570咎琅升 610625197909191976章以晴 220802198107141182周吉钟 320100198912195637乐颢锵 211005197607069877吉灵上 445122198011048058邹凡睦 623021197501077471房枝迟 330183198504077335凌寒显 422827199112135538唐静槐 610701199012217629危觅双 320100197910062940咎梦玉 220112197712157203尹夏瑶 511321198312224288钟乐儿 511181199105134124酆诗珊 450421198908219082顾淳雅 532628198308103753耿语梦 152530199401036428梁超南 620800199410081561芮蒙蒙 652301198112064829马南珍 350823199102140928");

        String[] arr = str.split(regex3);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%2d: %s\n", i, arr[i]);
        }

    }
}