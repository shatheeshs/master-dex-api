package com.dex.util;

public class DEXDataResponse<T> {

    private T object;
    private int status;
    private boolean success;


    public DEXDataResponse(T object, int status) {
        this.object = object;
        this.status = status;
    }

    public T getReturnData() {
        return this.object;
    }

    public void setReturnData(T object) {
        this.object = object;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean _isSuccess() {
        return this.status == Constants.SUCCESS;
    }

}
