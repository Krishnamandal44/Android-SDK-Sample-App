package com.payu.testapp.onetap;

import java.util.HashMap;

/**
 * Created by rahulhooda on 23/2/16.
 */
public interface FetchMerchantHashesCallBack {

    /**
     * This will provide all merchant hashes and card tokens which are stored on merchant server.
     * */
    void fetchMerchantHashesAPIResponse(HashMap<String, String> oneClickTokens);
}
