package bawei.com.wtest1.model;

import bawei.com.wtest1.contract.Constant;
import bawei.com.wtest1.entity.Result;
import bawei.com.wtest1.entity.UserPic;
import io.reactivex.Observable;
import okhttp3.MultipartBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Create by ysn on 2019/7/6
 */
public interface UserApi {

    @Multipart
    @POST(Constant.UPLOAD_URL)
    Observable<Result> upload(@Header("userId") String userId,
                              @Header("sessionId") String sessionId,
                              @Part MultipartBody.Part file);

    @GET(Constant.USER_URL)
    Observable<Result<UserPic>> userPic(@Header("userId") String userId,
                                        @Header("sessionId") String sessionId);

}
