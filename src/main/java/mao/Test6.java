package mao;

import java.io.IOException;
import java.io.InputStream;

/**
 * Project name(项目名称)：JDK11_more_convenient_io
 * Package(包名): mao
 * Class(类名): Test6
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/2
 * Time(创建时间)： 17:29
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test6
{
    public static void main(String[] args) throws IOException
    {
        InputStream inputStream = InputStream.nullInputStream();
        System.out.println(inputStream);
        int read = inputStream.read();
        System.out.println(read);
    }
}
