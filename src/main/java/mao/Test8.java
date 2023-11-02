package mao;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * Project name(项目名称)：JDK11_more_convenient_io
 * Package(包名): mao
 * Class(类名): Test8
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/2
 * Time(创建时间)： 17:34
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test8
{
    public static void main(String[] args) throws IOException
    {
        OutputStream outputStream = OutputStream.nullOutputStream();
        System.out.println(outputStream);
        outputStream.write("123".getBytes(StandardCharsets.UTF_8));
    }
}
