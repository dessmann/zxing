package com.zxing;

import android.os.Bundle;

import com.google.zxing.Result;

/**
 * Created by dccjll on 2017/3/7.
 * 二维码扫描通用接口
 */

interface QRScanInterface {
    void handleDecode(Result rawResult, Bundle bundle);
}
