package bawei.com.wtest1.presenter;

import bawei.com.wtest1.contract.BaseModel;
import bawei.com.wtest1.contract.DataCall;
import bawei.com.wtest1.model.UserApi;
import io.reactivex.Observable;
import okhttp3.MultipartBody;

/**
 * Create by ysn on 2019/7/6
 */
public class UpLoadPresenter extends BaseModel{

    public UpLoadPresenter(DataCall dataCall) {
        super(dataCall);
    }

    @Override
    protected Observable getModel(UserApi userApi, Object... args) {
        return userApi.upload("954",
                "1562389740464954",
                (MultipartBody.Part) args[0]);
    }
}
