## zuul-oauth2-tutorial

* composite application
    * base-application 1 & 2 used for testing configuration
        * changing config files on the fly will cause app to hit base app 1 or 2
    * zuul-application
        * controls routes uses spring config server to read - [config files](https://github.com/christopher-mckenzie/zuul-oauth2-tutorial-config)
        * uses oauth2 when contacting base apps