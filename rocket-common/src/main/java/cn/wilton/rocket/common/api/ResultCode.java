package cn.wilton.rocket.common.api;

/**
* 枚举了一些常用API操作码
* @Description
* @Author: Ranger
* @Date: 2021/1/15 10:27
* @Email: wilton.icp@gmail.com
*/
public enum ResultCode implements IErrorCode {
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");
    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }
    @Override
    public long getCode() {
        return code;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
