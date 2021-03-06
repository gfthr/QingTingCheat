package master.flame.danmaku.danmaku.loader.android;

import android.net.Uri;
import java.io.InputStream;
import master.flame.danmaku.danmaku.loader.ILoader;
import master.flame.danmaku.danmaku.loader.IllegalDataException;
import master.flame.danmaku.danmaku.parser.android.JSONSource;

public class AcFunDanmakuLoader
  implements ILoader
{
  private static volatile AcFunDanmakuLoader instance;
  private JSONSource dataSource;

  public static ILoader instance()
  {
    if (instance == null);
    try
    {
      if (instance == null)
        instance = new AcFunDanmakuLoader();
      return instance;
    }
    finally
    {
    }
  }

  public JSONSource getDataSource()
  {
    return this.dataSource;
  }

  public void load(InputStream paramInputStream)
    throws IllegalDataException
  {
    try
    {
      this.dataSource = new JSONSource(paramInputStream);
      return;
    }
    catch (Exception localException)
    {
      throw new IllegalDataException(localException);
    }
  }

  public void load(String paramString)
    throws IllegalDataException
  {
    try
    {
      this.dataSource = new JSONSource(Uri.parse(paramString));
      return;
    }
    catch (Exception localException)
    {
      throw new IllegalDataException(localException);
    }
  }
}

/* Location:           /Users/zhangxun-xy/Downloads/qingting2/classes_dex2jar.jar
 * Qualified Name:     master.flame.danmaku.danmaku.loader.android.AcFunDanmakuLoader
 * JD-Core Version:    0.6.2
 */