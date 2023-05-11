package com.example.demo;

// Import classes:
import com.elasticemail.client.ApiClient;
import com.elasticemail.client.ApiException;
import com.elasticemail.client.Configuration;
import com.elasticemail.client.auth.*;
import com.elasticemail.client.models.*;
import com.elasticemail.api.EmailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.elasticemail.com/v4");

        // Configure API key authorization: apikey
        ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
        apikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apikey.setApiKeyPrefix("Token");

        EmailsApi apiInstance = new EmailsApi(defaultClient);
        EmailMessageData emailMessageData = new EmailMessageData(); // EmailMessageData | Email data
        try {
            EmailSend result = apiInstance.emailsPost(emailMessageData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailsApi#emailsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

