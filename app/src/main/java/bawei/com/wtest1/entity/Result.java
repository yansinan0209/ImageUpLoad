package bawei.com.wtest1.entity;

/**
 * Create by ysn on 2019/7/6
 */
public class Result<T> {

    private String message = "请求失败";
    private String status = "-1";
    private T result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
