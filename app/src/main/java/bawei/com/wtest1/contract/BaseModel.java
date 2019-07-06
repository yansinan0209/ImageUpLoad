package bawei.com.wtest1.contract;

import bawei.com.wtest1.entity.Result;
import bawei.com.wtest1.model.UserApi;
import bawei.com.wtest1.util.RetrofitUtil;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Create by ysn on 2019/7/6
 */
public abstract class BaseModel {

    private DataCall dataCall;

    //构造方法
    public BaseModel(DataCall dataCall) {
        this.dataCall = dataCall;
    }

    public void requestData(Object...args){

        UserApi userApi = RetrofitUtil.getInstance().create(UserApi.class);

        getModel(userApi,args).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .onErrorReturn(new Function<Throwable,Result>() {
                    @Override
                    public Result apply(Throwable o) throws Exception {
                        o.printStackTrace();
                        return new Result();
                    }
                })
                .subscribe(new Consumer<Result>() {
                    @Override
                    public void accept(Result result) throws Exception {
                        if ("0000".equals(result.getStatus())){
                            dataCall.success(result);
                        }else{
                            dataCall.fail(result);
                        }
                    }
                });

    }

    protected abstract Observable getModel(UserApi userApi,Object...args);
}
