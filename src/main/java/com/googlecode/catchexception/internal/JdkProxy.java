package com.googlecode.catchexception.internal;

/**
 * Marks a proxy as generated by {@link JdkProxyFactory}. This is useful for
 * testing.
 * <p>
 * EXAMPLE:
 * <code><pre>assert new JdkProxyFactory(...).createProxy(obj) instanceof JdkProxy;
 * </pre></code>
 * 
 * @author rwoo
 */
public interface JdkProxy {
    // empty by purpose
}
