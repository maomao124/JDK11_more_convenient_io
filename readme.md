

## 更方便的IO

### Path

此前我们需要使用 Paths.get()。现在，我们像其他类一样使用 of()



```java
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
```





### Files

writeString(Path, CharSequence) 我们可以使用该方法来保存一个 String 字符串

```java
package mao;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Project name(项目名称)：JDK11_more_convenient_io
 * Package(包名): mao
 * Class(类名): Test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/2
 * Time(创建时间)： 17:20
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test2
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("./a.txt");
        Files.writeString(file.toPath(), "hello");
    }
}
```





我们可以使用readString(Path)方法来读取一个 String 字符串

```java
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
```







### Reader

使用nullReader()方法，我们可以得到一个不执行任何操作的 Reader



```java
package mao;

import java.io.IOException;
import java.io.Reader;

/**
 * Project name(项目名称)：JDK11_more_convenient_io
 * Package(包名): mao
 * Class(类名): Test4
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/2
 * Time(创建时间)： 17:24
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test4
{
    public static void main(String[] args) throws IOException
    {
        Reader reader = Reader.nullReader();
        System.out.println(reader);
        System.out.println(reader.read());
    }
}
```



```sh
java.io.Reader$1@3b07d329
-1
```





### Writer

使用nullWriter() 方法，我们可以得到一个不执行任何操作的 Writer



```java
package mao;

import java.io.IOException;
import java.io.Writer;

/**
 * Project name(项目名称)：JDK11_more_convenient_io
 * Package(包名): mao
 * Class(类名): Test5
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/2
 * Time(创建时间)： 17:25
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test5
{
    public static void main(String[] args) throws IOException
    {
        Writer writer = Writer.nullWriter();
        System.out.println(writer);
        writer.write("abc");
    }
}
```





### InputStream

nullInputStream() 使用该方法，我们可以得到一个不执行任何操作的 InputStream

```java
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
```





InputStream 有了一个非常有用的方法：transferTo，可以用来将数据直接传输到 OutputStream，这是在处理原始数据流时非常常见的一种用法

```java
package mao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Project name(项目名称)：JDK11_more_convenient_io
 * Package(包名): mao
 * Class(类名): Test7
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/2
 * Time(创建时间)： 17:31
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test7
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream("a.txt");
        fileInputStream.transferTo(new FileOutputStream("c.txt"));
    }
}
```





### OutputStream

使用该方法，我们可以得到一个不执行任何操作的 OutputStream

```java
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
```







