package app.com.mvpgwc.model;

import app.com.mvpgwc.bean.ShopBean;

/**
 * Created by lenovo on 2017/11/21.
 */

public interface MainModelCallBack {
    public void success(ShopBean bean);//成功的接口
    public void failure(Exception e);//失败的接口
}
