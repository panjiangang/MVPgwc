package app.com.mvpgwc.model;

import app.com.mvpgwc.bean.ShopBean;
import app.com.mvpgwc.okhttp.AbstractUiCallBack;
import app.com.mvpgwc.okhttp.OkhttpUtils;

/**
 * Created by lenovo on 2017/11/21.
 */

public class MainModel {
    public void getData(final MainModelCallBack callBack) {
        OkhttpUtils.getInstance().asy(null, "http://120.27.23.105/product/getCarts?uid=100", new AbstractUiCallBack<ShopBean>() {

            @Override
            public void success(ShopBean shopBean) {
                callBack.success(shopBean);
            }

            @Override
            public void failure(Exception e) {
                callBack.failure(e);
            }
        });
    }
}
