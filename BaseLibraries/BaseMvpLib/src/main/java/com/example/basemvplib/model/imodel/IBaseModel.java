package com.example.basemvplib.model.imodel;

/**
 * @ClassName: IBaseModel
 * @author create by Tang
 * @date date 16/9/29 上午11:26
 * @Description: Model基础接口
 */
public interface IBaseModel {

    void sendRequestToServer();

    void setApiInterface(String apiInterface);

    void setServerAddress(String address);

    void setMethod(int method);

    void cancelRequest();


}
