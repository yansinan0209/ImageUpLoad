package bawei.com.wtest1.contract;

import bawei.com.wtest1.entity.Result;

/**
 * Create by ysn on 2019/7/6
 */
public interface DataCall {

    void success(Result data);//成功

    void fail(Result result);//失败
}
