package com.drivertools.service;

/**
 * Created by Vasya on 21.03.2015.
 */
public class Constants {
    /*
    ids and othe locators from LoginPage
     */
    public static final String LOGIN_BUTTON_ID = "login-btn";
    public static final String LOGIN_EMAIL_ID = "inputLoginEmail";
    public static final String LOGIN_PASSWORD_ID = "login_password";
//    public static final String LOGIN_LINK_CSS = "html.ng-scope body div.ng-scope" +
//            " ui-view.ng-scope div#login-tab.ng-scope div.container div.row" +
//            " div.col-lg-8.col-lg-offset-2.margin_top_10_proc" +
//            " ul.nav.nav-tabs.autorization_tabs li a.ng-binding";
    public static final String LOGIN_LINK_CSS = "a[href*=index]";
    public static final String REGISTER_LINK_CSS = "html.ng-scope body div.ng-scope" +
            " ui-view.ng-scope div#login-tab.ng-scope div.container" +
            " div.row div.col-lg-8.col-lg-offset-2.margin_top_10_proc" +
            " ul.nav.nav-tabs.autorization_tabs li.active a.ng-binding";
    /*
        ids and locators from Settings page
     */
    public static final String CALENDAR_ID = "123";

    /*
    test credentials to login
     */
    public static final String TEST_EMAIL = "test56@mail.com";
    public static String TEST_PASSWORD = "test56";

    /*
    URLs
     */
    public static String LOGIN_PAGE_URL_ENDING = "index/login";
    public static final String SETTINGS_PAGE_URL_ENDING = "client/settings";
    public static final String LOGIN_PAGE_URL_START = "http://rotterdam-cj5.rhcloud.com";

}
