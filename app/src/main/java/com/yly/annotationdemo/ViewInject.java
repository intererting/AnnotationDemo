package com.yly.annotationdemo;

/**
 * Created by zhy on 16/4/22.
 */
public interface ViewInject<T>
{
    void inject(T t, Object source);
}
