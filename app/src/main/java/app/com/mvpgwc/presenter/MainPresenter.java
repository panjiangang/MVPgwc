package app.com.mvpgwc.presenter;

import app.com.mvpgwc.bean.ShopBean;
import app.com.mvpgwc.model.MainModel;
import app.com.mvpgwc.model.MainModelCallBack;
import app.com.mvpgwc.view.MainViewListener;

/**
 * Created by lenovo on 2017/11/21.
 */

public class MainPresenter {
    private MainViewListener mainViewListener;
    private MainModel mainModel;

    public MainPresenter(MainViewListener mainViewListener) {
        this.mainViewListener = mainViewListener;
        this.mainModel = new MainModel();
    }

    public void getDate() {
        mainModel.getData(new MainModelCallBack() {
            @Override
            public void success(ShopBean bean) {
                if (mainViewListener != null) {
                    mainViewListener.success(bean);
                }
            }

            @Override
            public void failure(Exception e) {
                if (mainViewListener != null) {
                    mainViewListener.failure(e);
                }
            }
        });
    }

    public void detach() {
        mainViewListener = null;
    }

}
