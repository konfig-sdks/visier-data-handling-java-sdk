package com.konfigthis.client;

import com.konfigthis.client.api.DataAndJobHandlingApi;

public class VisierDataHandling {
    private ApiClient apiClient;
    public final DataAndJobHandlingApi dataAndJobHandling;

    public VisierDataHandling() {
        this(null);
    }

    public VisierDataHandling(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.dataAndJobHandling = new DataAndJobHandlingApi(this.apiClient);
    }

}
