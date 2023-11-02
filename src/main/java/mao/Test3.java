package mao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Project name(项目名称)：JDK11_more_convenient_io
 * Package(包名): mao
 * Class(类名): Test3
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/2
 * Time(创建时间)： 17:22
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test3
{
    public static void main(String[] args) throws IOException
    {
        System.out.println(Files.readString(Path.of("./a.txt")));
    }
}
