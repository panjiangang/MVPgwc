package app.com.mvpgwc.view;

import app.com.mvpgwc.bean.ShopBean;

/**
 * Created by lenovo on 2017/11/21.
 */

public interface MainViewListener {
    public void success(ShopBean bean);//成功的接口
    public void failure(Exception e);//失败的接口

}
