package fm.qingting.async;

import java.security.cert.X509Certificate;

public abstract interface AsyncSSLSocket extends AsyncSocket
{
  public abstract X509Certificate[] getPeerCertificates();
}

/* Location:           /Users/zhangxun-xy/Downloads/qingting2/classes_dex2jar.jar
 * Qualified Name:     fm.qingting.async.AsyncSSLSocket
 * JD-Core Version:    0.6.2
 */