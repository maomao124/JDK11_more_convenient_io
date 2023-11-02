package mao;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Project name(项目名称)：JDK11_more_convenient_io
 * Package(包名): mao
 * Class(类名): Test1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/2
 * Time(创建时间)： 17:16
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test1
{
    public static void main(String[] args)
    {
        Path path = Paths.get("./");
        Path path1 = Path.of("./");
        System.out.println(path);
        System.out.println(path1);
    }
}
