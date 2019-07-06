package bawei.com.wtest1.presenter;

import bawei.com.wtest1.contract.BaseModel;
import bawei.com.wtest1.contract.DataCall;
import bawei.com.wtest1.model.UserApi;
import io.reactivex.Observable;

/**
 * Create by ysn on 2019/7/6
 */
public class UserPresenter extends BaseModel{

    public UserPresenter(DataCall dataCall) {
        super(dataCall);
    }

    @Override
    protected Observable getModel(UserApi userApi, Object... args) {
        return userApi.userPic("954","1562389740464954");
    }
}
